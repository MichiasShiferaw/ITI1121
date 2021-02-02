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


	public static void main(String[] args){

		int beforeArr[]={1,5,4,7,9,6};

		System.out.println("Array before insertion: ");

		for(int i=0;i<beforeArr.length;i++){

			System.out.println(beforeArr[i]);
		}


		int val=15;
		int ind=3;

		int [] afterArr=insertIntoArray(beforeArr,ind,val);

		System.out.println("After insertion of "+val+" at position "+ind+" :");

		for(int j=0;j<afterArr.length;j++){
