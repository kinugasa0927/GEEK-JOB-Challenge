/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author kinu
 */
public class BlackJack_Main {
    
    public static void main(String[]args)throws Exception{ 
                                          // ↑表示を遅らせる文

            Dealer dealer = new Dealer(); //インスタンスの生成。
            User user = new User();

            dealer.setCard(dealer.Deal());
            user.setCard(dealer.Deal());
            
            System.out.println("Black Jack ゲームを始めます");
            System.out.println("");
            Thread.sleep(2000); //　2秒遅らせる。
            
            System.out.println("Dealerの手札" + dealer.myCards);
            System.out.println("合計：" + dealer.open());
            System.out.println("");
            Thread.sleep(2000);
            
            System.out.println("Userの手札" + user.myCards);
            System.out.println("合計：" + user.open());
            System.out.println("");
            Thread.sleep(2000);

            int i = 0;// 17以下はhit,17以上は引けない
            while (dealer.cheakSum()) {
            dealer.setCard(dealer.Hit());
            i++; 
            }

            if (i == 0) {
            System.out.println("Dealer Stand");
            System.out.println("合計：" + dealer.open() );
            System.out.println("");
            Thread.sleep(2000);
            } else {
            System.out.println("Dealer hit ");
            System.out.println("Dealerの手札　" + dealer.myCards);
            System.out.println("合計：" + dealer.open() );
            System.out.println("");
            Thread.sleep(2000);
            }

            int ii = 0;// ユーザー側も同上
            while (user.cheakSum()) {
            user.setCard(dealer.Hit());
            ii++; 
            }

            if (ii == 0) {
            System.out.println("User Stand");
            System.out.println("合計：" + user.open());
            System.out.println("");
            Thread.sleep(2000);
            } else {
            System.out.println("User hit ");
            System.out.println("Userの手札" + user.myCards);
            System.out.println("合計：" + user.open());
            System.out.println("");
            Thread.sleep(2000);
            }

            
            if (user.open() >= 22) { //勝ち負けの判定、22以上はBUST
            System.out.println("UserがBustDerlerの勝ち");
            System.out.println("");
            } else if (dealer.open() >= 22) {
            System.out.println("DealerがBust Userの勝ち");
            System.out.println("");
            } else if (user.open() > dealer.open()) {
            System.out.println("Userの勝ち");
            } else if (user.open() < dealer.open()) {
            System.out.println("Dealerの勝ち");
            } else if (user.open() == dealer.open()) {
            System.out.println("引き分け。");
            } else if (user.open() >= 22 == dealer.open() >= 22) {
            System.out.println("DerlerもUserもBust 引き分け");
            System.out.println("");
            }    
            Thread.sleep(1000);
            System.out.println("");
            System.out.println("ゲームを終了します");
        }
    }
        
