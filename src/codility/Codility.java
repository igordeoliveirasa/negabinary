/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codility;

/**
 *
 * @author igor
 */
public class Codility {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ola Mundo!");
    }
    
    public int sumArrayValues(int[]array, int fromIndex, int toIndex) {
        int ret = 0;
        for (int i=fromIndex; i<=toIndex; i++) {
            ret += array[i];
        }
        return ret;
    }
    
    public boolean isIndexAnEquilibrium(int[] array, int index) {
        boolean ret = false;
        if (array.length>=3) {
            int sumLeft = sumArrayValues(array, 0, index-1); 
            int sumRight = sumArrayValues(array, index+1, array.length-1);
            ret = (sumLeft == sumRight);
        }
        return ret;
    }
    
    public int solution(int[] A) {
        int ret = -1;
        
        if (A.length>=3) {
            for (int i=1; i<A.length-1; i++) {
                if (isIndexAnEquilibrium(A, i)) {
                    ret = i;
                    break;
                }
            }
        }
        
        return ret;
    }
    
}
