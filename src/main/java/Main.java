import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] inputs = br.readLine().split(" ");
            Long num = Long.parseLong(inputs[0]);
            Long num1 = Long.parseLong(inputs[1]);
            System.out.println(fib(num, num1));
        } catch (IOException ioe) {

        }
    }

    private static Integer fib(Long num, Long num1) {
        List<Integer> integers = new ArrayList<>();
        integers.add(0);
        integers.add(1);
        for (int i = 2; i <= num * 6; i++) {
            integers.add((int) (((Integer.parseInt(String.valueOf(integers.get(i - 1)))) +  (Integer.parseInt(String.valueOf(integers.get(i - 2)))))%num1));
            if (integers.get(i - 1) == 1 && integers.get(i - 2) == 0) {
                break;
            }
        }
        Long nn = num%(integers.size() - 2);
        return integers.get((Integer.parseInt(String.valueOf(nn))));
    }
}
