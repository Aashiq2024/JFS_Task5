package JFS_Task;

import java.util.*;
import java.util.stream.*;

public class Uppercase {

    public static void main(String[] args) {
        Stream<String> names = Stream.of("aBc", "d", "eF");

        List<String> upperCase = names.map(s -> s.toUpperCase()) 
            .collect(Collectors.toList());
        System.out.println(upperCase);
    }
}
