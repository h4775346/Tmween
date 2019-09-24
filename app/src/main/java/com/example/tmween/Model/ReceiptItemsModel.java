package com.example.tmween.Model;

public class ReceiptItemsModel {

    private String receipt_product_name;
    private String receipt_product_count;
    private String receipt_product_price;
    private String receipt_product_total_price;

    public ReceiptItemsModel() {
    }

    public ReceiptItemsModel(String receipt_product_name, String receipt_product_count, String receipt_product_price, String receipt_product_total_price) {
        this.receipt_product_name = receipt_product_name;
        this.receipt_product_count = receipt_product_count;
        this.receipt_product_price = receipt_product_price;
        this.receipt_product_total_price = receipt_product_total_price;
    }

    public String getReceipt_product_name() {
        return receipt_product_name;
    }

    public void setReceipt_product_name(String receipt_product_name) {
        this.receipt_product_name = receipt_product_name;
    }

    public String getReceipt_product_count() {
        return receipt_product_count;
    }

    public void setReceipt_product_count(String receipt_product_count) {
        this.receipt_product_count = receipt_product_count;
    }

    public String getReceipt_product_price() {
        return receipt_product_price;
    }

    public void setReceipt_product_price(String receipt_product_price) {
        this.receipt_product_price = receipt_product_price;
    }

    public String getReceipt_product_total_price() {
        return receipt_product_total_price;
    }

    public void setReceipt_product_total_price(String receipt_product_total_price) {
        this.receipt_product_total_price = receipt_product_total_price;
    }
}
