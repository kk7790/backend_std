import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class queue_test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue_t = new LinkedList<Integer>();
        for (int i=1; i<6; i++){
            queue_t.offer(i);
        }

        System.out.println(queue_t);
        queue_t.poll(); //앞의 원소 삭제
        System.out.println(queue_t);

    }
}
