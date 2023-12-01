package SearchingDemo;

public class BinarySearchEx1 {

    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7,8,10};
        int srch=10;
        int n=arr.length;//size
        int li=0;//lower
        int hi=n-1;//higher
        int mid=(li+hi)/2;//middle
        int temp=0;

        while(li<=hi) {
            if(arr[mid]==srch) {
                System.out.println("The srch element is at "+mid+" th index in array");
                temp+=1;
                break; // Break out of the loop if the element is found
            }

            if(arr[mid]<srch) {
                li=mid+1;
            }

            if(arr[mid]>srch) {
                hi=mid-1;
            }
            mid=(li+hi)/2;
        }

        if(temp==0) {
            System.out.println("the srch element is not in array");
        }
    }
}
