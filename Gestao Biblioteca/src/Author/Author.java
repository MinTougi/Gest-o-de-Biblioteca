package Author;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Author {
    private String author_name;
    private String nacionality;
    private LocalDate birth_data;

    //Método construtor
    public Author(String author_name, String nacionality, LocalDate birth_data) {
        this.author_name = author_name;
        this.nacionality = nacionality;
        this.birth_data = birth_data;
    }

    public Author() {
    }

    //Getters e Setters
    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public String getNacionality() {
        return nacionality;
    }

    public void setNacionality(String nacionality) {
        this.nacionality = nacionality;
    }

    public LocalDate getBirth_data() {
        return birth_data;
    }

    public void setBirth_data(LocalDate birth_data) {
        this.birth_data = birth_data;
    }

    // create a list of authors
    private static final List<Author> authors = new ArrayList<>();

    public void addAuthor(Author author) {
        authors.add(author); // Add the author directly to the list
    }

    // find the author by the name
    public static Author findAuthorByName(String name) {
        for (Author author : authors) {
            if (author.getAuthor_name().equalsIgnoreCase(name)) {
                return author;
            }
        }
        return null;
    }

    //Show the name of the author
    @Override
    public String toString() {
        return author_name; // Return the author's name
    }
}

