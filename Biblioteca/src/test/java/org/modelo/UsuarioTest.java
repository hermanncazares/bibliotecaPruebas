/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package org.modelo;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jairi
 */
public class UsuarioTest {
    
    public UsuarioTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getId method, of class Usuario.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Usuario instance = new Usuario();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Usuario.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Usuario.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Usuario instance = new Usuario();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getApellido method, of class Usuario.
     */
    @Test
    public void testGetApellido() {
        System.out.println("getApellido");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getApellido();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setApellido method, of class Usuario.
     */
    @Test
    public void testSetApellido() {
        System.out.println("setApellido");
        String apellido = "";
        Usuario instance = new Usuario();
        instance.setApellido(apellido);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipoUsuario method, of class Usuario.
     */
    @Test
    public void testGetTipoUsuario() {
        System.out.println("getTipoUsuario");
        Usuario instance = new Usuario();
        TipoUsuario expResult = null;
        TipoUsuario result = instance.getTipoUsuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipoUsuario method, of class Usuario.
     */
    @Test
    public void testSetTipoUsuario() {
        System.out.println("setTipoUsuario");
        TipoUsuario tipoUsuario = null;
        Usuario instance = new Usuario();
        instance.setTipoUsuario(tipoUsuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContraseña method, of class Usuario.
     */
    @Test
    public void testGetContraseña() {
        System.out.println("getContrase\u00f1a");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getContraseña();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setContraseña method, of class Usuario.
     */
    @Test
    public void testSetContraseña() {
        System.out.println("setContrase\u00f1a");
        String contraseña = "";
        Usuario instance = new Usuario();
        instance.setContraseña(contraseña);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsuario method, of class Usuario.
     */
    @Test
    public void testGetUsuario() {
        System.out.println("getUsuario");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getUsuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsuario method, of class Usuario.
     */
    @Test
    public void testSetUsuario() {
        System.out.println("setUsuario");
        String usuario = "";
        Usuario instance = new Usuario();
        instance.setUsuario(usuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrestamos method, of class Usuario.
     */
    @Test
    public void testGetPrestamos() {
        System.out.println("getPrestamos");
        Usuario instance = new Usuario();
        List<Prestamo> expResult = null;
        List<Prestamo> result = instance.getPrestamos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrestamos method, of class Usuario.
     */
    @Test
    public void testSetPrestamos() {
        System.out.println("setPrestamos");
        Prestamo prestamo = null;
        Usuario instance = new Usuario();
        instance.setPrestamos(prestamo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Usuario.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
