

public class TestGuesser {

    public static void main(String[] args) {

        Guesser guesser1 = null; // Should pass the constructor and the toString test!
        try {
            guesser1 = new Guesser(0, 1000);
            System.out.println("guesser1 passed the constructor");
        } catch (Exception e) {
            System.out.println("guesser1: "+e.getMessage());
        }

        Guesser guesser2 = null; // Should fail in the constructor!
        try {
            guesser2 = new Guesser(1000, 0);
            System.out.println("guesser2 passed the constructor");
        } catch (Exception e) {
            System.out.println("guesser2: "+e.getMessage());
        }

        Guesser guesser3 = null; // Should fail in the constructor!
        try {
            guesser3 = new Guesser(100, 100);
            System.out.println("guesser3 passed the constructor");
        } catch (Exception e) {
            System.out.println("guesser3: "+e.getMessage());
        }

        if(guesser1.toString().equals("low: 0 high: 1000")){
            System.out.println("Test with 0, 1000 passed!");
        }else{
            System.err.println("Test with 0, 1000 failed!");
        }
    }

}
