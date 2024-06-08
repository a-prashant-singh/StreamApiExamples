
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExamles {


    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(3,6,1,34,23,1,33,234,675,505);

        Stream<Integer> stream=list.stream();

        stream.forEach(System.out::println);

        //UC 2.2
        List<Double> doubleList=list.stream().map(Integer->Integer.doubleValue()).toList();
        //or
        //List<Double> doubleList=list.stream().map(Integer::doubleValue).toList();



    }
}
