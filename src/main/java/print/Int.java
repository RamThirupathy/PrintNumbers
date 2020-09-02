package print;

import java.util.regex.Pattern;

public class Int {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("4[0-9][0-9]|5[0-9][0-9]|301");
        System.out.println(pattern.matcher("401").matches());
        System.out.println(pattern.matcher("301").matches());
        System.out.println(pattern.matcher("500").matches());
        System.out.println(pattern.matcher("503").matches());
    }
}
