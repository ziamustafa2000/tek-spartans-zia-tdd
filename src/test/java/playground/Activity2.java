package playground;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity2 {

    public String getFullName(String firstName, String lastName) {
        return lastName + ", " + firstName;
    }

    @Test
    public void testGetFullName() {
        String firstName = "John";
        String lastName = "Doe";
        String expectedFullName = "Doe, John";


        String actualFullName = getFullName(firstName, lastName);


        Assert.assertEquals(actualFullName, expectedFullName, "Full name is John Doe.");
    }
}
