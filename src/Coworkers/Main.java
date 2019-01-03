package Coworkers;

public class Main {
    public static void main(String[] args) {
        Coworker[] coworkers = new Coworker[5];
        coworkers[0] = new Coworker("Иванов Иван", "Инженер", "ivivan@mailbox.com", "892312312", 30000,30);
        coworkers[1] = new Coworker("Смирнов Вова", "Конструктор", "smirnovv@mailbox.com", "892342312", 35000,41);
        coworkers[2] = new Coworker("Васин Вася", "PR-менеджер", "vasvas@mailbox.com", "892311312", 28000,28);
        coworkers[3] = new Coworker("Комаров Дима", "Дизайнер", "komaid@mailbox.com", "892333312", 25000,48);
        coworkers[4] = new Coworker("Летучий Антон", "Программист", "leta@mailbox.com", "892212312", 38000,44);
        for (Coworker co : coworkers)
            if (co.getAge()>40) {
                co.getInfo();
                System.out.println("----------------------------");
            }
    }
}
