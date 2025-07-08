import java.util.*;
public class Book_store {
    private Map<String, Book> Library = new HashMap<>();
    public void adding(Book book) {
        Library.put(book.getISBN(), book);
        System.out.println("Book '" + book.getTitle() + "' added");
    }
    public void buying_books(String ISBN, int quantity, String email, String address){
        if (!Library.containsKey(ISBN)) {
            System.out.println("Book not found");
            return;
        }
        Book book = Library.get(ISBN);
        if (!book.OKAv()) {
            System.out.println("Book is not available");
            return;

        }
        double total = book.Canbuy(quantity);
        book.Esend(email, address);
        System.out.println("Final payment: "+ total + "$ EGP");

    }
    public void removing(int Nyears) {
        int Year = Calendar.getInstance().get(Calendar.YEAR);
        List<String> Removeed = new ArrayList<>();

        for (Book book : Library.values()) {
            if (Year - book.getYear() > Nyears) {
                Removeed.add(book.getISBN());
            }
        }
        for (String ISBN : Removeed) {
            Book removedBook = Library.get(ISBN);
            if (removedBook != null) {
                System.out.print("Book " + removedBook.getTitle() + " is removed"+"    ");
            }
        }

        for (String ISBN : Removeed) {
            Library.remove(ISBN);
        }
        System.out.println();
        System.out.println("Removed " + Removeed.size() + " books");
    }



}
