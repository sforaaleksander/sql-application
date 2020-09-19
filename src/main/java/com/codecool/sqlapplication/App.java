package com.codecool.sqlapplication;


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
//        MentorDao mentorDao = new MentorDao();
//        Mentor mentor = new Mentor("222", "222", "+123", "b@", "boo", "lodz", 4);
//        mentorDao.insert(mentor);
        ApplicantDao applicantDao = new ApplicantDao();
        List<Applicant> applicantList = applicantDao.getAll();
        applicantList.stream().map(e->e.getFirstName()).forEach(System.out::println);
    }
}


