package pl.javastart.app;
public class LibraryApp {
    public static final String APP_NAME = "Biblioteka v 1.8.2";
    public static void main(String[] args) {
        System.out.println(APP_NAME);

        LibraryControl libraryControl = new LibraryControl();
        libraryControl.controlLoop();
    }
}
