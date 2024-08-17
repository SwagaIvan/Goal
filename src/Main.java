//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a = 5;
        long b = a;
        String name = "Ivan";
        char x = 'I';
        double y = 4.5344d;
        float c = 23.5f;
        boolean m = true;
        byte u = 56;
        short p = 43;
        final float f = 3.14f;
        int r = 22;
        double myArea = f * r * r;
        int newArea = (int) myArea;

        System.out.println("myArea is equal to " + myArea);
        int length = 43;
        int width = 2;
        int theAreaOfRectangle = length * width;
        System.out.println(" The area of a rectangle is equal to " + theAreaOfRectangle);
        int AreaOfSquare = length * length;
        System.out.println("The area of a square = " + AreaOfSquare);

        int myResult = (a + a);
        System.out.println("Result =" + myResult);
        String Names = "Ivan";
        System.out.println(Names.length());
        System.out.println(Names.toUpperCase());
        String FirstName = " Balga";
        String SecondName = "Child";
        System.out.println("My name is " + FirstName + " " + SecondName);
        int g = 16;
        System.out.println(" The square root of g is " + Math.sqrt(g));
        System.out.println(" Random numbers is equal to " + Math.random() * 101);
        int age = 12;
        if (age == 18) {
            System.out.println(" I am an adult ");
        } else {
            System.out.println(" He is young ");
        }
        int day = 4;

        switch (day) {
            case 1:
                System.out.println("today is Monday ");
                break;
            case 2:
                System.out.println(" today is tuesday");
                break;
            case 3:
                System.out.println(" Today is wednesday");
                break;
            case 4:
                System.out.println(" Today is Thursday");
                break;
            case 5:
                System.out.println("Today is Friday");
                break;
            case 6:
                System.out.print("Today is saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;

            default:
        }
        int i = 0;
        while (i < 15) {
            System.out.println("print " + i);
            i += 3;

        }
        int aa = 2;
        while (aa < 100) {
            if (aa % 2 == 0) {
                System.out.println("Print even numbers" + aa);
            }
            aa++;

        }
        for (int bb = 2; bb < 100; bb++) {
            if (bb % 2 == 0) {
                System.out.println(" Even numbers " + bb);
            }
        }

        int cc = 2;
        do {
            if (cc % 2 == 0) {
                System.out.println(" print Numbers" + cc);

            }
            cc++;
        } while (cc < 100);

        int gg = 1;
        while (gg < 100) {
            if( gg%2 != 0){
                System.out.println(" print odd numbers "+ " " + gg);
            }
            gg++;
        }
        int yy = 1;
        while(yy < 100){
            if(yy%2 ==1){
                System.out.println(" print odd numbers" + yy);
            }
            yy++;
        }

        for( int uu = 2; uu < 100; uu ++){
            if (uu%2 !=0){
                System.out.println(" odd numbers "+ " " +uu);
            }
        }
        int hh = 1;
        do {
            if( hh%2 ==1) {
                System.out.println(" print numbers "+ " "+ hh);
            }
            hh++;
        }while (hh < 100);

        String firstName = "Ivan";
        String secondName = " Swaga";
        System.out.println(firstName.concat(secondName));

        String mm = "10";
        String nn = " 12";
        String zz = (mm +nn);
        String text = "This is a string\"it's not a string";
        System.out.println(text);

        int vv = 16;
        System.out.println("The square root of 16 is" + Math.sqrt(vv));

        int rr = 123;
        int kk = 435;
        System.out.println(" The maximum number is "+ " " + Math.max(rr,kk));
        System.out.println( " The minimum number is " + " " + Math.min(rr,kk));
        System.out.println(" My random numbers " + " " + Math.random()*100);

        if (rr > kk){
            System.out.println(" rr is the maximum number " + " " + rr);

        }else {
            System.out.println(" This is the number");
        }/* break used to jump out of the switch, define a for loop to print numbers between 0-10*/
        for(int tt = 1; tt < 10; tt++){
            if (tt==4){
                break;

            }
            System.out.println("print "+ " " +tt);

        }

    /* Continue*/
    for(int w4 = 1; w4 < 10; w4 ++){
        if ( w4 == 4){
            continue;

        }
        System.out.println("print value"+ w4);
    }
for(int za = 0; za < 100; za ++){
    if (za %4 != 0){
        continue;
    }
    System.out.println( " print numbers =" + za);
}
/* methods, these are like a function which helps to finish specific tasks
it's a block of codes, use of fuction, can be reused by calling, methods can be declared within a class
 */

    }

}