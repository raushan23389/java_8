import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class OddEven {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(71,18,42,21,67,32,95,14,56,87);
        //one way to achive even and odd
//       List<Integer> evenList =  integerList.stream().filter(i->i%2==0).collect(Collectors.toList());
//       System.out.println("Even Number");
//       evenList.forEach(System.out::println);
//
//       List<Integer> oddList = integerList.stream().filter(i->i%2!=0).collect(Collectors.toList());
//        System.out.println("Odd Number");
//        oddList.forEach(System.out::println);

       Map<Boolean,List<Integer>> oddevenmap = integerList.stream().collect(Collectors.partitioningBy(i->i%2 ==0));
//       Set<Map.Entry<Boolean,List<Integer>>> entrySet = oddevenmap.entrySet();
       for(Map.Entry<Boolean,List<Integer>> entry:oddevenmap.entrySet()){
           if(entry.getKey()){
               System.out.println("Even Numbers");
           }else{
               System.out.println("Odd Numbers");
           }

           List<Integer> list = entry.getValue();
           list.forEach(System.out::println);
        }
    }


}
