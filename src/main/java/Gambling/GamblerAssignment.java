package Gambling;

import java.util.ArrayList;

public class GamblerAssignment {
import java.util.*;
    public class main {
        public static void main(String[] args){
            ArrayList<Pair> mal = new ArrayList<>();
            int amt_month = 0; //monthly amount

            while( amt_month >= 0 ){

                amt_month = 0;
                int days = 0;
                ArrayList<Integer> dal = new ArrayList<>();

                int twds = 0;
                int tlds = 0;

                while( days < 30  ){

                    int days_amt = 100;

                    while( days_amt > 50 && days_amt < 150 ){

                        int lw = RandomNumber(0, 1);

                        if( lw == 0 ){
                            days_amt--;
                        }else{
                            days_amt++;
                        }

                    }

                    if( days_amt == 50 ){
                        amt_month -= 50;
                        dal.add(-50);
                        tlds++;
                    }else{
                        amt_month += 50;
                        dal.add(50);
                        twds++;
                    }

                    days++;

                }

                mal.add(new Pair(amt_month, dal, twds, tlds));

            }

            for( int i = 0; i < mal.size(); i++){
                Pair p = mal.get(i);
                System.out.println(p.al + " --> "+ "Total win days --> " + p.twd + ", Total loss days --> " + p.tld + " --> [ Total Amount won/loss in that month = " + p.am + " ]");

            }

        }

        public static int RandomNumber(int Min, int Max){
            int r = Min + (int)(Math.random() * ((Max - Min) + 1));
            return r;
        }

    }
    class Pair{

        ArrayList<Integer> al;
        int am;
        int twd; // total wins in a day
        int tld; // total lost in a day

        public Pair(){}
        public Pair(int am, ArrayList<Integer> al, int twd, int tld){
            this.al = al;
            this.twd = twd;
            this.tld = tld;
            this.am = am;
        }
    }
}
