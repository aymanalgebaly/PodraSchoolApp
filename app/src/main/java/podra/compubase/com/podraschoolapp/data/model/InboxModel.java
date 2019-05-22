package podra.compubase.com.podraschoolapp.data.model;

public class InboxModel {

    private String title,body,date;
    private int delete_img;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getDelete_img() {
        return delete_img;
    }

    public void setDelete_img(int delete_img) {
        this.delete_img = delete_img;
    }

    public InboxModel() {
    }

    public InboxModel(String title, String body, String date, int delete_img) {
        this.title = title;
        this.body = body;
        this.date = date;
        this.delete_img = delete_img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
