package amazon.treesandgraphs;

import  java.util.*;

class TreeNode123 {
      int val;
      TreeNode123 left;
      TreeNode123 right;
      TreeNode123() {}
      TreeNode123(int val) { this.val = val; }
      TreeNode123(int val, TreeNode123 left, TreeNode123 right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

public class SymmetricTree {
    public boolean isSymmetric(TreeNode123 root) {

        if(root==null)
            return true;
        Queue<TreeNode123> queue = new LinkedList<>();
        int depth = 0;
        queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> list = new ArrayList<>();
            depth = queue.size();
            while(depth>0){
                TreeNode123 node = queue.remove();
                if(node !=null)
                    list.add(node.val);
                else
                    list.add(500);
                if(node!=null){
                    queue.add(node.left);
                }
                if(node!=null){
                    queue.add(node.right);
                }
                depth--;
            }
            List<Integer> newList = new ArrayList<>(list);
            Collections.reverse(list);
            if(!list.equals(newList))
                return false;
        }



        return true;
    }
}
