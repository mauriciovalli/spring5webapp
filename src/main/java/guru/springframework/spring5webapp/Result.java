package guru.springframework.spring5webapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Result {

    /*
     * Complete the 'findNumber' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY arr
     *  2. INTEGER k
     */
    public static String findNumber(List<Integer> arr, int k) {
        // Write your code here
        return arr.contains(k)?"YES":"NO";
    }

    public static List<Integer> oddNumbers(int l, int r) {
        final List<Integer> result = new ArrayList<>();
        final int init = (l %2)!=0 ? l : l+1;
        for(int i=init; i<=r; i=i+2) result.add(i);
        return result;
    }


    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays. asList(1, 2, 3, 4, 5, 6));
        System.out.println(findNumber(numbers, 5));

        ArrayList<Integer> numbers2 = new ArrayList<>(Arrays. asList(3,2,3,1,5));
        System.out.println(findNumber(numbers, 0));
    }

}
