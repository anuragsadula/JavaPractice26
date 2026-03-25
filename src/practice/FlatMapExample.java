package practice;
import java.util.stream.*;
import java.util.*;
public class FlatMapExample{
	
	public static void main(String[] args){
	
		
		List<List<Integer>> nestedList = Arrays.asList(
											Arrays.asList(1,1,1,2,4,5,7,3,2,1),
											Arrays.asList(1,2,3,4,5,6,5,4,7,8)
										);

		List<Integer> flatList = nestedList.stream()
								.flatMap(list->list.stream())
								.distinct()
								.sorted(Comparator.reverseOrder())
								.collect(Collectors.toList());
								
		System.out.println(flatList);
	}
}