package com.example.nethanjan.projectuiux;

public class NumberClass {

    private int numbersoundimage;
    private String numberenglish;
    private String numbermaori;
    private int numberimage;
    private int sound;

    public NumberClass(int numbersoundimage, String numberenglish, String numbermaori, int numberimage, int sound){
        this.numbersoundimage = numbersoundimage;
        this.numberenglish = numberenglish;
        this.numbermaori = numbermaori;
        this.numberimage = numberimage;
        this.sound = sound;
    }

    public int getNumbersoundimage() {
        return numbersoundimage;
    }

    public String getNumberenglish() {
        return numberenglish;
    }

    public String getNumbermaori() {
        return numbermaori;
    }

    public int getNumberimage() {
        return numberimage;
    }

    public int getSound() {
        return sound;
    }
}
