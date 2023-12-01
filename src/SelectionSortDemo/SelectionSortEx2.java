package SelectionSortDemo;
//SearchSort ex for string array

public class SelectionSortEx2 {

	public static void main(String[] args) {
        String [] val= {"Yash","Anil","Shubham","Sanat","Chirag"};
        
		System.out.println("The elements of array before sorting: ");
		for(int b=0;b<val.length;b++) {
			System.out.println(val[b]);
		}
		
		String temp="";
		//for loop for choosing element for comparing
		for(int i=0;i<val.length;i++) {
			
			//for loop for taking index which +1 and above greater than choosed 'i' index from array
			for(int j=i+1;j<val.length;j++) {
				if(val[j].compareTo(val[i])<0) {
//					Swapping
					temp=val[i];
					val[i]=val[j];
					val[j]=temp;
				}
			}
		}
		
		System.out.println("The array after sorting : ");
		for(int a=0;a<val.length;a++) {
			System.out.println(val[a]);
		}

	}

}
