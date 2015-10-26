import java.lang.*;
import java.util.ArrayList;

public class DoubleLinkedList {
	public int nextID;
	ArrayList<Node> nodes = new ArrayList<Node>();
	public Node = head;
	public Node = tail; 

	public void insert(Node node, int index){
		this.node = nodes;
		this.index = nextID;
		if (nodes.prev == null) {
			nodes = head; 
		}
		if (nodes.next == null) {
			nodes = tail;
		}
	}

	public void remove(Node node){
		node.prev.next = node.next;
		node.next.prev = node.prev;
	}

	public void removeAt(int index){
		nodes.remove(index);
	}
	
	public boolean isEmpty(){
		if (head != null && tail != null) {
			return true;
		}
		else {
			return false;
		}
	}

	public void clear(){
		while (head != null && tail != null) {
			nodes.remove();
		}
	}
	

}