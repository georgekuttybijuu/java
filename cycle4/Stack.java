class Stack {
private int arr[];
private int top;
private int capacity;
Stack(int size) {
arr = new int[size];
capacity = size;
top = -1;
}
public void push(int x) {
if (isFull()) {

System.out.println("Stack OverFlow");
System.exit(1);
}

System.out.println("Inserting " + x);
arr[++top] = x;
}
public int pop() {
if (isEmpty()) {
System.out.println("STACK EMPTY");
System.exit(1);
}
return arr[top--];
}
public int getSize() {
return top + 1;
}
public Boolean isEmpty() {
return top == -1;
}
public Boolean isFull() {
return top == capacity - 1;
}
public void printStack() {
for (int i = 0; i <= top; i++) {
System.out.print(arr[i] + "\t");
}
}
public static void main(String[] args) {
System.out.println("\n NAME : GEORGEKUTTY BIJU \n REG NO :22MCA027 \n DATE : 27-06-2023 \n COURSE CODE : 20MCA132\n COURSE NAME : OBJECT ORIENTED PROGRAMMING LAB");
System.out.println("-----------OUTPUT---------");
Stack stack = new Stack(5);
stack.push(1);
stack.push(2);
stack.push(3);
System.out.print("Stack: ");
stack.printStack();
stack.pop();
System.out.println("\nAfter popping out");
stack.printStack();
}
}
