package viikko1;

public class SortThree {
    public static String ascending(int a, int b, int c) {
        int[] arr = {a, b, c};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[0] + "," + arr[1] + "," + arr[2];
    }
}