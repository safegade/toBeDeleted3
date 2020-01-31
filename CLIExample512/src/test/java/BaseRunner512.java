import org.testng.annotations.Test;

public class BaseRunner512 {
/*
* Maven Command to Execute the Code:
* mvn clean -Dtest=BaseRunner512 test -DfailIfNoTests=false
* */


    @Test(invocationCount = 1)
    public void test() {
         try {
            CucumberMain.main(new String[]
                    {
                            "--threads", "1",
                            "-p", "json:target/cucumber-report/cucumber.json",
                            "-p","rerun:target/rerun.txt",
                            "-g", "com.steps",
                            "-t", "@TestFeature",
                            "src/test/resources/features" //features
                    });
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
