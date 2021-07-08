package linecomparison;
import java.util.Scanner;
/**
 * @author Sakshi Shetty
 * Purpose - Line Comparison and Computation using OOPS concept
 */
public class LineComparison {

	/* To find the length of line using co-ordinates provided from user */
	public double FindLength() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first co-ordinate for x-axis of Line");
		int x1 = sc.nextInt();
		System.out.println("Enter the second co-ordinate for x-axis of Line");
		int x2 = sc.nextInt();
		System.out.println("Enter the first co-ordinate for y-axis of Line");
		int y1 = sc.nextInt();
		System.out.println("Enter the second co-ordinate for y-axis of Line");
		int y2 = sc.nextInt();
		sc.close();
		/* Calculating length between the two points of the Line */
		double lengthofline = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		System.out.println("The lenth of First Line is :" + lengthofline);
		return lengthofline;
	}

	public static void main(String args[]) {
		LineComparison Compare = new LineComparison();
		Compare.FindLength();

	}
}
