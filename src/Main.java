import model.Doctor;
import model.Patient;
import model.User;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //declarando obj -- instanciando obj

        /*model.Doctor dr1 = new model.Doctor();
        dr1.name = "Cosme Fulanito";
        dr1.speciality = "Pediatra";
        dr1.showName();

        model.Doctor dr2 = new model.Doctor("Marcelo Barrientos", "Cirujano");*/

        Doctor myDoctor = new Doctor("Anahí Salgado", "Pediatria");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        for (Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate() + " " + aA.getTime());
        }

        Patient patient = new Patient("Elio","elio.pantoja@outlook.com");
        patient.setBlood("O+");
        System.out.println(patient);

        User user = new Doctor("Marcelo Barrientos", "mbar@gmail.com");
        user.showDataUser();
        //showMenu();
    }
}
