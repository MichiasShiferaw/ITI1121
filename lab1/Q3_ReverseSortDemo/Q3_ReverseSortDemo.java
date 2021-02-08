public class Q3_ReverseSortDemo {
	public static void main(String[] args){
		char[] unorderedLetters;
		unorderedLetters = new char[]{'b', 'm', 'z', 'a', 'u'};
		reverseSort(unorderedLetters);
		for (int i = 0 ; i < unorderedLetters.length; i++ )
			System.out.println(unorderedLetters[i]);
	}

	//method that sorts a char array into its reverse alphabetical order
	public static void reverseSort(char[] values){
		//char arr[] = str.toCharArray();
		char temp =0;
		//char [] values;
		for (int i = values.length - 1; i >= 0; i--) {
		    for (int j = values.length - 1; j >= 0; j--) {
			if (values[j] > values[i]) {
			    temp = values[i];
			    values[i] = values[j];
			    values[j] = temp;
			}
		    }
		}
	}
}
