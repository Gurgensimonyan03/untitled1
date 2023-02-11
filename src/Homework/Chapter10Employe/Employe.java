package Homework.Chapter10Employe;

public class Employe {
    private  String name;
    private  String surname;
    private static String empleyeID;
    private  double salary; //зарплата
    private static String company;
    private String position;

    public Employe() {
    }

    public Employe(String name, String surname, String empleyeID, double salary, String company, String position) {
        this.name = name;
        this.surname = surname;
        this.empleyeID = empleyeID;
        this.salary = salary;
        this.company = company;
        this.position = position;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employe employe = (Employe) o;

        if (Double.compare(employe.salary, salary) != 0) return false;
        if (name != null ? !name.equals(employe.name) : employe.name != null) return false;
        if (surname != null ? !surname.equals(employe.surname) : employe.surname != null) return false;
        if (empleyeID != null ? !empleyeID.equals(employe.empleyeID) : employe.empleyeID != null) return false;
        if (company != null ? !company.equals(employe.company) : employe.company != null) return false;
        return position != null ? position.equals(employe.position) : employe.position == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (empleyeID != null ? empleyeID.hashCode() : 0);
        temp = Double.doubleToLongBits(salary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (company != null ? company.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", empleyeID='" + empleyeID + '\'' +
                ", salary=" + salary +
                ", company='" + company + '\'' +
                ", position='" + position + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public static String getEmpleyeID() {
        return empleyeID;
    }

    public void setEmpleyeID(String empleyeID) {
        this.empleyeID = empleyeID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
