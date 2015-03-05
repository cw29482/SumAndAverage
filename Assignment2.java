import javax.swing.JOptionPane;
public class Assignment2 {
	public static void main(String [] args) {
		String num1, num2, num3, num4, num5;
		double n1, n2, n3, n4, n5, sumOfn, averageOfn; //set as double because people may enter decimals

		JOptionPane.showMessageDialog(null, "Enter 5 numbers of your choice to display the sum and the average.");
		num1 = JOptionPane.showInputDialog("Please enter the first number.");
		num2 = JOptionPane.showInputDialog("Please enter the second number.");
		num3 = JOptionPane.showInputDialog("Please enter the third number.");
		num4 = JOptionPane.showInputDialog("Please enter the fourth number.");
		num5 = JOptionPane.showInputDialog("Please enter the fifth number.");
		//stores input on each number the user enters

		n1 = Double.parseDouble(num1);
		n2 = Double.parseDouble(num2);
		n3 = Double.parseDouble(num3);
		n4 = Double.parseDouble(num4);		
		n5 = Double.parseDouble(num5);
		//translates string to doubles

		sumOfn = n1 + n2 + n3 + n4 + n5;//sum = add all numbers
	        averageOfn = sumOfn / 5;//average = sum divided by the total count of number, in this case the total is 5

		JOptionPane.showMessageDialog(null, "Sum: " + sumOfn + "\n" + "Average: " + averageOfn);
		//displays the results 

	}
	}

												
