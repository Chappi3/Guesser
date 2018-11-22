

public class GuessingGame {

    public static void main(String[] args) {

        int low = 0;
        try {
            low = Integer.parseInt(args[0]);
        } catch (ArrayIndexOutOfBoundsException e) {
        } catch (NumberFormatException e) {
            System.out.println("Wrong format "+e.getMessage()+ " should be a number.");
            System.out.println("Using default value: "+low);
        }

        int high = 1000;
        try {
            high = Integer.parseInt(args[1]);
        } catch (ArrayIndexOutOfBoundsException e) {
        } catch (NumberFormatException e) {
            System.out.println("Wrong format "+e.getMessage()+ " should be a number.");
            System.out.println("Using default value: "+high);
        }

        Guesser guesser = new Guesser(low,high);
        guesser.start();

    }
}
