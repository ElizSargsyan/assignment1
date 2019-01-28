package YourLnuUserName_assign1;

public class PrintRecursive {
	
	 public static void print(String str, int pos)
	 {
		 if (pos == str.length()) {
				return;
		 }
		System.out.print(str.charAt(pos));
		print(str, ++pos);
	 }

	 public static void printReverse(String str, int pos) {
		 if(pos + 1 > str.length()) {
			 return;
		 }
		 System.out.print(str.charAt(str.length()-pos-1));
		 printReverse(str,pos+1);
	 }


	 public static void main(String[] args) {
		 String str = "Hello Everyone!";
			
		 print(str, 0);
		 System.out.println(); // Line break
		 printReverse(str, 0);
	 }
}