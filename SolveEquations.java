package Lab01;

//Example 6: SolveEquations.java

import javax.swing.JOptionPane;
import java.lang.Math;

public class SolveEquations {
	public static void main(String[] args) {
        String strNum, strNum1, strNum2, strNum3, strNum4;
        String strNum11, strNum12, strNum21, strNum22, strNum31, strNum32;
        String strNotification1 = ""
        		+ "1. The first-degree equation with one variable\n"
        		+ "2. The system of first-degree equations with two variables\n"
        		+ "3. The second-degree equation with one variable ";
        String strNotification2 = "Roots of the equations: ";
        String strNotification3 = "The equation has no solution.";
        String strNotification4 = "Infinitely many roots. ";
        
        JOptionPane.showMessageDialog(null, strNotification1,
                "Menu", JOptionPane.INFORMATION_MESSAGE);
        
        strNum = JOptionPane.showInputDialog(null,
                "Please input the number of option: ", "Input the option ",
                JOptionPane.INFORMATION_MESSAGE);
        
        int num = Integer.parseInt(strNum);
        double num1, num2, num3, num4, num5;
        double num11, num12, num21, num22, num31, num32;
        double num01, num02, num03, num04, num05, num06;
        
        if(num == 1) {
        	strNum1 = JOptionPane.showInputDialog(null,
        			"Please input a: ", "Input a",
        			JOptionPane.INFORMATION_MESSAGE);
        	
        	strNum2 = JOptionPane.showInputDialog(null,
        			"Please input b: ", "Input b",
        			JOptionPane.INFORMATION_MESSAGE);
        	
        	num1 = Double.parseDouble(strNum1);
        	num2 = Double.parseDouble(strNum2);
        	
        	if(num1 == 0) {
        		if(num2 != 0) {
        			JOptionPane.showMessageDialog(null, strNotification3,
                            "Result", JOptionPane.INFORMATION_MESSAGE);
        		}
        		else {
        			JOptionPane.showMessageDialog(null, strNotification4,
                            "Result", JOptionPane.INFORMATION_MESSAGE);
        		}
        	}
        	else {
        		num3 = (-1) * num2 / num1;
        		strNum3 = String.valueOf(num3);
        		strNotification2 += strNum3;
        		JOptionPane.showMessageDialog(null, strNotification2,
                        "Result", JOptionPane.INFORMATION_MESSAGE);
        	}
        }
        
        else if(num == 2) {
        	strNum11 = JOptionPane.showInputDialog(null,
        			"Please input a11: ", "Input a11",
        			JOptionPane.INFORMATION_MESSAGE);
        	
        	strNum12 = JOptionPane.showInputDialog(null,
        			"Please input a12: ", "Input a12",
        			JOptionPane.INFORMATION_MESSAGE);
        	
        	strNum21 = JOptionPane.showInputDialog(null,
        			"Please input a21: ", "Input a21",
        			JOptionPane.INFORMATION_MESSAGE);
        	
        	strNum22 = JOptionPane.showInputDialog(null,
        			"Please input a22: ", "Input a22",
        			JOptionPane.INFORMATION_MESSAGE);
        	
        	strNum31 = JOptionPane.showInputDialog(null,
        			"Please input b1: ", "Input a11",
        			JOptionPane.INFORMATION_MESSAGE);
        	
        	strNum32 = JOptionPane.showInputDialog(null,
        			"Please input b2: ", "Input a11",
        			JOptionPane.INFORMATION_MESSAGE);
        	
        	num11 = Double.parseDouble(strNum11);
        	num12 = Double.parseDouble(strNum12);
        	num21 = Double.parseDouble(strNum21);
        	num22 = Double.parseDouble(strNum22);
        	num31 = Double.parseDouble(strNum31);
        	num32 = Double.parseDouble(strNum32);
        	
        	num01 = num11 * num22;
        	num02 = num21 * num12;
        	num03 = num31 * num22;
        	num04 = num32 * num12;
        	num05 = num31 * num21;
        	num06 = num32 * num11;
        	
        	if(num01 == num02) {
        		if(num03 != num04) {
        			JOptionPane.showMessageDialog(null, strNotification3,
                            "Result", JOptionPane.INFORMATION_MESSAGE);
        		}
        		else {
        			JOptionPane.showMessageDialog(null, strNotification4,
                            "Result", JOptionPane.INFORMATION_MESSAGE);
        		}
        	}
        	else {
        		num3 = (num03 - num04) / (num01 - num02);
        		strNum3 = String.valueOf(num3);
        		strNotification2 += "(" + strNum3 + "," ;
        		
        		num3 = (num05 - num06) / (num01 - num02);
        		strNum3 = String.valueOf(num3);
        		strNotification2 += strNum3 + ")" ;
        		
        		JOptionPane.showMessageDialog(null, strNotification2,
                        "Result", JOptionPane.INFORMATION_MESSAGE);
        	}
        	
        }
        
        else {
        	strNum1 = JOptionPane.showInputDialog(null,
        			"Please input a: ", "Input a",
        			JOptionPane.INFORMATION_MESSAGE);
        	
        	strNum2 = JOptionPane.showInputDialog(null,
        			"Please input b: ", "Input b",
        			JOptionPane.INFORMATION_MESSAGE);
        	
        	strNum4 = JOptionPane.showInputDialog(null,
        			"Please input c: ", "Input c",
        			JOptionPane.INFORMATION_MESSAGE);
        	
        	num1 = Double.parseDouble(strNum1);
        	num2 = Double.parseDouble(strNum2);
        	num4 = Double.parseDouble(strNum4);
        	
        	num5 = num2 * num2 - 4 * num1 * num4;
        	
        	if(num1 == 0) {
        		if(num2 == 0) {
            		if(num4 != 0) {
            			JOptionPane.showMessageDialog(null, strNotification3,
                                "Result", JOptionPane.INFORMATION_MESSAGE);
            		}
            		else {
            			JOptionPane.showMessageDialog(null, strNotification4,
                                "Result", JOptionPane.INFORMATION_MESSAGE);
            		}
            	}
            	else {
            		num3 = (-1) * num4 / num2;
            		strNum3 = String.valueOf(num3);
            		strNotification2 += strNum3;
            		JOptionPane.showMessageDialog(null, strNotification2,
                            "Result", JOptionPane.INFORMATION_MESSAGE);
            	}
        	}
        	
        	else {
        		if(num5 < 0) {
        			JOptionPane.showMessageDialog(null, strNotification3,
                            "Result", JOptionPane.INFORMATION_MESSAGE);
        		}
        		else if(num5 == 0) {
        			num3 = ((-1) * num2 + Math.sqrt(num5)) / (2 * num1);
        			strNum3 = String.valueOf(num3);
        			strNotification2 += strNum3;
            		JOptionPane.showMessageDialog(null, strNotification2,
                            "Result", JOptionPane.INFORMATION_MESSAGE);
        		}
        		else {
        			num3 = ((-1) * num2 + Math.sqrt(num5)) / (2 * num1);
            		strNum3 = String.valueOf(num3);
            		strNotification2 += strNum3 + " and " ;
            		
            		num3 = ((-1) * num2 - Math.sqrt(num5)) / (2 * num1);
            		strNum3 = String.valueOf(num3);
            		strNotification2 += strNum3 ;
            		
            		JOptionPane.showMessageDialog(null, strNotification2,
                            "Result", JOptionPane.INFORMATION_MESSAGE);
        		}
        	}
        	
        }
        System.exit(0);
    }
}
