package podra.compubase.com.podraschoolapp.data.model;

public class NotificationModel {

    private String title,body;

    public NotificationModel() {
    }

    public NotificationModel(String title, String body) {
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
