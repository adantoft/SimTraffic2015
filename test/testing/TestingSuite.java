package testing;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import model.CarTEST;
import model.IntersectionTEST;
import model.LightControllerTEST;
import model.RoadTEST;
import model.SourceSinkTEST;
import parameters.ModelConfigTEST;
import timeserver.TimeServerTEST;

@RunWith(Suite.class) //Runs each of the below tests in addition to tests here
@SuiteClasses({TimeServerTEST.class, CarTEST.class, RoadTEST.class, IntersectionTEST.class, LightControllerTEST.class, SourceSinkTEST.class, ModelConfigTEST.class}) // add new tests here

public class TestingSuite {

	@Test
	public void test1() {
		Assert.assertTrue(true);
	}
}
