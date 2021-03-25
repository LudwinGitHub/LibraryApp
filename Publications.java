package pl.javastart.model;

import java.io.Serializable;
import java.time.Year;
import java.util.Objects;

public abstract class Publications implements Serializable, Comparable<Publications>, CsvConvertible {
    private Year year;
    private String title;
    private String publisher;

    public Publications(String title, String publisher, int year) {
        this.year = Year.of(year);
        this.title = title;
        this.publisher = publisher;
    }

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Publications{" +
                "year=" + year +
                ", title='" + title + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Publications)) return false;
        Publications that = (Publications) o;
        return Objects.equals(year, that.year) &&
                Objects.equals(title, that.title) &&
                Objects.equals(publisher, that.publisher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, title, publisher);
    }

    @Override
    public int compareTo(Publications p) {
        return title.compareToIgnoreCase(p.title);
    }
}

