import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        //declarando obj -- instanciando obj
        Doctor dr1 = new Doctor();
        dr1.name = "Cosme Fulanito";
        dr1.speciality = "Pediatra";
        dr1.showName();

        Doctor dr2 = new Doctor("Marcelo Barrientos", "Cirujano");

        showMenu();
    }
}
