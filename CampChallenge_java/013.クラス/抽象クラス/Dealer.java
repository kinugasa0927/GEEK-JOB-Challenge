/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author kinu
 */
public class Dealer extends Human{
    
    ArrayList<Integer> cards=new ArrayList<Integer>();
    
    public Dealer(){ 
        for(int i=1; i<=12; i++){ 
        //　1～12のカード
            for(int a=1; a<=4; a++){   
        //　4種ずつカード
                if(i<11){          //　10以上は10とする。
                    cards.add(i); //　ArrayListに追加。
                }else{
                    cards.add(10);
                }
            }
        }   
    }
    
    public ArrayList<Integer> Deal(){ 
        ArrayList<Integer> deal=new ArrayList();
        Random r = new Random(); 
        for(int i=1; i<=2; i++){ 
        int index = r.nextInt(cards.size());
        // int型のindexに、cardsの要素全て（52枚）を乱数として入れる。
        deal.add(cards.get(index));
        // cardsから2枚取得し、dealに追加する。
        cards.remove(index); //取得した2枚は削除。同じものを引かせない為。
        }
        return deal; //値をdealに返す。
    }
    public ArrayList<Integer> Hit(){
        ArrayList<Integer> hit=new ArrayList();
        Random r = new Random();
        int index = r.nextInt(cards.size());
        hit.add(cards.get(index));
        cards.remove(index);
        return hit;
    }
    
    @Override  //継承されているHumanクラスを上書きする。
    public int open(){ //手札の合計
    int sum = 0;
    for(int i =0; i<myCards.size(); i++){
        sum+=myCards.get(i);
}
        return sum;
}

    @Override //同じく上書き
    public boolean cheakSum() { //　hitするかしないかの判定、17以上は引けない
       int total = open();
        if (total <= 16) {
         return true;
        } else {
        return false;
         }
    }
    
    @Override //同じく上書き
    public void setCard(ArrayList<Integer>index){
    for(int i=0; i<index.size(); i++){
        myCards.add(index.get(i));
    }
}
    
}
    

    



