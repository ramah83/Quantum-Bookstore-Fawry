public class Demo_Book extends Book{
    public Demo_Book(String ISBN, String title, int year){
   super(ISBN,title,year,0);
    }
    @Override
    public boolean OKAv() {
        return false;
    }

    @Override
    public double Canbuy(int quantity){
        throw new RuntimeException("Book is not for sale");
    }

    @Override
    public void Esend(String email, String address) {
        throw new UnsupportedOperationException("Demo books cannot be sent");
    }
}
