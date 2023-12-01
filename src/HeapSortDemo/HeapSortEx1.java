package HeapSortDemo;
//Heap sort work on the basis of tree.

public class HeapSortEx1 {
	public static void main(String[] args) {
		int []arr= {3,9,1,7,4,2,8,5,10};
		HeapSortEx1 hs=new HeapSortEx1();
		hs.sort(arr);
		hs.print(arr);
		}
//	method for deciding index number for processing as well as for swapping between start and last index element
	void sort(int[] arr){
		int length=arr.length;
		for(int i=length/2-1;i>0;i--) {
			heapify(arr,length,i);
		}
		for(int i=length-1;i>0;i--) {
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			
			heapify(arr,i,0);
		}
	}

//	method for doing comaparing and swapping between parent and child index values if condition get satisfied
	void heapify(int arr[],int n,int i) {
		int largest=i;//parent index
		int li=i*2+1;//left side child index
		int ri=i*2+2;//right side child index
		if (li<n && arr[li]>arr[largest]) {
			largest=li;
		}
		if(ri<n && arr[ri]>arr[largest]) {
			largest=ri;
		}
		if(largest !=i) {
			int temp=arr[i];
			arr[i]=arr[largest];
			arr[largest]=temp;
			
			heapify(arr,n,largest);
		}
	}
	
	void print(int arr[]) {
	System.out.println("The heap element after sorting is :");
	for(int a:arr) {
		System.out.println(a+"");
	}
	}

}
