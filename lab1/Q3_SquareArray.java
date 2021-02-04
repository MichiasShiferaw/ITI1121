public class Q3_SquareArray{

	public static int[] createArray(int size) {
		int[] anArray;
		anArray = new int[size];
		for(int i = 0; i < anArray.length; i++){
			anArray[i] = i * i;
		}
