public class CommandLineArgs {

    public static void main(String[] args) {

        for (int i=0; i<args.length; i++){
            System.out.println(args[i]);
        }

        // to pass items into args from command line
        /**
         * 1. cd src
         * javac CommandLineArgs.java
         * java CommandLineArgs cat dog wombat
         * (prints out the passed command)
         *
         * Note: The java command, which runs compiled Java programs,
         * supports a set of command-line arguments s
         * uch as defining the available memory heap space.
         * See the Oracle Java documentation for details on the command-line arguments
         * that control the execution of your Java programs.
         */

    }
}
