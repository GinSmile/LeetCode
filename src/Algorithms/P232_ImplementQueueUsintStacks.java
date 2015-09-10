package Algorithms;

import java.util.Stack;

public class P232_ImplementQueueUsintStacks {
	//和225题一样，重点改变push方法，让两个栈的组合看起来好像是队列
	class MyQueue {
	    Stack<Integer> s1 = new Stack<Integer>();//peak,pop,empty
	    Stack<Integer> s2 = new Stack<Integer>();//push中转
	    
	    // Push element x to the back of queue.
	    public void push(int x) {
	        while(!s1.empty()){
	            s2.push(s1.peek());
	            s1.pop();
	        }
	        
	        s1.push(x);
	        
	        while(!s2.empty()){
	            s1.push(s2.peek());
	            s2.pop();
	        }
	        
	    }

	    // Removes the element from in front of queue.
	    public void pop() {
	        s1.pop();
	    }

	    // Get the front element.
	    public int peek() {
	        return s1.peek();
	    }

	    // Return whether the queue is empty.
	    public boolean empty() {
	        return s1.empty();
	    }
	}
}
