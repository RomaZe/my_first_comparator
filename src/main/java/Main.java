import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Records rc1 = new Records("Record#1", 7);
        Records rc2 = new Records("Record#2","This is the string with max length");
        Records rc3 = new Records("Record#3","str");
        Records rc4 = new Records("Record#4","int");
        Records rc5 = new Records("Record#5", 1 );


        // The override compareTo method compare the length of the concatenation object's fields
        // For rc1 and rc2 objects the result has to be false
        // For rc3 and rc4 objects the result has to be true
        System.out.println("Are \"rc1\" and \"rc2\" the same:");
        System.out.println( (rc1.compareTo(rc2) == 0) ? true : false );
        System.out.println();

        System.out.println("Are \"rc3\" and \"rc4\" the same:");
        System.out.println( (rc3.compareTo(rc4) == 0) ? true : false );
        System.out.println();

        // Sort array of Records object
        Records[] records = {rc1, rc2, rc3, rc4, rc5};
        System.out.println("Not sorted Records: "+ Arrays.toString(records));

        Arrays.sort(records);
        System.out.println("Sorted Records    : "+ Arrays.toString(records));
        System.out.println();

        /* Find max and min object in array.
         * Max - object with the maximum length of the concatenation object's fields;
         * Min - object with the minimum length of the concatenation object's fields;
         */

        System.out.print("Maximum Record from records array: ");
        System.out.println(records[records.length-1]);
        System.out.println();

        System.out.print("Minimum Record from records array: ");
        System.out.println(records[0]);
        System.out.println();

    }
}

