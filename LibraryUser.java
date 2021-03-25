package pl.javastart.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LibraryUser extends User {
    private List<Publications> publicationHistory = new ArrayList<>();
    private List<Publications> borrowedPublications = new ArrayList<>();

    public List<Publications> getPublicationHistory() {
        return publicationHistory;
    }

    public List<Publications> getBorrowedPublications() {
        return borrowedPublications;
    }

    public LibraryUser(String firstName, String lastName, String pesel) {
        super(firstName, lastName, pesel);
    }

    private void addPublicationToHistory(Publications pub){
        publicationHistory.add(pub);
    }

    public void borrowPublication(Publications pub){
        borrowedPublications.add(pub);
    }

    public boolean returnPublication(Publications pub){
        boolean result = false;
        if (borrowedPublications.remove(pub)){
            result = true;
            addPublicationToHistory(pub);
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LibraryUser)) return false;
        if (!super.equals(o)) return false;
        LibraryUser that = (LibraryUser) o;
        return Objects.equals(publicationHistory, that.publicationHistory) &&
                Objects.equals(borrowedPublications, that.borrowedPublications);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), publicationHistory, borrowedPublications);
    }

    @Override
    public String toCsV() {
        return getFirstName() + " " + getLastName() + " " + getPesel();
    }
}
