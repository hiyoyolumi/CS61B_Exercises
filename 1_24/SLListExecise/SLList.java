/** An SLList is a list of integers, which hides the terrible truth
   * of the nakedness within. */
  public class SLList {	
	private class IntNode {
		public int item;
		public IntNode next;

		public IntNode(int i, IntNode n) {
			item = i;
			next = n;
			System.out.println(size);
		}
	} 

	/* The first item (if it exists) is at sentinel.next. */
	private IntNode sentinel;
	private int size;

	/** Creates an empty SLList. */
	public SLList() {
		sentinel = new IntNode(63, null);
		size = 0;
	}

	public SLList(int x) {
		sentinel = new IntNode(63, null);
		sentinel.next = new IntNode(x, null);
		size = 1;
	}

	public SLList(int[] arr) {
		sentinel = new IntNode(63, null);
		
		IntNode tail = sentinel;

		for (int i = 0; i < arr.length; i++) {
			IntNode temp = new IntNode(arr[i], null);
			tail.next = temp;
			tail = tail.next;
			size++;
		}
	}

 	/** Adds x to the front of the list. */
 	public void addFirst(int x) {
 		sentinel.next = new IntNode(x, sentinel.next);
 		size = size + 1;
 	}

 	/** Returns the first item in the list. */
 	public int getFirst() {
 		return sentinel.next.item;
 	}

 	/** Adds x to the end of the list. */
 	public void addLast(int x) {
 		size = size + 1; 		

 		IntNode p = sentinel;

 		/* Advance p to the end of the list. */
 		while (p.next != null) {
 			p = p.next;
 		}

 		p.next = new IntNode(x, null);
 	}
 	
 	/** Returns the size of the list. */
 	public int size() {
 		return size;
 	}

	/** Delete the first element of the list */
	public void deleteFirst() {
		IntNode t = sentinel;

		t.next = t.next.next;

		size--;
	}

	/** Print the list */
	public void print() {
		IntNode t = sentinel.next;
		System.out.print("list : ");
		while (t != null) {
			System.out.print(t.item + " ");
			t = t.next;
		}
		System.out.println(" ");
	}

	public void deleteNode(IntNode d) {
		IntNode t = sentinel.next;
		while (t.next != d) {
			t = t.next;
		}
		t.next = t.next.next;
		size--;
	}

	public void addAdjacent() {
		IntNode q = sentinel.next;
		IntNode p = sentinel.next.next;
		if (q == null || p == null) {
			return;
		}

		while (p != null) {
			if (q.item == p.item) {
				q.next = p.next;
				p = q.next;
				q.item = q.item * 2;
				size--;
			} else {
				p = p.next;
				q = q.next;
			}
		}
	}

	public void squareAdd(int x) {
		IntNode t = sentinel.next;

		while (t != null) {
			t.next = new IntNode(t.item * t.item, t.next);
			size++;
			t = t.next;
			
			if (t.next == null) {
				t.next = new IntNode(x, null);
				size++;
				t = t.next;
			}
			t = t.next;
		}
	}

	public static void main(String[] args) {
 		/* Creates a list of one integer, namely 10 */
 		
		/** If 2 numbers in a row are the same, we add them together
		 * and make one large node.
		 */
		int[] arr = new int[]{1, 2};
		SLList L = new SLList(arr);
		// L.print();
		// L.addAdjacent();
		L.print();
		L.squareAdd(5);
		L.print();
		L.squareAdd(7);
		L.print();
		

 		// L.addLast(20);
		// L.addLast(30);
		// L.print();
		// L.deleteFirst();
		// L.print();

		// int[] arr = new int[]{1,2,3,4,5,6};
		// SLList L2 = new SLList(arr);
		// L2.print();

 		// System.out.println("size = " + L.size());
		// System.out.println("sizeL2 = " + L2.size());
 	}
}