public class Paper_book extends Book{
    private int EnoughBook;
    public Paper_book(String ISBN, String title, int year, double price,int EnoughBook){
        super(ISBN,title,year,price);
        this.EnoughBook=EnoughBook;
    }
    @Override
    public boolean OKAv() {
       if(EnoughBook>0) return true;
       else return false;
    }
    @Override
    public double Canbuy(int quantity) {
        if(EnoughBook>=quantity){
            EnoughBook -= quantity;
            return price * quantity;
        }
        else {
            throw new RuntimeException("We're runnin' low on stock, y'all");
        }
    }
    @Override
    public void Esend(String email, String address) {
        System.out.println("Your order is being shipped to " + address + ".");
    }
}
