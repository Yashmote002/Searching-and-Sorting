package QuickSortDemo;
//Quick sort is an also a type of divide and rule sorting
// in this type of sorting first of all pivot element has been selected ,then array is partitioned in left and right part as less than and greater than concept on the basis of pivot.

public class QuickSortEx1 {

	public static void main(String[] args) {
		int [] arr= {2,8,7,5,3,9,1,12,10,11,6};
		int length=arr.length;
		
		System.out.println("The array elements before sorting");
		for(int b:arr) {
			System.out.println(b);	
		}
//calling quickSortRecursion method
		QuickSortEx1 qs=new QuickSortEx1();
		qs.quickSortRecursion(arr,0, length-1);
		
		System.out.println("The array element after sorting");
		for(int a:arr) {
			System.out.println(a);	
		}
	}
	
//	method for finding out pivot element ,make partition in array by comparing between pivot and low/high element.
	int partition(int[] arr,int low,int high) {
		int pivot=arr[(low+high)/2];
		while(low<=high) {
			while(arr[low]<pivot) {
				low++;
			}
			while(arr[high]>pivot) {
				high--;
			}
			if(low<=high) {
				int temp=arr[low];
				arr[low]=arr[high];
				arr[high]=temp;
				low++;
				high--;
			}
		}
		return low;
	}
	
//	quick sorting and double recursion
	void quickSortRecursion(int[]arr,int low,int high) {
		int pi=partition(arr,low,high);
		if(low<pi-1) {
			quickSortRecursion(arr, low,pi-1);
		}
		if(high>pi) {
			quickSortRecursion(arr,pi,high);
		}
	}
}
