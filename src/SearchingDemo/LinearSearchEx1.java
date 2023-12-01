package SearchingDemo;
//Linear search ex for strings.

public class LinearSearchEx1 {

	public static void main(String[] args) {
		String []arr= {"Yash","chirag","rohit","Anil","Sai"};
		
		String srch="yash";
		int n=arr.length;//size of an array
		int li=0;//lower index
		int hi=n-1;//higher index
		int temp=0;
		
		for(int i=0;i<n;i++) {
			if(arr[i].equalsIgnoreCase(srch)) {
				System.out.println("The srch string is at "+i+"th index in array");
				temp+=1;
			}
		}
		
		if(temp==0) {
			System.out.println("the string is not in  array");
		}
	}

}
