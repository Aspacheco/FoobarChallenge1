package main;
import java.util.*;

import static java.util.Collections.swap;

public class Solution {
    public static void solution(List<Integer> data, int n) {

            //send the array to quicksort
            System.out.println("performing Quicksort!");
            QuickSort(data, 0, data.size()-1);

            int counter = 0;     //will keep occurrences
            List<Integer> newData = new ArrayList<>(data.size());
            List<Integer> delNums = new ArrayList<Integer>();

            //populate list
            for (int i : data) newData.add(i);

            //start loop
            for (int i = 0; i < data.size() - 1; i++) {
                counter++;

                if (counter > n)
                    delNums.add(data.get(i));

                if (data.get(i) != data.get(i + 1))
                    counter = 0;
            }
            //will take care of last index
            if (counter >= n)
                delNums.add(data.get(data.size() - 1));

            //remove instances from the list
            for (Integer delNum : delNums) newData.removeAll(delNums);

            //from list to arr
            int[] finalArr = newData.stream().mapToInt(i -> i).toArray();

            //print results
            System.out.print("\nArray after removing " + n + " occurrences: ");
            for (int i = 0; i < finalArr.length - 1; i++) {
                System.out.print(finalArr[i] + ", ");
            }
            System.out.println(finalArr[finalArr.length - 1]);


    }// end solution

    public static void QuickSort(List<Integer> arr, int minIndex, int maxIndex) {
        //base case
        if(minIndex<maxIndex){
            int pivot = partition(arr, minIndex, maxIndex);
            QuickSort(arr, minIndex, pivot -1);  //left
            QuickSort(arr, pivot + 1, maxIndex);   //right
        }
    }// end Quicksort()

    private static int partition(List<Integer> arr, int lowIndex, int highIndex){
        int pivot = arr.get(highIndex);
        int i = lowIndex -1;

        for(int j=lowIndex; j<=highIndex -1; j++) {
            if (arr.get(j) < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        i++;
        swap(arr, i, highIndex);
        return i;
    }// end partition

}