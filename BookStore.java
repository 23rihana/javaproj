
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class BookStore {
    private final List<Book> books;

    public BookStore() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }
    

    public void removeBook(Book book) {
        books.remove(book);
    }

    public List<Book> getAllBooks() {
        return books;
    }
    
   
    public List<Book> searchBooks(String keyword) {
        List<Book> searchResults = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(keyword.toLowerCase()) ||
                book.getAuthor().toLowerCase().contains(keyword.toLowerCase())) {
                searchResults.add(book);
            }
        }
        return searchResults;
    }

    // Other methods and functionality

    // ...
    
    public void displayBooks() {
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Year: " + book.getYear());
            System.out.println();
        }
    }
      public List<Book> getBooksSortedByTitle() {
        return books.stream()
                .sorted(Comparator.comparing(Book::getTitle))
                .collect(Collectors.toList());
    }

    public List<Book> getBooksSortedByAuthor() {
        return books.stream()
                .sorted(Comparator.comparing(Book::getAuthor))
                .collect(Collectors.toList());
    }

    public List<Book> findBooksByTitle(String title) {
        return books.stream()
                .filter(book -> book.getTitle().equalsIgnoreCase(title))
                .collect(Collectors.toList());
    }
    public List<Book> findBooksByAuthor(String author) {
        return books.stream()
                .filter(book -> book.getAuthor().equalsIgnoreCase(author))
                .collect(Collectors.toList());
    }
     public void editBookTitle(String oldTitle, String newTitle) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(oldTitle)) {
                book.setTitle(newTitle);
                break;
            }
        }
    }
    
      public void editBookAuthor(String title, String newAuthor) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.setAuthor(newAuthor);
                break;
            }
        }
    }
       public void removeBookByTitle(String title) {
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getTitle().equals(title)) {
                iterator.remove();
                System.out.println("Book removed successfully.");
                return;
            }
        }
        System.out.println("Book not found.");
    }
      


}


  
   
