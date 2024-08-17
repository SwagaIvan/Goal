public class MyClass {
    public static void main(String[] args) {
        int x = 22;
        String y = x == 22 ? "4" : "1";
        System.out.println((x == 22 ? "x is equal to 22" : " x is not equal to 22"));
        if (x == 12) {
            System.out.println(" x is equal to 12");
        } else if (x == 2) {
            System.out.println("This is not true for the value of x");
        } else {
            System.out.println(" You may be right");
        }

        System.out.println(" This is my class");
        int yy = 34;
        switch (yy) {
            case 12:
                System.out.println(" yy is equal to 12");
                break;
            case 22:
                System.out.println("This is not true for the value of yy");
                break;
            default:
                System.out.println(" You may be right");
        }

        String makeOfCar = "Volkswogan";
        boolean isDomestic = makeOfCar == "Volkswagon" ? false : true;
        int w = 1;
        while (w < 300) {
            if (w % 3 == 0) {

            }
            System.out.println("print " + w);
            w++;
        }
        double B3 = 20.00d;
        double B4 = 80.00d;
        double result = (B3 + B4) * 100;
        System.out.println("my result " + " " + result);
        double myReminder = result % 40.00;
        System.out.println("my reminder is " + " " + myReminder);
        boolean isNoReminder = (myReminder == 0) ? true : false;
        System.out.println("isNoReminder is equal to " + "" + isNoReminder);
        if (!isNoReminder) {
            System.out.println("Got some reminder");
        }
    }

}
