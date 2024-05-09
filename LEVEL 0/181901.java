class Solution {
  public int[] solution(int n, int k) {
    int count = n / k;  // 1 이상 n 이하의 정수 중에서 k의 배수는 n/k개 존재한다.
    int[] answer = new int[count];

    for (int i=1; i<=count; i++) {
      answer[i-1] = k * i;
    }

    return answer;
  }
}
