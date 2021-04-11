import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Random;

public class Records implements Comparable<Records> {
    private String recordName;
    private String str1, str2, str3, str4, str5, str6, str7, str8, str9, str10;

    public Records(String recordName, int length) {
        this.recordName = recordName;
        str1 = generateRandomString(length);
        str2 = generateRandomString(length);
        str3 = generateRandomString(length);
        str4 = generateRandomString(length);
        str5 = generateRandomString(length);
        str6 = generateRandomString(length);
        str7 = generateRandomString(length);
        str8 = generateRandomString(length);
        str9 = generateRandomString(length);
        str10 = generateRandomString(length);
    }

    public Records(String recordName, String str) {
        this.recordName = recordName;
        str1 = str2 = str3 = str4 = str5 = str6 = str7= str8 = str9 = str10 = str;
    }

    public String getRecordName() {
        return recordName;
    }

    public String getStr1() {
        return str1;
    }

    private String generateRandomString(int length){
        String baseString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";
        StringBuilder str = new StringBuilder();
        while (length > 0) {
            Double index = baseString.length() * Math.random();
            try {
                str.append(baseString.charAt(index.intValue()));
            } catch (StringIndexOutOfBoundsException ae) {
//                System.out.println("It's not possible to generate random string for Records object");
//                System.out.println("Errors details: " + ae);
                str.append(baseString.charAt(0));
            }
            finally { length--; }
        }
        return str.toString();
    }

    @Override
    public int compareTo(Records other) {
        StringBuilder stringThis = new StringBuilder();
        stringThis.append(this.str1);
        stringThis.append(this.str2);
        stringThis.append(this.str3);
        stringThis.append(this.str4);
        stringThis.append(this.str5);
        stringThis.append(this.str6);
        stringThis.append(this.str7);
        stringThis.append(this.str8);
        stringThis.append(this.str9);
        stringThis.append(this.str10);

        StringBuilder stringOther = new StringBuilder();
        stringOther.append(other.str1);
        stringOther.append(other.str2);
        stringOther.append(other.str3);
        stringOther.append(other.str4);
        stringOther.append(other.str5);
        stringOther.append(other.str6);
        stringOther.append(other.str7);
        stringOther.append(other.str8);
        stringOther.append(other.str9);
        stringOther.append(other.str10);

        return Integer.compare(stringThis.toString().length(), stringOther.toString().length());
    }

    @Override
    public String toString() {
        return recordName;
    }
}

