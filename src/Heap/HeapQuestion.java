package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class HeapQuestion {
//kth smallest 
	
	/*
	 * we need to find kth smallest means we need to eliminate all the greater
	 * element from it we will use max heap because on the top we will be having the
	 * using maxheap
	 */
public int kthSmallest(int[] arr,int k) {
	
	PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
	
	for(int num: arr) {
		pq.add(num);
		if(pq.size()>k) {
			pq.poll();
		}
		
	}
	
	
	
	return pq.poll();
}


//here we will remove all the smallest before that target kth larget and we will use min heap

public int kthLargest(int[] arr,int k) {
	PriorityQueue<Integer> pq=new PriorityQueue<>();
	for(int num:arr) {
		pq.add(num);
		
		if(pq.size()>k) pq.poll();
		}
	return pq.poll();
	}


//Sort the nearly Sorted array
public int[] sortNearlySorted(int[] arr, int k) {
	
	PriorityQueue<Integer> pq= new PriorityQueue<>();
	
	int i=0;
	for(int ele: arr) {
		pq.add(ele);
		
		if(pq.size()>k) {
			arr[i]=pq.poll();
			i++;
		}
		
	}
	
	while(pq.size()!=0) {
		arr[i]=pq.poll();
		i++;
	}
	return arr;
}


/*
 * in priorty queue we can add only one element, but how to implement PQ if we
 * need to add a pair and sorting need to be done from 1st value
 */


public void pairHeap(int[] arr,int k) {

//	min heap
	PriorityQueue<Pair> pq=new PriorityQueue<>();
	int key;
	for(int a:arr) {
		key=Math.abs(a-k);
		pq.add(new Pair(key,a));
		
	}
while(pq.size()!=0) {
	
Pair pair=pq.poll();
System.out.println("key is "+pair.key+" and value is "+pair.value);
	
}

}



//find the sum between k1th smallest and k2th smallest
public int sumkth(int[] arr,int k1,int k2) {
//	max heap
	PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
	
	for(int a:arr) {
		pq.add(a);
		if(pq.size()>k1) pq.poll();
		
	}
	int sum1=0;
	while(pq.size()>0) {
		sum1+=pq.poll();
	}
	
	
	for(int a:arr) {
		pq.add(a);
		if(pq.size()>k2) pq.poll();
		
	}
	int sum2=0;
	pq.poll();
	while(pq.size()>0) {
		sum2+=pq.poll();
	}
	
	
	return sum2-sum1;
}

}
//class end



//pair class
class Pair implements Comparable<Pair>{
	int key;
	int value;
	
	public Pair(int key,int value) {
		this.key=key;
		this.value=value;
	}
    @Override
	public int compareTo(Pair other) {
        // Compare based on the key
        return Integer.compare(this.key, other.key);
    }
}

