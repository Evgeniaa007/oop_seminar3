package seminar3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EmployeeFabric {
    
    private static Random random = new Random();


    public static Worker generateWorker(){
        String[] names = new String[] {"Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Михаил", "Сергей", "Андрей", "Александр"};    
        String[] surNames = new String[] {"Григорьев", "Фокин", "Шестаков", "Державин", "Петров", "Зорин", "Толстиков", "Бастрыкин"};

        int salary = random.nextInt(60000, 120001);
        int age = random.nextInt(18, 70);
        return Worker.create(
            surNames[random.nextInt(surNames.length)],
            names[random.nextInt(names.length)],
            age,
            salary);
    }

    public static Freelancer generateFreelancer(){
        String[] names = new String[] {"Иван", "Герман", "Алексей", "Мартин", "Виталий", "Георгий", "Василий", "Андрей", "Константин"};    
        String[] surNames = new String[] {"Леонов", "Медведев", "Гришин", "Ерохин", "Исаев", "Гречишников", "Орлов", "Воробьев"};

        int age = random.nextInt(18, 70);
        int salary = random.nextInt(400, 1001);
        return Freelancer.create(
            surNames[random.nextInt(surNames.length)],
            names[random.nextInt(names.length)],
            age,
            salary);
    }

    public static OfficeManager generateOfficeManager(){
        String[] names = new String[] {"Ирина", "Валентина", "Валерия", "Мирослава", "Клавдия", "Марина"};    
        String[] surNames = new String[] {"Логинова", "Будаева", "Вахлаева", "Тихонова", "Васильева", "Романова"};

        int age = random.nextInt(25, 55);
        int workDays = random.nextInt(10, 26);
        int salary = random.nextInt(1900, 3901);
        return OfficeManager.create(
            surNames[random.nextInt(surNames.length)],
            names[random.nextInt(names.length)],
            age,
            workDays,
            salary);
    }

    public static Employee[] generateEmployees(int count){
        
        Random random = new Random();

        Employee[] employees = new Employee[count];

        for(int i = 0; i < count; i++){

            int val = random.nextInt(3);
            switch (val) {
                case 0:
                employees[i] = generateWorker();
                break;
                                
                case 1:
                employees[i] = generateFreelancer();
                break;

                case 2:
                employees[i] = generateOfficeManager();
                break;
            }
        }

        return employees;

    }

}



/*
public static Worker generateWorker(){
    String[] names = new String[] {"Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Михаил", "Сергей", "Андрей", "Александр"};    
    String[] surNames = new String[] {"Григорьев", "Фокин", "Шестаков", "Державин", "Петров", "Зорин", "Толстиков", "Бастрыкин"};

    int salary = random.nextInt(60000, 120001);
    return Worker.create(
        surNames[random.nextInt(surNames.length)],
        names[random.nextInt(names.length)],
        salary);
}

public static Worker[] generateEmployees(int count){
    Worker[] workers = new Worker[count];
    for (int i = 0; i < count; i++) {
        workers[i] = generateWorker();
    }
    return workers;
}
*/
