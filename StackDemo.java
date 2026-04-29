
// Generic Stack Class
class GenericStack<T> {

    private T[] stackArray;
    private int top;
    private int capacity;

    // Constructor
    @SuppressWarnings("unchecked")
    public GenericStack(int capacity) {
        this.capacity = capacity;
        this.top = -1;
        this.stackArray = (T[]) new Object[capacity];
    }

    // Push Operation
    public void push(T element) {
        if (top == capacity - 1) {
            System.out.println("Error: Stack Overflow. Cannot push " + element);
            return;
        }
        stackArray[++top] = element;
        System.out.println("Pushed: " + element);
    }

    // Pop Operation
    public T pop() {
        if (top == -1) {
            System.out.println("Error: Stack Underflow. Stack is empty.");
            return null;
        }
        return stackArray[top--];
    }

    // Optional: Peek Operation
    public T peek() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return null;
        }
        return stackArray[top];
    }
}

// Main Class
public class StackDemo {
    public static void main(String[] args) {

        // Integer Stack
        System.out.println("----- Integer Stack -----");
        GenericStack<Integer> intStack = new GenericStack<>(3);

        intStack.push(10);
        intStack.push(20);
        intStack.push(30);
        intStack.push(40); // Overflow

        System.out.println("Popped: " + intStack.pop());

        // String Stack
        System.out.println("\n----- String Stack -----");
        GenericStack<String> stringStack = new GenericStack<>(2);

        stringStack.push("KTU");
        stringStack.push("MCA");

        System.out.println("Popped: " + stringStack.pop());
        System.out.println("Popped: " + stringStack.pop());
        stringStack.pop(); // Underflow
    }
}
