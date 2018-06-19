package diceroll;

import java.util.Random;
import java.util.Scanner;
public class dice1 {

    int Size;
    String[] selection={"One","Two","Three","Four","Five","Six"};
    public dice1(int Size){
        this.Size=Size;
    }
    public String rollDice(){
        return selection[new Random().nextInt(Size)];      
    }
    public static void main(String[] args) {
        System.out.print("Enter Size of Dice 2, 4 or 6 :");
        Scanner in=new Scanner(System.in);
        int size=in.nextInt();
        System.out.println();
        if(size==2 || size==4 || size==6 ){
            dice1 d=new dice1(size);
            System.out.println(d.rollDice());
        }
        else{
            System.out.println("Invalid Input"); 
        }  
    } 
}