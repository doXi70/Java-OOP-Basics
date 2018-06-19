package p02_BookShop;

public class GoldenEditionBook extends Book {

    public GoldenEditionBook(String author, String title, double price) {
        // price = price + ((price * 30) / 100);
        super(author, title, price * 1.3);
    }

}
