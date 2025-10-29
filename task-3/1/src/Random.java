public class Random {
    public static void main(String[] args){
        int firstNumber = (new java.util.Random()).nextInt(100, 1000);
        int secondNumber = (new java.util.Random()).nextInt(100, 1000);
        int thirdNumber = (new java.util.Random()).nextInt(100, 1000);
        int result = firstNumber / 100 +  secondNumber / 100 + thirdNumber / 100;
        System.out.println(result);
    }
}