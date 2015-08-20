package Algorithms;

import java.util.Stack;

	/**
	 * 
	 *  Implement an iterator over a binary search tree (BST). Your iterator will be initialized with the root node of a BST.

		Calling next() will return the next smallest number in the BST.

		Note: next() and hasNext() should run in average O(1) time and uses O(h) memory, where h is the height of the tree.
	 
	 * 
	 * 就是找二叉搜索树的下一个最小值。
	 * 
	 * 
	 * 
	 * 
	 * Definition for binary tree
	 * public class TreeNode {
	 *     int val;
	 *     TreeNode left;
	 *     TreeNode right;
	 *     TreeNode(int x) { val = x; }
	 * }
	 */

	public class P173_BinarySearchTreeIterator {

	    private Stack<TreeNode> stack = new Stack<TreeNode>();
	    public P173_BinarySearchTreeIterator(TreeNode root) {
	        pushAllLeft(root);
	    }
	    
	    public void pushAllLeft(TreeNode node){
	        while(node != null){
	            stack.push(node);
	            node = node.left;
	        }
	    }

	    /** @return whether we have a next smallest number */
	    public boolean hasNext() {
	        if(!stack.empty())
	            return true;
	        return false;
	    }

	    /** @return the next smallest number */
	    public int next() {
	        TreeNode node = stack.pop();
	        pushAllLeft(node.right);
	        return node.val;
	    }
	}

	/**
	 * Your BSTIterator will be called like this:
	 * BSTIterator i = new BSTIterator(root);
	 * while (i.hasNext()) v[f()] = i.next();
	 */
