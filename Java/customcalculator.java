
class InvalidInputException extends Exception {

    @Override
    public String toString() {
        return "Can not add 8 and 9";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}

class CannotDivideByZeroException extends Exception {

    @Override
    public String toString() {
        return "Can not divide by zero";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}

class MaxInputException extends Exception {

    @Override
    public String toString() {
        return "Input cannot be greater than 100000";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}

class MaxMultiplyInputException extends Exception {

    @Override
    public String toString() {
        return "Input cannot be greater than 7000 while multiplying";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}

class calci {

    double add(int a, int b) throws InvalidInputException, MaxInputException, MaxMultiplyInputException {
        if (a > 100000 || b > 100000) {
            throw new MaxInputException();
        } else if (a > 7000 || b > 7000) {
            throw new MaxMultiplyInputException();
        }
        if (a == 8 || a == 9) {
            throw new InvalidInputException();
        }
        return a + b;
    }

    double sub(int a, int b) throws MaxInputException, MaxMultiplyInputException {
        if (a > 100000 || b > 100000) {
            throw new MaxInputException();
        } else if (a > 7000 || b > 7000) {
            throw new MaxMultiplyInputException();
        }
        return a - b;
    }

    double multi(int a, int b) throws MaxInputException, MaxMultiplyInputException {
        if (a > 100000 || b > 100000) {
            throw new MaxInputException();
        } else if (a > 7000 || b > 7000) {
            throw new MaxMultiplyInputException();
        }
        return a * b;
    }

    double div(int a, int b) throws CannotDivideByZeroException, MaxInputException {
        if (a > 100000 || b > 100000) {
            throw new MaxInputException();
        }

        if (b == 0) {
            throw new CannotDivideByZeroException();
        }
        return a / b;
    }
}

public class customcalculator {

    public static void main(String[] args) throws InvalidInputException, CannotDivideByZeroException, MaxMultiplyInputException, MaxInputException {

        calci c = new calci();
        // c.add(8, 9);
        // c.div(3, 0);
        c.div(60000000, 50);
        c.multi(5, 78888);
        /*
        Exercise : You have to create a custom calculator with following operations:
        1. + -> Addition 
        2. - -> Substraction
        3. * -> Multiplication
        4. / -> Division

        which throws the following exceptions:
        1. Invalid input exception ex : 8 & 9
        2. Cannot divided by 0 exception
        3. Max input exception if any of the inputs is greater than 100000
        4. Max multiplier reached exception , Don't allow any multiplication input to be greater than 7000
        5. 

         */
    }

}
