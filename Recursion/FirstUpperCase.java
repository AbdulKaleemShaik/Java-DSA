public class FirstUpperCase {
    public static void main(String[] args) {
        Upper("abcBAkk");
    }

    static void Upper(String p) {
        if (p.isEmpty()) {

        }
        char ch = p.charAt(0);
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch);
            return;
        }
        Upper(p.substring(1));
    }
}
