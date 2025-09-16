package viikko1;

public class NumberProperties {
    public static String describe(int n) {
        if (n == 0) {
            return "nolla";
        }

        String sign = n > 0 ? "positiivinen" : "negatiivinen";

        String parity = (n % 2 == 0) ? "parillinen" : "pariton";

        return sign + " " + parity;
    }
}
