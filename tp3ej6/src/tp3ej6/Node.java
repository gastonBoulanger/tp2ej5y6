package tp3ej6;

public class Node {

	private int info;
	private Node left = null;
	private Node right = null;

	public Node(int num) {
		this.info = num;
	}

	public Node() {
		
	}

	public void setInfo(int i) {
		this.info = i;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	public int getInfo() {
		return info;
	}

	public Node getLeft() {
		return left;
	}

	public Node getRight() {
		return right;
	}

	public void printNodeByInfo() {
		System.out.println(info);
	}
}
