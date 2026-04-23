package sit707_week6;

import org.junit.Assert;
import org.junit.Test;

public class WeatherAndMathUtilsTest {
	
	int EvenNumber = 6452;
	int OddNumber = 34621;
	int notPrime = 634723112;
	int isPrime = 31;
	
	@Test
	public void testStudentIdentity() {
		String studentId = "225138738";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Moksh Bansal";
		Assert.assertNotNull("Student name is null", studentName);
	}
	
	@Test
	public void testFalseNumberIsEven() {
		Assert.assertFalse(WeatherAndMathUtils.isEven(OddNumber));
	}
	
	@Test
	public void testFalseNumberIsNotPrime() {
		Assert.assertFalse(WeatherAndMathUtils.isPrime(notPrime));
	}
	
	@Test
	public void testTrueNumberIsNotPrime() {
		Assert.assertTrue(WeatherAndMathUtils.isPrime(isPrime));
	}
	
	@Test
	public void testPrimeNumber1() {
		Assert.assertTrue(WeatherAndMathUtils.isPrime(1));
	}
	
	@Test
	public void testTrueNumberIsEven() {
		Assert.assertTrue(WeatherAndMathUtils.isEven(EvenNumber));
	}
	
    @Test
    public void testCancelWeatherAdvice() {
    	Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(70.1, 0.0));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testNegativeInput1() {
    	WeatherAndMathUtils.weatherAdvice(70.1, -4.0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testNegativeInput2() {
        WeatherAndMathUtils.weatherAdvice(-1.0, 2.0);
    }
    
    @Test
    public void testAllClear() {
        Assert.assertEquals("ALL CLEAR", WeatherAndMathUtils.weatherAdvice(10.0, 1.0));
    }

    @Test
    public void testWarnWindOnly() {
        Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(50.0, 1.0)); // wind > 45
    }

    @Test
    public void testWarnRainOnly() {
        Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(10.0, 5.0)); // rain > 4
    }


    @Test
    public void testCancelBothConcerning() {
        Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(50.0, 5.0)); 
            // wind > 45 AND rain > 4
    }
    
    @Test
    public void testCancelWindOnly() {
        Assert.assertEquals("CANCEL", 
            WeatherAndMathUtils.weatherAdvice(80.0, 1.0)); // wind > 70
    }

    @Test
    public void testCancelRainOnly() {
        Assert.assertEquals("CANCEL", 
            WeatherAndMathUtils.weatherAdvice(10.0, 7.0)); // rain > 6
    }


    
    
}
