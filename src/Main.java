public class Main {
    public static void main(String[] args) {
        System.out.println("For loop");
        /*When you know exactly how many times you want to loop through a block
        * of code, use the for loop istead of a while loop.
        * */
        //Syntax
        /*for (statemnt 1; statement 2; statement 3) {
            code block to be executed
        }
        Statement 1 is executed (one time) before the execution of the code block.
        Statement 2 defines the condition for executing the code block.
        Statement 3 is executed (every time) after the code block as been executed.*/
        for (int i=0; i<6; i++) {
            System.out.println(i);
        }
        for (int a=0;a<=10;a=a+2) {
            System.out.println(a);
            //This will print even values between 0 and 10
        }
        //NESTED LOOPS
        //it is also possible to place loop inside another loop. This is called Nested loop.
        //The inner loop will be executed one time for each iteration of the outer loop.

        //outer loop
        for (int b=1; b<=2; b++) {
            System.out.println("Outer " +b); //executes 2 times
            for (int c=1; c<=3; c++) {
                System.out.println("Inner loop " +c); //Executes 6 times (2 * 3)
            }
        }

    }
}