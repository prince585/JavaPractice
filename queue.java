import java.util.*;
class queue {
    public static void main(String[] args){
        Queue<Integer> que = new LinkedList<Integer>();

        que.offer(2);
        que.offer(4);
        que.offer(6);
        que.offer(8);

        System.out.println(que);

        que.poll();

        System.out.println(que.peek());
    }
}
