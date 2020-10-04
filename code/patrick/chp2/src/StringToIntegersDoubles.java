

public class StringToIntegersDoubles {

    public static void main(String[] args) {

        // converting passed command line arguments into numberd

        if (args.length >0) {
            int argsIntValue = Integer.parseInt(args[0]);
            System.out.println(argsIntValue);

        }

        if(args.length >1){
            double argsDoubleValue = Double.parseDouble(args[1]);
            System.out.println(argsDoubleValue);
        }






    }
}
