package com.example.nethanjan.projectuiux;

public class FamilyClass {

    private int familysoundimage;
    private String familyenglish;
    private String familymaori;
    private int familyimage;
    private int sound;

    public FamilyClass(int familysoundimage, String familyenglish, String familymaori, int familyimage, int sound){
        this.familysoundimage = familysoundimage;
        this.familyenglish = familyenglish;
        this.familymaori = familymaori;
        this.familyimage = familyimage;
        this.sound = sound;
    }

    public int getfamilysoundimage() {
        return familysoundimage;
    }

    public String getfamilyenglish() {
        return familyenglish;
    }

    public String getfamilymaori() {
        return familymaori;
    }

    public int getfamilyimage() {
        return familyimage;
    }

    public int getSound() {
        return sound;
    }
    
}
