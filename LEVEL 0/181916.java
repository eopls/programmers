import java.util.Arrays;

class Solution {
  public int solution(int a, int b, int c, int d) {
    int answer = 0;

    int[] dice = { a, b, c, d };
    Arrays.sort(dice);

    if (dice[0] == dice[3]) {
      // 네 주사위에서 나온 숫자가 모두 같다.
      answer = 1111 * dice[0];
    } else if (dice[0] == dice[2] || dice[1] == dice[3]) {
      /*
      dice[0] + dice[3] - dice[1]의 의미:
      dice[1]은 무조건 서로 값이 같은 세 주사위 쪽에 속한다.
      따라서 혼자 값이 다른 주사위 후보인 dice[0] 값과 dice[3] 값을 더해 dice[1] 값을 뺴면
      dice[1] 값과 같은, 즉 서로 값이 같은 세 주사위 쪽 값은 지워지고
      혼자 값이 다른 주사위의 값만 남게 된다.
      */
      answer = (int) Math.pow(10 * dice[1] + (dice[0] + dice[3] - dice[1]), 2);
    } else if (dice[0] == dice[1] && dice[2] == dice[3]) {
      // 값을 오름차순 정렬했으므로 주사위가 두 개씩 같은 값이 나오려면 이 경우밖에 없다.
      answer = (dice[0] + dice[2]) * (dice[2] - dice[0]);
    } else if (dice[0] == dice[1]) {
      answer = dice[2] * dice[3];
    } else if (dice[1] == dice[2]) {
      answer = dice[0] * dice[3];
    } else if (dice[2] == dice[3]) {
      answer = dice[0] * dice[1];
    } else {
      answer = dice[0];
    }

    return answer;
  }
}
