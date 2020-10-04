public class Loops {

    public static void main(String[] args) {

        // classic for loop
        for(int i=0; i <= 6; i++){

            System.out.printf("i == %d%n", i);
        }

        //enhanced for loop
        int [] arrays = {1, 2, 3};

        for (int num : arrays){
            System.out.println(num);
        }

        int [][] multiArrays = new int[2][3];

        //System.out.print(multiArrays.length);

        // inert values into arrays
        for (int row=0; row<multiArrays.length; row++){
            System.out.printf("array len -> %d%nrow %d%n",multiArrays.length, row+1);
            int value =0;
            for (int col : multiArrays[row]){
                multiArrays[row][col] = ++value;
                System.out.printf("col %d%n",multiArrays[row][col]);
            } }
     //   System.out.print(multiArrays[0][0]);



        // print values out from arrays
        int rowCount = 0;
        for (int row =0; row < multiArrays.length; row++){
            System.out.printf("row %d:%n", row+1);
            for (int col =0; col< multiArrays[row].length; col++)
                System.out.printf("col -> %d%n", multiArrays[row][col]);
        }


        String[] letters = { "A", "B", "C", "D" };

        for (String letter : letters) {
            if (letter.equals("A")) {
                continue;    // Jump to next iteration
            }
            System.out.println(letter);
            if (letter.equals("C")) {
                break;     // Leave the for loop
            }
        }


        // while loop
        int i = 0;
        while (i < letters.length){
            System.out.print(letters[i]);
            i++;
        }

        // do-while loop
        i =0;
        do {
            System.out.print(letters[i]);
            i++;
        }
        while (i<letters.length);



    }}
