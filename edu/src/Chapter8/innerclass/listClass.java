package Chapter8.innerclass;

class Node {
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

class LinkedList {
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

public class listClass {
	public static void main(String[] args) {
		LinkedList my = new LinkedList();
		my.add("hong");
		my.add("kim");
		my.add("choi");
		my.add("huh");
		my.add("lee");
		my.show();
	}
}
