import java.util.*;
class stack {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<Integer>();


        stack.push(2);
        stack.push(4);
        stack.push(6);
        stack.push(8);
        try{
        System.out.println(stack.empty());
        System.out.println(stack);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        }
        catch(Exception e){
            System.out.println(e);
        }
	// update
	// hello this is to check if my github is working properlly or not 
    }
}
