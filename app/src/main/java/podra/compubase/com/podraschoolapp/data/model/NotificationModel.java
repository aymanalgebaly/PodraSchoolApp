package podra.compubase.com.podraschoolapp.data.model;

public class NotificationModel {

    private String title,body;
    private int noti_img;

    public int getNoti_img() {
        return noti_img;
    }

    public void setNoti_img(int noti_img) {
        this.noti_img = noti_img;
    }

    public NotificationModel() {
    }

    public NotificationModel(String title, String body, int noti_img) {
        this.title = title;
        this.body = body;
        this.noti_img = noti_img;
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
