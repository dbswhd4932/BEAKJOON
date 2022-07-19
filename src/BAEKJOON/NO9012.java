package BAEKJOON;

import java.util.Scanner;
import java.util.Stack;

public class NO9012 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            Stack<Character> st = new Stack<>();
            String str = sc.next();

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '(') {
                    st.push(str.charAt(j));
                } else {
                    if (st.empty()) {
                        st.push(str.charAt(j));
                        break;
                    } else {
                        st.pop();
                    }
                }
            }
            if (st.isEmpty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

