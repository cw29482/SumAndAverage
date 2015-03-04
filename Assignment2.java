import javax.swing.JOptionPane;
public class Assignment2 {
	public static void main(String [] args) {
		String num1, num2, num3, num4, num5;
		double n1, n2, n3, n4, n5, sumOfn, averageOfn;

		JOptionPane.showMessageDialog(null, "Enter 5 numbers of your choice to display the sum and the average.");
		num1 = JOptionPane.showInputDialog("Please enter the first number.");
		num2 = JOptionPane.showInputDialog("Please enter the second number.");
		num3 = JOptionPane.showInputDialog("Please enter the third number.");
		num4 = JOptionPane.showInputDialog("Please enter the fourth number.");
		num5 = JOptionPane.showInputDialog("Please enter the fifth number.");

		n1 = Double.parseDouble(num1);
		n2 = Double.parseDouble(num2);
		n3 = Double.parseDouble(num3);
		n4 = Double.parseDouble(num4);		
		n5 = Double.parseDouble(num5);

		sumOfn = n1 + n2 + n3 + n4 + n5;
	        averageOfn = sumOfn / 5;

		JOptionPane.showMessageDialog(null, "Sum: " + sumOfn + "\n" + "Average: " + averageOfn);

	}
	}

												
