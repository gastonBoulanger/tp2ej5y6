package tp3ej6;

public class Main {
	public static void main(String[] args) {
		ArbolBinario arbolito = new ArbolBinario();
		System.out.println(arbolito.insert(8));
		System.out.println(arbolito.insert(9));
		System.out.println(arbolito.insert(7));
		System.out.println(arbolito.insert(4));
	
		System.out.println(arbolito.insert(9));
		System.out.println(arbolito.insert(12));
		System.out.println(arbolito.insert(12));
		System.out.println(arbolito.insert(3));
		System.out.println(arbolito.insert(9));
		System.out.println(arbolito.hasElem(9));
		
		
	}
}
