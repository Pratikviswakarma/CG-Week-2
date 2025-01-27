package librarymanagementsystem;

public class UseLibraryItem {
    public static void main(String[] args) {
        LibraryItem mg=new Magazine(101,"Let us C","Steev switch");
        mg.getLoanDuration();
        mg.getItemDeatails();
        Reservable mgin=new Magazine(101,"Let us C","Steev switch");
        mgin.reserveItem("Laptop");
        System.out.println("Currentlly Item is "+mgin.checkAvailablitiy());
        LibraryItem dvd=new DVD(101,"Let us C","Steev switch");
        dvd.getLoanDuration();
        dvd.getItemDeatails();
        Reservable dvdin=new Magazine(101,"Let us C","Steev switch");
        dvdin.reserveItem("Laptop");
        System.out.println("Currentlly Item is "+dvdin.checkAvailablitiy());
    }
}
