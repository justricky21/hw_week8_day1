package models;

import javax.persistence.*;

@Entity
@Table(name = "books")
public class Book {
    private int yearOfRelease;
    private String title;
    private int id;

    public Book(String title, int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
        this.title = title;
    }

    public Book() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    @Column(name = "year_of_release")
    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setId(int id) {
        this.id = id;
    }
}
