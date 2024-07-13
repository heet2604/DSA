import java.util.*;                                                            //USING RECURSION
public class binary {

    public static void main(String args[]){
        int arr[]={3,2,56,1,4,23};
        Arrays.sort(arr);
        System.out.println("The sorted array is : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Enter the key you want to search : ");
        Scanner sc = new Scanner(System.in);
        int key=sc.nextInt();
        int x=binarysearch(arr,0,arr.length-1,key);
        if(x!=-1){
            System.out.println("The key is present at index: "+ x);
        }
        else{
            System.out.println("Not found");
        }
    }
    public static int binarysearch(int arr[],int l,int h,int key){
        while(l<=h){
            int mid=l+(h-l)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]>key){
                l = mid-1;
            }
            else if(arr[mid]<key){
                h = mid+1;
            }
        }
        return -1;
    }
}
