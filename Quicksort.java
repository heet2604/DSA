public class exp2{
    public static void main(String args[]){
        int arr[]={2,4,5,1,6,3,7,9,0,8};
        int n=arr.length;
        quicksort(arr,0,n-1);
        System.out.println("Sorted array is : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }

    }
    public static int count=1;
    public static void quicksort(int arr[],int si,int ei){
        if(si<=ei){
            int p = partition(arr,si,ei);
                                                                   // Display the array after each partition
            System.out.println("Pass : " + count++);    
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }   
            System.out.println();
            quicksort(arr, si, p-1);
            quicksort(arr, p+1, ei);
        }       
    }
    public static int partition(int arr[],int si,int ei){
        /*int pivot=arr[ei];
        int i=si-1;                           //makes space for smaller elements

        for(int j=si;j<ei;j++){
            if(arr[j]<pivot){
                i++;                       //we need empty space for smaller elements
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;                            //swap 
            }
        }
        i++;
        int temp=arr[i];                       //pivot to correct position 
        arr[i]=arr[ei];
        arr[ei]=temp;       
        return i;                              //return pivot index
    }
     
    int mid = si +(ei-si)/2;                     //Using mid element as pivot
    int pivot=arr[mid]; 
    int temp=arr[mid];
    arr[mid]=arr[ei];
    arr[ei]=temp;
    int val=arr[ei];
    int i=si-1;

    for(int j=si;j<ei;j++){
        if(arr[j]<val){
            i++;
            int x=arr[i];
            arr[i]=arr[j];
            arr[j]=x;
        }
    }
    int y=arr[i+1];
    arr[i+1]=arr[ei];
    arr[ei]=y;
    return i+1;
    }
}
