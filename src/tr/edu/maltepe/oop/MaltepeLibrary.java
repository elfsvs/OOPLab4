package tr.edu.maltepe.oop;
import java.util.Vector;

public class MaltepeLibrary {
    private Vector books;
    public MaltepeLibrary(){
        books =new Vector();
    }
    public void addBook (Books abook){
        books.add(abook);
    }

    public void removeBook(Books rbook){
        books.remove(rbook);
    }

    public void list_books (){
        for (int i=0; i< books.size();i++ ){
            Books temp = (Books) books.get(i);
            System.out.println(temp.getBookname());
        }
    }

    public void lendBook(Person person, Books book){
        if (books.contains(book))
        {
            person.borrowBook(book);
            removeBook(book);
            System.out.println(book.getBookname()+" borrowed by\n "+person.getName());
            System.out.println(" ");

        }
        else{
            System.out.println(book.getBookname()+" isn't available.");
            System.out.println(" ");
        }
    }
    public void borrowBook(Person person, Books book){
        person.lendBook(book);
        addBook(book);
        System.out.println(book.getBookname()+" borrowed by\n "+person.getName());
        System.out.println(" ");
    }
}