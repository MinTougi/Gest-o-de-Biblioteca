import java.time.LocalDate;

public class Author {
    private String author_name;
    private String nacionality;
    private LocalDate birth_data;

    //Método construtor
    public Author(String author_name, String nacionality, LocalDate birth_data){
        this.author_name = author_name;
        this.nacionality = nacionality;
        this.birth_data = birth_data;
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
}
