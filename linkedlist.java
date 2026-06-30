import java.util.*;

class linkedlist {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        try {
            list.add("Prince");
            list.add("Aman");
            list.add("Rohit");
            list.add("Pavan");
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(list);
    }
}
