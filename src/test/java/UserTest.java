import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

//UC11

@RunWith(Parameterized.class)
public class UserTest {
    String emailId;
    public UserTest(String emailId){
        super();
        this.emailId = emailId;
    }
    UserValidationTest user ;
    @Before
    public void initialize(){
        user = new UserValidationTest();
    }
    @Test
    public void firstNameHappyTest(){
        boolean firstName = user.checkFirstName("Sukanya");
        Assert.assertEquals(true,firstName);
    }
    @Test
    public void firstNameSadTest(){
        boolean firstName = user.checkFirstName("sukanya");
        Assert.assertFalse(firstName);
    }
    @Test
    public void checkLastNameHappyTest(){
        boolean lastName = user.checkLastName("Vardam");
        Assert.assertTrue(lastName);
    }
    @Test
    public void checkLastNameSadTest(){
        boolean lastName = user.checkLastName("aardam");
        Assert.assertFalse(lastName);
    }
    @Test
    public void phoneNumberHappyTest(){
        boolean phoneNumber = user.checkMobileNumber("919930516251");
        Assert.assertTrue(phoneNumber);
    }
    @Test
    public void phoneNumberBadTest(){
        boolean phoneNumber = user.checkMobileNumber("12221 9930516251");
        Assert.assertFalse(phoneNumber);
    }
    @Test
    public void passwordHappyTest(){
        boolean password = user.checkPassword("Su@kanya123");
        Assert.assertTrue(password);
    }
    @Test
    public void passwordSadTest(){
        boolean password = user.checkPassword("Sukanya123");
        Assert.assertFalse(password);
    }
    @Test
    public void emailHappyTest(){
        boolean email = user.checkEmail("sukanya.44@gmai.com");
        Assert.assertTrue(email);
    }
    @Test
    public void emailSadTest(){
        boolean email = user.checkEmail("sukanya.@gmai.com");
        Assert.assertFalse(email);
    }


    @Parameterized.Parameters
    public static Collection input(){
        return Arrays.asList( new String[] {"sukanya.32@gmai.com","sukanya123@gmail.com","abc@yahoo.com","abc@abc.com.au","abc@1.com","abc+100@gmail.com","abc.9@gmail.com.com","abc-100@abc.net","abc-100@yahoo.com"});
    }
    @Test
    public void checkEmailWithMultipleInputs(){
        Assert.assertEquals(true,user.checkEmail(emailId));
    }


}