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

        Client client1 = new Client(1, "HashimClient", "hashim@email.com");

        try {
            library.addClient(client1);

            System.out.println("\n--- Borrowing ---");

            library.borrowItem(1, 100);

            System.out.println("Is Book 100 borrowed? " + book1.isBorrowed());

            library.borrowItem(1, 100);

            library.returnItem(1, 100);
            System.out.println("Is Book 100 borrowed after return? " + book1.isBorrowed());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}