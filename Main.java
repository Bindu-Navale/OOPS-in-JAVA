class Book{
    int bookid;
    String title;
    String author;
    double price;
    static int BookCount=0;
    Book(int BookID, String title,String author,double price){
    this.bookid=BookID;
    this.title=title;
    this.author=author;
    this.price=price;
    BookCount++;
    }
    void display(){
    System.out.println(" BookID "+bookid);
    System.out.println(" Title "+title);
    System.out.println(" Author"+author);
    System.out.println(" Price "+price);
    }
    boolean search(int id){
    return bookid==id;
    }
    boolean search(String title){
    return this.title.equalsIgnoreCase(title);
    }
    Book costlier(Book b){
     if(this.price>b.price)
        return this;
     else
            return b;
    }
    static void displayCount(){
    System.out.println("Total books : "+BookCount);
    }
}
public class Main{
public static void main(String[] args){
        Book b1 = new Book(101, "Java", "Ram", 550);
        Book b2 = new Book(102, "Python", "Dev", 600);
        Book b3 = new Book(103, "C++", "Devika", 400);

       
        System.out.println("BOOK DETAILS");
        System.out.println("----------------");

        b1.display();
        b2.display();
        b3.display();

        
        System.out.println("Searching Book ID 102:");
        if (b1.search(102))
            b1.display();
        else if (b2.search(102))
            b2.display();
        else if (b3.search(102))
            b3.display();
        else
            System.out.println("Book not found.");

       
        System.out.println("Searching by Title: OOP");
        if (b1.search("OOP"))
            b1.display();
        else if (b2.search("OOP"))
            b2.display();
        else if (b3.search("OOP"))
            b3.display();
        else
            System.out.println("Book not found");

        Book costly = b1.costlier(b2);
        System.out.println("Costlier book between Book 1 and Book 2:");
        costly.display();

        Book.displayCount();
    }
}

    