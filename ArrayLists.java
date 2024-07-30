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
