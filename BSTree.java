package com.company;

public class MyBSTree {
    Node root;

    MyBSTree(){
        root = null;
    }

    MyBSTree(int value){
        root = new Node(value);
    }

    // insert() -creates a new element
    Node insert(Node root, int key){
        if (root == null){
            root = new Node(key);
            return root;
        }

        if (key < root.key){
            root.left = insert(root.left, key); //-the key is smaller than root, it is moved to the node's left side.
        }

        else if (key > root.key) {
            root.right = insert(root.right, key); // - the key is greater than the root, the node is moved to the right side.
        }

        return root;
        }

    
    void inorder(Node root){
        if (root != null){
            inorder(root.left);
            System.out.println(root.key);
            inorder(root.right);
        }
    }
	
	
    public Node search(Node root, int key){// search() - searching items
        if (root == null || root.key == key){
            return root;
        }

        if (root.key < key){
            return search(root.right, key);
        }

        return search(root.left, key);
    }

    // deleteNode() - deleting node
