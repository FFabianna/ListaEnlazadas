package main;


import model.ListaEnlazada;
import model.Node;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaEnlazada list= new ListaEnlazada();
		list.addFirst( new Node (4));
		list.addFirst( new Node (3));
		list.addFirst( new Node (2));
		list.addFirst( new Node (1));
		list.addFirst( new Node (0));
		
		list.addLast( new Node (10));
		list.addLast( new Node (11));
		
		list.print();

	}

}
