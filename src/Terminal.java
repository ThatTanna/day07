import java.security.SecureRandom;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Terminal {
    public static void main(String[] args) {
        Integer range = 100;
        Random rnd = new SecureRandom();

        List<Integer> numList = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            numList.add(rnd.nextInt(range));

            System.out.println(">>> numList: " + numList);

            joining(numList);

            
        }
        System.out.println(">>> numList: " + numList);
        
    }

    public static void reducing(List<Integer> numList) {

        System.out.println("========== JOINING ==========");
        
       Optional<Integer> opt = numList.stream()
        // map: String apply(int i)
        .map(n -> "%d%d".formatted(n, n))
        .map(Integer::parseInt)
        .collect(
            // Integer apply(Integer total, Integer i)
            Collectors.reducing((total, i) -> {
            return total + i;
        })
    };

    // Check if we have any answer
    if (opt.isPresent()) {
        // Get answer
        
    }
        
    System.out.println(">>> total : " + total);
}
