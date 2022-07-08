public class Bookstore {
    
    public static void main(String args[]){

        Book book1 = new Book("Daniel Defoe", "Robinson Crusoe", 15.50, 1719);
        Book book2 = new Book("Joseph Conrad", "Heart of Darkness", 12.80, 1902);
        Book book3 = new Book("Pat Conroy", "Beach Music", 9.50, 1996);
        Book[] arr = {book1, book2, book3};
        for(int i=0; i< 3; i++){
            System.out.println("Book name - "+arr[i].getTitle()+ ", Author - "+arr[i].getAuthorName()+ ", Price = "+arr[i].getPrice()+" and Year of publishing = "+arr[i].getYOP());
        }

    }
}

class Book{

    private String title;
    private double price;
    private int YOP;
    private String authorName;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if(title != "")
        this.title = title;
        else
        System.out.println("Enter valid title");
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYOP() {
        return YOP;
    }

    public void setYOP(int yOP) {
        if(yOP > 1000)
        this.YOP = yOP;
        else{
            System.out.println("Enter valid year");
        }
    }
    public String getAuthorName() {
        return authorName;
    }
    public void setAuthorName(String authorName) {
        if(authorName != "")
        this.authorName = authorName;
        else
        System.out.println("Enter the valid author");
    }

    Book(String title, String authorName, double price, int YOP){

        setTitle(title);
        setAuthorName(authorName);
        setYOP(YOP);
        setPrice(price);

    }

}