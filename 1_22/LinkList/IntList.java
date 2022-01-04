public class IntList {
	public int first;
	public IntList rest;

	public IntList(int f, IntList r) {
		first = f;
		rest = r;
	}

	/** Return the size of the list using... recursion! */
	public int size() {
		if (this.rest == null) {
            return 1;
        }
        return rest.size() + 1;
	}

	/** Return the size of the list using no recursion! */
	public int iterativeSize() {
        IntList t = this;
        int res = 0;
        while (t != null) {
            res++;
            t = t.rest;
        }
		return res;
	}

	/** Returns the ith value in this list.*/
	public int get(int i) {
        if (i == 0) {
            return first;
        }
        return rest.get(i - 1);
	}

    public void printIntList() {
        IntList t = this;
        while (t != null) {
            System.out.print(t.first + " ");
            t = t.rest;
        }
        System.out.println();
    }

	public static void main(String[] args) {
		IntList L = new IntList(15, null);
		L = new IntList(10, L);
		L = new IntList(5, L);

        System.out.println(L.size());
		System.out.println(L.iterativeSize());
        System.out.println(L.get(1));
	}
}