package com.example.nethanjan.projectuiux;

public class ColorClass {

    private int colorsoundimage;
    private String colorenglish;
    private String colormaori;
    private int color;
    private int sound;

    public ColorClass(int colorsoundimage, String colorenglish, String colormaori, int color, int sound) {
        this.colorsoundimage = colorsoundimage;
        this.colorenglish = colorenglish;
        this.colormaori = colormaori;
        this.color = color;
        this.sound = sound;
    }

    public int getColorsoundimage() {
        return colorsoundimage;
    }

    public String getColorenglish() {
        return colorenglish;
    }

    public String getColormaori() {
        return colormaori;
    }

    public int getColor() {
        return color;
    }

    public int getSound() {
        return sound;
    }
}
