package com.example.micardview_e02_cardview;

public class MyModel {
    private String Name, Price;
    private Integer ImageRes;

    public MyModel(Integer imageRes, String name, String price) {
        ImageRes = imageRes;
        Name = name;
        Price = price;
    }
    public Integer getImageRes() {return ImageRes;}
    public void setImageRes(Integer imageRes) {ImageRes = imageRes;}
    public String getName() {return Name;}
    public void setName(String name) {Name = name;}
    public String getPrice() {return Price;}
    public void setPrice(String price) {Price = price;}
}
