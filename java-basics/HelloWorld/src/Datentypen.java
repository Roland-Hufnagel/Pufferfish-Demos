public class Datentypen {
    public static void main(String[] args) {
        // Datentypen
        byte a = 127; // -128, -127, ...., -1, 0, 1, 2, ...., 127     8bit
        short b = 32767; // 16 bit -32768 ... 32767
        int c = 2_147_483_647; // 32 bit
        long d = 9_223_372_036_854_775_807L; // 64 bit
        //System.out.println(c + 2);
        long ms = 1000 * 60 * 60 * 24 * 30L;
        long ms1 = 1000L * 60 * 60 * 24 * 30;
        System.out.println(ms);
        System.out.println(ms1);
        float f = 1.0F / c; // 32 bit
        // System.out.println(f);
        double g = 1.0 / c; // 64 bit
        // System.out.println(g);
        // System.out.println(0.1 + 0.2); // BigDecimal
        boolean isAdmin = true; // 1 bit
        boolean isStudent = false;
        // System.out.println(isAdmin);
        char c1 = 'X';
        // System.out.println(c1);
        String str1 = "abc";
        String str2 = "Hello World .....";

        // Mathematische Operatoren +, -, *, /, %
        int x = 5;
        int y = 10;
        double result = x / y * 1.0;
        System.out.println(result);

        // Vergleichsoperatoren == != > >= < <=
        boolean isEqual = 5 == 4 + 1;
        System.out.println(isEqual);

        // Logischen Operatoren &&, ||, !
        int age = 20;
        boolean isTeenager = age >= 13 && age <= 19;
        System.out.println(isTeenager);
        int power = 20;
        int health = 0;
        boolean gameOver = power <= 0 || health <= 0;
        System.out.println(gameOver);
        boolean isLoggedIn = false;
        System.out.println(!isLoggedIn);

    }


}