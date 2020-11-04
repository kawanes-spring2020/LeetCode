package medium_complexity;

class NewNode {
     int val;
     NewNode next;
     NewNode() {}
     NewNode(int val) { this.val = val; }
     NewNode(int val, NewNode next) { this.val = val; this.next = next; }
 }

public class RotateList {

    public NewNode rotateRight(NewNode head, int k) {
        NewNode base1 = head;
        NewNode base = head;
        NewNode base2 = null;
        if(head!=null){
            if(k==0 || head.next == null)
                return head;
            else{

                int size = 1;
                while(head.next!=null){
                    head = head.next;
                    size++;
                }
                if(size==k){
                    return base;
                }
                else{
                    if(k>size){
                        while(k>size){
                            k = k - size;
                        }
                    }

                    if( k == size)
                        return base;
                    int rem = size-k-1;
                    while(rem!=0){
                        base = base.next;
                        rem--;
                    }
                    base2 = base.next;
                    base.next = null;
                    head.next = base1;
                }
            }
        }

        return base2;
    }

}
