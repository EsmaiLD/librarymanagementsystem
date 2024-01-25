package com.knf.dev.librarymanagementsystem.controller;

import com.knf.dev.librarymanagementsystem.entity.Author;
import com.knf.dev.librarymanagementsystem.service.AuthorService;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.stream.IntStream;

@Controller
public class AuthorController {

	final AuthorService authorService;

	public AuthorController(AuthorService authorService) {
		this.authorService = authorService;
	}

	private static final String AN_AUTHOR = "author";
	private static String REDIR_AUTHORS = "redirect:/authors";
	@GetMapping("/authors")
	public String findAllAuthors(Model model, @RequestParam("page") Optional<Integer> page,
								 @RequestParam("size") Optional<Integer> size) {

		var currentPage = page.orElse(1);
		var pageSize = size.orElse(5);
		var bookPage = authorService.findPaginated(PageRequest.of(currentPage - 1, pageSize));

		model.addAttribute("authors", bookPage);

		int totalPages = bookPage.getTotalPages();
		if (totalPages > 0) {
			var pageNumbers = IntStream.rangeClosed(1, totalPages).boxed().toList();
			model.addAttribute("pageNumbers", pageNumbers);
		}
		return "list-authors";
	}

	@GetMapping("/author/{id}")
	public String findAuthorById(@PathVariable("id") Long id, Model model) {

		model.addAttribute(AN_AUTHOR, authorService.findAuthorById(id));
		return "list-author";
	}

	@GetMapping("/addAuthor")
	public String showCreateForm(Author author) {
		return "add-author";
	}

	@PostMapping("/add-author")
	public String createAuthor(Author author, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "add-author";
		}

		authorService.createAuthor(author);
		model.addAttribute(AN_AUTHOR, authorService.findAllAuthors());
		return REDIR_AUTHORS;

	}

	@GetMapping("/updateAuthor/{id}")
	public String showUpdateForm(@PathVariable("id") Long id, Model model) {

		model.addAttribute(AN_AUTHOR, authorService.findAuthorById(id));
		return "update-author";
	}

	@PostMapping("/update-author/{id}")
	public String updateAuthor(@PathVariable("id") Long id, Author author, BindingResult result, Model model) {
		if (result.hasErrors()) {
			author.setId(id);
			return "update-author";
		}

		authorService.updateAuthor(author);
		model.addAttribute(AN_AUTHOR, authorService.findAllAuthors());
		return REDIR_AUTHORS;
	}

	@GetMapping("/remove-author/{id}")
	public String deleteAuthor(@PathVariable("id") Long id, Model model) {
		authorService.deleteAuthor(id);
		model.addAttribute(AN_AUTHOR, authorService.findAllAuthors());
		return REDIR_AUTHORS;
	}

}
