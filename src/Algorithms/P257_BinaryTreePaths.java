package Algorithms;

import java.util.ArrayList;
import java.util.List;



/*Given a binary tree, return all root-to-leaf paths.

For example, given the following binary tree:

   1
 /   \
2     3
 \
  5
All root-to-leaf paths are:

["1->2->5", "1->3"]

*
*
*
*
*深度优先搜索！！
*
*/


/**
	 * Definition for a binary tree node.
	 * public class TreeNode {
	 *     int val;
	 *     TreeNode left;
	 *     TreeNode right;
	 *     TreeNode(int x) { val = x; }
	 * }
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	public class P257_BinaryTreePaths {
	    public List<String> binaryTreePaths(TreeNode root) {
	        List<String> list = new ArrayList<String>();
	        StringBuilder sb = new StringBuilder();
	        
	        
	        return path(root, list, sb);
	    }
	    
	    public List<String> path(TreeNode node, List<String> list, StringBuilder sb){
	        if(node == null) return list;
	        
	        //如果到叶子结点，一趟结束，添加到list
	        if(node.left == null && node.right == null){
	            list.add(sb.append(node.val).toString());
	        }
	        
	        //复制sb，左右各要一份。这样的话，到叶子结点就会有仅属于该叶子节点的sb
	        StringBuilder sb2 = new StringBuilder(sb);
	        if(node.left != null){
	            path(node.left, list, sb.append(node.val + "->"));
	        }
	        
	        if(node.right != null){
	            path(node.right, list, sb2.append(node.val + "->"));
	        }
	        
	        return list;
	    }
	}