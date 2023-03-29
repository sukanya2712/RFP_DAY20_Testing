import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidationTest {
    static Pattern firstName= Pattern.compile("^[A-Z]{1}[a-z]{2,}");
    static Pattern lastName= Pattern.compile("^[A-Z]{1}[a-z]{2,}");
    static Pattern emailPattern = Pattern.compile("^[a-z0-9]{3,}([+-._]{1}[0-9]+)?@[a-z0-9]+[.]{1}[a-z]{2,}[,]?([.]{1}[a-z]{1,})?$");
    static Pattern mobileNumber = Pattern.compile("^([0-9]{2,4})?[\s]?[0-9]{10}$");
    static Pattern passwordRule1 = Pattern.compile("^[a-zA-Z]{8,}");
    static Pattern passwordRule2 = Pattern.compile("^(?=.*[A-Z]).{8,}$");
    static Pattern passwordRule3 = Pattern.compile("^(?=.[A-Z])(?=.*[0-9]).{8,}$");
    static Pattern passwordRule4 = Pattern.compile("^(?=.*[A-Z])(?=.*[!@#$%&*()])(?=.*[0-9])(?=\\S+$).{8,}$");


    public boolean checkFirstName(String name){
        Matcher matcher = firstName.matcher(name);
        if (matcher.matches()){
            return true;
        }else {

            return false;
        }
    }
    public boolean checkLastName(String userName){
        Matcher matcher= lastName.matcher(userName);
        if (matcher.matches()){
            return true;
        }else {
            return false;
        }
    }
    public boolean checkMobileNumber(String userNumber){
        Matcher matcher= mobileNumber.matcher(userNumber);
        if (matcher.matches()){
            return true;
        }else {
            return false;
        }
    }
    public boolean checkPassword(String userPassword){
        Matcher matcher= passwordRule4.matcher(userPassword);
        if (matcher.matches()){
            return true;
        }else {
            return false;
        }
    }
    public boolean checkEmail(String userEmail){
        Matcher matcher = emailPattern.matcher(userEmail);
        if (matcher.matches()){
            return true;
        }else {
            return false;
        }
    }

}
