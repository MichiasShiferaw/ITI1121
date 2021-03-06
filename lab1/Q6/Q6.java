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
		if (failed>0){
			System.out.println("Number of failed students are "+ failed);
		}else{
			System.out.println("No One Failed");
		}
		if (pass>0){
			System.out.println("Number of passed students are "+ pass);
		}else{
			System.out.println("No One Passed");
		}	

	}
	public static double calculateAverage(double[] notes){
		//your code here
		double sum_mark=0.0;
		int num= notes.length;
		for (int i=0; i<num; i++){
			sum_mark+= notes[i];
		}
		return (sum_mark/num);
	}

	public static double calculateMedian(double[] notes){
		int num=notes.length;
		for (int i = 0; i < notes.length; i++) {
			for (int j = i + 1; j < notes.length; j++) {
				double temp = 0.0;
				if (notes[i] > notes[j]) {
					temp = notes[i];
					notes[i] = notes[j];
					notes[j] = temp;
				}
			}
		}
		if (num%2==0){
			return((notes[(num-1)/2] + notes[num/2])/2.0);
		}
		return notes[num/2];
	}

	public static int calculateNumberFailed(double[] notes){
		int counter=0;
		for (int i = 0; i < notes.length; i++) {
			if (notes[i]<50){
				counter++;
			}
		}
		return counter;
	}

	public static int calculateNumberPassed(double[] notes){
		int counter=0;
		for (int i = 0; i < notes.length; i++) {
			if (notes[i]>=50){
				counter++;
			}
		}
		return counter;
	}
}
