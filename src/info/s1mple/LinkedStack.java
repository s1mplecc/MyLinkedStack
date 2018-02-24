package info.s1mple;

public class LinkedStack<T> {
    private static class Node<T> {
        T item;
        Node<T> next; //下一个节点的引用，类似于C中的指针

        Node() { //没有参数的Constructor，用于初始化时生成栈顶
            item = null;
            next = null;
        }

        Node(T item, Node<T> next) {
            this.item = item;
            this.next = next;
        }

        boolean isEmpty() { //栈空标记
            return item == null && next == null;
        }
    }

    private Node<T> top = new Node<>(); //初始化栈顶

    public void push(T item) {
        top = new Node<>(item, top); //与上一节点链接
    }

    public T pop() {
        T result = top.item;
        if (!top.isEmpty()) {
            top = top.next; //指针后移
        }
        return result;
    }

}
