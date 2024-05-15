class Solution {
  public int[] solution(String myString) {
    String[] myStringArr = myString.split("x", -1);
    // String[] split(String regex, int limit)
    // 1. limit>0: limit 개수만큼 split
    // 2. limit==0: 맨 마지막 값이 빈값이면 생략
    // 3. limit<0: 맨 마지막 빈값까지 split

    int[] answer = new int[myStringArr.length];
    for (int i=0; i<answer.length; i++) {
      answer[i] = myStringArr[i].length();
    }

    return answer;
  }
}
