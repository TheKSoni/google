public class SwappingStringHalvesUsingCharArray {
	
	public static void main(String args[]) 
	{ 
//		String s = "they"; 
		String s = "there"; 
		char[] charArray = s.toCharArray();
		int centre = 0;
		int half = 0;
		if( charArray.length%2==0) {
			centre =(charArray.length/2-1);
			half = centre+1;
		} else {
			centre =charArray.length/2;
			half = centre;
		}
		for (int i = 0; i < half; i++) {
			char t = charArray[i];
			charArray[i] = charArray[centre+i+1];
			charArray[centre+i+1] = t;
			
		}
		System.out.println(new String(charArray));
	}
}
