package com.DSA.BinaryTrees;

//Check if the given tress is balanced or not
public class balanced extends findHeight {
    //    This function is not that efficient because we are finding the height of both the sides and then making recursive calls on both the sides. Finding the height is not some constant work. So the time complexity reaches O(n^2) in worst case and O(nlog(n)) in average case.
//    So we need to optimise our function and make it better.
//    The improved function has complexity of O(n).
    public static boolean isBalanced(BinaryTreeNode<Integer> root) {  //2 recursive calls here and calls to height(height also makes recursive calls) + some constant work
        if (root == null)
            return true;
        boolean isLeftBalanced = isBalanced(root.left);
        boolean isRightBalanced = isBalanced(root.right);
        if (Math.abs(height(root.left) - height(root.right)) > 1)
            return false;
        return isLeftBalanced && isRightBalanced;
    }

    //    In each call, we will return the height as well as whether the node is balanced or not. This will reduce the extra work which was carried out in the last function. We can make a pair to return two things.
    public static PairsForBT<Integer, Boolean> isBalancedImproved(BinaryTreeNode<Integer> root) { //2 recursive calls and some constant work
        if (root == null) {     //Base case
            int height = 0;
            boolean isBal = true;
            PairsForBT<Integer, Boolean> ans = new PairsForBT<>();
            ans.first = height;     //first refers to integer
            ans.second = isBal;     //second refers to boolean
            return ans;
        }
        PairsForBT<Integer, Boolean> leftOutput = isBalancedImproved(root.left); //Recursive call on left half
        PairsForBT<Integer, Boolean> rightOutput = isBalancedImproved(root.right);   //Recursive call on right half
        boolean isBal = true;   //assume it's true, we'll take care of it later
        int height = 1 + Math.max(leftOutput.first, rightOutput.first); //calculating height

//        For the tree to be not balanced, either the left or right half is not balanced or the difference between their height is >1. So below, we are checking these both conditions are if they are not favourable to the tree being balanced, we are changing isBal to false.

        if (Math.abs(leftOutput.first - rightOutput.first) > 1) {
            isBal = false;    //checking if the height condition
        }
        if (!leftOutput.second || !rightOutput.second) {
            isBal = false;    //checking if balanced or not
        }

//        At this point we know whether it is balanced or not and also the height, all that's left is putting these two in the pair and returning.

        PairsForBT<Integer, Boolean> ans = new PairsForBT<>();
        ans.first = height;
        ans.second = isBal;
        return ans;     //We are returning both the height and isBalanced
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInputLevelWise();
        PairsForBT<Integer,Boolean> ans = isBalancedImproved(root);
        System.out.println("Is the tree balanced?\n" + ans.second);
    }

}
