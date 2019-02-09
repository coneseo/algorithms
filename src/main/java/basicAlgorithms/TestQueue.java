package basicAlgorithms;

import java.util.NoSuchElementException;

class Queue<T>{
    // 객체를 만들 때 데이터 타입을 명시하도록 하고,  같은 타입을 갖는 노드를 선언
    class Node<T>{
        //데이터와 다음 노드도 선언한다.
        private T data;
        private Node<T> next;

        //생성자에서 해당 타입의 데이터를 받아서 내부 변수에 저장한다.
        public Node(T data){
            this.data = data;
        }
    }

    //Queue 는 앞 뒤로 주소를 알고 있어야 한다.
    // first , last 두 개의 멤버 변수를 선언
    private Node<T> first;
    private Node<T> last;

    //메소드를 구현
    //추가할 T 타입의 item을 받아서
    public void add(T item){
        //그 item을 가지고 Node를 하나 생성
        Node<T> t = new Node<T>(item);
        //마지막 노드가 있다면 그 뒤에 노드를 하나 붙이고
        if(last != null){
            last.next = t;
        }
        last = t;
        if (first == null){
            first = last;
        }
    }

    public T remove(){
        //큐가 비어있으면
        if (first == null){
            throw new NoSuchElementException();
        }
        //데이터를 백업하고
        T data = first.data;
        // 다음 애를 first로 만들어 준다.
        first = first.next;
        //first가 null이 됐을 때 last도 null로 만들어 준다.
        if(first == null){
            last = null;
        }
        return data;
    }

    //T 타입의 데이터를 반환
    public T peek(){
        if (first == null){
            throw new NoSuchElementException();
        }
        return first.data;
    }

    public boolean isEmpty(){
        return first == null;
    }
}
public class TestQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new Queue<Integer>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q.isEmpty());
        System.out.println(q.remove());
        System.out.println(q.isEmpty());
    }
}
