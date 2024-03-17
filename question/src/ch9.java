
import java.util.*;

public class ch9 {
    public static void main(String[] args) {
        Random r = new Random();
        Set<Integer> ranSet = new HashSet<>();

        while (ranSet.size() < 6) {
            int ranNum = r.nextInt(45) + 1;
            ranSet.add(ranNum);
        }
        System.out.println(ranSet);

    }
}
