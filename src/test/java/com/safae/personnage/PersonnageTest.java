package com.safae.personnage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonnageTest {

    @Test
    public void testTournerTroisQuarts() {

        Personnage personnage = new Personnage();
        personnage.tourner(3);
        assertEquals("OUEST", personnage.getOrientation());
    }

    @Test
    public void testTournerPlusieursTours() {
        Personnage personnage = new Personnage();
        assertEquals("NORD", personnage.tourner(4));
    }
}
