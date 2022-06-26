package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalculatorTestCases {
    @DataProvider(name = "DP1")
    public Object[][] dpMethod1(){
        return new Object[][]{{2,6,8},{7,3,10}};
    }

    @Test(dataProvider = "DP1",groups = "g1")
    public void sumTest(int a, int b, int c){
        assertEquals(a+b,c);
    }
    @DataProvider(name = "DP2")
    public Object[][] dpMethod2(){
        return new Object[][]{{10,5,5},{8,4,4}};
    }
    @Test(dataProvider = "DP2",groups = "g2")
    public void subtractTest(int a, int b, int c){
        assertEquals(a-b,c);
    }
    @DataProvider(name = "DP3")
    public Object[][] dpMethod3(){
        return new Object[][]{{10,5,50},{8,4,32}};
    }
    @Test(dataProvider = "DP3",groups = "g3")
    public void multiplierTest(int a, int b, int c){
        assertEquals(a*b,c);
    }
    @DataProvider(name = "DP4")
    public Object[][] dpMethod4(){
        return new Object[][]{{10,5,2},{8,4,2}};
    }
    @Test(dataProvider = "DP4",groups = "g4")
    public void divTest(int a, int b, int c){
        assertEquals(a/b,c);
    }
    @DataProvider(name = "DP5")
    public Object[][] dpMethod5(){
        return new Object[][]{{10,2,0},{8,4,0}};
    }
    @Test(dataProvider = "DP5",groups = "g5")
    public void modDivTest(int a, int b, int c){
        assertEquals(a%b,c);
    }

}
