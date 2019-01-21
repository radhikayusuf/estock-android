package id.estock.app.presentation.profile;

public class ProfileModel {
    private int idUser;
    private String name;
    private String address;
    private String email;
    private String imageUrl;

    public ProfileModel(int idUser, String name, String address, String email, String imageUrl) {
        this.idUser = idUser;
        this.name = name;
        this.address = address;
        this.email = email;
        this.imageUrl = imageUrl;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
