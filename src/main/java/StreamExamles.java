
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExamles {


    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(4,6,1,34,23,1,33,2345,675,5);

        Stream<Integer> stream=list.stream();

        stream.forEach(System.out::println);

        //UC 2.2
        list.stream().map(Integer->Integer.doubleValue()).toList();
        //or
        //list.stream().map(Integer::doubleValue).toList();

        //UC 2.3
        List<Double> douIntegerList= list.stream().map(Integer->Integer.doubleValue()).toList();
        //or
        // List<Double> douIntegerList=list.stream().map(Integer::doubleValue).toList();

        //UC 2.4
        List<Integer> evenList=list.stream().filter(n->n%2==0).toList();

        //UC 2.5
        int firstEvenNumber=list.stream().filter(n->n%2==0).peek(n-> System.out.println("Peak even number: "+n)).findFirst().orElseThrow();
        //System.out.println(firstEvenNumber);

    }
}
