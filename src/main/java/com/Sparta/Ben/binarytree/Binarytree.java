package com.Sparta.Ben.binarytree;

import com.Sparta.Ben.Sorter;

public class Binarytree implements BinaryTreeInterface, Sorter {
    private static Node rootNode;
    private static int numberOfElements;
    private static int count;

    private static int[] sortedTree;
    private static int[] sortedTreeDesc;


    public Binarytree(Node rootNode) {//done
        this.rootNode = rootNode;
        this.numberOfElements = 1;
    }

    public Binarytree(int value){
        this(new Node(value));
    }

    public Binarytree(int[] values){
        this(values[0]);
        addElements(values);
    }

    @Override
    public int getRootElement() {//done

        return rootNode.getValue();
    }

    @Override
    public int getNumberOfElements() {//done

        return numberOfElements;
    }

    @Override
    public void addElements(int[] elements) {//done
        for(int i: elements){
            addElement(i);
        }
    }

    public void addElement(final int element) {//done
        addNodeToTree(rootNode, element);
    }

    @Override
    public boolean findElement(int value) {//done
        if(findNode(value) == null){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public int getLeftChild(int element) throws ChildNotFoundException {
        Node node = findNode(element);
        if(node.isLeftChildEmpty()) {
            throw new ChildNotFoundException();
        }else{
            return node.getLeftChild().getValue();
        }
    }//done not tested

    @Override
    public int getRightChild(int element) throws ChildNotFoundException {
        Node node = findNode(element);
        if(node.isRightChildEmpty()) {
            throw new ChildNotFoundException();
        }else{
            return node.getRightChild().getValue();
        }
    }//done not tested

    @Override
    public int[] getSortedTreeAsc() {

        sortedTree = new int[numberOfElements];
        count = 0;
        sortTreeAsc(rootNode);
        return sortedTree;
    }

    private void sortTreeAsc(Node node) {
        if (!node.isLeftChildEmpty()) {
            sortTreeAsc(node.getLeftChild());
        }
            sortedTree[count] = node.getValue();
            count++;


        if (!node.isRightChildEmpty()) {
            sortTreeAsc(node.getRightChild());
        }
    }

    @Override
    public int[] getSortedTreeDesc() {
        //TODO
        sortedTreeDesc = new int[numberOfElements];
        count = numberOfElements-1;
        sortTreeDesc(rootNode);
        return sortedTreeDesc;
    }

    private void sortTreeDesc(Node node){
        if (!node.isLeftChildEmpty()) {
            sortTreeDesc(node.getLeftChild());
        }
            sortedTreeDesc[count] = node.getValue();
            count--;

        if (!node.isRightChildEmpty()) {
            sortTreeDesc(node.getRightChild());
        }
    }

    private void addNodeToTree(Node node, int element) {
        if (element == node.getValue()) {
            return;
        }
        if (element < node.getValue()) {
            if (node.isLeftChildEmpty()) {
                node.setLeftChild(new Node(element));
                numberOfElements++;
            } else {
                addNodeToTree(node.getLeftChild(), element);
            }
        } else {
            if (node.isRightChildEmpty()) {
                node.setRightChild(new Node(element));
                numberOfElements++;
            } else {
                addNodeToTree(node.getRightChild(), element);
            }
        }
    }

    public Node findNode(int element) {
        Node node = rootNode;
        while (node != null) {
            if (element == node.getValue()) {
                return node;
            }else if(element<node.getValue()){
                node = node.getLeftChild();
            }else{
                node = node.getRightChild();
            }
        }
        return null;
    }

    @Override
    public int[] sortArray(int[] arrayToSort) {
        return getSortedTreeAsc();
    }
}
