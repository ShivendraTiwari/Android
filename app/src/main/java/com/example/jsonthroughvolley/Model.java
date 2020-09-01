package com.example.jsonthroughvolley;

public class Model {

    String name;
    String description;
    String featured_photo;
    String qty;
    String old_price;
    String new_price;

    public Model(String featured_photo,String name, String description, String qty, String old_price, String new_price) {
        this.name = name;
        this.description = description;
        this.featured_photo = featured_photo;
        this.qty = qty;
        this.old_price = old_price;
        this.new_price = new_price;
    }

    public String getFeatured_photo() {
        return featured_photo;
    }

    public void setFeatured_photo(String featured_photo) {
        this.featured_photo = featured_photo;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public String getOld_price() {
        return old_price;
    }

    public void setOld_price(String old_price) {
        this.old_price = old_price;
    }

    public String getNew_price() {
        return new_price;
    }

    public void setNew_price(String new_price) {
        this.new_price = new_price;
    }

    public Model(String p_name, String p_description, String p_old_price, String p_image, String p_qty, String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Model{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", featured_photo='" + featured_photo + '\'' +
                ", qty='" + qty + '\'' +
                ", old_price='" + old_price + '\'' +
                ", new_price='" + new_price + '\'' +
                '}';
    }
}
