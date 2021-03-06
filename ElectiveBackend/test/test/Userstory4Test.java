package test;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import backend.DummyBackend;
import model.Priorities;
import model.Pool;
import java.util.ArrayList;
import model.ElectiveSubject;
import model.Teacher;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kristijan
 */
public class Userstory4Test {
    
    public Userstory4Test() {
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
    
    @Test
    public void makePoolTest() {
        Pool pool = new Pool();
        assertNotNull(pool);
    }
    
    @Test
    public void addSubjectToPoolTest() {
        Pool pool = new Pool();
        Teacher t1 = new Teacher(1, "Torben", "?", 111, "tor@cph.dk", "cocio2013");
        ElectiveSubject es = new ElectiveSubject(7,"C#","C Sharp", t1);
        pool.addSubject(es);
        int size = pool.getSize();
        assertEquals(1, size);        
    }
    
    @Test
    public void studentStatisticTest() {
        
        DummyBackend des = new DummyBackend();
        
        ArrayList<Priorities> prio = des.getStudentPoolSatisfaction();
        
        assertNotNull(prio);
        
        
    }
}