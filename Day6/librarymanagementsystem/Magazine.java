package librarymanagementsystem;

class Magazine extends LibraryItem implements Reservable{
    private int loanDuration=12;
    private String reserveItem;
    private String availablitiy;
    public Magazine(int itemId,String title,String author){
        super(itemId,title,author);
    }
    public int getLoanDuration(){
        return loanDuration;
    }
    public void reserveItem(String reserveItem){
        this.reserveItem=reserveItem;
    }
    public String getreserveItem(){
        return reserveItem;
    }
    public void setAvailablitiy(String availablitity){
        this.availablitiy=availablitity;
    }

    public boolean checkAvailablitiy(){
        if(availablitiy!=null){
            return true;
        }else{
            return false;
        }
    }

}