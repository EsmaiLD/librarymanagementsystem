package com.knf.dev.librarymanagementsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import com.knf.dev.librarymanagementsystem.entity.Publisher;
import com.knf.dev.librarymanagementsystem.service.PublisherService;

@Controller
public class PublisherController {

	final PublisherService publisherService;
	private static String REDIR_PUBLISHERS = "redirect:/publishers";
	private static String A_PUBLISHER = "publisher";


	public PublisherController(PublisherService publisherService) {
		this.publisherService = publisherService;

	}

	@GetMapping("/publishers")
	public String findAllPublishers(Model model) {
		model.addAttribute("publishers", publisherService.findAllPublishers());
		return "list-publishers";
	}

	@GetMapping("/publisher/{id}")
	public String findPublisherById(@PathVariable("id") Long id, Model model) {
		model.addAttribute(A_PUBLISHER, publisherService.findPublisherById(id));
		return "list-publisher";
	}

	@GetMapping("/addPublisher")
	public String showCreateForm(Publisher publisher) {
		return "add-publisher";
	}

	@PostMapping("/add-publisher")
	public String createPublisher(Publisher publisher, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "add-publisher";
		}
		publisherService.createPublisher(publisher);
		model.addAttribute(A_PUBLISHER, publisherService.findAllPublishers());
		return REDIR_PUBLISHERS;
	}

	@GetMapping("/updatePublisher/{id}")
	public String showUpdateForm(@PathVariable("id") Long id, Model model) {
		model.addAttribute(A_PUBLISHER, publisherService.findPublisherById(id));
		return "update-publisher";
	}

	@PostMapping("/update-publisher/{id}")
	public String updatePublisher(@PathVariable("id") Long id, Publisher publisher, BindingResult result, Model model) {
		if (result.hasErrors()) {
			publisher.setId(id);
			return "update-publishers";
		}
		publisherService.updatePublisher(publisher);
		model.addAttribute(A_PUBLISHER, publisherService.findAllPublishers());
		return REDIR_PUBLISHERS;
	}

	@GetMapping("/remove-publisher/{id}")
	public String deletePublisher(@PathVariable("id") Long id, Model model) {
		publisherService.deletePublisher(id);
		model.addAttribute(A_PUBLISHER, publisherService.findAllPublishers());
		return REDIR_PUBLISHERS;
	}

}
