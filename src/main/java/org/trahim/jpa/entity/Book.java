package org.trahim.jpa.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.NavigableMap;
import java.util.Objects;

@Entity
@Table(name = "book", schema = "jpa")
//@SecondaryTables({@SecondaryTable(name="author")})
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
//    @Column(table = "author")
    private String author;
//    @Column(table = "author")
    private Date publihed;

    public Book() {
    }

    public Book(String name, String author, Date publihed) {
        this.name = name;
        this.author = author;
        this.publihed = publihed;
    }




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getPublihed() {
        return publihed;
    }

    public void setPublihed(Date publihed) {
        this.publihed = publihed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(name, book.name) &&
                Objects.equals(author, book.author) &&
                Objects.equals(publihed, book.publihed);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, author, publihed);
    }
}
