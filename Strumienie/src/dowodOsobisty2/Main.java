package dowodOsobisty2;

public class Main {
    public static void main(String[] args) {
        System.out.println(checkID("ATN376194"));
    }

    private static boolean checkID(String id) {
        if (!length(id)) {
            System.out.println("podany numer dowodu ma niepoprawną długość");
            return false;
        }

        if (!correctSymbols(id) || !check(id)) {
            System.out.println("podano niepoprawny format numeru dowodu");
            return false;
        } else {
            System.out.println("format dowodu jest ok");
            return true;
        }
    }

    private static boolean length(String id) {
        return id.length() == 9;
    }

    private static boolean correctSymbols(String id) {
        for (int i = 0; i < 3; i++) {
            if (!Character.isAlphabetic(id.charAt(i))) {
                return false;
            }
        }
        for (int i = 3; i < 9; i++) {
            if (!Character.isDefined(id.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private static boolean check(String id) {
        int sum=0;
        String letter;

        int[] values = {7, 3, 1, 9, 7, 3, 1, 7, 3};

        for (int i = 0; i < 3; i++) {
            letter = String.valueOf(id.charAt(i));
            sum += LetterValue.valueOf(letter).getValue() * values[i];
        }

        for (int i = 3; i < 9; i++) {
            letter = String.valueOf(id.charAt(i));
            sum += Integer.parseInt(letter) * values[i];
        }

        return sum % 2 == 0;
    }
}