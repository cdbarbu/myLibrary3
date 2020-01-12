package net.metrosystems.mylibrary3.service;

import net.metrosystems.mylibrary3.data.model.entity.Book;
import net.metrosystems.mylibrary3.data.repository.BookRepository;
import net.metrosystems.mylibrary3.data.repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class DataService {
    @Autowired
    BookRepository bookRepository;

    @Autowired
    LibraryRepository libraryRepository;

    @Transactional
    public void clearAll() {
        bookRepository.deleteAll();
        libraryRepository.deleteAll();
    }

    @Transactional
    public void addBooksToDb (List<Book> books) {
        bookRepository.saveAll(books);
    }

    @Transactional
    // de facut cu dto
    public Iterable<Book> getAllBooks() {
        return bookRepository.findAll();
    }
}
