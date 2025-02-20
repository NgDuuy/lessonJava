import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class regEx {
    public static void main(String[] args) {
        // Check kiểm tra phần tử có tôi thiểu 6 kí tự ::: Pattern pattern =
        // Pattern.compile("\\d{6,}");
        Pattern pattern = Pattern.compile("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$");
        Matcher matcher = pattern.matcher("Duy@gmail.com");
        System.out.println("Input String pattern regex: " + matcher.matches());
    }
}
