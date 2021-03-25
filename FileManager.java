package pl.javastart.io.file;

import pl.javastart.model.Library;

public interface FileManager {
    Library importData();
    void exportData(Library library);
}
