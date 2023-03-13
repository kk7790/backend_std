import java.util.Scanner;
import java.util.Stack;
public class stack_test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st_1 = new Stack<>();
        st_1.push(1);
        st_1.push(2);
        st_1.push(3);

        System.out.println(st_1);
        st_1.pop();

        System.out.println(st_1);

    }
}
