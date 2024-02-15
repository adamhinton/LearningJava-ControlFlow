//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int myNum = 5;

        while(myNum <=20){
            if(!isEvenNumber(myNum)){
                myNum++;
                continue;
            }
            System.out.println(myNum);
            myNum++;
        }

    }

    public static boolean isEvenNumber (int num){
        return num % 2 == 0;
    }



}