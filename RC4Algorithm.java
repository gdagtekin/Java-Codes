package algorithms;

import java.util.Scanner;

/**
 *
 * @author Gökhan DAĞTEKİN
 *
 * 2019
 */
public class RC4Algorithm {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter plain text: ");
        String plainText = sc.nextLine();
        System.out.print("Enter a key: ");
        String key = sc.nextLine();

        byte[] plainTextByte = plainText.getBytes();
        byte[] keyByte = key.getBytes();
        int[] S = new int[256];
        S = KSA(S, keyByte);
        S = PRGA(S);
        byte[] cipherByte = encrypt(S, plainTextByte);
        String encryptDataText = new String(cipherByte);
        System.out.println("Encrypted data: " + encryptDataText);

        /*System.out.print("Enter a key: ");
        String key2 = sc.nextLine();
        byte[] keyByte2 = key2.getBytes();
        int[] S2 = new int[256];
        S2 = KSA(S2, keyByte2);
        S2 = PRGA(S2);
        byte[] decryptedByte2 = decrypt(S2, cipherByte);
        String decryptedText2 = new String(decryptedByte2);
        System.out.println("Decrypted data: " + decryptedText2);*/
        byte[] decryptedByte = decrypt(S, cipherByte);
        String decryptedText = new String(decryptedByte);
        System.out.println("Decrypted data: " + decryptedText);
    }

    public static int[] KSA(int[] S, byte[] key) {
        for (int i = 0; i < S.length; i++) {
            S[i] = i;
        }
        int j = 0, temp;
        for (int i = 0; i < S.length; i++) {
            j = (j + S[i] + key[i % key.length]) % 256;
            temp = S[i];
            S[i] = S[j];
            S[j] = temp;
        }
        return S;
    }

    public static int[] PRGA(int[] S) {
        int[] keyStream = new int[S.length];
        int j = 0, temp;
        for (int i = 0; i < S.length; i++) {
            j = (j + S[i]) % S.length;
            temp = S[i];
            S[i] = S[j];
            S[j] = temp;
            keyStream[i] = S[(S[i] + S[j]) % S.length];
        }
        return keyStream;
    }

    public static byte[] encrypt(int[] keyStream, byte[] plainText) {
        byte[] cipherByte = new byte[plainText.length];
        for (int i = 0; i < plainText.length; i++) {
            cipherByte[i] = (byte) (plainText[i % plainText.length] ^ keyStream[i % keyStream.length]);
        }
        return cipherByte;
    }

    public static byte[] decrypt(int[] keyStream, byte[] plainText) {
        return encrypt(keyStream, plainText);
    }
}
