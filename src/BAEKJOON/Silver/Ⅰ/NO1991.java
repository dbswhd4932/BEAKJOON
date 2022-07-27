package BAEKJOON.Silver.Ⅰ;


import java.util.*;

class Node {
    char data;
    Node left;
    Node right;

    public Node(char data) {
        this.data = data;
    }
}

public class NO1991 {

    static Node root; // 루트 노드

    // 노드생성
    public static void createNode(char data, char leftData, char rightData) {
        if (root == null) { // 처음에만 root 가 null 이니까
            // 루트에 data 추가
            root = new Node(data);

            // 왼쪽 자식 노드 데이터가 . 가 아니면 leftdata를 가진 노드 생성
            if (leftData != '.') {
                root.left = new Node(leftData);
            }
            // 오른쪽 자식 노드 데이터가 . 가 아니면 rightData 가진 노드 생성
            if (rightData != '.') {
                root.right = new Node(rightData);
            }
            // 루트 노드가 존재하면
        } else Search(root, data, leftData, rightData);
    }

    public static void Search(Node root, char data, char leftData, char rightData) {
        // 루트 노드가 null 이면 종료
        if (root == null) return;
            //  데이터가 있는데 왼쪽, 오른쪽이 . 이 아닐때
        else if (root.data == data) {
            if (leftData != '.') root.left = new Node(leftData);
            if (rightData != '.') root.right = new Node(rightData);
        } else {
            // 못찾았다면
            Search(root.left, data, leftData, rightData);
            Search(root.right, data, leftData, rightData);
        }
    }

    public void preOrder(Node root) {
        System.out.print(root.data);
        if (root.left != null) preOrder(root.left);
        if (root.right != null) preOrder(root.right);
    }

//    public void inOrder(Node root) {
//
//        if (root.left != null) inOrder(root.left);
//        System.out.print(root.data);
//        if (root.right != null) inOrder(root.right);
//    }
//
//    public void postOrder(Node root) {
//
//        if (root.left != null) postOrder(root.left);
//        if (root.right != null) postOrder(root.right);
//        System.out.print(root.data);
//    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        NO1991 tree = new NO1991();
        for (int i = 0; i < n; i++) {
            tree.createNode(
                    sc.next().charAt(0)
                    , sc.next().charAt(0)
                    , sc.next().charAt(0));
        }

        tree.preOrder(tree.root);
        System.out.println();
//        tree.inOrder(tree.root);
//        System.out.println();
//        tree.postOrder(tree.root);


    }
}
