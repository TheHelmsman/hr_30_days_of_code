/*
 * Copyright 2016
 */

package reviewbinarytrees;

/**
 * @author Mikromafia
 */
class Node {
    Node left,right;
    int data;
    Node(int data) {
        this.data = data;
        left = right = null;
    }
}