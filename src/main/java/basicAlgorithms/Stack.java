package basicAlgorithms;

import java.util.EmptyStackException;

public class Stack<T> { //객체를 만들 때 데이터 타입을 명시하도록 하는 제네릭 표기법
    class Node<T> { //같은 타입을 갖는 노드를 하나 선언
        private T data;// T 타입의 테이터를 선언
        private Node<T> next; //다음 노드도 선언

        public Node(T data) {// 생성자에서 해당 타입의 데이터를 하나 받아서 내부 변수에 저장한다.
            this.data = data;
        }
    }

    // 멤버 변수를 하나 선언한다.
    private Node<T> top; // 스택은 맨 위에 올라가있는 주소만 알고 있으면 된다.

    public T pop() { //pop() : 맨 마지막에 있는 데이터를 가져오면서 지우는 것
        if (top == null) {
            throw new EmptyStackException();
        }
        //맨 위에 있는 애를 반환하기 전에 그 다음에 있는 데이터를 top으로 만들어 줘야한다.
        T item = top.data;
        top = top.next;
        return item;
    }

    public void push(T item) { // push() : 새로운 데이터를 새로 한 개 쌓아올리는 것
        //push할 T 타입의 데이터를 하나 받아서 그 아이템을 가지고 노드를 하나 생성한다.
        Node<T> t = new Node<T>(item);
        // top 앞에 그 노드를 위치시키고
        t.next = top;
        // 이제 그 노드가 top이 된다.
        top = t;
    }

    public T peek() { // peek() : 맨 마지막 데이터를 보는 것
        //마찬가지로 널 체크
        if (top == null) {
            throw new EmptyStackException();
        }
        //널이 아니면 현재 탑이 가지고 있는 데이터를 반환
        return top.data;
    }

    public boolean isEmpty() { //스택에 데이터가 있는지 없는지 확인하는 것
        return top == null;
    }

}





