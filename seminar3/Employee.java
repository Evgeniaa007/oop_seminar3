package seminar3;

public abstract class Employee implements Comparable<Employee>{
    /**
     * необходим для переопределения сортировки рабочих workers[] по алфавиту
     * Если в "Program" Arrays.sort(workers) не будет уникального сравнения для сортировки данных, он будет сравнивать по умолчанию по алфавиту
     */
    @Override
    public int compareTo(Employee o) {
        int surNameRes = surName.compareTo(o.surName);
        if (surNameRes == 0) { // Если есть сотрудники с одинаковыми фамилиями, то surNameRes == 0
            return name.compareTo(o.name); // Сортировка по имени
        }
        return surNameRes;
    }
    /**
     * Имя
     */

    protected String name;

    /**
     * Фамилия
     */

    protected String surName;


    /**
     * Возраст
     */

    protected int age;

     /**
     * Ставка з/п
     */

    protected double salary;

    /**
     * Расчет среднемесячной з/п
     * @return з/п в месяц
     */
    public abstract double calculateSalary();

    public Employee(String surName, String name, int age, double salary){
        this.surName = surName;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }



}