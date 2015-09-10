package Algorithms;
/*Given a binary tree, return the inorder traversal of its nodes' values.

For example:
Given binary tree {1,#,2,3},
   1
    \
     2
    /
   3
return [1,3,2].

Note: Recursive solution is trivial, could you do it iteratively?

confused what "{1,#,2,3}" means? > read more on how binary tree is serialized on OJ.

*
*
*
*用两种方法，一种递归，另一种用栈
*
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

public class P094_BinaryTreeInorderTraversal {
	
	//递归
	public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        
        if(root == null) return res;
        
        
        if(root.left != null){
            List<Integer> resLeft = inorderTraversal(root.left);
            for(Integer i : resLeft){
                res.add(i);
            }
        }
        
        res.add(root.val);
        
        if(root.right != null){
            List<Integer> resRight = inorderTraversal(root.right);
            for(Integer i : resRight){
                res.add(i);
            }
        }
        
        return res;
        
    }
	
	
	
    //栈
    public List<Integer> inorderTraversal2(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        Stack<TreeNode> sta = new Stack<TreeNode>();
        if(root == null) return res;
        
        TreeNode curNode = root;
        
        while(curNode != null || !sta.empty()){
            while(curNode != null){
            	sta.push(curNode);
            	curNode = curNode.left;
            }
            
            curNode = sta.pop();
            res.add(curNode.val);
            
            curNode = curNode.right;
            
        }
        
        return res;
        
    }
	
	
}
