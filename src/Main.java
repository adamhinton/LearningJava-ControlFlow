//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int myNum = 4;

        int totalEvens = 0;

        while(myNum <=20){
            myNum++;
            if(!isEvenNumber(myNum)){
                continue;
            }

            System.out.println(myNum);

            totalEvens ++;

            if (totalEvens >= 5) {
                break;
            }
        }

    }

    public static boolean isEvenNumber (int num){
        return num % 2 == 0;
    }



}