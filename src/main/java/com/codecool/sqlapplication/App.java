package com.codecool.sqlapplication;


import com.codecool.sqlapplication.models.Human;
import com.codecool.sqlapplication.models.Input;
import com.codecool.sqlapplication.models.Mentor;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class App
{
    public static void main( String[] args )
    {
//        Input input = new Input();
//        String fileName = input.getScanner().next();
//        System.out.println("Type in the name of the file you want to load into your database.");
//        PostgreSQLJDBC.connect();
        Human mentor = new Mentor("a", "b", "c", "c", "c", "c", 0);
        Method[] methods = mentor.getClass().getMethods();
        for (Method met : methods) {
            try {
                System.out.println(met.invoke(mentor));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }
}
