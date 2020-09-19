package com.codecool.sqlapplication;


import com.codecool.sqlapplication.dao.ApplicantDao;
import com.codecool.sqlapplication.dao.MentorDao;
import com.codecool.sqlapplication.models.Mentor;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class App
{
    public static void main( String[] args )
    {
        MentorDao mentorDao = new MentorDao();
        Mentor mentor = new Mentor("tesetee", "tttt", "+123", "b@", "boo", "lodz", 4);
        mentorDao.insert(mentor);
        ApplicantDao applicantDao = new ApplicantDao();
        applicantDao.getAll();
    }
}


