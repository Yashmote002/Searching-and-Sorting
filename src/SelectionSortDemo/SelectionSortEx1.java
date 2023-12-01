package SelectionSortDemo;
//Searching sort is help to sort element in array by searching least value and swap between index of array.

public class SelectionSortEx1 {

	public static void main(String[] args) {
		int [] num= {38,52,9,18,6,62,13};
        
		System.out.println("The elements of array before sorting: ");
		for(int b=0;b<num.length;b++) {
			System.out.println(num[b]);
		}
		
		int temp=0;
		//for loop for choosing element for comparing
		for(int i=0;i<num.length;i++) {
			
			//for loop for taking index which +1 and above greater than choosed 'i' index from array
			for(int j=i+1;j<num.length;j++) {
				if(num[j]<num[i]) {
//					Swapping
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		
		System.out.println("The array after sorting : ");
		for(int a=0;a<num.length;a++) {
			System.out.println(num[a]);
		}
	}

}
