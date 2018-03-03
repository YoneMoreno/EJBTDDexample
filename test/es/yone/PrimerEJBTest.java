/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.yone;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author YonePC
 */
public class PrimerEJBTest {

    @Test
    public void testSaluda() {
        PrimerEJB ejb = new PrimerEJB();
        assertEquals("Hola usuario", ejb.saluda("usuario"));
    }

    @Test
    public void testSaludaNull() {
        PrimerEJB ejb = new PrimerEJB();
        assertEquals("Hola desconocido", ejb.saluda(null));
    }

    @Test
    public void testSaludaNombre() {
        PrimerEJB ejb = new PrimerEJB();
        assertEquals("Hola Luisa", ejb.saluda("Luisa"));
    }
}
