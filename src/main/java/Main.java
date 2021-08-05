public class Main {
    public static void main(String[] arg){
        int temperature=100;
        final  int lowLimit=20;
        final int highLimit=30;
        System.out.println(TemperatureAnalize.tempCondition(temperature,lowLimit,highLimit));
        Loops.dividing();
        System.out.println(Loops.inputCheck());
        System.out.println(Loops.inputCheckDoWhile());
        Loops.fruitsOutput();
    }
}
