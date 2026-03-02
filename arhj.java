import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class arhj {
    static final byte[] a(byte[] arr_b, byte[] arr_b1) {
        SecretKeySpec secretKeySpec0 = new SecretKeySpec(arr_b, "AES");
        byte[] arr_b2 = Arrays.copyOf(arr_b1, 12);
        try {
            Cipher cipher0 = Cipher.getInstance("AES/GCM/NoPadding");
            cipher0.init(2, secretKeySpec0, new GCMParameterSpec(0x80, arr_b2));
            return cipher0.doFinal(arr_b1, 12, arr_b1.length - 12);
        }
        catch(NoSuchAlgorithmException | NoSuchPaddingException exception2) {
            throw new arhi("Unexpected error when creating cipher: JCE thinks it does not support AES/GCM/NoPadding, but this has existed since Android API level 10.", exception2);
        }
        catch(InvalidKeyException | InvalidAlgorithmParameterException exception1) {
            throw new arhi("Unable to initialise cipher.", exception1);
        }
        catch(IllegalBlockSizeException | BadPaddingException exception0) {
            throw new arhi("Unable to decrypt.", exception0);
        }
    }
}

