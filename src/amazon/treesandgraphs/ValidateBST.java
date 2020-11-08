package amazon.treesandgraphs;

import java.util.*;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

public class ValidateBST {

    public boolean isValidBST(TreeNode root) {
        if(root == null || (root.left == null && root.right == null))
            return true;
        List<Integer> list = new ArrayList<>();
        checkBST(root, list);
        List<Integer> sortedList = new ArrayList<>(list);
        Collections.sort(list);
        Set<Integer> set = new HashSet<>(list);
        if(list.equals(sortedList) && set.size()>1 && set.size()==list.size() )
            return true;
        return false;
    }
    public void checkBST(TreeNode root, List<Integer> list){

        if(root != null){
            checkBST(root.left,list);
            list.add(root.val);
            checkBST(root.right,list);
        }
    }
}
