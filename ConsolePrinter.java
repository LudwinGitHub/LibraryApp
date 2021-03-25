package pl.javastart.io;

import pl.javastart.model.Book;
import pl.javastart.model.LibraryUser;
import pl.javastart.model.Magazine;
import pl.javastart.model.Publications;

import java.util.Collection;

public class ConsolePrinter {

    public void printBooks(Collection<Publications> publications) {
        long count = publications.stream()
                .filter(s -> s instanceof Book)
                .map(Publications::toString)
                .peek(this::printLine)
                .count();
        if (count == 0) {
            printLine("Brak książek  w bibliotece");
        }
    }

    public void printMagazines(Collection<Publications> publications) {
        long count = publications.stream()
                .filter(s -> s instanceof Magazine)
                .map(Publications::toString)
                .peek(this::printLine)
                .count();
        if (count == 0) {
            printLine("Brak magazynów w bibliotece");
        }
    }


    public void printUsers(Collection<LibraryUser> users){

    for (LibraryUser user: users){
        printLine(user.toString());
    }
    }


    public void printLine(String text){
        System.out.println(text.toUpperCase());
    }
}
