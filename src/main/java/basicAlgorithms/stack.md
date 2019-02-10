## stack 이란?
데이터 구조의 하나로서 데이터를 1열로 나열하지만, 서류를 쌓아 놓은 경우처럼 새롭게 추가한 데이터에만 접근할 수 있다.
한 쪽 끝에서만 자료를 넣고 뺄 수 있는 LIFO(Last In First Out)형식의 자료구조이다.

### stack의 연산
stack은 가장 최근에 stack에 추가한 항목이 가장 먼저 제거될 항목이다.

* pop() : stack에서 가장 위에 있는 항목을 제거한다.
* push(item): item하나를 stack의 가장 윗 부분에 추가한다.
* peek() : stack의 가장 위의 항목을 반환한다.
* isEmpty() : stack이 비어있을 때 true를 반환한다.

### stack의 구현
문제의 종류에 따라 배열보다 stack에 데이터를 저장하는 것이 더 적합한 방법일 수 있다.
* 배열과 달리 stack은 상수 시간에 i번째 항목에 접근할 수 없다.
* 하지만 stack에서 데이터를 추가하거나 삭제하는 연산은 상수 시간에 가능하다.
* 배열처럼 원소들을 하나씩 옆으로 밀어줄 필요가 없다.  

stack은 연결리스트로 구현할 수 있다. 연결리스트의 같은 방향에서 아이템을 추가하고 삭제하도록 구현한다.

```$xslt
public class MyStack {
  private static class StackNode {
    private T data;
    private StackNode next;

    public StackNode(T data) {
      this.data = data;
    }
  }

  private StackNode top;

  public T pop() {
    if (top == null) throw new NoSuchElementException();
    T item = top.data;
    top = top.next;

    return item;
  }

  public void push(T item) {
    StackNode t = new StackNode(item);
    t.next = top;
    top = t;
  }

  public T peek() {
    if (top == null) throw new NoSuchElementException();
    return top.data;
  }

  public boolean isEmpty() {
    return top == null;
  }
}
https://gmlwjd9405.github.io/2018/08/03/data-structure-stack.html
```
### stack의 사용 사례
재귀 알고리즘을 사용하는 경우 스택이 유용하다.
* 재귀 알고리즘
    - 재귀적으로 함수를 호출해야 하는 경우에 임시 데이터를 스택에 넣어준다.  
    - 재귀함수를 빠져 나와 퇴각 검색을 할 때는 스택에 넣어 두었던 임시 데이터를 빼 줘야 한다.  
    - 스택은 재귀 알고리즘을 반복적 형태를 통해서 구현할 수 있게 해준다.
* 웹 브라우저 방문기록(뒤로가기)
* 실행 취소(undo)
* 역순 문자열 만들기
* 수식의 괄호 검사(연산자 우선순위 표현을 위한 괄호 검사)
- ex) 올바른 괄호 문자열 판단하기
* 후위 표기법 계산 
***
출처 : https://gmlwjd9405.github.io/2018/08/03/data-structure-stack.html
    