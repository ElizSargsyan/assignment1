package YourLnuUserName_assign1;

public class PascalMain {
	 public static int[] pascalRow(int n)
	 {
		int[] result=new int[n+1];
		if(n == 0) {
			 result[0]=1;
			 return result;
		}
	
		for(int i = 1;i <= n; ++i){
			result[i]=pascalRow(n-1)[i-1]+pascalRow(n-1)[i];
		}
		return result;
	 }
	 
	 
	public static void main(String[] args) {
		System.out.println(pascalRow(2).toString());
	}
}
