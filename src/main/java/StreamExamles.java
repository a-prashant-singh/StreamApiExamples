
import java.util.Arrays;
import java.util.Comparator;
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

        //UC 2.6
        Integer min= list.stream().filter(n->n%2==0).min(Comparator.comparingInt(o -> o)).orElse(null);
        System.out.println("Minimum : "+min);

        Integer max= list.stream().filter(n->n%2==0).max((o1, o2) -> o1-o2).orElse(null);
        System.out.println("Maximum : "+max);

        //UC 2.7
        Integer sum=  list.stream().reduce(0,Integer::sum);
        System.out.println("sum of list : "+sum);
        long count=list.stream().count();
        System.out.println("Average is : "+(sum/count));

        //UC 2.8
        boolean allMatch=list.stream().allMatch(n->n%2==0);
        System.out.println(allMatch);
        boolean anyMatch=list.stream().anyMatch(n->n%2==0);
        System.out.println(anyMatch);

        //UC 2.9
        List<Integer> sortedList = list.stream().sorted(Integer::compareTo).toList();
        System.out.println("Sorted in Ascending order : ");
        sortedList.forEach(System.out::println);

    }
}
