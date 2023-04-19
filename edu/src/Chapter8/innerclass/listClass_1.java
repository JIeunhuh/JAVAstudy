package Chapter8.innerclass;

class LinkedList1 {
	static class Node { //inner class
		String data;
		Node link; // class명

		public Node(String data) {
			this.data = data;
			link = null;
		}

		public String toString() {
			return "data = " + data;
		}
	}

	Node head;

	void show() {
		Node p = head;
		while (p != null) {
			System.out.println(p.toString());
			p = p.link;
		}
	}

	void add(String name) {
		Node temp = new Node(name);
		if (head == null) {
			head = temp;
		} else {
			temp.link = head;
			head = temp;
		}
	}
}

public class listClass_1 {

}
