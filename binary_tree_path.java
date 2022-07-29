class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        
        if(root==null)
        {
            return ans;
        }
                
        solve(root,ans,"");
        
        return ans;
    }
    
    void solve(TreeNode root, List<String> list,String s)
    {
        if(root==null)return;
        if(root.left==null && root.right==null)list.add(s+root.val);
        if(root.left!=null)    solve(root.left,list,s+root.val+"->");
        if(root.right!=null)    solve(root.right,list,s+root.val+"->");
    }
}
