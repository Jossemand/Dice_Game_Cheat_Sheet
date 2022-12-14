public class Matador {
    public static void main(String[] args) {

        Die die1, die2;
        die1 = new Die();
        die2 = new Die();
        int points_P1 = 0;
        int points_P2 = 0;
        int a = 0;
        int turn = 1;
        boolean pair;
        int sum;


        while (a == 0){
            System.out.println("Turn " + turn + ":");
            System.out.println("Player 1 rolls the Dice");
            die1.   roll();
            die2.roll();
            pair= getPair(die1.getFaceValue(), die2.getFaceValue());
            sum = getSum(die1.getFaceValue(), die2.getFaceValue());
            points_P1 = sum + points_P1;
            System.out.println("Die 1: " + die1.getFaceValue() + "\n" + "Die 2: " + die2.getFaceValue());
            System.out.println("Their sum is: " + sum);
            System.out.println("Total points for player 1 are: " + points_P1);
            System.out.println();
            if (points_P1 >= 40)
                a=1;
            System.out.println("Player 2 rolls the Dice");
            die1.roll();
            die2.roll();
            pair= getPair(die1.getFaceValue(), die2.getFaceValue());
            sum = getSum(die1.getFaceValue(), die2.getFaceValue());
            points_P2 = sum + points_P2;
            System.out.println("Die 1: " + die1.getFaceValue() + "\n" + "Die 2: " + die2.getFaceValue());
            System.out.println("Their sum is: " + sum);
            System.out.println("Total points for player 2 are: " + points_P2);
            System.out.println();
            System.out.println("--------------------------------------------------------------------------------");
            turn++;
            if (points_P1 >= 40 || points_P2 >= 40)
                a = 1;
        }
        if (points_P1 > points_P2)
            System.out.println("Player 1 wins!");
        else
            System.out.println("Player 2 wins!");
    }

    public static boolean getPair(int die1, int die2) {

        return die1 == die2;
    }
    public static int getSum(int die1, int die2 ){

        return die1 + die2;
    }
}
