public class FirstTwentyPrimes {

    public static void main(String[] args) {
        int numbers = 20;
        int count = 0;
        int num = 2;

        while (count < numbers) {
            if (isPrime(num)) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;



        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i === 0) {
                return false;
            }
        }
        return true;
    }
}
