public class Q3_ArrayInsertionDemo{

	public static int[] insertIntoArray(int[] beforeArray,int indexToInsert,int valueToInsert){
		int newArr[]= new int[1+beforeArray.length];
		for(int i=0;i<indexToInsert;i++){
			newArr[i]=beforeArray[i];
		}
		newArr[indexToInsert]=valueToInsert;
		for(int i=indexToInsert+1;i<=beforeArray.length;i++){
			newArr[i]=beforeArray[i-1];

		}
		return(newArr);
	}
