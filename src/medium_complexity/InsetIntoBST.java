package medium_complexity;

class TreeNode2 {
      int val;
      TreeNode2 left;
      TreeNode2 right;
      TreeNode2() {}
      TreeNode2(int val) { this.val = val; }
      TreeNode2(int val, TreeNode2 left, TreeNode2 right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

public class InsetIntoBST {

    public TreeNode2 insertIntoBST(TreeNode2 root, int val) {
        if(root == null)
            return new TreeNode2(val);

        TreeNode2 base = root;
        while(root.left!=null || root.right!=null){
            if(val<root.val){
                if(root.left!=null){
                    root = root.left;
                }
                else{
                    root.left = new TreeNode2(val);
                    return base;
                }
            }
            else{
                if(root.right!=null){
                    root = root.right;
                }
                else{
                    root.right = new TreeNode2(val);
                    return base;
                }
            }



        }
        if(root.left==null && root.right==null){
            if(val<root.val)
                root.left = new TreeNode2(val);
            else
                root.right = new TreeNode2(val);
            return base;
        }



        return root;
    }

}
