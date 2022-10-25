package Homework9ObjectMethods;

import java.util.Objects;

public class Author {

    private final String nameAuthor;
    private final String surnameAuthor;

    public Author(String nameAutor, String surnameAuthor) {
        this.nameAuthor = nameAutor;
        this.surnameAuthor = surnameAuthor;
    }

    public String getNameAuthor(){
        return  this.nameAuthor;
    }

    public String getSurnameAuthor(){
        return this.surnameAuthor;
    }

    public String getFullNameAuthor(){
        return this.nameAuthor + " " + this.surnameAuthor;
    }

    public String toString(){
        return "Автор: " + nameAuthor + " " + surnameAuthor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(nameAuthor, author.nameAuthor) && Objects.equals(surnameAuthor, author.surnameAuthor);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nameAuthor, surnameAuthor);
    }
}