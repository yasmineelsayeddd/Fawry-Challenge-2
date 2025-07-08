import java.time.LocalDate;
class PaperBook extends Book {
    private int quantity;

    public PaperBook(String ISBN, String title, String authorName, LocalDate publishDate, double price, int quantity) {
        super(ISBN, title, authorName, publishDate, price);
        this.quantity = quantity;
    }

    @Override
    protected void deliver(Customer customer) {
        ShippingService.send(customer.getAddress());
    }

    @Override
    protected boolean isAvailable(int quantity) {
        return this.quantity >= quantity;
    }

    @Override
    protected void reduceQuantity(int quantity) {
        if (quantity <= this.quantity) {
            this.quantity -= quantity;
        }
    }
}