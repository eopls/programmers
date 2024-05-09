class Solution {
  public String solution(String my_string, int[] indices) {
    String[] my_string_array = my_string.split("");

    for (int i=0; i<indices.length; i++) {
      my_string_array[indices[i]] = "";
    }

    return String.join("", my_string_array);
  }
}
