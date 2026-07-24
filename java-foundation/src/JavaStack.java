//Opening and closing brackets checking using Stack

import java.util.*;

public class JavaStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String s = sc.nextLine();
            Stack<Character> stack = new Stack<>();
            boolean balanced = true;

            for (char ch : s.toCharArray()) {
                if (ch == '(' || ch == '{' || ch == '[') {
                    stack.push(ch);
                } else {
                    if (stack.isEmpty()) {
                        balanced = false;
                        break;
                    }
                    char top = stack.pop();
                    if ((ch == ')' && top != '(') ||
                            (ch == '}' && top != '{') ||
                            (ch == ']' && top != '[')) {
                        balanced = false;
                        break;
                    }
                }
            }

            if (!stack.isEmpty()) balanced = false;

            System.out.println(balanced);
        }
    }
}