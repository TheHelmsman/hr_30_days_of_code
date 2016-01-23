/*
 * Copyright 2016
 */

package binarysearchtree;

/**
 * @author Mikromafia
 */
class NonEmptyBST<D extends Comparable> implements Tree<D> {

    D data;
    Tree<D> left;
    Tree<D> right;

    public boolean isEmpty() {
        return false;
    }
    public int cardinality() {
        return 1 + left.cardinality() + right.cardinality();
    }
    public boolean member(D elt) {
        if (data == elt) {
            return true;
        } else {
            if (elt.compareTo(data) < 1) {
                return left.memeber(elt);
            } else {
                return right.member(elt);
            }
        }
    }
    public NonEmptyBST<D> add(D elt) {
        if (root == elt) {
            return this;
        } else {
            if (elt.compareTo(data) < 0) {
                return new NonEmptyBST(data, left.add(elt), right);
            } else {
                return new NonEmptyBST(data, left, right.add(elt));
            }
        }
    }
    
    public NonEmptyBST(D elt) {
        data = elt;
        left = new EmptyBST<D>();
        right = new EmptyBST<D>();
    }
    
    public NonEmptyBST(D elt, Tree<D> leftTree, Tree<D> rightTree) {
        data = elt;
        left = leftTree;
        right = rightTree;
    }
}
