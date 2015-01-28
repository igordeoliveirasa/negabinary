/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import codility.Codility;

/**
 *
 * @author igor
 */
public class MainTest {

    public MainTest() {
    }

    @Before
    public void setUp() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void hello() {
        Codility toptal = new Codility();
        int[] array = new int[]{-1, 3, -4, 5, 1, -6, 2, 1};
        assertTrue(toptal.isIndexAnEquilibrium(array, 1));
        assertTrue(toptal.isIndexAnEquilibrium(array, 3));
        assertTrue(toptal.isIndexAnEquilibrium(array, 7));

        assertTrue(!toptal.isIndexAnEquilibrium(array, 2));
        assertTrue(!toptal.isIndexAnEquilibrium(array, 4));
        assertTrue(!toptal.isIndexAnEquilibrium(array, 5));
        assertTrue(!toptal.isIndexAnEquilibrium(array, 6));
        assertTrue(!toptal.isIndexAnEquilibrium(array, 8));
        
        
        assertEquals(toptal.sumArrayValues(array, 0, array.length - 1), 1);

        int ret = toptal.solution(array);
        assertEquals(ret, 1);
        
    }
}
