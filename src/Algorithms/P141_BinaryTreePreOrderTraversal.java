package Algorithms;
/*Given a binary tree, return the preorder traversal of its nodes' values.

For example:
Given binary tree {1,#,2,3},
   1
    \
     2
    /
   3
return [1,2,3].

Note: Recursive solution is trivial, could you do it iteratively?

*
*可以用栈来实现iteratively，先把root压栈，然后压root.right，最后压root.left
*另一种方法是用递归，比较简单。
*
*/
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


	/**
	 * Definition for a binary tree node.
	 * public class TreeNode {
	 *     int val;
	 *     TreeNode left;
	 *     TreeNode right;
	 *     TreeNode(int x) { val = x; }
	 * }
	 */
	public class P141_BinaryTreePreOrderTraversal {
	    
		
		//递归
	    public List<Integer> preorderTraversal(TreeNode root) {
	        List<Integer> res = new ArrayList<Integer>();
	        
	        if(root == null) return res;
	        res.add(root.val);
	        
	        if(root.left != null){
	            List<Integer> resLeft = preorderTraversal(root.left);
	            for(Integer i : resLeft){
	                res.add(i);
	            }
	        }
	        if(root.right != null){
	            List<Integer> resRight = preorderTraversal(root.right);
	            for(Integer i : resRight){
	                res.add(i);
	            }
	        }
	        
	        return res;
	        
	    }
	    
	    
	    //栈
	    public List<Integer> preorderTraversal2(TreeNode root) {
	        List<Integer> res = new ArrayList<Integer>();
	        Stack<TreeNode> sta = new Stack<TreeNode>();
	        if(root == null) return res;
	        
	        sta.push(root);
	        
	        while(!sta.empty()){
	            TreeNode myTree = sta.pop();
	            res.add(myTree.val);
	            
	            if(myTree.right != null)
	                sta.push(myTree.right);
	            
	            if(myTree.left != null)
	                 sta.push(myTree.left);
	            
	        }
	        
	        return res;
	        
	    }
	}