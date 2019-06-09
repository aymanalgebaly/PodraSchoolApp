package podra.compubase.com.podraschoolapp.data.model;

public class LibraryModel {
    private String NameOfBook,Num,Num_Rack;

    public LibraryModel() {
    }

    public LibraryModel(String nameOfBook, String num, String num_Rack) {
        NameOfBook = nameOfBook;
        Num = num;
        Num_Rack = num_Rack;
    }

    public String getNameOfBook() {
        return NameOfBook;
    }

    public void setNameOfBook(String nameOfBook) {
        NameOfBook = nameOfBook;
    }

    public String getNum() {
        return Num;
    }

    public void setNum(String num) {
        Num = num;
    }

    public String getNum_Rack() {
        return Num_Rack;
    }

    public void setNum_Rack(String num_Rack) {
        Num_Rack = num_Rack;
    }
}
