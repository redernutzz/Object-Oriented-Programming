import java.util.ArrayList;
import java.util.Scanner;

public class PerfectSquare extends PrimeFactors {
    PerfectSquare() {
        primeFac = new ArrayList<>();
    }

    @Override
    public void getPrimeFactors() {
        int input = getInp();
        while (input % 2 == 0) {
            primeFac.add(2);
            input /= 2;
        }

        for (int i = 3; i <= Math.sqrt(input); i += 2) {
            while (input % i == 0) {
                primeFac.add(i);
                input /= i;
            }
        }
        if (input > 2) {
            primeFac.add(input);
        }
    }

    @Override
    public int getSmallestNum() {
        ArrayList<Integer> factors = new ArrayList<>();

        for (int i = 0; i < primeFac.size(); i++) {
            factors.add(primeFac.get(i));
        }

        ArrayList<Integer> uniqueFactors = new ArrayList<>();
        for (int factor : factors) {
            if (!uniqueFactors.contains(factor)) {
                uniqueFactors.add(factor);
            }
        }

        ArrayList<Integer> oddCountFactors = new ArrayList<>();
        for (int factor : uniqueFactors) {
            if (count(factor) % 2 != 0) {
                oddCountFactors.add(factor);
            }
        }

        int smallestNum = 1;
        for (int oddFactor : oddCountFactors) {
            smallestNum *= oddFactor;
        }

        return smallestNum;
    }
    @Override
    public void calculatePerfectSquare() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer m: ");
        setInp(input.nextInt());
        getPrimeFactors();
        System.out.println("The smallest number n for m * n to be a perfect square is " + getSmallestNum());
        System.out.println("m * n is " + getSmallestNum() * getInp());

    }

    public static void main(String[] args) {
        PerfectSquare calculate = new PerfectSquare();
        calculate.calculatePerfectSquare();
    }
    @Override
    public int count(int factor) {
        int count = 0;
        for (int j = 0; j < primeFac.size(); j++) {
            if (factor == primeFac.get(j)) {
                count++;
            }
        }
        return count;
    }
}