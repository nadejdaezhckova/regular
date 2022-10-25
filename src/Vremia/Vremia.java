package Vremia;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Vremia {
    public Vremia(String input){
        Pattern pat1 = Pattern.compile("(2[0-3]|[0-1]\\d):[0-5]\\d]");
        Matcher mat1 = pat1.matcher(input);
        while (mat1.find()){
            System.out.println(mat1.group());
        }
    }
}
