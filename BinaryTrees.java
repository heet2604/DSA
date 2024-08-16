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


        public static void main(String args[]){
            int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
            Tree t = new Tree();
            Node root=t.build(nodes); 
            postorder(root);
        }
    }
