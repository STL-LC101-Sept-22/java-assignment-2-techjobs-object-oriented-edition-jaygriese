package org.launchcode.techjobs.oo.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.Job;

import org.launchcode.techjobs.oo.CoreCompetency;
import org.launchcode.techjobs.oo.Employer;
import org.launchcode.techjobs.oo.Location;
import org.launchcode.techjobs.oo.PositionType;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

//    Each Job object should have a unique ID that is an integer.//
//    Create two Job objects using the empty constructor.
//
//    Use assertNotEquals to verify that the IDs of the two objects are distinct.
//
//    Run the test using the run configuration that you created above.
//
//    If the test doesn’t pass, what should be your first thought?
//
//        “Drat! I need to fix the unit test.”
//
//        “Drat! I need to fix my Job() constructor code.”
    JobTest jobTest;


        @Test
            public void testSettingJobId() {
            Job jobOne = new Job();
            Job jobTwo = new Job();
            assertNotEquals(jobOne.getId(), jobTwo.getId());
        }



    @Test
    public void testJobConstructorSetsAllFields() {
      Job jobOne = new Job("James Bradshaw", new Employer("Anheiser Busch"),new Location("Saint Louis"),
          new PositionType("Brew Master"),new CoreCompetency("Beer Tasting"));

      assertTrue(jobOne.getName() instanceof String);
      assertTrue(jobOne.getEmployer() instanceof Employer);
      assertTrue(jobOne.getLocation() instanceof Location);
      assertTrue(jobOne.getPositionType() instanceof PositionType);
      assertTrue(jobOne.getCoreCompetency() instanceof CoreCompetency);


      assertEquals("James Bradshaw", jobOne.getName());
      assertEquals("Anheiser Busch", jobOne.getEmployer().getValue());
      assertEquals("Saint Louis", jobOne.getLocation().getValue());
      assertEquals("Brew Master", jobOne.getPositionType().getValue());
      assertEquals("Beer Tasting", jobOne.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
        //Generate two Job objects that have identical field values EXCEPT for id. Test that equals returns false.
//                String expectd =
//                asserFalse()
      Job employeeTwo = new Job("Terry Bailey", new Employer("Schlafly Brewing Company"),new Location("Saint Louis"),
          new PositionType("Brew Master"),new CoreCompetency("Beer Tasting"));
      Job employeeThree = new Job("Terry Bailey", new Employer("Schlafly Brewing Company"),new Location("Saint Louis"),
          new PositionType("Brew Master"),new CoreCompetency("Beer Tasting"));

      assertFalse(employeeTwo.equals(employeeThree));
    }

    @Test
  public void testToStringStartsAndEndsWithNewLine() {
      Job testJob = new Job("Terry Bailey", new Employer("Schlafly Brewing Company"),new Location("Saint Louis"),
          new PositionType("Brew Master"),new CoreCompetency("Beer Tasting"));

      char first = testJob.toString().charAt(0);
      char last = testJob.toString().charAt(testJob.toString().length()-1);

      assertEquals(String.valueOf(first), "\n");
      assertEquals(String.valueOf(last), "\n");
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
      Job testJob = new Job("Terry Bailey", new Employer("Schlafly Brewing Company"),new Location("Saint Louis"),
          new PositionType("Brew Master"),new CoreCompetency("Beer Tasting"));

      String first = testJob.toString();
      assertEquals("\n ID: 1 \n Name: Terry Bailey\n Employer: Schlafly Brewing Company\n Location: Saint Louis\n PositionType: Brew Master\n CoreCompetency: Beer Tasting\n", first );
    }

    @Test
  public void testToStringHandlesEmptyField() {
      //  If a field is empty, the method should add, “Data not available” after the label.
      Job testJob = new Job("", new Employer("LaunchCode"), new Location("Saint Louis"), new PositionType(""), new CoreCompetency(""));
      String output = "\nID: " + testJob.getId() + "\nName: Data not available" + "\nEmployer: " + testJob.getEmployer() + "\nLocation: " + testJob.getLocation() + "\nPositionType: Data not available" + "\nCoreCompetency: Data not available\n";
      String first = testJob.toString();
      assertEquals(output, testJob.toString());
    }
}
