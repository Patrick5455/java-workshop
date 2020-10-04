public class Exercise03 {

    public static void main(String[] args) {

        // using switch statements

        String evaluate = "Yes";

        String result;

        switch (evaluate){
            case "Yes" : result = "matched yes";
            break;
            case "No": result = "matched no";
            break;
            default: result = "no match";
        }

        System.out.println(result);


        int number = 3;

        switch (number){

            case 1 : result = "matched case 1";
            break;

            case 2 : result = "matched case 2";
            break;

            default: result = "matched no case";
        }

        System.out.print(result);


        int tempAdjustment = 0;
        String taste = "way too hot";

        switch(taste) {
            case "too cold":    tempAdjustment += 1;
                break;
            case "way too hot": tempAdjustment -= 1;
            case "too hot":     tempAdjustment -= 1;
                break;
            case "just right":  // No adjustment
            default:
                break;
        }

        System.out.println("Adjust temperature: " + tempAdjustment);


        // Java 12 switch statements

//        int tempAdjustment = switch(taste) {
//            case "too cold" ->    1;
//            case "way too hot" -> -2;
//            case "too hot" ->    -1;
//            case "just right" -> 0;
//            default -> 0;
//        };


    }
}
