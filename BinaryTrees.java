public class binarytree {
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static class Tree{
        static int idx=-1;
        public static Node build(int nodes[]){                         //build a binary tree
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newnode = new Node(nodes[idx]);
            newnode.left=build(nodes);            
            newnode.right=build(nodes);
            return newnode;
        }
    }

    public static void preorder(Node root){                   //preorder
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void postorder(Node root){          //postorder
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }
    
    public static void inorder(Node root){                   //Inorder Traversal
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void levelorder(Node root){                       //LevelOrder Traversal
        if(root==null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
    
        while(!q.isEmpty()){
            Node curr=q.remove();
            if(curr==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(curr.data + " ");
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }
    }

    public static int height(Node root){           //height of a tree(nodes)
        if(root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        int h = Math.max(lh,rh)+1;
        return h;
    }

    public static int count(Node root){          //total no of nodes
        if(root==null){
            return 0;
        }
        int lc=count(root.left);
        int rc=count(root.right);
        int total=lc+rc+1;
        return total;
    }

     public static int diameter(Node root){               //diameter of a tree
        if(root==null){
            return 0;
        }
        int ld=diameter(root.left);
        int rd=diameter(root.right);
        int lh=height(root.right);
        int rh=height(root.right);
        int self=lh+rh+1;
        return Math.max(self,Math.max(ld,rd));
    }
}
