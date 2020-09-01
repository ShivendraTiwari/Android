package com.example.jsonthroughvolley;

import java.util.List;

public class Record {
    public String p_id;
    public String p_name;
    public String p_old_price;
    public String p_current_price;
    public String p_qty;
    public String p_featured_photo;
    public String p_description;
    public String p_short_description;
    public String p_feature;
    public String p_condition;
    public String p_return_policy;
    public String p_total_view;
    public String p_is_featured;
    public String p_is_active;
    public String tcat_id;
    public String category_name;
    public String vendor_id;
    public String vendor_name;
    public String favorite;
    public String discount;
    public object rating;

    public Record(String p_id, String p_name, String p_old_price, String p_current_price, String p_qty, String p_featured_photo, String p_description, String p_short_description, String p_feature, String p_condition, String p_return_policy, String p_total_view, String p_is_featured, String p_is_active, String tcat_id, String category_name, String vendor_id, String vendor_name, String favorite, String discount, object rating) {
        this.p_id = p_id;
        this.p_name = p_name;
        this.p_old_price = p_old_price;
        this.p_current_price = p_current_price;
        this.p_qty = p_qty;
        this.p_featured_photo = p_featured_photo;
        this.p_description = p_description;
        this.p_short_description = p_short_description;
        this.p_feature = p_feature;
        this.p_condition = p_condition;
        this.p_return_policy = p_return_policy;
        this.p_total_view = p_total_view;
        this.p_is_featured = p_is_featured;
        this.p_is_active = p_is_active;
        this.tcat_id = tcat_id;
        this.category_name = category_name;
        this.vendor_id = vendor_id;
        this.vendor_name = vendor_name;
        this.favorite = favorite;
        this.discount = discount;
        this.rating = rating;

    }

    public String getP_id() {
        return p_id;
    }

    public void setP_id(String p_id) {
        this.p_id = p_id;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public String getP_old_price() {
        return p_old_price;
    }

    public void setP_old_price(String p_old_price) {
        this.p_old_price = p_old_price;
    }

    public String getP_current_price() {
        return p_current_price;
    }

    public void setP_current_price(String p_current_price) {
        this.p_current_price = p_current_price;
    }

    public String getP_qty() {
        return p_qty;
    }

    public void setP_qty(String p_qty) {
        this.p_qty = p_qty;
    }

    public String getP_featured_photo() {
        return p_featured_photo;
    }

    public void setP_featured_photo(String p_featured_photo) {
        this.p_featured_photo = p_featured_photo;
    }

    public String getP_description() {
        return p_description;
    }

    public void setP_description(String p_description) {
        this.p_description = p_description;
    }

    public String getP_short_description() {
        return p_short_description;
    }

    public void setP_short_description(String p_short_description) {
        this.p_short_description = p_short_description;
    }

    public String getP_feature() {
        return p_feature;
    }

    public void setP_feature(String p_feature) {
        this.p_feature = p_feature;
    }

    public String getP_condition() {
        return p_condition;
    }

    public void setP_condition(String p_condition) {
        this.p_condition = p_condition;
    }

    public String getP_return_policy() {
        return p_return_policy;
    }

    public void setP_return_policy(String p_return_policy) {
        this.p_return_policy = p_return_policy;
    }

    public String getP_total_view() {
        return p_total_view;
    }

    public void setP_total_view(String p_total_view) {
        this.p_total_view = p_total_view;
    }

    public String getP_is_featured() {
        return p_is_featured;
    }

    public void setP_is_featured(String p_is_featured) {
        this.p_is_featured = p_is_featured;
    }

    public String getP_is_active() {
        return p_is_active;
    }

    public void setP_is_active(String p_is_active) {
        this.p_is_active = p_is_active;
    }

    public String getTcat_id() {
        return tcat_id;
    }

    public void setTcat_id(String tcat_id) {
        this.tcat_id = tcat_id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public String getVendor_id() {
        return vendor_id;
    }

    public void setVendor_id(String vendor_id) {
        this.vendor_id = vendor_id;
    }

    public String getVendor_name() {
        return vendor_name;
    }

    public void setVendor_name(String vendor_name) {
        this.vendor_name = vendor_name;
    }

    public String getFavorite() {
        return favorite;
    }

    public void setFavorite(String favorite) {
        this.favorite = favorite;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public object getRating() {
        return rating;
    }

    public void setRating(object rating) {
        this.rating = rating;
    }
    String json="{}";
}


//class Example {
//    public List<Record> records;
//
//records.add(newRecord());
//
//}



