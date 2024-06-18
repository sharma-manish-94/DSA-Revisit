package stack;

public class TwoStacks {

	int[] array;
	int top1;
	int top2;
	int size;

	public TwoStacks(int n) {
		size = n;
		array = new int[size];
		top1 = -1;
		top2 = size;
	}

	public void push1(int data) {
		if (top1 < top2 - 1) {
			array[++top1] = data;
		} else {
			System.out.println("Stack Overflow!!!");
		}
	}
	
	public void push2(int data) {
		if(top1 < top2 -1) {
			array[--top2] = data;
		} else {
			System.out.println("Stack Overflow!!!");
		}
	}
	
	public int pop1() {
		if(top1 == -1) {
			System.out.println("Stack Underflow!!!");
			return -1;
		} else {
			return array[top1--];
		}
	}
	
	public int pop2() {
		if(top2 == size) {
			System.out.println("Stack Underflow!!!");
			return -1;
		} 
		
		return array[top2++];
	}
	
	public static void main(String[] args) {
		final TwoStacks twoStacks = new TwoStacks(5);
		twoStacks.push1(0);
		twoStacks.push2(5);
		twoStacks.push1(1);
		twoStacks.push1(2);
		twoStacks.push2(4);
		
		
		System.out.println(twoStacks.pop1());
		System.out.println(twoStacks.pop2());
	}
}
