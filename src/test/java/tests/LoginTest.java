package tests;



import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest  extends TestBase {

    @BeforeMethod
    public void preCondition(){
        if(TestBase.app.user().isLoginSuccess()){
            TestBase.app.user().logout();
        }
    }


    @Test
    public void loginSuccess(){

        TestBase.app.user().openLoginForm();
        TestBase.app.user().fillLoginForm("noa@gmail.com","Nnoa12345$");
        TestBase.app.user().submitLogin();

        Assert.assertTrue(TestBase.app.user().isLoginSuccess());

    }


    @Test
    public void loginSuccess2(){

        TestBase.app.user().openLoginForm();
        TestBase.app.user().fillLoginForm("noa@gmail.com","Nnoa12345$");
        TestBase.app.user().submitLogin();

        Assert.assertTrue(TestBase.app.user().isLoginSuccess());

    }
}
