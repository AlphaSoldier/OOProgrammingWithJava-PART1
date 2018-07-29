import java.util.Random;

public class PasswordRandomizer {
    private int length;
    private String password;
    private Random random = new Random();

    public PasswordRandomizer(int length) {
        this.length = length;
        this.password = "";
    }

    public String createPassword() {
        this.password = "";
        String total = "abcdefghijklmnopqrstuvwxyz";
        int i = 0;
        while(i < this.length)
        {
            int x = random.nextInt(total.length());
            this.password += total.charAt(x);
            i++;
        }
        return password;
    }
}
