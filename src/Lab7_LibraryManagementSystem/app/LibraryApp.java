package Lab7_LibraryManagementSystem.app;

import Lab7_LibraryManagementSystem.model.*;
import Lab7_LibraryManagementSystem.service.Library;

public class LibraryApp {
    public static void main(String[] args) {
        LibraryItem book1 = new Book(100, "Hashim's great life", "Hashim");
        LibraryItem book2 = new Book(101, "The cirica of pure reasom",
                "Imanuel Kant");
        LibraryItem mag1 = new Magazine(102, "Micky",
                "AlNahda", 92);

        //System.out.println(book1.getItemDetails());

        Library library = new Library();
        library.addItem(book1);
        library.addItem(book2);
        library.addItem(mag1);

        library.displayAllItems();

    }
}
