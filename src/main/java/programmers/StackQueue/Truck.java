package programmers.StackQueue;




import java.util.*;
public class Truck {
  public int solution(int bridge_length, int weight, int[] truck_weights) {
    int answer = 0;
    //다리 위 트럭의 무게
    int onBridgeTweight = 0;

    //대기 트럭들
    Queue<Truck> trucks_wait = new LinkedList<>();
    for(int truck_weight : truck_weights){
      trucks_wait.offer(new Truck(truck_weight));
    }

    //다리 위 트럭들
    Queue<Truck> trucks_bridge = new LinkedList<>();
    onBridgeTweight += trucks_wait.peek().weight;
    trucks_bridge.offer(trucks_wait.poll());

    int time = 0;
    while(!trucks_bridge.isEmpty()){
      time++;
      //다리 위 트럭 한 칸씩 이동
      for(Truck truck : trucks_bridge){
        truck.position++;
      }
      //이동 완료 시 빠져나옴
      if(trucks_bridge.peek().position > bridge_length){
        onBridgeTweight -= trucks_bridge.poll().weight;
      }
      //새로운 트럭 투입 판단 후 투입
      if(trucks_wait.isEmpty()==false && (onBridgeTweight + trucks_wait.peek().weight <= weight)){
        onBridgeTweight += trucks_wait.peek().weight;
        trucks_wait.peek().position++;
        trucks_bridge.offer(trucks_wait.poll());
      }
    }

    return answer=time;


  }
  static class Truck{
    int position;
    int weight;

    public Truck(int weight){
      this.weight = weight;
      this.position = 0;
    }
  }
}