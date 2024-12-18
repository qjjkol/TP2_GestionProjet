package com.safae.personnage;

public class Personnage {
    private String orientation;

    public Personnage() {
        this.orientation = "NORD";
    }

    public String tourner(int fois) {
        String[] orientations = {"NORD", "EST", "SUD", "OUEST"};
        int indexActuel = 0;

        for (int i = 0; i < orientations.length; i++) {
            if (orientations[i].equals(orientation)) {
                indexActuel = i;
                break;
            }
        }

        int nouvelIndex = (indexActuel + fois) % orientations.length;
        orientation = orientations[nouvelIndex];
        return orientation;
    }

    public String getOrientation() {
        return orientation;
    }
}
