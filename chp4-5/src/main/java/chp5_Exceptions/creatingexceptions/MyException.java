package chp5_Exceptions.creatingexceptions;



class MyException extends Exception {

    //constructors

    // The contructors shoud include all the possibilities to
    //be thrown. This implies that the constructor needs to contemplate several different cases.

    public MyException() {
        super();
    }

    public MyException(String message) {
        super(message);
    }

    public MyException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyException(Throwable cause) {
        super(cause);
    }

    //This will allow us to now wrap any exception with our newly formed exception.


//Our main class has to throw the newly created exception class since we are
//going to be issuing that exception in the code.

}