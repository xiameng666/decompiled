import android.util.Pair;
import java.security.KeyPair;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class blxl implements blxk {
    static final ggfp a;
    static final byte[] b;

    static {
        blxl.a = ggfp.K(Integer.valueOf(16), Integer.valueOf(0x20));
        blxl.b = new byte[16];
    }

    @Override  // blxk
    public final int a() {
        return 1;
    }

    @Override  // blxk
    public final Pair b(PublicKey publicKey0) {
        KeyPair keyPair0 = gnqs.b(gnqp.a);
        byte[] arr_b = gnqs.l(((ECPrivateKey)keyPair0.getPrivate()), ((ECPublicKey)publicKey0));
        PublicKey publicKey1 = keyPair0.getPublic();
        byte[] arr_b1 = bbmq.ab(arr_b, "SHA-256");
        batl.s(arr_b1);
        return Pair.create(publicKey1, arr_b1);
    }

    @Override  // blxk
    public final byte[] c(byte[] arr_b, byte[] arr_b1) {
        if(blxl.a.contains(Integer.valueOf(arr_b.length))) {
            return new gnrq(new gnrp("HMACSHA256", new SecretKeySpec(arr_b, "HMACSHA256")), 16).b(arr_b1);
        }
        throw new IllegalArgumentException("Unexpected key size for authentication.");
    }

    @Override  // blxk
    public final byte[] d(byte[] arr_b, byte[] arr_b1) {
        if(arr_b.length != 0x20) {
            throw new IllegalArgumentException("Expected 32-byte secret for decryption.");
        }
        if((arr_b1.length & 15) != 0) {
            throw new IllegalArgumentException("Ciphertext expected to be multiple of AES block size.");
        }
        Cipher cipher0 = bbmq.B("AES/CBC/NoPadding");
        batl.s(cipher0);
        cipher0.init(2, new SecretKeySpec(arr_b, "AES"), new IvParameterSpec(blxl.b));
        return cipher0.doFinal(arr_b1);
    }

    @Override  // blxk
    public final byte[] e(byte[] arr_b, byte[] arr_b1) {
        if(arr_b.length != 0x20) {
            throw new IllegalArgumentException("Expected 32-byte secret for encryption.");
        }
        if((arr_b1.length & 15) != 0) {
            throw new IllegalArgumentException("Plaintext expected to be multiple of AES block size.");
        }
        Cipher cipher0 = bbmq.B("AES/CBC/NoPadding");
        batl.s(cipher0);
        cipher0.init(1, new SecretKeySpec(arr_b, "AES"), new IvParameterSpec(blxl.b));
        return cipher0.doFinal(arr_b1);
    }
}

