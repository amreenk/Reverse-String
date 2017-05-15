/* create classes called Reverse and ReverseDemo
Reverse:
	1) reverseR(): write a recursive method that reverses a string
	2) reverseI(): write an iterative method that reverses a string

	ReverseDemo:
		main method:
			Test out both of the methods of Reverse and make sure you get the same output.
			*/
class Reverse {
	//wrapper method
	public String reverseR(String str) {
		return reverseR2(str, str.length());
	}
	//Reversing characters using Recursion
	public String reverseR2(String str, int n) {
		String result = str.substring(n-1, n);
		if (n == 1) {
			return str.substring(0,1);
		}
		result += reverseR2(str, n-1);
		return result;
	}

	//reversing charaacters using iteration (for loop)
	public String reverseI(String str) {
		char c[] = str.toCharArray();
		char temp;
		int i, j;

		// for (i=0, j=str.length()-1; i<j; i++, j--) {
		// 	//swapping characters
		// 	temp = c[i];
		// 	c[i] = c[j];
		// 	c[j] = temp;
		// }
		
		//another way to reverse 
		for (i=str.length()-1, j=0; i >= 0; i--) {
			c[j] = str.charAt(i);
			j++;
		}
		
		return new String(c);

		
	}
}

class ReverseDemo {
	public static void main(String[] args) {
		Reverse ob = new Reverse();
		String s = "orange";
		System.out.println(ob.reverseR(s));

	}
}