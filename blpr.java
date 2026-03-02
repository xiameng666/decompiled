import android.util.Pair;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class blpr {
    public static final byte[] a;
    public static final byte[] b;
    private static final byte[] c;
    private static final byte[] d;

    static {
        blpr.a = new byte[0];
        blpr.b = "WebauthnCredentialSpecifics.Encrypted".getBytes(StandardCharsets.UTF_8);
        blpr.c = "KeychainApplicationKey:gmscore_module:com.google.android.gms.fido".getBytes(StandardCharsets.US_ASCII);
        blpr.d = new byte[0];
    }

    public static Pair a(byte[] arr_b, byte[] arr_b1) {
        try {
            byte[] arr_b2 = blpr.c(arr_b, arr_b1, blpr.b);
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)herx.a), arr_b2, 0, arr_b2.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            return Pair.create(blpr.b(((herx)hftv0).c.toByteArray()), ((herx)hftv0));
        }
        catch(hfur hfur0) {
            bxly bxly0 = new bxly();
            bxly0.c = hfur0;
            bxly0.a = 8;
            bxly0.b = "Failed to decode decrypted protobuf.";
            throw bxly0.a();
        }
    }

    public static PrivateKey b(byte[] arr_b) {
        try {
            return KeyFactory.getInstance("EC").generatePrivate(new PKCS8EncodedKeySpec(arr_b));
        }
        catch(NoSuchAlgorithmException | InvalidKeySpecException exception0) {
            bxly bxly0 = new bxly();
            bxly0.c = exception0;
            bxly0.a = 8;
            bxly0.b = "Failed to decode private key.";
            throw bxly0.a();
        }
    }

    public static byte[] c(byte[] arr_b, byte[] arr_b1, byte[] arr_b2) {
        if(arr_b1.length >= 12) {
            try {
                SecretKeySpec secretKeySpec0 = new SecretKeySpec(arr_b, "AES");
                Cipher cipher0 = Cipher.getInstance("AES/GCM/NoPadding");
                byte[] arr_b3 = Arrays.copyOf(arr_b1, 12);
                byte[] arr_b4 = Arrays.copyOfRange(arr_b1, 12, arr_b1.length);
                cipher0.init(2, secretKeySpec0, new GCMParameterSpec(0x80, arr_b3));
                cipher0.updateAAD(arr_b2);
                return cipher0.doFinal(arr_b4);
            }
            catch(BadPaddingException | NoSuchPaddingException | InvalidAlgorithmParameterException | IllegalBlockSizeException | InvalidKeyException | NoSuchAlgorithmException exception0) {
                bxly bxly0 = new bxly();
                bxly0.c = exception0;
                bxly0.a = 8;
                bxly0.b = "Failed to decrypt credential.";
                throw bxly0.a();
            }
        }
        bxly bxly1 = new bxly();
        bxly1.a = 8;
        bxly1.b = "Ciphertext is too short.";
        throw bxly1.a();
    }

    public static byte[] d(byte[] arr_b) {
        if(arr_b.length == 0x20) {
            try {
                return hhur.k(new SecretKeySpec(arr_b, "AES"), blpr.d, blpr.c);
            }
            catch(NoSuchAlgorithmException | InvalidKeyException exception0) {
                bxly bxly0 = new bxly();
                bxly0.c = exception0;
                bxly0.a = 8;
                bxly0.b = "Failed to derive domain secret.";
                throw bxly0.a();
            }
        }
        bxly bxly1 = new bxly();
        bxly1.a = 8;
        bxly1.b = "Domain secret invalid length.";
        throw bxly1.a();
    }

    public static byte[] e(byte[] arr_b, byte[] arr_b1, byte[] arr_b2, SecureRandom secureRandom0) {
        if(arr_b.length == 0x20) {
            byte[] arr_b3 = new byte[12];
            secureRandom0.nextBytes(arr_b3);
            GCMParameterSpec gCMParameterSpec0 = new GCMParameterSpec(0x80, arr_b3);
            SecretKeySpec secretKeySpec0 = new SecretKeySpec(arr_b, "AES");
            try {
                Cipher cipher0 = Cipher.getInstance("AES/GCM/NoPadding");
                cipher0.init(1, secretKeySpec0, gCMParameterSpec0);
                cipher0.updateAAD(arr_b2);
                return glwl.d(new byte[][]{arr_b3, cipher0.doFinal(arr_b1)});
            }
            catch(InvalidAlgorithmParameterException | InvalidKeyException | BadPaddingException | IllegalBlockSizeException | NoSuchAlgorithmException | NoSuchPaddingException exception0) {
                bxly bxly0 = new bxly();
                bxly0.a = 8;
                bxly0.c = exception0;
                bxly0.b = "Encrypting Webauthn credential failed.";
                throw bxly0.a();
            }
        }
        bxly bxly1 = new bxly();
        bxly1.a = 8;
        bxly1.b = "Domain secret invalid length.";
        throw bxly1.a();
    }
}

