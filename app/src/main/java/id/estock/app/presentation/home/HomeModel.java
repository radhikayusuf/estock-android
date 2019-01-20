package id.estock.app.presentation.home;

import java.util.List;

public class HomeModel {


    private List<HomeCorouselItemModel> caraouselModels;

    private List<HomeContentItemModel> contentModels;

    public HomeModel(List<HomeCorouselItemModel> caraouselModels, List<HomeContentItemModel> contentModels) {
        this.caraouselModels = caraouselModels;
        this.contentModels = contentModels;
    }

    public List<HomeCorouselItemModel> getCaraouselModels() {
        return caraouselModels;
    }

    public void setCaraouselModels(List<HomeCorouselItemModel> caraouselModels) {
        this.caraouselModels = caraouselModels;
    }

    public List<HomeContentItemModel> getContentModels() {
        return contentModels;
    }

    public void setContentModels(List<HomeContentItemModel> contentModels) {
        this.contentModels = contentModels;
    }

    public static class HomeCorouselItemModel{
        private int id;
        private String title;
        private String subTitle;
        private String imageUrl;

        public HomeCorouselItemModel(int id, String title, String subTitle, String imageUrl) {
            this.id = id;
            this.title = title;
            this.subTitle = subTitle;
            this.imageUrl = imageUrl;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getImageUrl() {
            return imageUrl;
        }

        public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }

        public String getSubTitle() {
            return subTitle;
        }

        public void setSubTitle(String subTitle) {
            this.subTitle = subTitle;
        }
    }

    public static class HomeContentItemModel{
        private int id;
        private String title;
        private String imageUrl;
        private Double price;

        public HomeContentItemModel(int id, String title, String imageUrl, Double price) {
            this.id = id;
            this.title = title;
            this.imageUrl = imageUrl;
            this.price = price;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getImageUrl() {
            return imageUrl;
        }

        public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }

        public Double getPrice() {
            return price;
        }

        public void setPrice(Double price) {
            this.price = price;
        }
    }

}
