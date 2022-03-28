package tr.edu.maltepe.oop;

public class Professor extends Person {


    public Professor(long id, String name, int year) {
        super(id, name, year);

        this.setPersonType("Professor");
    }


    public void Borrow(long bookisbn){

    }

}