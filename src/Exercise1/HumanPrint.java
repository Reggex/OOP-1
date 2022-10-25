package Exercise1;

public class HumanPrint {

    public static void print (Human human){
        System.out.println("---------------------------");
        System.out.println("Имя: " + human.getFirstName());
        System.out.println("Фамилия: " + human.getLastName());
        System.out.println("Возраст: " + human.calculateAge());
    }
}
