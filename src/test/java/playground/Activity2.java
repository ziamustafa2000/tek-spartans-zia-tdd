package playground;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity2 {



        @Test
        public void testGetFullName() {
            NameFormatter formatter = new NameFormatter();
            String firstName = "John";
            String lastName = "Doe";
            String expectedFullName = "Doe, John";


            Assert.assertEquals(actualFullName, expectedFullName, "Full name format is incorrect.");
        }
    }

