package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTest extends TestBase {

    @Test
    public void registrationSuccess(){
        int i =(int) (System.currentTimeMillis()/1000)%3600;
        String email = "wick"+i+"@mail.com";

        TestBase.app.user().openRegistrationForm();
        TestBase.app.user().fillRegistrationForm("John","Wick",email,"Wick12345$","Wick12345$","+8765432100");
        TestBase.app.user().checkPolicy();
        TestBase.app.user().submitRegistration();

        Assert.assertTrue(TestBase.app.user().isRegistrationSuccess(email));
    }
}
