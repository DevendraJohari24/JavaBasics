package Reflection_API;

import java.lang.reflect.Method;

public class reflectionAPI {
    public static void main(String[] args) throws Exception {

        // create a object using class
        Class c = Class.forName("Reflection_API.Test");
        Test t = (Test) c.newInstance();
        Method m = c.getDeclaredMethod("show", null);
        m.setAccessible(true);
        m.invoke(t, null);

    }
}

class Test{
    private void show(){
        System.out.println("Calling private method");
    }
}

