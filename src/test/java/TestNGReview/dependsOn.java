package TestNGReview;

import org.testng.annotations.Test;

public class dependsOn {

    @Test
    public void Alogin(){
        System.out.println("i am a beautiful test");
        System.out.println("Test passed");

    }

    @Test()
    public void DashBoardPage(){

        System.out.println("i am a beautiful dashboardPage");
    }
}