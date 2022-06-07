public class Employee {


    private String firstName; // имя
    private String lastName; // фамилия
    private int age; // возраст
    private String team; // команда
    private long salary; // зп
    private POSITION position; // позиция сотрудника



    public Employee(String firstName, String lastName, int age, String team, POSITION position) {
        this(firstName, lastName, age, team, 0, position);
    }

    public Employee(String firstName, String lastName, int age, String team, long salary, POSITION position) {

        if (age < 18) {
            System.out.println("Incorrect age value");
        }

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.team = team;

        if (salary == 0) {
            salary = position.minSalary;
        }

        this.salary = salary;
        this.position = position;

    }


    public static class Builder {
        private String firstName; // имя
        private String lastName; // фамилия
        private int age; // возраст
        private String team; // команда
        private long salary; // зп
        private POSITION position; // позиция сотрудника


        public Builder firstName (String firstName){
            this.firstName = firstName;
            return this;
        }
        public Builder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }
        public Builder age(int age){
            this.age = age;
            return this;
        }
        public Builder salary(long salary){
            this.salary = salary;
            return this;
        }
        public Builder team (String team){
            this.team = team;
            return this;
        }

        public Builder position (POSITION position){
            this.position = position;
            return this;
        }

        public Employee build(){
            return new Employee(firstName,lastName,age,team,salary,position);
        }
    }
}
