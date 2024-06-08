
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExamles {


    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(4,6,1,34,23,1,33,2345,675,5);

        Stream<Integer> stream=list.stream();
        stream.forEach(System.out::println);
    }
}
