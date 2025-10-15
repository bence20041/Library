package hu.bence20041.library.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Library {
    private List<Book> books=new ArrayList<>();

    public Library(){
        this.books=new ArrayList<>();
    }

    public void addBook(Book b){
        if(b!=null){
            this.books.add(b);
        }
    }

    public List<Book> getBooks(){
        return new ArrayList<>(books);
    }

    public Optional<Book> getBookByISBN(String isbn){
        return books.stream().filter(b->b.getIsbn().equals(isbn)).findFirst();
    }

    public void setBooks(List<Book> books){
        this.books=books;
    }
}
