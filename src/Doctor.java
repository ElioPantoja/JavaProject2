import java.util.ArrayList;
import java.util.Date;

//atribs
public class Doctor {
    static int id = 0;
    private String name;
    private String speciality;
    private String email;

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

//Arraylist
    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment(Date date, String time){
        availableAppointments.add(new Doctor.AvailableAppointment(date,time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }



    public static class AvailableAppointment{
        private int id;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }

}
