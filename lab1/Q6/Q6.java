import java.util.Scanner;

public class Q6{
	public static void main(String[] args){
		double[]notes=new double[10];
		System.out.print("Enter your grades (on this line): ");
		Scanner scanName = new Scanner(System.in);
		for(int i=0; i< 10; i++){
			notes[i]=scanName.nextDouble();
		}
		double avg_val=calculateAverage(notes);
		double mid=calculateMedian(notes);
		int pass=calculateNumberPassed(notes);
		int failed=calculateNumberFailed(notes);
		System.out.println("Average grades is "+ avg_val+ "\nMedian of grades is "+ mid);
