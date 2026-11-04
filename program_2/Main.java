class Book
{
int bookId,price;
String author,title;
static int count=0;
Book(int i,int p,String a,String t)
{
this.bookId=i;
this.price=p;
this.author=a;
this.title=t;
count++;
}
void display()
{
System.out.println("-----Book Details-----");
System.out.println("book Id:"+bookId);
System.out.println("price:"+price);
System.out.println("author:"+author);
System.out.println("title:"+title);
}
void search(int i)
{
if (bookId==i)
{
System.out.println("Book of "+i+" ID is present:");
display();
}
}
void search(String t)
{
if (title.equalsIgnoreCase(t))
{
System.out.println("Book of "+t+"title is present:");
display();
}
}
static Book costlier(Book b1,Book b2)
{
if (b1.price>b2.price)
{
return b1;
}
else
{
return b2;
}
}
}

public class Main
{
public static void main(String[]args)
{
Book b1 =new Book(101,500,"sharath","sea");
Book b2 =new Book(102,700,"chethan","autobiography");
b1.display();
b2.display();
b1.search(101);
b2.search("autobiography");
Book b=Book.costlier(b1,b2);
System.out.println("the deatils of the costlier book is");
b.display();
System.out.println("the total number of books is "+ Book.count);
}
}




