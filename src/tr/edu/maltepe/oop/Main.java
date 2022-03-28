package tr.edu.maltepe.oop;

public class Main {
    public static void main(String[] args) {
        Books book1, book2, book3;
        MaltepeLibrary MAULib = new MaltepeLibrary();

        Professor prof = new Professor(20222022,"Ensar Gül ",2022);
        Students student = new Students(190704017,"Elif Savas", 2022,prof);



        book1 = new Books("Java Programing");
        book2 = new Books("C Programming  ");
        book3 = new Books("Phyton");

        MAULib.addBook(book1);
        MAULib.addBook(book2);
        MAULib.addBook(book3);

        System.out.println("Books of Library");
        MAULib.list_books();
        System.out.println(" ");

        MAULib.lendBook(prof,book1);
        MAULib.lendBook(student,book2);

        MAULib.lendBook(student,book1);

        MAULib.borrowBook(prof,book1);
        MAULib.lendBook(prof,book3);

        MAULib.lendBook(student,book1);

        prof.ShowHaveBooks();
        student.ShowHaveBooks();

    }

}