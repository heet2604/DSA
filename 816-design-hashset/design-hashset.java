class MyHashSet {

    public static int SIZE = 1000;
    public LinkedList<Integer> buckets[];
    public int Hash(int key){
        return key % SIZE;  
    }

    public MyHashSet() {
        buckets = new LinkedList[SIZE];
        for(int i=0;i<SIZE;i++){
            buckets[i] = new LinkedList<>();
        }
    }
    
    public void add(int key) {
        int i = Hash(key);
        LinkedList<Integer> bucket = buckets[i];
        if(!bucket.contains(key)){
            bucket.add(key);
        }
    }
    
    public void remove(int key) {
        int i = Hash(key);
        LinkedList<Integer> bucket = buckets[i];    
        bucket.remove((Integer) key);
    }
    
    public boolean contains(int key) {
        int i = Hash(key);
        LinkedList<Integer> bucket = buckets[i];
        return bucket.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */