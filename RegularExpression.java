import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegularExpression{
    public static void main(String[] args){
        Pattern myPattern = Pattern.compile("w3schools" , Pattern.CASE_INSENSITIVE);
        Matcher matcher = myPattern.matcher("Visit w3schools");
        boolean matchFound = matcher.find();
        if(matchFound){
            System.out.println("Match Found!");
        }else{
            System.out.println("Match not Found");
        }
    }
}