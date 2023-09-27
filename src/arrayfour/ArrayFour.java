/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrayfour;

/**
 *
 * @author lab_services_student
 */
public class ArrayFour {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //declare a double array
       //                1   2  3     4
       double[]myList={2.5,3.1,108.4,170.4};
        System.out.println("The items in the array");
        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i]);
            
        }
        //reverse all items
        System.out.println("the array is reversed");
        for (int i = myList.length -1; i > 0; i--) {
            System.out.println(myList[i]);
            
        }
        
        
    }
    
}
