package com.miracakkoyun.oopproject;

public class SuperMusician extends Musicians{
    public SuperMusician(String name, String instrument, int age) {
        super(name, instrument, age);
    }
    // extend kullanarak Musicans sınıfının istediğim özelliklerini bu sınıfa dahil edebiliyorum
    // super ile hangilerini dahil edeceksem ğstteki iel de yazıyorum
    //Inheritance
    public String sing(){
        return "Yine aklıma düştü ölüm\n" +
                "Yoksa bi' düş mü ömür ";
    }
}
