public class ComputerInheritance2 extends  ComputerInheritance{


    // variables
    private double screenSize;  // in inches
    // methods
    void setScreenSize ( double _screenSize ) {
        screenSize = _screenSize;
    }
    double getScreenSize () {
        return screenSize;
    }



    public static void main(String[] args) {

        ComputerInheritance2 myTab = new ComputerInheritance2();

        myTab.setCpuSpeed( 2.5 );
        myTab.setScreenSize( 10 );
        System.out.println( myTab.getCpuSpeed() );
        System.out.println( myTab.getScreenSize() );

    }






}
