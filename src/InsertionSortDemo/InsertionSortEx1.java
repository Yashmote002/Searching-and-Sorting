package InsertionSortDemo;

public class InsertionSortEx1 {
	public static void main(String[]args){
		int [] num= {5,6,7,9,2,4,8,3,4,3,0};
		
		int temp,j;
//		for loop for selecting index element from index 1 and above 
		for(int i=1;i<num.length;i++) {
			temp=num[i];
			j=i;
//			while loop for comapring between selected value(num[i]) and previous index value(index=CurrentIndex-1),if previous value is greater then give it to the next index term.
			while(j>0 && num[j-1]>temp) {
				num[j]=num[j-1];
				j=j-1;
			}
			num[j]=temp;
		}
		
//		printing the array
		System.out.println("The array is : ");
		for(int a=0;a<num.length;a++) {
			System.out.println(num[a]+"");
		}
	}

}
