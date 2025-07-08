public class EBook extends Book{
    private String FileType;
    EBook(String FileType) {
        this.FileType = FileType;
    }
    EBook(){
    }
    public EBook(String ISBN, String title, int year, double price, String FileType) {
        super(ISBN, title, year, price);
        this.FileType = FileType;
    }

    public String getFileType() {
        return FileType;
    }

    public void setFileType(String fileType) {
        FileType = fileType;
    }

    @Override
    public boolean OKAv() {
        return true;
    }
    @Override
    public double Canbuy(int quantity) {
        return price * quantity;
    }
    @Override
    public void Esend(String email, String address) {
        System.out.println("Your order is being sended to " + email + ".");
    }
}
