public class Main {
    public static void main(String[] args) {
        FactorPrinter.printFactors(6);
        FactorPrinter.printFactors(32);
        FactorPrinter.printFactors(10);
        FactorPrinter.printFactors(-1);
    }
}

//* printFactors(6); → should print 1 2 3 6
//
//* printFactors(32); → should print 1 2 4 8 16 32
//
//* printFactors(10); → should print 1 2 5 10
//
//* printFactors(-1); → should print "Invalid Value" since number is < 1