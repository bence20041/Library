package hu.bence20041.library.model;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private String genre;
    private int publicationYear;

    Book(String title, String author, String isbn, String genre, int publicationYear) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.genre = genre;
        this.publicationYear = publicationYear;
    }

    String getTitle() {return title;}
    String getAuthor() {return author;}
    String getIsbn() {return isbn;}
    String getGenre() {return genre;}
    int getPublicationYear() {return publicationYear;}

    void setTitle(String title) {this.title = title;}
    void setAuthor(String author) {this.author = author;}
    void setIsbn(String isbn) {this.isbn = isbn;}
    void setGenre(String genre) {this.genre = genre;}
    void setPublicationYear(int publicationYear) {this.publicationYear = publicationYear;}
    @Override
    public String toString() {return "Könyv:\n{"+"cím: "+title+" | szerző: "+author+
            " | azonosító: "+isbn+" | műfaj: "+genre+" | kiadás éve:"+publicationYear+"}";}

}
