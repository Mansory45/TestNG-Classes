package Class02;

import org.testng.annotations.Test;

public class enableDisable {

    @Test()
    public void FirstTest() {
        System.out.println("hello! 1st test");

    }

    @Test
    public void SecondTest() {

        System.out.println("hello! 2nd test");
    }

    @Test(groups = "smoke")
    public void ThridTest() {

        System.out.println("hello! 3rd test");
    }

}
