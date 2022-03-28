package tr.edu.maltepe.oop;

public class Books {

    private String bookname;

    public Books(String name){
        bookname = name;
    }


    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

}