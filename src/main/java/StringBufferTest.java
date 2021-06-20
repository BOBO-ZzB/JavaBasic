public class StringBufferTest {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("abasdfwe");
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.toString());

        sb.reverse();
        System.out.println(sb);
        sb.reverse();
        sb.insert(1,"bobo");
        System.out.println(sb);
        System.out.println(sb.delete(1,5));
        System.out.println(sb.replace(1,5,""));
    }

}
