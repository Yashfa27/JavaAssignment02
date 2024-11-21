package MyPakage;

import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;

public class bookProcessor {
    List<Book> bookList;


    // Constructor
    public bookProcessor(List<Book> bookListobject) {
        this.bookList = bookListobject;
    }

    // Display details of all books in the list
    public void displayAllBooks() {
        System.out.println("Details of All Books:");
        bookList.forEach(book -> {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Category" + book.getMetadata().getCategory());
            System.out.println("Price: Rs  " + book.getMetadata().getPrice());
            System.out.println("Pages: " + book.getMetadata().getPages());
            System.out.println("Isbn: " + book.getMetadata().getIsbn());
            System.out.println("-----------------------");
        });
    }


    public void displayAuthor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Author name:");
        String authorName = scanner.nextLine();
        if (authorName.equals("Oscar Wild")) {
            System.out.println("Title: The Picture of Dorian Gray");
        } else if (authorName.equals("J.R.R")) {
            System.out.println("Title: The Picture of Dorian Gray");
        } else if (authorName.equals("Ray Bradbury")) {
            System.out.println("Fahrenheit 451");
        } else {
            System.out.println("Sorry....! Not found ");
        }
    }


    public void avgPriceBooks() {
        // Calculate the average price of all books
        double averagePrice = bookList.stream()
                .mapToDouble(book -> book.getMetadata().getPrice())
                .average()
                .getAsDouble();

        System.out.println("Average Price of All Books: Rs " + averagePrice);
    }


    public void titleBooks() {
        double highestPrice = bookList.stream()
                .mapToDouble(book -> book.getMetadata().getPrice())
                .max()
                .getAsDouble();
        System.out.println("Highest price of Book is: Rs " + highestPrice);

    }

    public void specificCategoryBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Specific Category of book:");
        String categoryName = scanner.nextLine();

        // Correcting the condition for multiple categories
        if (categoryName.equals("Fiction") || categoryName.equals("Classic") || categoryName.equals("Philosophical")) {
            System.out.println("Title: Oscar Wild");
        } else if (categoryName.equals("Fantasy") || categoryName.equals("Adventure") || categoryName.equals("Epic")) {
            System.out.println("Title: The Picture of Dorian Gray");
        } else if (categoryName.equals("Political Fiction")) {
            System.out.println("The Lord of Ring");
        } else {
            System.out.println("Sorry....! Not found ");
        }
    }
}