/**
 * Test cases for Calculator class.
 *
 * @author stevelyall
 */

package test;

import multithreadstats.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCalcStatistics {

    final int[] testNumbers = {90, 81, 78, 95, 79, 72, 85};
    Calculator calc;

    @Before
    public void SetUp() {
        calc = new Calculator();
    }

    @Test
    public void TestCalculateAverageCalculatesAverageCorrectly() {
        int result = calc.calculateAverage(testNumbers);
        Assert.assertEquals(82, result);
    }

    @Test
    public void TestCalculateMinimumCalculatesMinimumCorrectly() {
        int result = calc.calculateMinimum(testNumbers);
        Assert.assertEquals(72, result);
    }

    @Test
    public void TestCalculateMaximumCalculatesMaximumCorrectly() {
        int result = calc.calculateMaximum(testNumbers);
        Assert.assertEquals(95, result);
    }

    @Test
         public void TestCalculateAverageZeroCalculatesAverageCorrectly() {
        int[] array = {0};
        int result = calc.calculateAverage(array);
        Assert.assertEquals(0, result);
    }

    @Test
    public void TestCalculateMinimumZeroCalculatesMinimumCorrectly() {
        int[] array = {0};
        int result = calc.calculateMinimum(array);
        Assert.assertEquals(0, result);
    }

    @Test
    public void TestCalculateMaximumZeroCalculatesMaximumCorrectly() {
        int[] array = {0};
        int result = calc.calculateMaximum(array);
        Assert.assertEquals(0, result);
    }

    @Test
    public void TestCalculateAverageEmptyArrayCalculatesAverageCorrectly() {
        int[] array = {};
        int result = calc.calculateAverage(array);
        Assert.assertEquals(0, result);
    }

    @Test
    public void TestCalculateMinimumEmptyArrayCalculatesMinimumCorrectly() {
        int[] array = {};
        int result = calc.calculateMinimum(array);
        Assert.assertEquals(0, result);
    }

    @Test
    public void TestCalculateMaximumEmptyArrayCalculatesMaximumCorrectly() {
        int[] array = {};
        int result = calc.calculateMaximum(array);
        Assert.assertEquals(0, result);
    }


}
