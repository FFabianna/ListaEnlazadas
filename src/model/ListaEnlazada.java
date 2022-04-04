package model;

public class ListaEnlazada {
	private Node head;
	
	public void addFirst(Node node) {
		if (head==null) {
			head= node;
		}else {
			node.setNext(head); // head se enlaza 
			head= node; // queda dee head el nuevo nodo 
		}
	}
	
	public void addLast(Node node) {
		addLast(head,node);
	}
	
	public void print() {
		print(head);
	}
	
	public void print (Node current) {
		if (current == null) {
			return; 
		}
		System.out.println(current.getValue());
		print (current.getNext());
	}
	
	
	
	public void addLast(Node current, Node node) {
		//se lanza un método recursivo 
		
		//caso base
		
		if (current ==null) {
			current= node; 
			return ; 
		}
		if(current.getNext()==null) {
			current.setNext(node);
			return ;
		}
		
		//recursivo 
		addLast(current.getNext(), node);
	}
	
	public void addLastIterative(Node node) {
		if (head==null) {
			head= node;
		}else {
			Node current= head; 
			while(current.getNext() != null) {
				current = current.getNext();
				
			}
			current.setNext(node);
		}
	}
}
