//atribs
public class Doctor {
    static int id = 0;
    String name;
    String speciality;
    String email;

Doctor(){
    System.out.println("Creando al nuevo Dr");
}


Doctor(String name, String speciality){
    id++;
    System.out.println("id del Dr:" + id);
    this.name = name;
    this.speciality = speciality;
}

//comportamientos
    public void showName(){
        System.out.println(name + " Especialidad: " + speciality);
    }
}
