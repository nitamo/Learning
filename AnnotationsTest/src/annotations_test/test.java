package annotations_test;

import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Sergey 2 on 17.01.2017.
 */
public class test {
    public static void main(String... args) {
        List<Integer> useCases = new ArrayList<Integer>();
        useCases.addAll(Arrays.asList(42, 13, 77));

        inspectClass(useCases, ProcessUnit.class);
    }

    public static void inspectClass(List<Integer> unitCases, Class<?> cls) {
        Arrays.stream(cls.getMethods())
                .map( mt -> mt.getAnnotation(UseCase.class) )
                .filter( it -> it != null)
                .forEach( anno -> {
                    System.out.println("Use case " + anno.id() + " with description \"" + anno.description() + "\"");
                    unitCases.remove((Integer) anno.id());
                });

        System.out.println("No unit cases found:");
        unitCases.stream().forEach(it -> System.out.println(it));
    }
}
