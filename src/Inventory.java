import java.time.LocalDate;
import java.util.*;

class Inventory {
    private Map<String, Book> inventory = new HashMap<>();

    public void addBook(Book book) {
        if (!inventory.containsKey(book.getISBN())) {
            inventory.put(book.getISBN(), book);
            System.out.println("Quantum bookstore: Book " + book.getTitle() + " added.");
        } else {
            System.out.println(" Quantum bookstore:" + book.getTitle() + " already exists." );
        }
    }

    public void removeBookByISBN(String isbn) {
        if (inventory.containsKey(isbn)) {
            inventory.remove(isbn);
            System.out.println("Quantum bookstore: Removed book with ISBN : " + isbn);
        } else {
            System.out.println("Quantum bookstore: ISBN not found");
        }
    }

    public void removeOutdatedBooks(int maxAgeInYears) {
        LocalDate now = LocalDate.now();
        for (Book book : new ArrayList<>(inventory.values())) {
            if (book.getPublishDate().plusYears(maxAgeInYears).isBefore(now)) {
                removeBookByISBN(book.getISBN());
            }
        }
    }

    public void purchase(String isbn, Customer customer, int quantity) {
        Book book = inventory.get(isbn);
        if (book == null) {
            System.out.println("Quantum bookstore: Book not found.");
            return;
        }
        double amount = book.purchase(customer, quantity);
        if (amount > 0) {
            System.out.println("Quantum bookstore: Paid amount = " + amount);
        }
    }

    public Map<String, Book> getInventory() {
        return inventory;
    }
}

