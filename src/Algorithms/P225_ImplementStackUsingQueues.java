package Algorithms;

import java.util.LinkedList;
import java.util.Queue;

public class P225_ImplementStackUsingQueues {
	class MyStack {
		
		//用了两个队列，我把q1看作是栈，每次push的时候不按Queue的方法push到队尾，我push到队首，
		//这样，对队列的pop(),top(),empty()，就相当于对队列的poll(),peek(),empty(),，效果是一样的
	    Queue<Integer> q1 = new LinkedList<Integer>();
	    Queue<Integer> q2 = new LinkedList<Integer>();
	    
	    // Push element x onto stack.
	    public void push(int x) {
	        while(q1.peek() != null){
	            q2.add(q1.poll());
	        }
	        
	        q1.add(x);
	        
	        while(q2.peek() != null){
	            q1.add(q2.poll());
	        }
	    }

	    // Removes the element on top of the stack.
	    public void pop() {
	        q1.poll();
	    }

	    // Get the top element.
	    public int top() {
	        return q1.peek();
	    }

	    // Return whether the stack is empty.
	    public boolean empty() {
	        return q1.peek() == null;
	    }
	}
}
