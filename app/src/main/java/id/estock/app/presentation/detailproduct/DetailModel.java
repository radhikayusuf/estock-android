package id.estock.app.presentation.detailproduct;

import java.util.List;

import id.estock.app.data.model.ExtractModel;
import id.estock.app.data.model.StoreModel;

public class DetailModel {

    private String id;
    private String productName;
    private String imageUrl;
    private String desc;
    private Double price;
    private StoreModel storeModel;
    private List<ExtractModel> extractModelList;

    public DetailModel(String id, String productName, String imageUrl, String desc, Double price, StoreModel storeModel, List<ExtractModel> extractModelList) {
        this.id = id;
        this.productName = productName;
        this.imageUrl = imageUrl;
        this.desc = desc;
        this.price = price;
        this.storeModel = storeModel;
        this.extractModelList = extractModelList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public StoreModel getStoreModel() {
        return storeModel;
    }

    public void setStoreModel(StoreModel storeModel) {
        this.storeModel = storeModel;
    }

    public List<ExtractModel> getExtractModelList() {
        return extractModelList;
    }

    public void setExtractModelList(List<ExtractModel> extractModelList) {
        this.extractModelList = extractModelList;
    }
}
