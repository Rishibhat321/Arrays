import java.util.*;

public class betting_game {
    public static int betBalance(String result)
    {
        int bal=4;
        int bet=1;

        if(result.charAt(0) == 'W'){
            bal += bet;
            bet=1;
        }
        else{
            bal -= bet;
            bet = 2*bet;
        }

        for(int i=1;i<result.length();i++){

            if(bal<bet){
                return -1;
            }

            else if(result.charAt(i) == 'W'){
                bal += bet;
                bet = 1;
            }
            else{
                bal -= bet;
                bet = 2*bet;
            }
        }

        return bal;
    }
    public static void main(String[] args) {

        String str = new String("WLWLLLWWLW");

        int res = betBalance(str);

        System.out.println(res);
    }
}
