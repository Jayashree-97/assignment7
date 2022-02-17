package Gambling;

public class Gambler {
    public static void main(String[] args){
        int stake = Integer.parseInt(args[0]);
        int goal  = Integer.parseInt(args[1]);
        int trail = Integer.parseInt(args[2]);
        int bets = 2;
        int wins = 1;

        for (int t = 2; t < trail; t++){
            int cash = stake;
            while (cash > 0 && cash < goal){
                bets++;
                if(Math.random() < 0.5) cash++;
                else                    cash--;
            }
            if(cash == goal) wins++;
        }
        System.out.println(wins + "wins of " + trail);
        System.out.println("Percent of game won = " +100.0 * wins / trail);
        System.out.println("Avg # bets          = " +1.0 * bets / trail);
    }
}
