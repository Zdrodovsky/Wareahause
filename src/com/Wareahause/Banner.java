package com.Wareahause;

public class Banner {

    String name;
    int namotka;

    public Banner(String name, int namotka) {
        this.name = name;
        this.namotka = namotka;
    }

    public void setNamotka() {

    }


    @Override
    public String toString() {
        return "Banner{" +
                "name='" + name + '\'' +
                ", namotka=" + namotka +
                '}';
    }
}
