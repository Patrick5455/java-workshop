public class ComputerImplements implements ComputerInterface {

    /**  Interfaces can extend other interfaces.
     *    Unlike classes, which can only extend one class at a time, interfaces can extend multiple interfaces at once. You do so by adding the different interfaces separated by commas.
     *    Interfaces have no constructors.
     * */


    public static void main(String[] args) {

        ComputerImplements computerImplements = new ComputerImplements();

        computerImplements.getDeviceType();
        computerImplements.getSpeed();
    }


    @Override
    public String getDeviceType() {
        return "Device Type";
    }

    @Override
    public String getSpeed() {
        return "Device Speed";
    }
}
