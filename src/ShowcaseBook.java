import java.time.LocalDate;
class ShowcaseBook extends Book {
    public ShowcaseBook(String ISBN, String title, String authorName, LocalDate publishDate, double price) {
        super(ISBN, title, authorName, publishDate, price);
    }

    @Override
    protected void deliver(Customer customer) {
        System.out.println("Quantum bookstore: Showcase book — not for sale.");
    }

    @Override
    protected boolean isAvailable(int quantity) {
        return false;
    }

    @Override
    protected void reduceQuantity(int quantity) {
        // Not for sale
    }
}
