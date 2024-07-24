public class sorting{
    public static void merge(int arr[],int si,int ei,int mid){
        int merged[]=new int[ei-si+1];
        
        int i1=si;         //first of arr1
        int i2=mid+1;      // first of arr2
        int k=0;
        while(i1<=mid && i2<=ei){
            if(arr[i1]<=arr[i2]){
                merged[k]=arr[i1];
                k++;i1++;
            }
            else{
                merged[k]=arr[i2];
                k++;i2++;
            }
        }
        while(i1<=mid){
            merged[k]=arr[i1];
            k++;i1++;
        }
        while(i2<=ei){
            merged[k]=arr[i2];
            k++;i2++;
        }

        for(int i=0,j=si;i<merged.length;i++,j++){
            arr[j]=merged[i];
        }
    }
    public static int count=1;
    public static void divide(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        divide(arr,si,mid);
        divide(arr,mid+1,ei);
        System.out.println("Pass : " + count++);    
            for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }   
        System.out.println();
        merge(arr,si,ei,mid);
    }

    public static void main(String args[]){
        int arr[]={2,3,1,6,5,4,8,7,0,9};
        int n=arr.length;
        divide(arr,0,n-1);
        System.out.println("Sorted array is : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
