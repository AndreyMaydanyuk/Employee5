public class Runner {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Shash","Petrov",30,"qaq",POSITION.JUNIOR);

        var employee3= new Employee.Builder()
                .firstName("vasya")
                .lastName("petrov")
                .salary(123)
                .age(20)
                .position(POSITION.JUNIOR)
                .team("QA")
                .build();







    }
}