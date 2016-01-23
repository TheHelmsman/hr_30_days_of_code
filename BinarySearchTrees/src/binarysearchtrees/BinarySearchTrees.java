/*
 * Copyright 2016
 */
package binarysearchtrees;

import java.util.*;
import java.io.*;

/**
 *
 * @author Mikromafia
 */
public class BinarySearchTrees {

    public static int getHeight(Node root) {
      //Write your code here
        /* base case tree is empty */
        if (root == null)
            return 0;
 
        /* If tree is not empty then height = 1 + max of left
           height and right heights */
        return (1 + Math.max(getHeight(root.left), getHeight(root.right)));
    }
    
    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur=new Node(data);
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Node root = null;
        while(T --> 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        int height = getHeight(root);
        System.out.println(height);
    }	
}
