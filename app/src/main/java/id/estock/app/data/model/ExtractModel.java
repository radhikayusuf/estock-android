package id.estock.app.data.model;

public class ExtractModel {
    private String id;
    private String title;
    private String dec;
    private String extra;

    public ExtractModel(String id, String title, String dec, String extra) {
        this.id = id;
        this.title = title;
        this.dec = dec;
        this.extra = extra;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDec() {
        return dec;
    }

    public void setDec(String dec) {
        this.dec = dec;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }
}
