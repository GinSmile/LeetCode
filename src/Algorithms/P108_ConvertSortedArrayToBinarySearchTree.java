/*Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
*
*用二分搜索！！
*
*/
package Algorithms;

public class P108_ConvertSortedArrayToBinarySearchTree {

	/**
	 * Definition for a binary tree node.
	 * public class TreeNode {
	 *     int val;
	 *     TreeNode left;
	 *     TreeNode right;
	 *     TreeNode(int x) { val = x; }
	 * }
	 */
	    public TreeNode sortedArrayToBST(int[] nums) {
	        if(nums.length == 0) return null;
	        return toBST(nums, 0, nums.length - 1);
	    }
	    public TreeNode toBST(int[] nums, int l, int r) {
	        if(l > r) return null;
	        int mid = (r + l + 1)/2;
	        TreeNode next = new TreeNode(nums[mid]);
	        next.left = toBST(nums, l, mid - 1);
	        next.right = toBST(nums, mid + 1, r);
	        
	        return next;
	    }
	    
	}
