package tp3ej6;

public class Node {

	private int info;
	private Node left = null;
	private Node right = null;

	public Node(int num) {
		info = num;
	}


	public void setInfo(int st) {
		info = st;
	}

	

	public int getInfo() {
		return info;
	}

	public Node getLeft() {
		return left;
	}
	public Node getRight() {
		return left;
	}

	public void printNodeByInfo() {
		System.out.println(info);
	}
}
