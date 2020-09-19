package com.codecool.sqlapplication.controller;

import com.codecool.sqlapplication.dao.ApplicantDao;
import com.codecool.sqlapplication.dao.MentorDao;
import com.codecool.sqlapplication.input.Input;
import com.codecool.sqlapplication.models.Applicant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Controller {
    private final Input input;
    private final MentorDao mentorDao;
    private final ApplicantDao applicantDao;
    private final HashMap<Integer, Runnable> commands;
    private boolean isRunning;

    public Controller() {
        this.input = new Input();
        this.mentorDao = new MentorDao();
        this.applicantDao = new ApplicantDao();
        this.commands = new HashMap<>();
        this.isRunning = true;
        initCommands();
    }

    private void initCommands() {
        commands.put(1, mentorDao::getBothNameColumns);
        commands.put(2, mentorDao::getNickNamesForMiskolc);
        commands.put(3, applicantDao::getCarol);
        commands.put(4, applicantDao::getCarol2);
        commands.put(5, ()-> applicantDao.insert(new Applicant(
                "Markus", "Schaffarzyk", "003620/725-2666", "djnovus@groovecoverage.com", 54823)));
        commands.put(6, ()-> applicantDao.getByApplicationCode(54823));
        commands.put(7, applicantDao::updateJemina);
        commands.put(8, applicantDao::deleteTwoGuys);
        commands.put(9, this::exit);
    }

    private void exit() {
        this.isRunning = false;
    }

    private void printMenu(){
        List<String> commandNames = new ArrayList<>();
        commandNames.add("Get full of every mentor ");
        commandNames.add("Get nick names for all mentors from Miskolc");
        commandNames.add("Find Carol");
        commandNames.add("Find the other girl");
        commandNames.add("Insert Marcus");
        commandNames.add("Find Marcus by his application code");
        commandNames.add("Update Jemina");
        commandNames.add("Delete two guys with given email domain");
        commandNames.add("Exit");
        int i = 1;
        for (String command : commandNames) {
            System.out.println(i++ + ". " + command);
        }
    }

    public void run(){
        while (isRunning) {
            printMenu();
            int userChoice = input.gatherIntInput(9);
            commands.get(userChoice).run();
        }
    }
}
