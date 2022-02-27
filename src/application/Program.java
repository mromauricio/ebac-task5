package application;

public class Program {

    public static void main(String[] args){
        String ambiente = args[0];
        if (ambiente.equalsIgnoreCase("DEV")){
            System.out.print("Executando DEV");
        }
        else if (ambiente.equalsIgnoreCase("TEST")){
            System.out.print("Executando TEST");
        }
        else {
            System.out.print("Hello " + ambiente);
        }
    }

}
