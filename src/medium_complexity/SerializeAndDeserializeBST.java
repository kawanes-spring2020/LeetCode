package medium_complexity;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode1 {
     int val;
     TreeNode1 left;
     TreeNode1 right;
     TreeNode1(int x) { val = x; }
 }

public class SerializeAndDeserializeBST {
    // Encodes a tree to a single string.
    public String serialize(TreeNode1 root) {
        List<String> list = new ArrayList<>();
        if(root == null)
            return "";
        else{
            Queue<TreeNode1> queue = new LinkedList<>();
            queue.add(root);

            while(!queue.isEmpty()){
                TreeNode1 node = queue.remove();
                if(node!=null){
                    list.add(""+node.val);
                    queue.add(node.left);
                    queue.add(node.right);
                }

                else
                    list.add("$");



            }
        }

        return String.join(",",list);
    }

    // Decodes your encoded data to tree.
    public TreeNode1 deserialize(String data) {
        String[] arr = data.split(",");
        if(arr[0].equals("$") || data.equals("")){
            return null;
        }

        Queue<TreeNode1> queue = new LinkedList<>();
        TreeNode1 root = new TreeNode1(Integer.parseInt(arr[0]));
        queue.add(root);

        int i=1;
        while(!queue.isEmpty() ){
            TreeNode1 h = queue.remove();
            if(h!=null){
                TreeNode1 left = null;
                if(!arr[i].equals("$")){
                    left = new TreeNode1(Integer.parseInt(arr[i]));
                }
                h.left = left;
                queue.add(left);

                i++;

                TreeNode1 right = null;
                if(!arr[i].equals("$")){
                    right = new TreeNode1(Integer.parseInt(arr[i]));
                }
                h.right = right;
                queue.add(right);
                i++;
            }

        }

        return root;
    }
}
