package librarymanagementsystem;

abstract class LibraryItem{
    private int itemId;
    private String title;
    private String author;

    public LibraryItem(int itemId,String title,String author){
        this.itemId=itemId;
        this.title=title;
        this.author=author;
    }
    abstract public int getLoanDuration();

    public void getItemDeatails(){
        System.out.println("Item id is "+itemId);
        System.out.println("Title is "+title);
        System.out.println("Author is "+author);
    }
}