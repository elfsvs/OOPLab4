package tr.edu.maltepe.oop;

import java.util.Vector;

public class Person {
    private Vector<Books> books = new Vector<Books>();
    private long id;
    private String name;
    private int age;
    private String personType ;

    public Person(long id, String name, int age){
        this.id = id;
        this.name= name;
        this.age=age;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    protected String getPersonType() {
        return personType;
    }
    protected void setPersonType(String personType) {
        this.personType = personType;
    }

    public void  ShowInfo()
    {   System.out.println(" ");
        System.out.println(personType+" ID : "+ id + ", " +personType+" Name : "+ name);
    }

    public void borrowBook (Books bbook){
        books.add(bbook);
    }

    public void ShowHaveBooks(){
        System.out.println("");
        System.out.println(name+"'s borrowed books   ");
        for (int i = 0; i< books.size();i++)
        {
            System.out.println(books.get(i).getBookname());
        }
    }

    public void lendBook(Books lbook){
        books.remove(lbook);
    }
}