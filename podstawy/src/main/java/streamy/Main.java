package streamy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {




        List<Person> list= new ArrayList<>(Arrays.asList(
            new Person("Przemek", "Auk", 25, false),
            new Person("Wacaław", "Mruk", 15, false),
            new Person("Joanna", "Aninf", 19, true)
        ));

        //lista facetow


        list.stream()
                .filter(Predicate.isEqual(false))
                .collect(Collectors.toList());
        System.out.println(list);

























    }


}
