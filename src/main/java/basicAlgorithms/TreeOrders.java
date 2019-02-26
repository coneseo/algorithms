package basicAlgorithms;

/*
         (1)
        ↙ ↘
      (2)   (3)
    ↙ ↘
   (4)  (5)
   Inorder(left, Root, Right) : 4 2 5 1 3
   Preorder(Root, left, Right) : 1 2 4 5 3
   Postorder(Left, Right ,Root) : 4 5 2 3 1
 */
class Node {
    //이진 트리의 노드는 데이터와 왼쪽 오른쪽 2개의 child node를 갖는다.
    int data;
    Node left;
    Node right;
}

class Tree{
    //트리의 시작점
    public Node root;

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public Node makeNode(Node left, int data, Node right){
       //노드를 만드는 함수 makeNode를 만든다. 왼, 오 , 데이터 의 값을 받아서 할당한다.
        Node node = new Node();
        node.data = data;
        node.left = left;
        node.right = right;
        return node;
    }

    public void inorder(Node node){
        if(node != null){
            //node가 null이 아닐 때까지 재귀호출을 반복한다.
            inorder(node.left); //왼쪽 재귀호출을 다 돌고 오면
            System.out.println(node.data);// 나 자신을 출력
            inorder(node.right);// 오른쪽 재귀호출을 돌린다.
        }

    }
    //나 자신을 먼저 출력하는 preorder
    public void preorder(Node node){
        if(node != null){
            System.out.println(node.data);
            preorder(node.left);
            preorder(node.right);
        }
    }
    //나 자신을 가장 나중에 출력하는 postorder
    public void postorder(Node node){
        if(node != null) {
            postorder(node.left);
            postorder(node.right);
            System.out.println(node.data);
        }
    }
}
public class TreeOrders {
    public static void main(String[] args) {
        Tree t = new Tree();
        Node n4 = t.makeNode(null, 4, null);
        Node n5 = t.makeNode(null, 5, null);
        Node n2 = t.makeNode(n4, 2, n5);
        Node n3 = t.makeNode(null, 3, null);
        Node n1 = t.makeNode(n2, 1, n3);

        t.setRoot(n1);
      t.inorder(t.getRoot());
//        System.out.println("-----------");
//        t.preorder(t.getRoot());
//        System.out.println("-----------");
       // t.postorder(t.getRoot());
    }
}
