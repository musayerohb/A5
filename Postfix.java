public class Postfix {
    
    //eatin a burger with no honey mustard
    //All static methods
    
// addFirst(x): adds element at the beginning
// addLast(x): adds element at the end
// removeFirst(): removes element from the beginning
// removeLast(): removes element from the end
// Use as a queue: addLast() and removeFirst()
// Use as a stack: addFirst and removeFirst()

//Implementation of push(x) :
// Create new node with x as data, pointing to head
// Make head point at the newly created node

// Implementation of pop():
// Make note of head.data for return value
// Make head point at head.next

    public Postfix(SLL stack) {
    }

    public void addFirst(T v) {
        if (isEmpty() == true) {
            NodeSL<T> newItem = new NodeSL<>(v, null);
            this.head = this.tail = newItem;
        }
        else {
            NodeSL<T> newItem = new NodeSL<>(v, this.head);
            this.head = newItem;
        }
        return;
    }

}
