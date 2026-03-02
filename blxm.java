import android.util.Pair;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class blxm implements blxk {
    static final byte[] a;
    static final byte[] b;
    static final byte[] c;

    static {
        blxm.a = "CTAP2 HMAC key".getBytes(StandardCharsets.UTF_8);
        blxm.b = "CTAP2 AES key".getBytes(StandardCharsets.UTF_8);
        blxm.c = new byte[0x20];
    }

    @Override  // blxk
    public final int a() {
        return 2;
    }

    @Override  // blxk
    public final Pair b(PublicKey publicKey0) {
        KeyPair keyPair0 = gnqs.b(gnqp.a);
        PublicKey publicKey1 = keyPair0.getPublic();
        byte[] arr_b = gnqs.l(((ECPrivateKey)keyPair0.getPrivate()), ((ECPublicKey)publicKey0));
        byte[] arr_b1 = gnrj.b("HMACSHA256", arr_b, blxm.c, blxm.a, 0x20);
        byte[] arr_b2 = gnrj.b("HMACSHA256", arr_b, blxm.c, blxm.b, 0x20);
        byte[] arr_b3 = new byte[0x40];
        System.arraycopy(arr_b1, 0, arr_b3, 0, 0x20);
        System.arraycopy(arr_b2, 0, arr_b3, 0x20, 0x20);
        return Pair.create(publicKey1, arr_b3);
    }

    @Override  // blxk
    public final byte[] c(byte[] arr_b, byte[] arr_b1) {
        if(arr_b.length >= 0x20) {
            return new gnrq(new gnrp("HMACSHA256", new SecretKeySpec(arr_b, 0, 0x20, "HMACSHA256")), 0x20).b(arr_b1);
        }
        throw new InvalidKeyException("Provided key too short to contain 32-byte HMAC key.");
    }

    @Override  // blxk
    public final byte[] d(byte[] arr_b, byte[] arr_b1) {
        if(arr_b.length != 0x40) {
            throw new InvalidKeyException("Expected 64-byte key (HMAC key || AES key).");
        }
        if(arr_b1.length < 16 || (arr_b1.length & 15) != 0) {
            throw new IllegalBlockSizeException("Ciphertext expected to be multiple of AES block size and to be prefixed with IV.");
        }
        Cipher cipher0 = bbmq.B("AES/CBC/NoPadding");
        batl.s(cipher0);
        cipher0.init(2, new SecretKeySpec(arr_b, 0x20, 0x20, "AES"), new IvParameterSpec(arr_b1, 0, 16));
        return cipher0.doFinal(arr_b1, 16, arr_b1.length - 16);
    }

    @Override  // blxk
    public final byte[] e(byte[] arr_b, byte[] arr_b1) {
        if(arr_b.length != 0x40) {
            throw new InvalidKeyException("Expected 64-byte key (HMAC key || AES key).");
        }
        if((arr_b1.length & 15) != 0) {
            throw new IllegalBlockSizeException("Plaintext expected to be multiple of AES block size.");
        }
        Cipher cipher0 = bbmq.B("AES/CBC/NoPadding");
        batl.s(cipher0);
        SecureRandom secureRandom0 = new SecureRandom();
        byte[] arr_b2 = new byte[16];
        secureRandom0.nextBytes(arr_b2);
        cipher0.init(1, new SecretKeySpec(arr_b, 0x20, 0x20, "AES"), new IvParameterSpec(arr_b2));
        byte[] arr_b3 = cipher0.doFinal(arr_b1);
        byte[] arr_b4 = new byte[arr_b3.length + 16];
        System.arraycopy(arr_b2, 0, arr_b4, 0, 16);
        System.arraycopy(arr_b3, 0, arr_b4, 16, arr_b3.length);
        return arr_b4;
    }
}

