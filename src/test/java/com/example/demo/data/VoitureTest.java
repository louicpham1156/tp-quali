package com.example.demo.data;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VoitureTest {

    private Voiture voiture;

    @BeforeEach
    void setUp() {
        // Créer une nouvelle instance de Voiture avant chaque test
        voiture = new Voiture("Toyota", 20000);
    }

    @Test
    void testGetMarque() {
        assertEquals("Toyota", voiture.getMarque(), "La marque de la voiture devrait être Toyota");
    }

    @Test
    void testSetMarque() {
        voiture.setMarque("Honda");
        assertEquals("Honda", voiture.getMarque(), "La marque de la voiture devrait être Honda après le set");
    }

    @Test
    void testGetPrix() {
        assertEquals(20000, voiture.getPrix(), "Le prix de la voiture devrait être 20000");
    }

    @Test
    void testSetPrix() {
        voiture.setPrix(25000);
        assertEquals(25000, voiture.getPrix(), "Le prix de la voiture devrait être 25000 après le set");
    }

    @Test
    void testGetId() {
        // ID doit être 0 par défaut
        assertEquals(0, voiture.getId(), "L'ID de la voiture devrait être 0 par défaut");
    }

    @Test
    void testSetId() {
        voiture.setId(123);
        assertEquals(123, voiture.getId(), "L'ID de la voiture devrait être 123 après le set");
    }

    @Test
    void testToString() {
        voiture.setId(123);
        String expected = "Car{marque='Toyota', prix=20000, id=123}";
        assertEquals(expected, voiture.toString(), "La méthode toString() doit retourner la représentation correcte de la voiture");
    }
}
