package ba.unsa.etf.rpr.tut2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
Student student = new Student ("Amina" , "Kantic" , 12345);
    @Test
    void dajIme(){
        assertEquals("Amina", student.dajIme());
    }
    void dajPrezime(){
        assertEquals("Kantic", student.dajPrezime());
    }
    void dajBrojInedx(){
        assertEquals(12345, student.dajBrojIndexa());
    }
}