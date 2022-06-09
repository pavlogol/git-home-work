package Homework7.Task2;


import java.util.*;
import java.util.stream.Collectors;

import static org.apache.commons.lang3.RandomStringUtils.random;

public class Book {
    String name;
    int price;

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Book() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public static int rnd(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }


    public String toString() {
        return "[Name: " + name + ", price: " + price + "]";
    }


    public static List<Book> generateBooks(int qty) {

        List<Book> listOfBooks = new ArrayList<>();
        for (int i = 0; i < qty; i++) {
            Book book = new Book();
            book.setName(random(rnd(3, 10), true, false));
            book.setPrice(rnd(1, 99));
            listOfBooks.add(i, book);

        }
        return listOfBooks;
    }

    public static void main(String[] args) {
        List<Book> listOfBooks;

        //Create List of books (of 10 items) using previously created method for books generating
        listOfBooks = generateBooks(10);

        //print all books using method toString (information should be consistent, e.g. “name: Book1, price: 10”)
        System.out.println(listOfBooks.toString());

        //get List<String> of all book names and print them
        String allBooks = listOfBooks.stream()
                .map(Book::getName)
                .collect(Collectors.joining(", "));
        System.out.println("All books: " + allBooks);

        //get total price of all books and print it
        int totalPrice = listOfBooks.stream()
                .map(Book::getPrice)
                .reduce(0, Integer::sum);
        System.out.println("Total price: " + totalPrice);

        //get any book with “A” or “a” character in name and print its name
        Optional<String> anyBook = listOfBooks.stream()
                .map(Book::getName)
                .filter((s) -> s.contains("A") || s.contains("a"))
                .findAny();

        System.out.println("Any book with 'A' or 'a': " + anyBook);

//        listOfBooks.stream().filter((s) -> s.getName().contains("A") || s.getName().contains("a"))
//                .forEach(s -> System.out.println("Book with 'a' or 'A': " + s.getName()));


        //print book name with highest price
        int highestPrice = listOfBooks.stream()
                .map(Book::getPrice)
                .max((book1, book2) ->
                        book1 > book2 ? 1 : -1).get();

        System.out.println("Highest price: " + highestPrice);

        //get number of books where name consists of 5 letters
        long count = listOfBooks.stream()
                .map(Book::getName)
                .filter(name -> name.length() == 5)
                .count();
        System.out.println("Number of books where name consists of 5 letters: " + count);

        //get all books except books with price higher then 30
        listOfBooks.stream()
                .filter(p -> p.getPrice() > 30)
                .forEach(p -> System.out.println("Price > 30: " + p.getName()));

        //sort books by name in desc order, if name equals then sort by price
        listOfBooks.sort(Comparator.comparing(Book::getName)
                .thenComparing(Book::getPrice));
        System.out.println("Sorted list: " + listOfBooks);


//        Sub-task 2:
//  - create object Book book1(name myBook, price 5)
//  - create object Book book2(name myBook, price 5)
//  - add Book1 to map Map<Book, String> mapWithBook -> key = Book1, value - some library name
//  - get library name using book2 object


        Book book1 = new Book("myBook", 5);
        Book book2 = new Book("myBook", 5);
        Map<Book, String> mapWithBook = new HashMap<>();
        mapWithBook.put(book1, "Korolenko");

        String libName = mapWithBook.entrySet().stream()
                .filter(map -> map.getKey().toString().equals(book2.toString()))
                .map(Map.Entry::getValue).collect(Collectors.joining());
        System.out.println("Library name: " + libName);
    }
}