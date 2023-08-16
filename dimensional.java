package CollectionPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class dimensional {
	public static void main(String[] args) {
		List<List<Integer>> listOfLists = new ArrayList<>();
        listOfLists.add(Arrays.asList(1234));
        listOfLists.add(Arrays.asList(5678));
        listOfLists.add(Arrays.asList(1234));
        listOfLists.add(Arrays.asList(5678));
        
        int sum = calculateSumOfTwoDimensionalList(listOfLists);
        System.out.println("Sum: " + sum);
    }

    public static int calculateSumOfTwoDimensionalList(List<List<Integer>> listOfLists) {
        int sum = 0;
        
        for (List<Integer> innerList : listOfLists) {
            for (Integer num : innerList) {
                sum += num;
            }
        }
        
        return sum;
 
	}

}
