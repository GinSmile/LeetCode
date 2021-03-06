/*
Invert a binary tree.

     4
   /   \
  2     7
 / \   / \
1   3 6   9
to
     4
   /   \
  7     2
 / \   / \
9   6 3   1

Trivia:
This problem was inspired by this original tweet by Max Howell:
Google: 90% of our engineers use the software you wrote (Homebrew), but you can’t invert a binary tree on a whiteboard so fuck off.
 
*/
package Algorithms;


//Definition for a binary tree node.
class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
    TreeNode(int x) { val = x; }
}
 
public class P226_InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return root;
        
        TreeNode tempNode = invertTree(root.right);
        root.right = invertTree(root.left);
        root.left = tempNode;
        return root;

    }
}
