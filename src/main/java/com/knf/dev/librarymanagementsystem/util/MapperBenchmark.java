package com.knf.dev.librarymanagementsystem.util;

import com.knf.dev.librarymanagementsystem.entity.Author;
import com.knf.dev.librarymanagementsystem.entity.Book;
import com.knf.dev.librarymanagementsystem.entity.Category;
import com.knf.dev.librarymanagementsystem.entity.Publisher;
import com.knf.dev.librarymanagementsystem.vo.AuthorRecord;
import com.knf.dev.librarymanagementsystem.vo.BookRecord;
import com.knf.dev.librarymanagementsystem.vo.CategoryRecord;
import com.knf.dev.librarymanagementsystem.vo.PublisherRecord;
import org.openjdk.jmh.annotations.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@Warmup(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Fork(1)
@State(Scope.Benchmark)
public class MapperBenchmark {
    private List<Publisher> publishers;

    private List<Author> authors;

    private List<Book> books;

    private List<Category> categories;

    @Setup
    public void init() {
        this.publishers = new ArrayList<>();
        this.authors = new ArrayList<>();
        this.categories = new ArrayList<>();
        this.books = new ArrayList<>();

        Publisher publisher = new Publisher();
        publisher.setId(1L);
        publisher.setName("name");

        Author author = new Author();
        author.setId(1L);
        author.setName("John doe");
        author.setDescription("an author");

        Category category = new Category();
        category.setId(1L);
        category.setName("random category");

        Book book = new Book();
        book.setId(1L);
        book.setIsbn("dummy isbn");
        book.setName("coding book");
        book.setSerialName("serialnumber");


        publishers.add(publisher);
        authors.add(author);
        categories.add(category);
        books.add(book);

    }

    @Benchmark
    public List<PublisherRecord> testPublisherModelToVo() {
        return Mapper.publisherModelToVo(publishers);
    }

    @Benchmark
    public List<BookRecord> testBookModelToVo(){
        return Mapper.bookModelToVo(books);
    }

    @Benchmark
    public List<AuthorRecord> testAuthorModelToVo(){
        return Mapper.authorModelToVo(authors);
    }

    @Benchmark
    public List<CategoryRecord> testCategoryModelToVo(){
        return Mapper.categoryModelToVo(categories);
    }
    public static void main(String[] args) throws Exception {
        org.openjdk.jmh.Main.main(args);
    }
}
