package seminar3;
/*
 * Фрилансер (работник с почасовой оплатой)
 */

public class Freelancer extends Employee {


    
    private Freelancer(String surName, String name, int age, double salary){
        super(surName, name, age, salary);
    }

    public static Freelancer create(String surName, String name, int age, double salary){
        return new Freelancer(surName, name, age, salary);
    }

    @Override
    public double calculateSalary() {
        return 20.8 * 8 * salary;
       
    }

    @Override
    public String toString() {
        return String.format("%s %s возраст: %d; почасовая ставка: %.2f руб.; заработная плата: %.2f руб.",
            surName, name, age, salary, calculateSalary());
    }
    
}
