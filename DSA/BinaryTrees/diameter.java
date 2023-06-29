package com.DSA.BinaryTrees;

//Find diameter of the tree
public class diameter extends findHeight {
//    It has worst case time complexity of O(n^2) because in option 1 we are calling the height function which is recursive in itself. Then we are making recursive findDiameter calls on both the halves.
//    So we are finding the height of a node again and again in the way that we are finding the height for option 1 and for calculating the diameter in option 2, we are again calling the height for almost the same nodes. This is worsening our time complexity.
    public static int findDiameter(BinaryTreeNode<Integer> root) {
        if (root == null)   //base case
            return 0;
        int option1 = height(root.left) + height(root.right);
        int option2 = findDiameter(root.left);
        int option3 = findDiameter(root.right);
        return Math.max(option1, Math.max(option2, option3));   //max of these three will be diameter
    }

//    So what we can do is we would make the function to provide us two information(returns): height as well as diameter, hence we are using the Pairs class like we have done in generics.
//    we will store the height of the left side and right side as well as their diameters so that we don't have to make the same calls again.
//    The time complexity of the improved code is O(n).
    public static PairsForBT<Integer, Integer> findDiameterImproved(BinaryTreeNode<Integer> root) {
        if (root == null) {     //base case
            PairsForBT<Integer, Integer> output = new PairsForBT<>();
            output.first = 0;       //first stores height
            output.second = 0;      //second stores diameter
            return output;
        }
        PairsForBT<Integer,Integer> leftAns = findDiameterImproved(root.left);
        PairsForBT<Integer,Integer> rightAns = findDiameterImproved(root.right);
        int height= 1+ Math.max(leftAns.first,rightAns.first);

        int option1= leftAns.first + rightAns.first;
        int option2= leftAns.second;
        int option3= rightAns.second;
        int diameter= Math.max(option1,Math.max(option2,option3));

//        By this point we know the height and diameter, all that is left is putting the values in the pair and returning.
        PairsForBT<Integer, Integer> output = new PairsForBT<>();
        output.first = height;
        output.second = diameter;
        return output;

    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInputLevelWise();
        System.out.println("The diameter of the given tree is: " +
                findDiameterImproved(root).second);       //second stores diameter
        System.out.println("The height is: " +
                findDiameterImproved(root).first);
    }
}
