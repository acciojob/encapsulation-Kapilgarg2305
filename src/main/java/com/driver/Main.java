package com.driver;

public class Main {
    public static void main(String args[]) {
        RWOnly kk = new RWOnly();
        //kk.name = "kapil";
        //java: name has private access in com.driver.RWOnly

        kk.setName("kapil");
        kk.getName();
    }

}