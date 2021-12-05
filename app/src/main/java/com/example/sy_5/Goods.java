package com.example.sy_5;

public class Goods {
    private String paiming;
    private String name;
    private String number;
    private String gang;



    public Goods(){

        }
    public Goods(String paiming, String name, String number, String gang) {
        this.paiming = paiming;
        this.name = name;
        this.number = number;
        this.gang = gang;
    }

    public String getPaiming() {
        return paiming;
    }

    public void setPaiming(String paiming) {
        this.paiming = paiming;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getGang() {
        return gang;
    }

    public void setGang(String gang) {
        this.gang = gang;
    }
}
