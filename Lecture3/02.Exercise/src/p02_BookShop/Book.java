package p02_BookShop;

public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String author, String title, double price) {
        setTitle(title);
        setAuthor(author);
        setPrice(price);
    }

    public String getTitle() {
        return this.title;
    }

    protected void setTitle(String title) {
        if (title.trim().length() < 3) {
            throw new IllegalArgumentException("Title not valid!");
        }

        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    protected void setAuthor(String author) {
        String[] authorNames = author.split(" ");

        if (authorNames.length >= 2) {
            if (Character.isDigit(authorNames[1].charAt(0))) {
                throw new IllegalArgumentException("Author not valid!");
            }
        }


        this.author = author;
    }

    public double getPrice() {
        return this.price;
    }

    protected void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price not valid!");
        }

        this.price = price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();

        sb.append("Type: ").append(this.getClass().getSimpleName())
                .append(System.lineSeparator())
                .append("Title: ").append(this.getTitle())
                .append(System.lineSeparator())
                .append("Author: ").append(this.getAuthor())
                .append(System.lineSeparator());


        return String.format(sb + "Price: %.1f%n", this.price);
    }
}
