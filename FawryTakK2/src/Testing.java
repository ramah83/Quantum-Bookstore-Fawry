public class Testing {
    public static void main(String[] args) {

        Book_store store = new Book_store();
        store.adding(new Paper_book("1", "ML", 2008, 200, 9));
        store.adding(new EBook("2", "C++", 1905, 450, "pdf"));
        store.adding(new Demo_Book("3", "OPP JAVA", 1900));

        store.removing(5);

        store.buying_books("1", 2, "Rammahpaper@example.com", "Asyat, Egypt");
        store.buying_books("2", 1, "Rammahebook@mail.com", "");
        store.buying_books("3", 1, "Rammahdemo@mail.com", "");


    }
}
