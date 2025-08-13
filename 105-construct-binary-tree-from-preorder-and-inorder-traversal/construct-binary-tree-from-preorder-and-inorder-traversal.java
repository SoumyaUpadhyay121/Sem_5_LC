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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
           return CreateTree(inorder,preorder,0,inorder.length-1,0,preorder.length-1);
    }

    public TreeNode CreateTree(int []in,int[]pre,int inlow,int inhigh,int prelow,int prehigh){
        if(inlow>inhigh || prelow>prehigh){
            return null;
        }
        TreeNode node=new TreeNode(pre[prelow]);
        int idx=search(in,inlow,inhigh,pre[prelow]);
        int c=idx-inlow;
        node.left=CreateTree(in,pre,inlow,idx-1,prelow+1,prelow+c);
        node.right=CreateTree(in,pre,idx+1,inhigh,prelow+c+1,prehigh);
        return node;
    }

    public int search(int[]in,int inlow,int inhigh,int item){
        for(int i=inlow;i<=inhigh;i++){
            if(in[i]==item){
                return i;
            }
        }
        return 0;
    }
}