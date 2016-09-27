import junit.framework.Assert;
import org.junit.Test;


public class CalculatorTest {

    @Test
    public void Test7Plus2Res9() {

        Calc calculator = new  Calc();
        Assert.assertEquals(9, calculator.metodCalc(7,"+",2));
    }
    @Test
    public void Test5Plus0Res5(){
        Calc calculator = new Calc();
        Assert.assertEquals(5, calculator.metodCalc(5,"+",0));

    }
    @Test
    public void Test20Plus6Res26(){
        Calc calculator = new Calc();
        Assert.assertEquals(26,calculator.metodCalc(20,"+",6));
    }
    @Test
    public void Test9Minus6ResOtr3() {
        Calc calculator = new Calc();
        Assert.assertEquals(-3, calculator.metodCalc(6,"-",9));
    }
    @Test
    public void Test6Minus0Res6() {
        Calc calculator = new Calc();
        Assert.assertEquals(6, calculator.metodCalc(6,"-",0));
    }
    @Test
    public void Test40Minus8Res32(){
        Calc calculator = new Calc();
        Assert.assertEquals(32,calculator.metodCalc(40,"-",8));
    }

    @Test
    public void Test4Del2Res2(){
        Calc calculator = new Calc();
        Assert.assertEquals(2,calculator.metodCalc(4,"/",2));
    }
    @Test
    public void Test5Del0Res(){
        Calc calculator = new Calc();
        try{
        Assert.assertEquals(5,calculator.metodCalc(5,"/",0));}
        catch (Exception e ){Assert.assertTrue(true);}

    }
    @Test
    public void Test9Del3Res3(){
        Calc calculator = new Calc();
        Assert.assertEquals(3,calculator.metodCalc(9,"/",3));
    }

    @Test
    public void Test3Ymn2Res6(){
        Calc calculator = new Calc();
        Assert.assertEquals(6,calculator.metodCalc(2,"*",3));
    }
    @Test
    public void Test0Ymn3Res0(){
        Calc calculator = new Calc();
        Assert.assertEquals(0,calculator.metodCalc(0,"*",3));
    }
    @Test
    public void Test30Ymn3Res90(){
        Calc calculator = new Calc();
        Assert.assertEquals(90,calculator.metodCalc(30,"*",3));
    }






    }

