public class Patient {
    int id;
    String name;
    String email;
    String address;
    String phoneNumber;
    String birthday;
    double weight;
    private double height;
    String blood;

//Aca se definen los params obligatorios para crear el objeto
    Patient(String name, String email){
        this.name = name;
        this.email = email;
    }

    //setter
    public void setHeight(double height){
        this.height = height;
    }
    //getter
    public String getHeight(){
        return this.height + " Kg.";
    }

    public String getWeight() {
        return this.weight + " cm";
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if(phoneNumber.length()>8){
            System.out.println("Ingrese un numero valido");
        }
        else if (phoneNumber.length()>=8){
            this.phoneNumber = phoneNumber;
        }

    }
}

