
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BookStore bookStore = new BookStore();
        
        
            // Add books to the store
        
        bookStore.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald",14.5, 1925));
        bookStore.addBook(new Book("To Kill a Mockingbird", "Harper Lee",17.4, 1960));
        bookStore.addBook(new Book("1984", "George Orwell", 21.9,1949));
        bookStore.addBook(new Book("Pride and Prejudice", "Jane Austen", 45.3,1813));
        
        
        

             // Display all books in the library
        System.out.println("All Books:");
        bookStore.displayBooks();
        
        
        
        
        
        
         // Sort books by title and display
        System.out.println("Books Sorted by Title:");
        List<Book> booksSortedByTitle = bookStore.getBooksSortedByTitle();
        
        
        for (Book book : booksSortedByTitle) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Year: " + book.getYear());
            System.out.println();
        }
/*
        // Sort books by author and display
        System.out.println("Books Sorted by Author:");
        List<Book> booksSortedByAuthor = bookStore.getBooksSortedByAuthor();
        
        
        for (Book book : booksSortedByAuthor) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Year: " + book.getYear());
            System.out.println();
        }
            // Find books by title and display
        System.out.println("Books with Title '1984':");
        List<Book> booksByTitle = bookStore.findBooksByTitle("1984");
        for (Book book : booksByTitle) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Year: " + book.getYear());
            System.out.println();
        }
        
        
         // Find books by author and display
        System.out.println("Books by Author 'F. Scott Fitzgerald':");
        List<Book> booksByAuthor = bookStore.findBooksByAuthor("F. Scott Fitzgerald");
        for (Book book : booksByAuthor) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Year: " + book.getYear());
            System.out.println();
        }
 // Display all books in the book store
        System.out.println("All Books:");
        bookStore.displayBooks();
        
        // Retrieve all books
        List<Book> allBooks = bookStore.getAllBooks();
        for (Book book : allBooks) {
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        

        // Edit the title of a book
        String oldTitle = "The Great Gatsby";
        String newTitle = "The Great Gatsby (Revised Edition)";
        bookStore.editBookTitle(oldTitle, newTitle);

     
        // Edit the author of a book
        String bookTitle2 = "To Kill a Mockingbird";
        String newAuthor = "Harper Lee (Updated)";
        bookStore.editBookAuthor(bookTitle2, newAuthor);
        
        
        
         // Display all books in the book store after editing
        System.out.println("Books after Editing:");
        bookStore.displayBooks();*/
        
        
        
        
        
         // Remove a book by title
        String bookTitleToRemove = "november 9";
        bookStore.removeBookByTitle(bookTitleToRemove);
    }
}
    
        
      
    
