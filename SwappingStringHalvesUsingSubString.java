public class SwappingStringHalvesUsingSubString {
	
	public static void main(String args[]) 
	{ 
//		String s = "they"; 
		String s = "there"; 
		String left = s.substring(0,s.length()/2);
		String centre;
		String right; 
		if(s.length()%2==0) {
			centre = "";
			right = s.substring(s.length()/2);
		} else {
			centre = s.substring(s.length()/2, s.length()/2+1);
			right = s.substring(s.length()/2+1);
		}

		System.out.println(right+centre+left);
	}
}
