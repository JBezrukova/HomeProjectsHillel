package homeTask5;

/**
 * Created by Þëÿ on 28.02.2016.
 */
public class XOR {

    private char[] key;

    public XOR(char[] key) {
        this.key = new char[key.length];
        int i = 0;
        for (char element : key) {
            this.key[i] = element;
            i++;
        }
    }

    public String crypt(String text) {
        int size = text.length();

        char[] chars = text.toCharArray();
        for (int i = 0; i < size; i++) {
            chars[i] ^= key[i % key.length];
            i++;
        }
        text = String.copyValueOf(chars);
        return text;
    }
}
