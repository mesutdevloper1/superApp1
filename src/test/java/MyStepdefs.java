import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import sun.security.util.PendingException;
import org.junit.runner.RunWith;
public class MyStepdefs {
    public MyStepdefs() {





        @RunWith(Cucumber.class)
        public class MyStepDefinitions {

            @Given("^click telphone number$")
            public void click_telphone_number() throws Throwable {
                throw new PendingException();
            }

            @When("^write phone number$")
            public void write_phone_number() throws Throwable {
                throw new PendingException();
            }

            @When("^user see \"([^\"]*)\"$")
            public void user_see_something(String strArg1) throws Throwable {
                throw new PendingException();
            }

            @Then("^click login$")
            public void click_login() throws Throwable {
                throw new PendingException();
            }

            @Then("^user click \"([^\"]*)\" icon$")
            public void user_click_something_icon(String strArg1) throws Throwable {
                throw new PendingException();
            }

            @And("^write password$")
            public void write_password() throws Throwable {
                throw new PendingException();
            }

            @And("^user click \"([^\"]*)\"$")
            public void user_click_something(String strArg1) throws Throwable {
                throw new PendingException();
            }

            @And("^user check text$")
            public void user_check_text() throws Throwable {
                throw new PendingException();
            }

        }Given("^click telphone number$", () -> {
        });
    }
}
