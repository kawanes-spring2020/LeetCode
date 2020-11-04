package medium_complexity;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
     int val;
     TreeNode1 left;
     TreeNode1 right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode1 left, TreeNode1 right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }

public class BinaryLevelOrder {

    public List<List<Integer>> levelOrder(TreeNode1 root) {
        List<List<Integer>> output = new ArrayList<>();
        if(root == null)
            return output;
        else{
            Queue<TreeNode1> queue = new LinkedList<>();

            queue.add(root);
            int level = 0;

            while(!queue.isEmpty()){
                output.add(level,new ArrayList<Integer>());
                int level_length = queue.size();
                for(int i=0;i<level_length;i++){
                    TreeNode1 node = queue.remove();
                    output.get(level).add(node.val);

                    if(node.left!=null)
                        queue.add(node.left);

                    if(node.right!=null)
                        queue.add(node.right);

                }
                level++;



            }
        }
        return output;

    }

}
