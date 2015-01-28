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
   
    @Test
    public void hello() {
        Codility codility = new Codility();
        assertArrayEquals(codility.solution(new int[] {1,0,0,1,1}), new int[]{1,1,0,1});
        assertArrayEquals(codility.solution(new int[] {1,0,0,1,1,1}), new int[]{1,1,0,1,0,1,1});
    }       
}
