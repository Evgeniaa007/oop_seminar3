package seminar3;

import java.util.Arrays;

public class Program {
    
    public static void main(String[] args) {
        
        Employee[] employees = EmployeeFabric.generateEmployees(20);
        for(Employee employee : employees){
            System.out.println(employee);
        }

        System.out.println();
        System.out.println("***");
        System.out.println();



        //Arrays.sort(employees, new SalaryComparator()); // Сортировка по заработанной плате с помощью переопределения SalaryComparator
        //Arrays.sort(employees); // сортировка рабочих по алфавиту (без уникального сравнения для сортировки данных, сравнивается по умолчанию по алфавиту)
        Arrays.sort(employees, new AgeComparator());
        
        for(Employee employee : employees){
            System.out.println(employee);
        }
        
    }

}

/*
Worker[] workers = EmployeeFabric.generateEmployees(15);
for(Worker worker : workers){
    System.out.println(worker);
}
*/

    //Arrays.sort(workers, new SalaryComparator()); // Сортировка по заработанной плате с помощью переопределения SalaryComparator
        
        //Arrays.sort(workers); // сортировка рабочих по алфавиту (без уникального сравнения для сортировки данных, сравнивается по умолчанию по алфавиту)
        /*
        for(Worker worker : workers){
            System.out.println(worker);
        }
        */