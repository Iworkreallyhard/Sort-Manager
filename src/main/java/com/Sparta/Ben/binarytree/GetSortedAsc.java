package com.Sparta.Ben.binarytree;

public class GetSortedAsc {
    public static int[] sortBinaryTree(){
        int count = 0;

        return new int[0];
    }

    private static int[] sorter(Node node, int[] sort, int count){
        if(node.isLeftChildEmpty()==false){
            sort = sorter(node.getLeftChild(), sort, count);

        }else{

            sort[count] = node.getValue();
            count++;
        }
        if(node.isRightChildEmpty()==false){
            sort = sorter(node.getRightChild(),sort,count);
        }

        return sort;
    }
}
