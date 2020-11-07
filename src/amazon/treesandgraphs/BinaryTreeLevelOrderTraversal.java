package amazon.treesandgraphs;

import java.util.*;

class TreeNodes1 {
      int val;
      TreeNodes1 left;
      TreeNodes1 right;
      TreeNodes1() {}
      TreeNodes1(int val) { this.val = val; }
      TreeNodes1(int val, TreeNodes1 left, TreeNodes1 right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNodes1 root) {
        if(root==null)
            return new ArrayList<>();
        List<List<Integer>> depthList = new ArrayList<>();
        Queue<TreeNodes1> queue = new LinkedList<>();
        int depth = 0;
        queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> list = new ArrayList<>();
            depth = queue.size();
            while(depth>0){
                TreeNodes1 node = queue.remove();
                list.add(node.val);
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
                depth--;
            }
            depthList.add(list);
        }
        System.out.println(depthList);
        return depthList;
    }
}
