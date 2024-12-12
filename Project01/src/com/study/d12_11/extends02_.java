package com.study.d12_11;

public class extends02_ {
    public static void main(String[] args) {
        PC pc = new PC("levle");
        NotePad notePad = new NotePad("red");

    }
}

class Computer {
    private String cpu;
    private String neicun;
    private String yingpan;

    public Computer() {
    }

    public Computer(String cpu, String neicun, String yingpan) {
        this.cpu = cpu;
        this.neicun = neicun;
        this.yingpan = yingpan;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getNeicun() {
        return neicun;
    }

    public void setNeicun(String neicun) {
        this.neicun = neicun;
    }

    public String getYingpan() {
        return yingpan;
    }

    public void setYingpan(String yingpan) {
        this.yingpan = yingpan;
    }

    public String getDetails() {
        return cpu + neicun + yingpan;
    }
}

class PC extends Computer {
    private String brand;

    public PC() {
    }

    public PC(String brand) {
        this.brand = brand;
    }
}

class NotePad extends Computer {
    private String color;

    public NotePad() {
    }

    public NotePad(String color) {
        this.color = color;
    }
}
