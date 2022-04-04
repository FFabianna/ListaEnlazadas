package model;

public class ListaEnlazadaTail {
	private Node head;
	private Node tail;
	
	public void addFirst (Node node) {
		if (head==null) {
			head= node;
			tail=node;
		}else {
			node.setNext(head);
			head= node;
		}
	}
	public void addLast (Node node) {
		if (tail==null) {
			head= node;
			tail=node;
		}else {
			tail.setNext(head);
			tail= node;
		}

}
}
