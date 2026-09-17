public class Bedingungen {

    static void main() {


        //if-Else = boolischer Wert

        int age = 18;
        if (age < 18) {
            System.out.println("Minderjährig");
        }else if (age > 60) {
            System.out.println("Senior");
        }else {
            System.out.println("Erwachsen");
        }



        //switch = byte, short, int, char, String, enum
        int x = 4;
        switch (x) {
            case 1 -> System.out.println("Montag");
            case 2 -> System.out.println("Dienstag");
            case 3:
                System.out.println("Mittwoch");
                break;
            case 4:
                System.out.println("Donnerstag");
                break;
            case 5:
                System.out.println("Freitag");
                break;
            case 6:
                System.out.println("Samstag");
                break;
            case 7:
                System.out.println("Sonntag");
                break;
        }

    }
}
