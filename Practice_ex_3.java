import java.util.Random;
import java.util.Scanner;
import java.util.random.*;
public class Practice_ex_3 {
    public static void main(String args[]){

        Game g = new Game();

        boolean b=false;

        while (!b) {
            
            g.takeUserinput();
            b = g.isCorrectNumber();
            System.out.println(b); 

        }

        System.out.println(g.get());
        

        

        
    }
}

class Game{

    int number;
    int numberofGuesses=0;
    int inputnumber;

    public void Set(int numberofGuesses){
        this.numberofGuesses= numberofGuesses;
    }

    public int get(){
        return numberofGuesses;
    }
    public Game(){
        Random rand = new Random();
       this.number = rand.nextInt(100);

        
    }

    void takeUserinput(){
        Scanner sc = new Scanner(System.in);
        inputnumber = sc.nextInt();
    }

    boolean isCorrectNumber(){
        numberofGuesses++;
        if (number == inputnumber){
            return true;
        }
        else if(number>inputnumber){
            System.out.println("inputnumber is less");
        }
        else if(number<inputnumber){
            System.out.println("input number is greater than the number");
        }

        return false;

    }
}

