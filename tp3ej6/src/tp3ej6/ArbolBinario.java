package tp3ej6;

import java.util.List;

public class ArbolBinario {
	private Node root = new Node();
	private int size;
	private Node answer = null;

	public Node getRoot() {
		return root;
	}

	public boolean hasElem(int elem) {
		if(size != 0){
		if (findElem(root, elem).getInfo() == elem) { // no estoy seguro que sea una buena
											// pr�ctica
			answer = null; // asi answer vuelve a ser null y en una nueva
							// busqueda no da un falso positivo
			return true;
		} else {
			return false;
		}
		
		} else {
			return false;
		}

	}

	private Node findElem(Node n, int elem){
		if(n != null){
			if(n.getInfo() == elem){
				answer = n;
			} else if(n.getInfo() < elem){
				if(n.getRight() != null){
					answer = n.getRight();/////////
					findElem(answer, elem);		 //
				} else{							 //
					answer = n;					//
				}								//
			} else if (n.getLeft() != null){	//---- para devolver la posici�n m�s cercana al elem
				answer = n.getLeft();/////////////
				findElem(answer, elem);
			} else {
				answer = n;
			}
			}
		
		return answer;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public String insert(int i) { // devuelve String para poder decir si lo
								// insert� o si ya exist�a, no agrega
									// valores iguales
		String st = "";
		Node nodo = new Node(i);
		if (!this.isEmpty()){
			Node nod = findElem(root, i);
		if (nod != null) {
			if(nod.getInfo() < i){
				nod.setRight(nodo);
				size++;
				st = "Se agreg� correctamente a la derecha";
			} else if(nod.getInfo() > i){
				nod.setLeft(nodo);
				size++;
				st = "Se agreg� correctamente a la izquierda";
			} else{
				st = "El valor ya exist�a, por lo tanto, no se agreg�";
			}
		} }else{
			root.setInfo(i);
			size++;
			st = "Se agreg� correctamente";
		}
		return st;
		}
	
	

	
	 public boolean delete(int elem) {
	 if (size != 0){
		 if(root.getInfo() == elem){
			 root = null;
		 }
	 }
	 }
	 /* 
	 * public int getHeight() {
	 * 
	 * }
	 * 
	 * public void printPosOrder() {
	 * 
	 * }
	 * 
	 * public void printPreOrder() {
	 * 
	 * }
	 * 
	 * public void printInOrder() {
	 * 
	 * }
	 * 
	 * public List getLongestBranch() {
	 * 
	 * }
	 * 
	 * public List getFrontera() {
	 * 
	 * }
	 * 
	 * public Object getMaxElem() {
	 * 
	 * }
	 * 
	 * public List getElemAtLevel(int i) {
	 * 
	 * }
	 */
}
