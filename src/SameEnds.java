public class SameEnds {
/*
Given a string, return the longest substring that appears at both the beginning and end of the
string without overlapping.
For example, sameEnds("abXab") is "ab".
 */

  public static void main(String[] args) {
    SameEnds newSameEnds = new SameEnds();
    String string = "mymmy";
    System.out.printf("\n the longest substring in \"%s\" that appears both at the end and the start of \"%s\", is \""
    + newSameEnds.sameEnds(string) + "\"\n", string, string);
  }
  public String sameEnds(String string) {

    String result = "";

    for (int i = 0; i < string.length() / 2 + 1; i++) {
      if (string.substring(0, i).equals(string.substring(string.length() - i))) {
        result = string.substring(0, i);
      }
    }
    return result;
  }
}
