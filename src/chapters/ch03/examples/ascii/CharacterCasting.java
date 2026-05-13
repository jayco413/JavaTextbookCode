public class CharacterCasting {
    public static void main(String[] args) {
        int num = 65;
        char ch = (char) num;

        System.out.println(ch);

        for (int i = 32; i <= 126; i++) {
            ch = (char) i;
            System.out.print(ch);
        }
    }
}
