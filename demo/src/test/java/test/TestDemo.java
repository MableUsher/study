package test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import demo.Demo;
public class TestDemo
{
    @Test
    public void testSayHello(){
        Demo demo=new Demo();
        String result=demo.sayHello();
        assertEquals("Hello maven",result);
    }
}