package BasicPrograms;

enum Days{
    Sunday,Monday,Tuesday,Wednesday,Thursday,Friday
        }


public class Weeks {
    public static void main(String[] args) {
        Days Today = Days.Tuesday;
        System.out.println("Today is " + Today);

        System.out.println("All days of the Week");
        for(Days day: Days.values()){
            System.out.println(day);
        }
    }
}
