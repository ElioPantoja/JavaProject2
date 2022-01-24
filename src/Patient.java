public class Patient extends User{
    //atributos
    private String birthday;
    private double weight;
    private double height;
    private String blood;

//Aca se definen los params obligatorios para crear el objeto
    Patient(String name, String email){
        super(name,email);

    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    public String getWeight() {
        return this.weight + " cm";
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    //setter
    public void setHeight(double height){
        this.height = height;
    }
    //getter
    public String getHeight(){
        return this.height + " Kg.";
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    @Override
    public String toString() {
        return super.toString()+ "\nAge: " +birthday+ "\nWeight: " +getWeight()+
                "\nHeight " +getHeight()+ "\nBlood "+blood;
    }
}

