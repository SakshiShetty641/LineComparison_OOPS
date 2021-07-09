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
		double lengthofline1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		System.out.println("The lenth of First Line is :" + lengthofline1);
		return lengthofline1;
	}

	/* Checking Equality between two lines using Equals method */
	public void CheckEquality(double Line1, double Line2) {
		if (Line1 == Line2)
			System.out.println("Both lines are of same length");
		else
			System.out.println("Both the lines are of different length");
	}

	public static void main(String args[]) {
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

		LineComparison Compare = new LineComparison();
		double lengthOfLine1 = Compare.FindLength(x1, x2, y1, y2);
		double lengthOfLine2 = Compare.FindLength(x3, x4, y3, y4);
		Compare.CheckEquality(lengthOfLine1, lengthOfLine2);
		sc.close();

	}
}
