package lesson4;

public class Light {
    public static void main(String[] args) {
        int lightspeed;
        long days;
        long seconds;
        lightspeed = 186000;
        days = 1000;
        seconds = days * 24 * 60 * 60;
        long distance = lightspeed * seconds;
        System.out.println("За" + days);
        System.out.println("дней свет пройдет около");
        System.out.println(distance + "миль.");


    }
}
