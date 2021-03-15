package com.bst;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarySearchTreeTest {
    @Test
    public void givenValue_ToInsertFunction() {
        Node<Integer> nodeOne = new Node<>(56);
        Node<Integer> nodeTwo = new Node<>(30);
        Node<Integer> nodeThree = new Node<>(70);
        BinarySearchTree  binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(nodeOne);
        binarySearchTree.insert(nodeTwo);
        binarySearchTree.insert(nodeThree);
        boolean result = binarySearchTree.root.left.value.equals(30) && binarySearchTree.root.value.equals(56) && binarySearchTree.root.right.value.equals(70);
        Assertions.assertTrue(result);
        binarySearchTree.inorder();
    }

    @Test
    public void givenValues_find_theSize() {
        Node<Integer> nodeOne= new Node(56);
        Node<Integer> nodeTwo = new Node(30);
        Node<Integer> nodeThree = new Node(70);
        Node<Integer> nodeFour = new Node<>(22);
        Node<Integer>  nodeFive = new Node<>(40);
        Node<Integer>  nodeSix = new Node<>(60);

        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(nodeOne);
        binarySearchTree.insert(nodeTwo);
        binarySearchTree.insert(nodeThree);
        binarySearchTree.insert(nodeFour);
        binarySearchTree.insert(nodeFive);
        binarySearchTree.insert(nodeSix);
        binarySearchTree.inorder();
        int size = binarySearchTree.size();
        System.out.println("Size of Tree is "+size);
        Assertions.assertEquals(6,size);
    }

    @Test
    public void givenBinarySearch_particular_value() {
        Node<Integer> nodeOne= new Node(56);
        Node<Integer> nodeTwo = new Node(30);
        Node<Integer> nodeThree = new Node(70);
        Node<Integer> nodeFour = new Node<>(22);
        Node<Integer>  nodeFive = new Node<>(40);
        Node<Integer>  nodeSix = new Node<>(60);


        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(nodeOne);
        binarySearchTree.insert(nodeTwo);
        binarySearchTree.insert(nodeThree);
        binarySearchTree.insert(nodeFour);
        binarySearchTree.insert(nodeFive);
        binarySearchTree.insert(nodeSix);
        binarySearchTree.inorder();

        Node searchResult = binarySearchTree.search(22);
        System.out.println("Found "+searchResult.value);
        Assertions.assertEquals(22,searchResult.value);
    }

}
