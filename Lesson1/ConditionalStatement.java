public class ConditionalStatement {
    public static void main (String[] args){
        int age = 39;
        char gender = 'm';
        float height = 1.85f;
        char firstSymbolOfName = 'A';

        if (age > 20) {
            System.out.println("Your age more than 20 y.o.");
        }

        if (gender == 'm'){
            System.out.println("Your gender is MALE");
        }

        if (gender != 'm'){
            System.out.println("Your gender is not MALE");
        }

        if (height < 1.80f){
            System.out.println("Your height less than 1.80m");
        }
        else{
            System.out.println("Your height equals or more than 1.80");
        }

        if (firstSymbolOfName == 'М'){
            System.out.println("Your name has first symbol M");
        }
        else
            if (firstSymbolOfName == 'И'){
                System.out.println("Your name has first symbol И");
            }
            else {
                System.out.println("Your name has unsupported first symbol");
            }
    }
}