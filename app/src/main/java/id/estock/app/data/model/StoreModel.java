package id.estock.app.data.model;

public class StoreModel {
    private String id;
    private String namaUser;
    private String imageUrl;

    public StoreModel(String id, String namaUser, String imageUrl) {
        this.id = id;
        this.namaUser = namaUser;
        this.imageUrl = imageUrl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNamaUser() {
        return namaUser;
    }

    public void setNamaUser(String namaUser) {
        this.namaUser = namaUser;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
