package MergeSortDemo;
//Merge sort , which work based on divide and conquer rule .

public class MergeSortEx1 {
	//for comparing and assigning element in merged named array
	public static void conquer(int arr1[],int si,int mid,int ei) {
		int merged[]=new int[ei-si+1];
		int index1=si;//index from first group of element
		int index2=mid+1;//index element from second group of element 
		int x=0;//help us to store sorted value in merged array in further process
		
		while(index1<=mid && index2<=ei) {
			if(arr1[index1]<=arr1[index2]) {
				merged[x]=arr1[index1];
				x++;
				index1++;
			}
			else {
				merged[x]=arr1[index2];
				x++;
				index2++;
			}
		}
		while(index1<=mid) {
			merged[x]=arr1[index1];
			x++;
			index1++;
			
		}
		while(index2<=ei) {
			merged[x]=arr1[index2];
			x++;
			index2++;
		}
		
//		replacing original array element from merged array element
		for(int i=0,j=si;i<merged.length;i++,j++) {
			arr1[j]=merged[i];
		}
		
	}
	
//	for dividing array by calculating middleindex value 
	public static void divide(int arr1[],int si,int ei) {
		if(si>=ei) {
			return ;
		}
		
		int mid=si+(ei-si)/2;
		divide(arr1,si,mid);
		divide(arr1,mid+1,ei);
		conquer(arr1,si,mid,ei);
	}
   
	public static void main(String[] args) {
		
	  
		int []arr1= {8,7,6,5,4,3,2,1};
		System.out.println("The element of array before sorting: ");
		for(int b=0;b<arr1.length;b++) {
			System.out.print(arr1[b]+" ");
		}
		
		int n=arr1.length;
		
//		calling method divide in main method 
		divide(arr1,0,n-1);
		
		//printing sorted array
		System.out.println("\nThe element of array after sorting: ");
		for(int a=0;a<n;a++) {
			System.out.print(arr1[a]+" ");
		}
		
	}

}
