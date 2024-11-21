package MyPakage;
import java.util.ArrayList;
import java.util.List;

class Book {
    // Books attributes
    private int id;
    private String title;
    private String author;
    private Metadata metadata;

    static class Metadata {
        private int price;
        private List<String> category;
        private String isbn;
        private int pages;

        // Constructor to initialize Metadata
        public Metadata(int price, List<String> category, String isbn, int pages) {
            this.price = price;
            this.category = category;
            this.isbn = isbn;
            this.pages = pages;
        }

        // Getters for Metadata fields
        public int getPrice() {
            return price;
        }

        public List<String> getCategory() {
            return category;
        }

        public String getIsbn() {
            return isbn;
        }

        public int getPages() {
            return pages;
        }
    }

    // Getters for Book fields
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    // Set Book method with a Metadata object initialization
    public void setBook(int id, String title, String author, List<String> category, int pages, int price, String isbn) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.metadata = new Metadata(price, category, isbn, pages);
    }

    // Display Book information
    void displayBookInfo() {
        System.out.println("ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Category: " + getMetadata().getCategory());
        System.out.println("Pages: " + getMetadata().getPages());
        System.out.println("Price: " + getMetadata().getPrice());
        System.out.println("ISBN: " + getMetadata().getIsbn());
    }
}

public class books {
    public static void main(String[] args) {

        // Creating categories for the books
        List<String> category = new ArrayList<>();
        category.add("Fantasy");
        category.add("Sci-fi");
        category.add("Literature");

        // Creating and setting the first book
        Book bookObject1 = new Book();
        bookObject1.setBook(1, "Rich Dad Poor Dad", "Robert Kiyosaki", category, 400, 2000, "123-433-5");
        bookObject1.displayBookInfo();

        // Creating and setting the second book
        Book bookObject2 = new Book();
        bookObject2.setBook(2, "Think and Grow Rich", "Napoleon Hill", category, 565, 3000, "574-3332-44");
        bookObject2.displayBookInfo();
    }
}
