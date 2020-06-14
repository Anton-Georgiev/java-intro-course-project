package inf.informatics.Invest.Generator;

import inf.informatics.Input.input;
import inf.informatics.Invest.*;
import java.util.Random;

public class GenInvest {
        private Invest getInvest(int number){
            if (number == 1){
                return new BombsAway(0);
            } else if (number == 2){
                return new ClockWorkOrange(0);
            } else if (number == 3){
                return new EvelCo(0);
            } else if (number == 4) {
                return new FatCat(0);
            } else if (number == 5){
                return new Macrosoft(0);
            } else if (number == 6){
                return new MarodersUnited(0);
            }
            return null;
        }
        public Invest generateInvest(){
            Random rand = new Random();
            int[] randomNums = new int[]{-1, -1, -1};
            Invest[] choices = new Invest[3];
            for (int i = 0;  i < 3; i++){
                randomNums[i] = rand.nextInt(6) + 1;
                choices[i] = getInvest(randomNums[i]);
                System.out.println(
                        (i + 1) + ". " + choices[i].getName() +
                                " min: " + choices[i].getMinInvestValue() +
                                " Coeff: " + choices[i].getCoefficient() +
                                " risk: " + choices[i].getRisk()[0] + "/" + choices[i].getRisk()[1]);

            }

            System.out.println("0. Не ми се инвестира повече.");
            int playerChoice = input.getScanner().nextInt();
            if (playerChoice == 0){
                return null;
            }
            return choices[playerChoice - 1];
        }
    }