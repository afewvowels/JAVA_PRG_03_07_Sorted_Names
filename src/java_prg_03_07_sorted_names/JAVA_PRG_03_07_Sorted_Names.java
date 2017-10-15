/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_prg_03_07_sorted_names;

import javax.swing.JOptionPane;
/**
 *
 * @author bluebackdev
 * Write a program that asks the user to enter three names, and then displays
 * the names sorted in ascending order. For example, if the user entered
 * "Charlie", "Leslie", and "Andy", the program would display:
 * 
 *      Andy
 *      Charlie
 *      Leslie
 */
public class JAVA_PRG_03_07_Sorted_Names {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create strings to hold user inputs
        String strName01;
        String strName02;
        String strName03;
        String strTemp;
        
        // Get names from user
        strName01 = JOptionPane.showInputDialog("Please enter the first name\n" +
                "to compare.");
        strName02 = JOptionPane.showInputDialog("Please enter the second name\n" +
                "to compare.");
        strName03 = JOptionPane.showInputDialog("Please enter the third name\n" +
                "to compare.");
        
        // Compare first and second names, swap if first is greater than second
        // i.e. name1 = B, name2 = A
        if(strName01.compareTo(strName02) > 0)
        {
            strTemp = strName01;
            strName01 = strName02;
            strName02 = strTemp;
        }
        // Compare second and third names, swap is second is greater than third
        // i.e. name2 = C, name3 = B;
        if(strName02.compareTo(strName03) > 0)
        {
            strTemp = strName02;
            strName02 = strName03;
            strName03 = strTemp;
        }
        // Compare first and second again, swap if first is greater than second
        // i.e. name1 = B, name2 = A
        if(strName01.compareTo(strName02) > 0)
        {
            strTemp = strName01;
            strName01 = strName02;
            strName02 = strTemp;
        }
        
        // Output ordered names for user
        JOptionPane.showMessageDialog(null, strName01 + "\n" + strName02 + "\n" + strName03);
        
        System.exit(0);
    }
    
}
