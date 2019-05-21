package podra.compubase.com.podraschoolapp.data.model;

public class InboxModel {

    private String title,body;

    public InboxModel() {
    }

    public InboxModel(String title, String body) {
        this.title = title;
        this.body = body;
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
