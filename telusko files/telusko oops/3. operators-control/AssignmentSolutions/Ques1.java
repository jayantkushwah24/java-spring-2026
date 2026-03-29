// 1. What is the difference between `==` and `.equals()` when comparing variables?  
// Explain with examples for:
// - primitives  
// - wrapper classes  
// - Strings

package AssignmentSolutions;

class Ques1 {

  public static void main(String[] args) {
    int a = 2;
    int b = 2;
    if (a == b) {
      System.out.println("a and b are equal");
    }

    int c = 1;
    char d = '1';

    if (c == d) {
      System.out.println("c and d are equal");
    }
  }
}