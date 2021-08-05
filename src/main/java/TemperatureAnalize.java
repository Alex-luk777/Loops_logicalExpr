public class TemperatureAnalize {
    public static String tempCondition(int temp, int llimit, int hlimit) {
        boolean belowFreeze = temp < 0;
        boolean isWarm = temp > llimit && temp < hlimit;
        System.out.println("isWarm: " + isWarm);
        boolean isUnComfortable = (temp < llimit || temp > hlimit) && !belowFreeze;//Combining of conditions
        System.out.println("isUnComfortable but above 0: " + isUnComfortable);
        //If then else more simplified:
        String answer = temp < 0 ? "There are freezing conditions" : "There is no freezing conditions";
        System.out.println(answer);

        switch (temp) {
            case (0):
                System.out.println("This is a freezing point");
                break;
            case (100):
                System.out.println("It is water vapour temp");
                break;
            default:
                System.out.println("THere is nothing to say");
        }
        return answer;
    }
}