package BubbleSortDemo;
//Bubble Sort mainly used for arranging element in particular stated order(like ascending or descending order) by comparing adjacent elements

//following ex for int type
public class BubbleSortEx1 {

	public static void main(String[] args) {
	    int [] num= {1,23,4,589,67,7,89,9,765,43};
	    
	    //For printing array
	    System.out.println("The array before sorting: ");
	    for(int b=0;b<num.length;b++) {
	    	System.out.println(num[b]);
	    }
	    
	    int temp=0;// For storing greater value element
	    
	    //for conducting round
	    for(int i=0;i<num.length;i++) {
	        int swap=0;
	        
	        //for selecting value by using index of array
	    	for(int j=0;j<num.length-1-i;j++) {
	    		if (num[j]>num[j+1]) {
	    			temp=num[j];
	    			num[j]=num[j+1];
	    			num[j+1]=temp;
	    			swap=1;
	    		}
	    		
	    	}
	    	if(swap==0) {
    			break;
    		}
	    }
	    
	    System.out.println("The array after sorting is : "+num);
	    for(int a=0;a<num.length;a++) {
	    	System.out.println(num[a]);
	    }

	}

}
