public class String_t {

    public static void main(String[] args) {
  /*      String s1 = "bobo";
        String s2 = "bobo";
        System.out.println(s1 == s2);
        String s3 = new String("bobo");
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));*/

        String s1 = "abc";
        String s2 = new String("abc");
        char [] ca = {'a','b','c'};
        String s3 = new String(ca);
        System.out.println(s3);

        String s = "123456789";
        //查找下标为5的值
        System.out.println("s.charAt(5)="+s.charAt(5));
        System.out.println(s.indexOf('5'));


    }
}
