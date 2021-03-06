package net.metrosystems.mylibrary3.data.repository;

import net.metrosystems.mylibrary3.data.model.entity.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {
    List<Book> findByAuthorName (String authorName);

    Book findByTitleAndAuthorName (String title, String authorName);

}
