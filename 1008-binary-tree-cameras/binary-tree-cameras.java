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
    int Camera=0;
    public int minCameraCover(TreeNode root) {
        int c=minCamera(root);
        if(c==-1){
            Camera++;
        }
        return Camera;
    }

    //1: Camera setup kra is node pr
    //-1: is node camera ki need hai
    //0: Covered hai
    public int minCamera(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=minCamera(root.left);
        int right=minCamera(root.right);
        if(left==-1 || right==-1){
            Camera++;
            return 1;
        }
        else if(left==1 || right==1){//inme se koi ek pass ya dono ke pass Camera hai or ek ke pass camera hai and dusra wala covered hai
            return 0;//covered hai
        }
        else{
            return -1;//need a camera
        }
    }
}