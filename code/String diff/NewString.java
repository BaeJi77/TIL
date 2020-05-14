public class NewString {
    public static void main(String[] args) {
        String s1 = "cat";
        String s2 = "cat";
        String s3 = new String("cat");

        if(s1 == s2) System.out.println("s1 == s2 true");
        if(s1 == s3) System.out.println("s1 == s3 true");
        else System.out.println("s1 == s3 false");
        if(s1.equals(s2)) System.out.println("s1.compare(s2) true");
        if(s1.equals(s3)) System.out.println("s1.compare(s3) true");
    }
}
