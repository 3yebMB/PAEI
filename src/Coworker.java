public class Coworker {
    private String name;
    private String office;
    private String mail;
    private String phone;
    private float salary;
    private int age;

    public Coworker (String name, String office, String mail, String phone, float salary, int age){
        this.name = name;
        this.office = office;
        this.mail = mail;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {

        return this.age;
    }

    public void getInfo(){
        System.out.println("Сотрудник "+ this.name + " " + this.age + Ending.endBack(this.age) +
                ", в должности " + this.office + "\nэлектронный адресс: "+ this.mail + " и телефон : " +
                this.phone + "\nимеет зарплату : " + this.salary);
    }
}
