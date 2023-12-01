package SearchingDemo;
//Code for linear searching demo.

public class LinearSearchingEx1 {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		
		int srch=10;
		int n=arr.length;//Size of an array
		int li=0;//lower
		int hi=n-1;//higher
		int temp=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==srch) {
				System.out.println("The searched element is at "+i+"th index in array");
				temp=1;
			}
		}
		if(temp==0) {
			System.out.println("The searched element is not in array");
		}
	}

}
