package linecomparison;
import java.util.Scanner;
/**
 * @author Sakshi Shetty
 * Purpose - Line Comparison and Computation using OOPS concept
 */
public class LineComparison {

	/* To find the length of line using co-ordinates provided from user */
	public double FindLength(int x1, int x2, int y1, int y2) {

		/* Calculating length between the two points of the line */
		double lengthofline = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		return lengthofline;
	}

	/* To compare the two lines */
	public void CheckEquality(double Line1, double Line2) {
		if (Line1 > Line2)
			System.out.println("Length of Line 1 is greater than the Length of Line 2");
		else if (Line1 < Line2)
			System.out.println("Length of Line 1 is lesser than the Length of Line 2");
		else
			System.out.println("Both the lines have equal length");
	}

	public static void main(String args[]) {

		/* User input for co-ordinates of Line1 and Line2 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first co-ordinate  for x-axis of First Line");
		int x1 = sc.nextInt();
		System.out.println("Enter the second co-ordinate for x-axis of First Line");
		int x2 = sc.nextInt();
		System.out.println("Enter the first co-ordinate for y-axis of First Line");
		int y1 = sc.nextInt();
		System.out.println("Enter the second co-ordinate for y-axis of First Line");
		int y2 = sc.nextInt();
		System.out.println("Enter the first co-ordinate  for x-axis of second Line");
		int x3 = sc.nextInt();
		System.out.println("Enter the second co-ordinate for x-axis of second Line");
		int x4 = sc.nextInt();
		System.out.println("Enter the first co-ordinate for y-axis of second Line");
		int y3 = sc.nextInt();
		System.out.println("Enter the second co-ordinate for y-axis of second Line");
		int y4 = sc.nextInt();

		/* Calling Method to calculate and compare the length of lines */
		LineComparison Compare = new LineComparison();
		double lengthOfLine1 = Compare.FindLength(x1, x2, y1, y2);
		System.out.println("The lenth of First Line is :" + lengthOfLine1);
		double lengthOfLine2 = Compare.FindLength(x3, x4, y3, y4);
		System.out.println("The lenth second Line is :" + lengthOfLine2);
		Compare.CheckEquality(lengthOfLine1, lengthOfLine2);
		sc.close();

	}
}
