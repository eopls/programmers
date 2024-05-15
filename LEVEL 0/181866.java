import java.util.*;

class Solution {
  public String[] solution(String myString) {
    String[] myStringArr = myString.split("x");

    // myString에서 x가 두 개 이상 연달아 등장했을 경우
    // myStringArr에 빈 문자열이 포함되어 있을 수 있다.
    // 이를 제외하는 작업이 필요함!
    List<String> myStringList = new ArrayList<>();
    for (String str : myStringArr) {
      if (!str.isEmpty()) {
        myStringList.add(str);
      }
    }

    String[] answer = myStringList.toArray(new String[myStringList.size()]);
    Arrays.sort(answer);

    return answer;
  }
}
