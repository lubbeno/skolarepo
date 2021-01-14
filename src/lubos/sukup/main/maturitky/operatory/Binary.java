package lubos.sukup.main.maturitky.operatory;

public class Binary {


        public static void main(String[] args) {

            int a = 1;
            int b = 2;
            int c = 3;
            int d = 4;
            int e = 5;
            int f = 6;

            // Multiplicative (* / %) operations are evaluated first
            // Before Additive operators (+ -)
            // and evaluated left to right.

            // Could also be written:  a + (e * b) - (f / c) % b;
            int result = a + e * b - f / c % b;
            System.out.println("result for (a + e * b - f / c % b) = "
                    + result);




// Relationship operators <, <=
// | - logical or
// || - conditional logical or
            System.out.println("\nResults using relationship operators" +
                    " and logical or operators (| ||) ");
            e = 0;
            f = 0;
            if ((e++ <= f) | (++e < f)) {
                System.out.println("Evaluation [(e++ <= f) | (++e < f)] met");
            }
            System.out.println("Logical | (OR) will evaluate both expressions: e = "
                    + e + ", and f = " + f);

            e = 0;
            f = 0;
            if ((e++ <= f) || (++e < f)) {
                System.out.println("Evaluation [(e++ <= f) || (++e < f)] met");
            }
            System.out.println("Conditional Logical || evaluates only first " +
                    "expression if it evaluates to true: e = "
                    + e + ", and f = " + f);

            e = 0;
            f = 0;
            if ((e++ < f) || (++e <= f)) {
                System.out.println("Evaluation [(e++ <= f) || (++e < f)] met");
            }
            System.out.println("Conditional Logical || (OR) will evaluate" +
                    " both expressions ONLY if first expression is false : e = "
                    + e + ", and f = " + f);




            System.out.println("\nResults using relationship operators" +
                    " and logical or operators (& &&) ");

            a = 0;
            b = 10;
            if ((++a > b) & (++a >= b)) {
                System.out.println("Evaluation [(++a > b) & (++a >= b)] met");
            }

            System.out.println("Logical & (AND) will evaluate both expressions: a = "
                    + a + ", and b = " + b);

            a = 0;
            b = 10;
            if ((++a > b) && (++a >= b)) {
                System.out.println("Evaluation [(++a > b) && (++a >= b)] met");
            }

            System.out.println("Conditional && (AND) will evaluate only first " +
                    "expression if it evaluates to false: a = "
                    + a + ", and b = " + b);

            a = 0;
            b = 0;
            if ((++a > b) && (a++ == b)) {
                System.out.println("Evaluation [(++a > b) && (++a >= b)] met");
            }

            System.out.println("Conditional && (AND) will evaluate both " +
                    "expressions if first evaluates to true: a = "
                    + a + ", and b = " + b);

        }


    }


