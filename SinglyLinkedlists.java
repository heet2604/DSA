public class SinglyLinkedlists{
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public static void first(int data){                                   //adding a head node
        Node newnode = new Node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    public static void add(int index , int data){                           //adding a node to a position
        if(index==0){
            first(data);
            return;
        }
        Node newnode = new Node(data);
        size++;
        Node temp=head;
        int i = 0;
        while(i<index-1){
            temp=temp.next;
            i++;
        }
        newnode.next=temp.next;
        temp.next=newnode;
    }

    public static void print(){                                     //printing a linked list
        Node temp = head;   
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static int removehead(){                                 //removing head node of the linked list
        if(size==0){
            System.out.println("Linked List is empty");
        }
        int val = head.data;
        head=head.next;
        size--;
        return val;
    }

    public static int removetail(){                              //removing tail node of the linked list
        if(size==0){
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        }
        Node prev=head;
        int i=0;
        while(i<size-2){
            i++;
            prev=prev.next;
        }
        int val = tail.data;
        prev.next=null;
        tail=prev;
        size--;
        return val; 
    }

    public static int search(int key){                     //searching a node of the linked list
        Node temp = head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }

    /*public static int recsearch(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int i = search(head.next,key);
        if(i==-1){
            return -1;
        }
        return i+1;
    }*/

    public static void reverse(){                              //reversing the linked list
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public static void remove(int n){
        int sz=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }

        if(sz==n){
            head=head.next;
            return;
        }

        int i=1;
        int find = sz-n;
        Node prev=head;
        while(i<find){
            prev=prev.next;
            i++;
        } 
        prev.next=prev.next.next;
        return;

    }

    public Node findmid(Node head){                               //check if the linked list is palindrome
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow; //mid
    }

    public boolean Palin(){                                         
        if(head==null || head.next==null){
            return true;
        }
        Node mid = findmid(head);
        
        Node prev = null;
        Node curr=mid;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right = prev;
        Node left = head;
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }

      public int dup(Node head){                     //Remove Duplicates
        if(head==null){
            return 0;
        }
        Node temp=head;
        while(temp!=null && temp.next!=null){
            if(temp.data==temp.next.data){
                temp.next=temp.next.next;
            }
            else{
                temp=temp.next;
            }
        }
        return head.data;
    }
    
    public static boolean cycle(){                         //To check if the linked list has loop 
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==head){
                return true;
            }
        }
        return false;
    }

    public Node getMid(Node head) {                          //Merge sort on Linked List
        if (head == null || head.next == null) {
            return head;
        }
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node merge(Node h1, Node h2) {
        Node merged = new Node(-1); // Dummy node
        Node temp = merged;

        while (h1 != null && h2 != null) {
            if (h1.data <= h2.data) {
                temp.next = h1;
                h1 = h1.next;
            } else {
                temp.next = h2;
                h2 = h2.next;
            }
            temp = temp.next;
        }
        temp.next = (h1 != null) ? h1 : h2;

        return merged.next; // Return the head of the merged list
    }

    public Node mergesort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node mid = getMid(head);
        Node righthead = mid.next;
        mid.next = null;
        
        Node newleft = mergesort(head);
        Node newright = mergesort(righthead);

        return merge(newleft, newright);
    }

    public static void main(String args[]) {
        SinglyLinkedlists ll = new SinglyLinkedlists();
        first(3);
        first(40);
        first(12);
        first(1);
        first(34);
        print();
        ll.head = ll.mergesort(ll.head);
        print();
    }
}
    public static void main(String args[]){
        SinglyLinkedlists ll = new SinglyLinkedlists();
        ll.first(2);
        ll.first(1);
        ll.first(1);
        ll.first(3);
        ll.print();
    }
}
