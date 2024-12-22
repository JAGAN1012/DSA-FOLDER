import java.util.Arrays;

public class stack {
	static int max=5;
	static int top=-1;
	static int[] stack=new int[max];
   public static void main(String []args) {
	   System.out.println("Implementation of stack");
	    push(10);
	    push(20);
	    push(30);
	    push(40);
	    push(50);
	    System.out.println(Arrays.toString(stack));
	   pop();
	   pop();
	   pop();
	   pop();
	   
	   
	   System.out.println(Arrays.toString(stack));
	   System.out.println(top);
	   
	   if(isEmpty()){
		   System.out.print("stack is empty");
		   
	   }
	   else {
		   System.out.print("stack is not empty");
	   }
   }
   
   
  static boolean isEmpty() {
	   if(top==-1) {
		   return true;
	   }
	return false;
   }

public static void push(int i) {
	 if(top==max) {
		 System.out.println("satck is full");
		 return;
	 }
 	  
 	 stack[++top]=i;
 }
   public static void pop() {
		if(top==-1) {
			 System.out.println("satck is empty");
		}
	 	stack[top]=0;
	 	top--;
	 
	 }

   
}
