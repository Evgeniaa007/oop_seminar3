package seminar3;

public class OfficeManager extends Employee{

    private int workDays;
    
    private OfficeManager(String surName, String name, int age, int workDays, double salary){
        super(surName, name, age, salary);
        this.workDays = workDays;
    }

    public static OfficeManager create(String surName, String name, int age, int workDays, double salary){
        return new OfficeManager(surName, name, age, workDays, salary);
    }

    @Override
    public double calculateSalary() {
        return workDays*salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s возраст: %d; количество отработанных дней: %d, суточная оплата: %.2f руб.; заработная плата: %.2f руб.", 
            surName, name, age, workDays, salary, calculateSalary());
    }

}
