package com.bridgelabz.BST;

public class BinarySearchTreeMain {

    public static void main(String[] args) {
        System.out.println("BINARY SEARCH TREE PROBLEM");

        BinarySearchTree bst = new BinarySearchTree();
        Node root = null;

        root = bst.insert(root, 56);
        root = bst.insert(root, 30);
        root = bst.insert(root, 70);

        bst.print(root);

    }
}
