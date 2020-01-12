package net.metrosystems.mylibrary3.data.model.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "books_in_libraries", uniqueConstraints = {@UniqueConstraint(name = "uk_bil", columnNames = {"book_id", "library_id"})})
@SequenceGenerator(name = "gen_bil_seq", sequenceName = "bil_seq")
public class BookInLibrary {
    //@EmbeddedId
    //private BookInLibraryId id;

    @Id
    @GeneratedValue(generator = "gen_bil_seq", strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne
    //(fetch = FetchType.LAZY)
    //@MapsId("book_id")
    @JoinColumn(name = "book_id")
    private Book book;

    @ManyToOne(/*fetch = FetchType.LAZY,*/ cascade = CascadeType.ALL)
    //@MapsId("library_id")
    @JoinColumn(name = "library_id")
    private Library library;

    @Column(name = "price")
    private int priceInEur;

    @Column(name = "no_pieces")
    private int noPieces;

    public BookInLibrary() {};

    public BookInLibrary(Book book, Library library) {
        this.book = book;
        this.library = library;
        //this.id = new BookInLibraryId(book.getId(), library.getId());
    };

//    public BookInLibraryId getId() {
//        return id;
//    }
//
//    public void setId(BookInLibraryId id) {
//        this.id = id;
//    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    public int getPriceInEur() {
        return priceInEur;
    }

    public void setPriceInEur(int priceInEur) {
        this.priceInEur = priceInEur;
    }

    public int getNoPieces() {
        return noPieces;
    }

    public void setNoPieces(int noPieces) {
        this.noPieces = noPieces;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        BookInLibrary  that = (BookInLibrary) obj;
        return Objects.equals(this.book, that.book) && Objects.equals(this.library, that.library);
    }

    @Override
    public int hashCode() {
        return Objects.hash(book, library);
    }
}
