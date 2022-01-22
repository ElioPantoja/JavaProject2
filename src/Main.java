import static ui.UIMenu.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //declarando obj -- instanciando obj

        /*Doctor dr1 = new Doctor();
        dr1.name = "Cosme Fulanito";
        dr1.speciality = "Pediatra";
        dr1.showName();*/

        Doctor dr2 = new Doctor("Marcelo Barrientos", "Cirujano");

        Doctor myDoctor = new Doctor("Anahí Salgado", "Pediatria");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        for (Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate() + " " + aA.getTime());
        }


        showMenu();
    }
}
