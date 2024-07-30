public static ArrayList<Integer> greater(int arr[]){                    //next greater elements
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length-1;i++){
            boolean found=false;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    list.add(arr[j]);
                    found=true;
                    break;
                }
            }
            if(!found){
                list.add(-1);
            }
        }
        return list;
    }

    public static void main(String args[]){
        int arr[]={6,8,7,0,1,3};
        ArrayList<Integer> res = greater(arr);
        System.out.println(res);
    }


public class arraylist{                                           //Find out if the arraylist has duplicates 
    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        System.out.println(mono(arr));
    }
    public static boolean mono(ArrayList<Integer> arr){
        if(arr.size()==0){
            return false;
        }
        for(int i=0;i<arr.size()-1;i++){
            for(int j=0;j<arr.size();j++){
                if(arr.get(i)==arr.get(i+1)){
                    return true;
                }
            }
        }
        return false;
    }
}
