import java.util.ArrayList; // import the ArrayList class

public class Library {
     private ArrayList<Book> books;
public Library (){
    this.books = new  ArrayList<Book>();
}   
public void setBook(Book book){
    this.books.add(book);
}
public  ArrayList<Book> getBooks(){
    return books;
}

public static void main(String[] args) {
 Publisher p = new Publisher("null", "null");
    Book b = new Book("The Lord of the Rings", "J.R.R. Tolkien", p);
    AudioBook a = new AudioBook("The Martian", "Andy Weir", 11, 22, p);
    AudioBook audioBook2 = new AudioBook("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", 3, 54, p);

    Library l = new Library();
    l.setBook(b);
    l.setBook(a);
    // l.display();
for (Book i:l.books){
    i.display();
}
}
}
