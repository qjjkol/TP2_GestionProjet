package com.safae.personnage;

public class Main {

        public static void main(String[] args) {
            Personnage personnage = new Personnage();

            System.out.println("Orientation initiale : " + personnage.getOrientation());


            System.out.println("Après tourner(1) : " + personnage.tourner(1));

            System.out.println("Après tourner(3) : " + personnage.tourner(3));

            System.out.println("Après tourner(4) : " + personnage.tourner(4));
        }
    }


