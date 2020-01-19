package net.metrosystems.mylibrary3.data.model.dto;

import net.metrosystems.mylibrary3.data.model.entity.BookInLibrary;

import java.math.BigDecimal;
import java.util.List;

public class BookInLibraryDto {
//    private BookDto book;
    private LibraryDto library;
    private BigDecimal priceInDollar;
    private int noPieces;


    public BookInLibraryDto() {};

//    public BookInLibraryDto(BookDto book, LibraryDto library, int priceInEur, int noPieces) {
//        this.book = book;
    public BookInLibraryDto(LibraryDto library, BigDecimal price, int noPieces) {
        this.library = library;
        this.priceInDollar = price;
        this.noPieces = noPieces;
    }

//    public BookDto getBook() {
//        return book;
//    }

//    public void setBook(BookDto book) {
//        this.book = book;
//    }


    public LibraryDto getLibrary() {
        return library;
    }

    public void setLibrary(LibraryDto library) {
        this.library = library;
    }

    public BigDecimal getPriceInDollar() {
        return priceInDollar;
    }

    public void setPriceInDollar(BigDecimal priceInDollar) {
        this.priceInDollar = priceInDollar;
    }

    public int getNoPieces() {
        return noPieces;
    }

    public void setNoPieces(int noPieces) {
        this.noPieces = noPieces;
    }

    @Override
    public String toString() {
        return "BookInLibraryDto{" +
                "library=" + library +
                ", priceInDollar=" + priceInDollar +
                ", noPieces=" + noPieces +
                '}';
    }
}