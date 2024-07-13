import java.util.*;
public class linear {
    public static void main(String args[]){
        boolean flag=false;
        int index=0;
        int count=0;
        int arr[]={3,1,4,2,5,6,4};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to search : ");
        int key=sc.nextInt();

        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                flag=true;
                count++;
                System.out.println("The element is present at : "+ i +" index");
            }
            else{
                flag=false;
            }
        }
        if(flag){
            System.out.println("The number has "+ count + " occurances");
        }
        else{
            System.out.println("Number not present");
        }
    }
}
