
public class HelloWorld {

	public static void main(String[] args) {
		
		//primitive vars
		int i = 123;  //ja vertiba nav defineta, tad nulle
		i=100_000_000; //var lietot underscore parskatamibai
		long l = 5_000_000_000l; //longam pielikt l beigas
		float f = 1.0f;
		double d = -1.0;
		boolean b = true;
		char c = 'u';
		
		//object vars
		int nullArray;// null size array
		int[] ai = {1,2,3,4}; //array with int value
		int[] sizedArray = new int[5]; // empty array size 5
		int[] emptyArray = {}; //empty array
		
		String nullS;
		String s = new String(); //Create empty string
		String shortSyntaxString = "";
		String initializedString = "Hello world!";
		
		String[] stringArray = {"abc", "cde", "efg"};
		
		System.out.println("Text to output");
		
	}

}
