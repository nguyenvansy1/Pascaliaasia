import java.util.Stack;

public class Stack1 {
        public static int countWorlds(String input) {
            String[] words = input.split(" ");
            Stack<String> stack = new Stack<>();

            for (String word : words) {
                if (stack.isEmpty() || !word.equals(stack.peek())) {
                    stack.push(word);
                } else {
                    stack.pop();
                }
            }

            return stack.size();
        }

        public static void main(String[] args) {
            String input1 = "ab aa aa bcd ab";
            int output1 = countWorlds(input1);
            System.out.println(output1);

            String input2 = "hello world world hello";
            int output2 = countWorlds(input2);
            System.out.println(output2);
        }
}


