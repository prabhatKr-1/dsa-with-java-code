//It is not working idk why, but no issues check the lecture video
package com.DSA.BinaryTrees;

//We have to construct the binary tree when Inorder and Preorder is given
//All the elements in the array are unique
public class treeConstruction extends InputAndPrint {

    //    This one was coded by me. It works fine as far as I know but in this function, I have done a lot of unnecessary work. I have made four new arrays in each call.
//    The better and simple solution will be to work on the same two given arrays and instead of creating new arrays, I just have to create new variables which will be the start and end Index of preOrder and inOrder arrays for the next recursive call.
    public static BinaryTreeNode<Integer> makeTree(int[] preOrder, int[] inOrder, int poStartIndex, int poEndIndex, int ioStartIndex, int ioEndIndex) {
        if (preOrder.length == 0 || inOrder.length == 0) {
            return null;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(preOrder[poStartIndex]);
        int rootIndexInOrder = 0;
        while (!(inOrder[rootIndexInOrder] == root.data)) {
            rootIndexInOrder++;
        }
        int[] inOrderLeft = new int[rootIndexInOrder];
        for (int i = 0; i < rootIndexInOrder; i++) {
            inOrderLeft[i] = inOrder[i];
        }

        int[] inOrderRight = new int[ioEndIndex - rootIndexInOrder];
        for (int i = 0; i < inOrderRight.length; i++) {
            inOrderRight[i] = inOrder[rootIndexInOrder + i + 1];

        }

        int[] preOrderLeft = new int[rootIndexInOrder];
        for (int i = 0; i < preOrderLeft.length; i++) {
            preOrderLeft[i] = preOrder[i + 1];

        }

        int[] preOrderRight = new int[poEndIndex - rootIndexInOrder];
        for (int i = 0; i < preOrderRight.length; i++) {
            preOrderRight[i] = preOrder[rootIndexInOrder + i + 1];
        }


        BinaryTreeNode<Integer> leftNode = makeTree(preOrderLeft, inOrderLeft, 0, preOrderLeft.length - 1, 0, inOrderLeft.length - 1);

        BinaryTreeNode<Integer> rightNode = makeTree(preOrderRight, inOrderRight, 0, preOrderRight.length - 1, 0, inOrderRight.length - 1);

        root.left = leftNode;
        root.right = rightNode;


        return root;

    }


    public static BinaryTreeNode<Integer> makeTreeBetter(int[] pre, int[] in) {
//        Here we will use a helper function. It is not necessary here but is useful at times specially in CP, hence a nice practice for us.

        return makeTreeBetterHelper(pre, in, 0, in.length - 1, 0, pre.length - 1);
    }

    private static BinaryTreeNode<Integer> makeTreeBetterHelper(int[] pre, int[] in, int preSI, int preEI, int inSI, int inEI) {
        if (inSI > inEI)       //base case
            return null;

        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(pre[preSI]);
        int rootIndex=-1;
        for (int i = inSI; i < inEI; i++) {
            if ((in[i]) == root.data) {
                rootIndex = i;
                break;
            }
        }
        if(rootIndex==-1)
            return null;

        int inSIleft = inSI;
        int inEIleft = rootIndex-1;
        int inSIright = rootIndex+1;
        int inEIright = inEI;
        int preSIleft = preSI+1;
        int preEIleft = inEIleft- inSIleft + preSIleft;
        int preSIright = preEIleft+1;
        int preEIright = preEI;

        root.left = makeTreeBetterHelper(pre, in, preSIleft, preEIleft, inSIleft, inEIleft);
        root.right = makeTreeBetterHelper(pre, in, preSIright, preEIright, inSIright, inEIright);
        return root;


    }

    public static void main(String[] args) {
        int[] preOrder = {1, 2, 4, 5, 3, 7};
        int[] inOrder = {4, 2, 5, 1, 3, 7};
//        BinaryTreeNode<Integer> root = makeTree(preOrder, inOrder, 0, preOrder.length - 1, 0, inOrder.length - 1);
        BinaryTreeNode<Integer> root = makeTreeBetter(preOrder,inOrder);
        printLevelWise(root);
    }
}
