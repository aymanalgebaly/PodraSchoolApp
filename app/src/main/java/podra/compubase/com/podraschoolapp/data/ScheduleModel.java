package podra.compubase.com.podraschoolapp.data;

public class ScheduleModel {
    private int class_img,book_img;
    private String clas,book,from,to;

    public ScheduleModel() {
    }

    public ScheduleModel(int class_img, int book_img, String clas, String book, String from, String to) {
        this.class_img = class_img;
        this.book_img = book_img;
        this.clas = clas;
        this.book = book;
        this.from = from;
        this.to = to;
    }

    public int getClass_img() {
        return class_img;
    }

    public void setClass_img(int class_img) {
        this.class_img = class_img;
    }

    public int getBook_img() {
        return book_img;
    }

    public void setBook_img(int book_img) {
        this.book_img = book_img;
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }
}
