package com.company;

public class Software extends Product {

    private String programmer;
    private String platform; // linux, mac, or pc
    private String os;

    public Software(){}

    public Software(String str){

        programmer = str;

    }


    @Override
    public String toString(){
        return  "Code:               " + this.getCode() + "\n" +
                "Description:        " + this.getDescription() + "\n" +
                "Price:              " + this.getFormattedPrice(this.getPrice()) + "\n" +
                "Software written by " + programmer;

    }


    public String getProgrammer() {

        return programmer;

    }



    public void setProgrammer(String programmer) {

        this.programmer = programmer;

    }



    public String getPlatform() {

        return platform;

    }



    public void setPlatform(String platform) {

        this.platform = platform;

    }



    public String getOs() {

        return os;

    }



    public void setOs(String os) {

        this.os = os;

    }
}
