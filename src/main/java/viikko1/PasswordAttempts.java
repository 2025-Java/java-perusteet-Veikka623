package viikko1;

public class PasswordAttempts {
    public static String login(String[] tries) {
        String correct = "java123";
        int maxAttempts = 3;
        
        for (int i = 0; i < tries.length && i < maxAttempts; i++) {
            if (correct.equals(tries[i])) {
                return "Tervetuloa!";
            }
        }
        return "Liian monta virheellistä yritystä.";
    }
}