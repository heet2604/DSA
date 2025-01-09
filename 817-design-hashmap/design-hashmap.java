class MyHashMap {
    public static int SIZE = 1000;
    public LinkedList<int[]> buckets[];
    public static int hash(int key){
        return key % SIZE;
    }

    public MyHashMap() {
        buckets = new LinkedList[SIZE];
        for(int i=0 ; i<SIZE;i++){
            buckets[i] = new LinkedList<>();
        }
    }
    
    public void put(int key, int value) {
        int i = hash(key);
        LinkedList<int[]> bucket = buckets[i];
        for(int pair[] : bucket){
            if(pair[0]==key){
                pair[1] = value;
                return;
            }
        }
        bucket.add(new int[]{key,value});
    }
    
    public int get(int key) {
        int i = hash(key);
        LinkedList<int[]> bucket = buckets[i];
        for(int pair[] : bucket){
            if(pair[0] == key){
                return pair[1];
            }
        }
        return -1;
    }
    
    public void remove(int key) {
        int i = hash(key);
        LinkedList<int[]> bucket = buckets[i];
        for (int[] pair : bucket) {
        if (pair[0] == key) {
            bucket.remove(pair);
            return;
        }
    }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */