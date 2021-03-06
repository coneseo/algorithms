package basicAlgorithms.programmers;

/*
포비와 크롱이 페이지 번호가 1부터 시작되는 400 페이지의 책을 주웠습니다.
 책을 살펴보니 왼쪽 페이지는 홀수, 오른쪽 페이지는 짝수 번호이고 모든 페이지에는 번호가 적혀있었습니다.
 책이 마음에 든 포비와 크롱은 페이지 번호 게임을 통해 게임에서 이긴 사람이 책을 갖기로 합니다.
 페이지 번호 게임의 규칙은 아래와 같습니다.

1. 책을 임의로 펼칩니다.
2. 왼쪽 페이지 번호의 각 자리 숫자를 모두 더하거나, 모두 곱해 가장 큰 수를 구합니다.
3. 오른쪽 페이지 번호의 각 자리 숫자를 모두 더하거나, 모두 곱해 가장 큰 수를 구합니다.
4. 2~3 과정에서 가장 큰 수를 본인의 점수로 합니다.
5. 점수를 비교해 가장 높은 사람이 게임의 승자입니다.
6. 시작 면이나 마지막 면이 나오도록 책을 펼치지 않습니다.
포비와 크롱이 펼친 페이지가 들어있는 배열 pobi와 crong이 주어질 때,
포비가 이긴다면 1, 크롱이 이긴다면 2, 무승부는 0, 예외사항은 -1로 return 하도록 solution 메서드를 완성해주세요.

pobi	crong	result
[97, 98]	[197, 198]	0
[131, 132]	[211, 212]	1
[99, 102]	[211, 212]	-1
 */
public class BookGame {
    public int solution(int[] pobi, int[] crong) {
        int answer = 0;

        if ((pobi[1] - pobi[0]) != 1 || (crong[1] - crong[0]) != 1) {
            answer = -1;
        } else {
            int a = pobi[0];
            int b = pobi[1];
            int c = crong[0];
            int d = crong[1];

        }
        return answer;
    }
}
