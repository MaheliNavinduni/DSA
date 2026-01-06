package dsa;

class RabbitProblem {

    static int rabbits(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return rabbits(n - 1) + rabbits(n - 2);
    }

    public static void main(String[] args) {
        int months = 6;
        System.out.println("Rabbit pairs after " + months + " months: " + rabbits(months));
    }
}

