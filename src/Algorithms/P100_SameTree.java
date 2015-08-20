/*
Given two binary trees, write a function to check if they are equal or not.
Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
 */

package Algorithms;

/*
  //Definition for a binary tree node.
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
}*/
 
public class P100_SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        
        if(p == null || q == null) return false;
        if(p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right)) return true;
        return false;
        
    }
}
