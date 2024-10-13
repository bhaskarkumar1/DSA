package stack_practice;

import java.util.Arrays;
import java.util.Stack;

public class StackQuestions {

	public int[] nextGreaterElement(int[] arr) {
		// TODO Auto-generated method stub
		Stack<Integer> st=new Stack<>();
		int[] res=new int[arr.length];
		for(int i=arr.length-1;i>=0;i--) {
			if(st.isEmpty()) {
				res[i]=-1;
			}
			else if(st.peek()>arr[i]) {
				res[i]=st.peek();
			}else if(st.peek()<arr[i]) {
//				pop the stack until you get what you want 
				while(!st.isEmpty() && st.peek()<=arr[i]) {
					st.pop();
				}
				if(st.peek()>arr[i]) res[i]=st.peek();	
				else res[i]=-1;
				
			}
			st.push(arr[i]);
		}
		
//		now We only need to do he reverse
		int l=0,r=res.length-1;
		
		while(l<=r) {
			int temp=res[l];
			res[l]=res[r];
			res[r]=temp;
			
			r--;l++;
		}
//		System.out.print(Arrays.toString(res));
		return res;
	}
	
	
	
	/// next Greater to LEFT 
	
	public int[] nextGreaterLeft(int[] arr) {
		int[] res=new int[arr.length];
		
		Stack<Integer> st=new Stack<>();
		for(int i=0;i<arr.length;i++) {
			
			if(st.isEmpty()) {
				res[i]=-1;
			}
			else if(st.peek() > arr[i]) res[i]=st.peek();
			else if(st.peek()<arr[i]) {
				while(!st.isEmpty() && st.peek()<arr[i]) {
					st.pop();
				}
				if(st.isEmpty()) res[i]=-1;
				else res[i]=st.peek();
				}
			
			st.push(arr[i]);
		}
		
		
		
		
		return res;
	}
	
	
	
	
	
	
	//nearest smaller to left 
	
	public int[] nearestSmallerLeft(int[] arr) {
		int[] res=new int[arr.length];
		Stack<Integer> st=new Stack<>();
		
		for(int i=0;i<arr.length;i++) {
			if(st.isEmpty()) {
				res[i]=-1;
			}else if(st.peek()<arr[i]) res[i]=st.peek();
			else if(st.peek()>=arr[i]) {
//				pop until you receive st.peek()< arr[i]
				while(!st.isEmpty() && st.peek()>=arr[i]) {
					st.pop();
				}
				if(!st.isEmpty() && st.peek()<arr[i]) res[i]=st.peek();
				else res[i]=-1;
			}
			st.push(arr[i]);
		}
			
		
		return res;
	}
	
	
	
//nearest smaller to right
	
	public int[] nearestSmallerRight(int[] arr) {
		int[] res=new int[arr.length];
		Stack<Integer> st=new Stack<>();
		
		for(int i=arr.length-1;i>=0;i--) {
			if(st.isEmpty()) res[i]=-1;
			else if(st.peek()<arr[i]) res[i]=st.peek();
			else if(st.peek()>arr[i]) {
//				pop until you get what you want
				while(!st.isEmpty() && st.peek()>arr[i]) {
					st.pop();
				}
				if(st.isEmpty()) res[i]=-1;
				else res[i]=st.peek();
				}
			st.push(arr[i]);
		}
		return res;
	}
	
	
//	stock span
	public int[] stockSpan(int[] arr) {
		int[] res=new int[arr.length];
		Stack<Integer> st=new Stack<>();
		
		for(int i=0;i<arr.length;i++) {
			if(st.isEmpty()) {
//				res[i]=-1;
				res[i]=i+1;
			}else if(arr[st.peek()]>arr[i]) res[i]=i-st.peek();
			else if(arr[st.peek()]<arr[i]) {
//				pop it until you get what you want 
				while(!st.isEmpty() && arr[st.peek()]<arr[i]) {
					st.pop();
				}
				if(st.isEmpty()) res[i]=i;
				else res[i]=i-st.peek();
				
			}
			
			st.push(i);
		}
		
		
		return res;
	}
	
	//max hist area of rectangle
	
	public int maxHistArea(int[] arr) {
//		1st find the nextSmalller index
		
		int[] res1=new int[arr.length];
		Stack<Integer> st=new Stack<>();
		for(int i=arr.length-1;i>=0;i--) {
			if(st.isEmpty()) {
//				as we are assuming that at the end of the histogram building size =0
//				res1[i]=-1;
				res1[i]=arr.length;
			}else if(arr[st.peek()]<arr[i]) {
				res1[i]=st.peek();
			}else if(arr[st.peek()]>arr[i]) {
//				until you get the what you want pop it till then
				while(!st.isEmpty() && arr[st.peek()]>=arr[i]) {
					st.pop();
				}
				if(st.isEmpty()) res1[i]=arr.length;
				else res1[i]=st.peek();
			}
			st.push(i);
		}
//		System.out.println(Arrays.toString(res1));
		
//		2nd find the previousSmalller index 
		
//		we are assuming that the before 0 the index we have a building with height 0
		Stack<Integer> st2=new Stack<>();
		int[] res2=new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			if(st2.isEmpty()) {
				res2[i]=-1;
			}else if(arr[st2.peek()]<arr[i]) res2[i]=st2.peek() ;
			else if(arr[st2.peek()]>arr[i]) {
//				pop it until you get what you want
				while(!st2.isEmpty() && arr[st2.peek()]>=arr[i]) {
					st2.pop();			
					}
				if(st2.isEmpty()) res2[i]=-1;
				else res2[i]=st2.peek();
				}
			st2.push(i);
		}
		
//		System.out.println(Arrays.toString(res2));
		
//		area =(next-prev+1)*arr[i]
		int max=0;
		
		for(int i=0;i<arr.length;i++) {
			int x=(res1[i]-res2[i]-1)*arr[i];
			
			if(x>max) max=x=max;
		}
		
		
		return max;
	}
	
	
	
	
	
	}


