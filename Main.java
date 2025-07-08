import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Book paperBook = new PaperBook("111", "Book A", "author A", LocalDate.of(2010, 1, 1), 100.0, 10);
        Book eBook = new EBook("222", "Book B", "author B", LocalDate.of(2015, 5, 5), 50.0, "PDF");
        Book showcaseBook = new ShowcaseBook("333", "Book C", "author C", LocalDate.of(2020, 10, 10), 75.0);

        inventory.addBook(paperBook);
        inventory.addBook(eBook);
        inventory.addBook(showcaseBook);
        inventory.addBook(new PaperBook("111", "Book A", "author A", LocalDate.of(2010, 1, 1), 100.0, 10));

        inventory.removeOutdatedBooks(10);

        Customer customer = new Customer("Yasmine", "yas@gmail.com", "address");

        inventory.purchase("111", customer, 2);
        inventory.purchase("222", customer, 1);
        inventory.purchase("333", customer, 1);
    }
}