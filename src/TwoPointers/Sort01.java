package TwoPointers;

// https://www.naukri.com/code360/problems/sort-0-1_624379?leftPanelTabValue=PROBLEM

public class Sort01 {
    void sortZeroesAndOne(int input[], int size)
    {
        //Write your code here
        int i = 0;
        int j = size - 1;

        while(i < j) {
            while(input[i] == 0 && i < j) {
                i++;
            }

            while(input[j] == 1 && i < j) {
                j--;
            }

            int temp = input[i];
            input[i] = input[j];
            input[j] = temp;
            i++;
            j--;
        }
    }
}
