import java.time.LocalDate;

// Book.java
public abstract class Book {
    private String ISBN;
    private String title;
    private String authorName;
    private LocalDate publishDate;
    private double price;

    public Book(String ISBN, String title, String authorName, LocalDate publishDate, double price) {
        this.ISBN = ISBN;
        this.title = title;
        this.authorName = authorName;
        this.publishDate = publishDate;
        this.price = price;
    }

    public String getISBN() { return ISBN; }
    public String getTitle() { return title; }
    public String getAuthorName() { return authorName; }
    public LocalDate getPublishDate() { return publishDate; }
    public double getPrice() { return price; }

    protected abstract void deliver(Customer customer);
    protected abstract boolean isAvailable(int quantity);
    protected abstract void reduceQuantity(int quantity);

    public final double purchase(Customer customer, int quantity) {
        if (!isAvailable(quantity)) {
            System.out.println("Quantum bookstore: Book not available or not for sale.");
            return 0.0;
        }
        double total = price * quantity;
        reduceQuantity(quantity);
        deliver(customer);
        return total;
    }
}