package com.codecool.sqlapplication;


import com.codecool.sqlapplication.controller.Controller;
import com.codecool.sqlapplication.dao.ApplicantDao;
import com.codecool.sqlapplication.dao.MentorDao;
import com.codecool.sqlapplication.models.Applicant;
import com.codecool.sqlapplication.models.Mentor;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public class App
{
    public static void main( String[] args )
    {
        new Controller().run();
    }
}


