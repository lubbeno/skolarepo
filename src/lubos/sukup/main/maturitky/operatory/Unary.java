package lubos.sukup.main.maturitky.operatory;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Unary {

    public static void main(String[] args) {

        System.out.println("----------Test 1 ----------");
        int a = 0;
        // If you do no assignment and the operator is not participating
        // in a more complex expression the following statements are the
        // same.  the value in variable a gets incremented by 1
        a = 1;
        ++a;  // a = a+1
        System.out.println("a after ++a = " + a);
        a = 1;
        a++;  // a = a+1
        System.out.println("a after a++ = " + a);


        // What happens if we do this?
        System.out.println("----------Test 2 ----------");
        a = 1;
        System.out.println("a after ++a = " + ++a);
        a = 1;
        System.out.println("a after a++ = " + a++);
        System.out.println("And now the value of a is: " + a);

        //https://www.quora.com/Why-does-the-expression-x-x++-not-increase-the-value-of-x-in-Java

        System.out.println("----------Test 3 ----------");
        // Let's look at postfix increment in a variable declaration
        a = 1; //1
        int a2 = a++;
        //a = a+1;


        System.out.println("The value of a is " + a);
        System.out.println("The value of a2 is " + a2);

        // Let's look at postfix in an expression...
        a = 1;
        if (a++ == 1) {
            System.out.println("If Statement, now the value of a is " + a);
        }else {
            System.out.println("ak je vyraz nepravda a a je: " +a );
        }
        System.out.println("----------End 3 ----------");


    }
}
