package zhong.jason.seniorresearchproject;

public class fragInfo {
    private String title;
    private String date;
    private String imageURL;

    public fragInfo(String t, String d, String iURL){
        title = t;
        date = d;
        imageURL = iURL;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}
