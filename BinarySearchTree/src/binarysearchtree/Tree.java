/*
 * Copyright 2016
 */
package binarysearchtree;

/**
 * @author Mikromafia
 */
public interface Tree<D extends Comparable> {
    public boolean isEmpty();
    public int cardinality();
    public boolean member(D elt);
    public NonEmptyBST<D> add(D elt);
}
