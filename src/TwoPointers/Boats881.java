package TwoPointers;

import java.util.Arrays;

public class Boats881 {
    public int numRescueBoats(int[] people, int limit) {
        int count = 0;
        Arrays.sort(people);

        int i = 0;
        int j = people.length - 1;
        int res = 0;

        while(i <= j) {
            if(people[i] + people[j] <= limit) {
                res += 1;
                i++;
                j--;
            } else {
                res += 1;
                j--;
            }
        }

        return res;
    }
}
