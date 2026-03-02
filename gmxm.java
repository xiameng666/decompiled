import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

final class gmxm implements gmyb {
    @Override  // gmyb
    public final int a() {
        return 0x20;
    }

    @Override  // gmyb
    public final byte[] b() {
        return gmyo.l;
    }

    @Override  // gmyb
    public final byte[] c(byte[] arr_b, byte[] arr_b1, byte[] arr_b2, int v, byte[] arr_b3) {
        if(arr_b.length != 0x20) {
            throw new InvalidAlgorithmParameterException("Unexpected key length: 32");
        }
        if(gmtj.a()) {
            if(!gmue.a(1)) {
                throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
            }
            if(!gmtj.a()) {
                throw new GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
            }
            SecretKeySpec secretKeySpec0 = new SecretKeySpec(arr_b, "ChaCha20");
            if(arr_b2 == null) {
                throw new NullPointerException("ciphertext is null");
            }
            if(arr_b1.length != 12) {
                throw new GeneralSecurityException("nonce length must be 12 bytes.");
            }
            if(arr_b2.length < v + 16) {
                throw new GeneralSecurityException("ciphertext too short");
            }
            IvParameterSpec ivParameterSpec0 = new IvParameterSpec(arr_b1);
            Cipher cipher0 = gmsx.d();
            cipher0.init(2, secretKeySpec0, ivParameterSpec0);
            return cipher0.doFinal(arr_b2, v, arr_b2.length - v);
        }
        byte[] arr_b4 = Arrays.copyOfRange(arr_b2, v, arr_b2.length);
        return new gmth(arr_b).c(ByteBuffer.wrap(arr_b4), arr_b1, arr_b3);
    }

    @Override  // gmyb
    public final byte[] d(byte[] arr_b, byte[] arr_b1, byte[] arr_b2, byte[] arr_b3) {
        return gmya.a(this, arr_b, arr_b1, arr_b2, arr_b3);
    }

    @Override  // gmyb
    public final byte[] e(byte[] arr_b, byte[] arr_b1, byte[] arr_b2, int v, byte[] arr_b3) {
        if(arr_b.length != 0x20) {
            throw new InvalidAlgorithmParameterException("Unexpected key length: 32");
        }
        if(gmtj.a()) {
            if(!gmue.a(1)) {
                throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
            }
            if(!gmtj.a()) {
                throw new GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
            }
            SecretKeySpec secretKeySpec0 = new SecretKeySpec(arr_b, "ChaCha20");
            if(arr_b2 == null) {
                throw new NullPointerException("plaintext is null");
            }
            if(arr_b1.length != 12) {
                throw new GeneralSecurityException("nonce length must be 12 bytes.");
            }
            IvParameterSpec ivParameterSpec0 = new IvParameterSpec(arr_b1);
            Cipher cipher0 = gmsx.d();
            cipher0.init(1, secretKeySpec0, ivParameterSpec0);
            int v1 = cipher0.getOutputSize(arr_b2.length);
            if(v1 > 0x7FFFFFFF - v) {
                throw new GeneralSecurityException("plaintext too long");
            }
            byte[] arr_b4 = new byte[v + v1];
            if(cipher0.doFinal(arr_b2, 0, arr_b2.length, arr_b4, v) == v1) {
                return arr_b4;
            }
            throw new GeneralSecurityException("not enough data written");
        }
        gmth gmth0 = new gmth(arr_b);
        if(arr_b2.length > 0x7FFFFFEF) {
            throw new GeneralSecurityException("plaintext too long");
        }
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(arr_b2.length + 16);
        gmth0.b(byteBuffer0, arr_b1, arr_b2, arr_b3);
        byte[] arr_b5 = byteBuffer0.array();
        if(arr_b5.length > 0x7FFFFFFF - v) {
            throw new InvalidAlgorithmParameterException("Plaintext too long");
        }
        byte[] arr_b6 = new byte[v + arr_b5.length];
        System.arraycopy(arr_b5, 0, arr_b6, v, arr_b5.length);
        return arr_b6;
    }
}

