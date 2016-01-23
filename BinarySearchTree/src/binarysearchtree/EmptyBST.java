/*
 * Copyright 2016
 */

package binarysearchtree;

/**
 * @author Mikromafia
 */
public class EmptyBST<D extends Comparable> implements Tree<D> {

    public boolean isEmpty() {
        return true;
    }
    public int cardinality() {
        return 0;
    }
    public boolean member(D elt) {
        return false;
    }
    public NonEmptyBST<D> add(D elt) {
        return new NonEmptyBST<D>(elt);
    }
    
    public EmptyBST() {
        
    }
}
