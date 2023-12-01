package BubbleSortDemo;
//following ex for string values in array

public class BubbleSortEx2 {

	public static void main(String[] args) {
	    String [] val= {"Yash","Anil","Chirag","Shubham","Sanat","Amit"};
        
	    System.out.println("The values of array before sorting : ");
	    for(int b=0;b<val.length;b++) {
	    	System.out.println(val[b]);
	    }
	    
	    String temp="";
	    for(int i=0;i<val.length;i++) {
	        int swap=0;
	    	for(int j=0;j<val.length-1-i;j++) {
	    		if(val[j].compareTo(val[j+1])>0) {
	    			temp=val[j];
	    			val[j]=val[j+1];
	    			val[j+1]=temp;
	    			swap=1;
	    		}
	    	}
	    	if(swap==0) {
	           break;
	    	}
	    }
	    
	    System.out.println("The array element after sorting : ");
	    for(int a=0;a<val.length;a++) {
	    	System.out.println(val[a]);
	    }
	}
	

}
