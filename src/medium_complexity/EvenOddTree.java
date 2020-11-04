package medium_complexity;

import java.util.*;

class treeNode {
      int val;
      treeNode left;
      treeNode right;
      treeNode() {}
      treeNode(int val) { this.val = val; }
      treeNode(int val, treeNode left, treeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

public class EvenOddTree {

    public boolean isEvenOddTree(treeNode root) {
        Queue<treeNode> queue = new LinkedList<>();

        queue.add(root);
        int level = 0;
        List<List<Integer>>list = new ArrayList<>();
        while(!queue.isEmpty()){

            list.add(new ArrayList<>());
            int level_length = queue.size();
            for(int i=0;i<level_length;i++){
                treeNode node = queue.remove();
                list.get(level).add(node.val);
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
            }

            level++;
        }
        System.out.println(list);
        if(list.get(0).get(0)%2==0){
            return false;
        }
        else{
            Boolean flag = true;
            for(int i=1; i<list.size();i++){
                List<Integer> tempList = list.get(i);
                if(tempList.size()==1){
                    if(i%2==0){
                        if(tempList.get(0)%2!=0 ){
                            flag = true;

                        }
                        else{
                            return false;
                        }
                    }
                    else{
                        if(tempList.get(0)%2==0 ){
                            flag = true;
                        }
                        else{
                            return false;
                        }
                    }
                }
                else{
                    for(int j=0;j<tempList.size()-1;j++){
                        if(i%2==0){
                            if(tempList.get(j)%2!=0 && tempList.get(j)<tempList.get(j+1)){
                                if(Collections.max(tempList) == tempList.get(tempList.size()-1) && tempList.get(tempList.size()-1)%2!=0){
                                    flag = true;
                                }
                                else{
                                    return false;
                                }
                            }
                            else{
                                return false;
                            }
                        }
                        else{
                            if(tempList.get(j)%2==0 && tempList.get(j)>tempList.get(j+1)){
                                if(Collections.min(tempList) == tempList.get(tempList.size()-1) && tempList.get(tempList.size()-1)%2==0){
                                    flag = true;
                                }
                                else{
                                    return false;
                                }
                            }
                            else{
                                return false;
                            }
                        }
                    }
                }
            }
            return flag;
        }

    }

}
