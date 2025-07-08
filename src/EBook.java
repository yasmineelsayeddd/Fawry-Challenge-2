import java.time.LocalDate;
class EBook extends Book {
    private String fileType;

    public EBook(String ISBN, String title, String authorName, LocalDate publishDate, double price, String fileType) {
        super(ISBN, title, authorName, publishDate, price);
        this.fileType = fileType;
    }

    @Override
    protected void deliver(Customer customer) {
        MailService.send(customer.getEmail());
    }

    @Override
    protected boolean isAvailable(int quantity) {
        return true;
    }

    @Override
    protected void reduceQuantity(int quantity) {
        // No-op
    }
}
