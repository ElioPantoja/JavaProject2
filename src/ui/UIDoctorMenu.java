package ui;

import model.Doctor;

import java.util.ArrayList;
import java.util.Scanner;

public class UIDoctorMenu {

    public static ArrayList<Doctor> doctorAvailableAppointments = new ArrayList<>();

    public static void showDoctorMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Welcome Doctor " + UIMenu.doctorLogged.getName());
            System.out.println("1. Add available appointment");
            System.out.println("2. My Schedule appointments");
            System.out.println("0. Logout");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    showAddAvailableAppointmentsMenu();
                    break;
                case 2:
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
            }

        }while(response !=0);

    }
    private static void showAddAvailableAppointmentsMenu(){
        int response = 0;
        do {
            System.out.println();
            System.out.println("::Add Available Appointment");
            System.out.println("::Select a Month");

            for (int i = 0; i < 3; i++) {
                int j = i +1;
                System.out.println(j + ". "+ UIMenu.MONTHS[i]);
            }
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            if(response >0 && response <4){
                int monthSelected = response;
                System.out.println(monthSelected+ " . " + UIMenu.MONTHS[monthSelected-1]);
                System.out.println("Insert the data available: [dd/mm/yy]");
                String date = sc.nextLine();

                System.out.println("Your date is: "+ date + "\n 1. Correct \n 2. Change date");
                int responseDate = Integer.valueOf(sc.nextLine());
                if(responseDate == 2) continue;

                int responseTime = 0;
                String time ="";
                do{
                    System.out.println("Insert the time available for date: "+ date + "[00:00]");
                    time = sc.nextLine();
                    System.out.println("Your time is: "+ time + "\n 1. Correct \n 2. Change time");
                    responseTime = Integer.valueOf(sc.nextLine());
                }while (responseTime ==2);
                UIMenu.doctorLogged.addAvailableAppointment(date,time);
                checkDoctorAvailabbleAppointments(UIMenu.doctorLogged);
            }else if (response == 0){
                showDoctorMenu();
            }

        }while(response !=0);
    }

    private static void checkDoctorAvailabbleAppointments (Doctor doctor){
        if (doctor.getAvailableAppointments().size() > 0 && !doctorAvailableAppointments.contains(doctor)){
            doctorAvailableAppointments.add(doctor);
        }
    }

}