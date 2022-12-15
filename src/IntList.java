import java.security.SecureRandom;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class IntList {
    public static void main(String[] args) {
        Integer range = 100;
        Random rnd = new SecureRandom();

        List<Integer> numList = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            numList.add(rnd.nextInt(range));

            
        }
        System.out.println(">>> numList: " + numList);
        
        filter(numList);
    } 
    
    public static void filter(List<Integer> numList) {

        System.out.println("========== FILTER ==========");

        // filter
        List<Integer> resultList = new LinkedList<>();

        for (Integer n : numList) {
            if ((n % 3) == 0) {
            resultList.add(n);
            }
            
            // resultList.stream()
            // // Predicate: boolean test(Integer i)
            // .filter((n) -> {
                //     return 0 != (n % 3);
                // })
                // ;
                
                
        } 
        System.out.println(">>> resultList: " + resultList);

        resultList = numList.stream()
            // Predicate: boolean test(Integer i)
            .filter((n) -> (n % 3) == 0)
            .distinct()
            .sorted()
            .limit(5)
            .toList();
        System.out.println(">>> stream resultList: " + resultList);
    }
}