public class Casting {
    public static void main(String[] args){
        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 30;

        long longValue = (50000 + 10 * (byteValue + shortValue + intValue));
        System.out.println(longValue);
    }
}