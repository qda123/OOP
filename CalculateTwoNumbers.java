package Lab01;

//Example 5: CalculateTwoNumbers.java

import javax.swing.JOptionPane;

public class CalculateTwoNumbers {
	public static void main(String[] args) {
        String strNum1, strNum2, strNum3, strNum4, strNum5, strNum6;
        String strNotification1 = "Sum of 2 numbers: ";
        String strNotification2 = "Difference of 2 numbers: ";
        String strNotification3 = "Product of 2 numbers: ";
        String strNotification4 = "Quotient of 2 numbers: ";
        
        strNum1 = JOptionPane.showInputDialog(null,
                "Please input the first number: ", "Input the first number",
                JOptionPane.INFORMATION_MESSAGE);
        
	    strNum2 = JOptionPane.showInputDialog(null,
	    		"Please input the second number: ", "Input the second number",
	    		JOptionPane.INFORMATION_MESSAGE);
	    
	    double num1 = Double.parseDouble(strNum1);
	    double num2 = Double.parseDouble(strNum2);
	    double num3 = num1 + num2;
	    double num4 = num1 - num2;
	    double num5 = num1 * num2;
	    double num6 = num1 / num2;
	    
	    strNum3 = String.valueOf(num3);
	    strNum4 = String.valueOf(num4);
	    strNum5 = String.valueOf(num5);
	    strNum6 = String.valueOf(num6);
	    
	    strNotification1 += strNum3;
	    strNotification2 += strNum4;
	    strNotification3 += strNum5;
	    strNotification4 += strNum6;
	    
	    strNotification1 += "\n" + strNotification2 + "\n" + strNotification3 + "\n" + strNotification4;
	        
	    JOptionPane.showMessageDialog(null, strNotification1,
	    		"Calculate two numbers", JOptionPane.INFORMATION_MESSAGE);
	    
	    System.exit(0);
	}
}
