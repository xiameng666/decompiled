import android.content.pm.Signature;
import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class fpul {
    public static String a(Signature signature0) {
        try {
            byte[] arr_b = MessageDigest.getInstance("SHA-1").digest(signature0.toByteArray());
            return ghjc.f.o(arr_b);
        }
        catch(NoSuchAlgorithmException noSuchAlgorithmException0) {
            Log.e("CredentialsHelper", "Unable to get certificate fingerprint.", noSuchAlgorithmException0);
            return null;
        }
    }
}

