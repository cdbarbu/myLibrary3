package net.metrosystems.mylibrary3.data.model.dto;

import java.util.List;

public class BookDto {
    private String authorName;
    private String title;
    private int yearOfPublication;

    private List<BookInLibraryDto> bookInLibraryStock;

    public BookDto() {};

    public BookDto(String authorName, String title, int yearOfPublication) {
        this.authorName = authorName;
        this.title = title;
        this.yearOfPublication = yearOfPublication;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public String toString() {
        return "BookDto{" +
                "authorName='" + authorName + '\'' +
                ", title='" + title + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                ", bookInLibraryStock=" + bookInLibraryStock +
                '}';
    }

    public List<BookInLibraryDto> getBookInLibraryStock() {
        return bookInLibraryStock;
    }

    public void setBookInLibraryStock(List<BookInLibraryDto> bookInLibraryStock) {
        this.bookInLibraryStock = bookInLibraryStock;
    }

}
