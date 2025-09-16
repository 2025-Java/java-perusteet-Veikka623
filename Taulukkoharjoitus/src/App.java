public class App {
    public static void main(String[] args) throws Exception {
    int [] numbers = {1, 2, 3, 4, 5};
    System.out.println(numbers[0]);
    for (int i = 1; i < numbers.length; i++) {
        System.out.println("Taulukon arvo indexillä " + i + ": " + numbers[i]);
    }
    }
}
