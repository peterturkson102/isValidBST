/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    boolean isvalid = false;
    public boolean isValidBST(TreeNode root) {
    
if(root.left==null&&root.right==null){
    isvalid = true;
}else if(root.left!=null&&root.right!=null){
        if(root.left.val<root.val&&root.right.val>root.val){
            isvalid = true;
            isValidBST(root.left);
            isValidBST(root.right);
        }else{
           isvalid = false;
        }
}else if(root.right!=null){
  if(root.right.val>root.val){
            isvalid = true;
            isValidBST(root.right);
        }else{
           isvalid = false;
        }

}else if(root.left!=null){
 if(root.left.val<root.val){
            isvalid = true;
            isValidBST(root.left);
        }else{
           isvalid = false;
        }
}

    return isvalid; 
    }
}
