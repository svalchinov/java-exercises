import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Sum {


    static void solution(int count, Scanner in) {

        HashMap<String, List<String>> relationships = new HashMap<String, List<String>>();

        for (int i = 0; i < count; i++) {

            if (in.hasNextLine()) {
                String item = in.next();
                if (relationships.containsKey(item)) {
                    relationships.get(item).add(in.next());
                } else {
                    relationships.put(item, new ArrayList<String>());
                }
            }
        }




        System.out.println(relationships);
    }

}