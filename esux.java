import java.math.BigInteger;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class esux {
    public static final byte[] a;

    static {
        esux.a = new byte[8];
    }

    public static byte[] a(byte[] arr_b) {
        try {
            return MessageDigest.getInstance("SHA1").digest(arr_b);
        }
        catch(NoSuchAlgorithmException noSuchAlgorithmException0) {
            throw new RuntimeException("Missing SHA1 implementation.", noSuchAlgorithmException0);
        }
    }

    public static byte[] b(byte[] arr_b, byte[] arr_b1) {
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(24);
        byteBuffer0.put(arr_b1, 0, 8);
        byteBuffer0.put(arr_b1, 0, 8);
        byteBuffer0.put(arr_b1, 0, 8);
        ByteBuffer byteBuffer1 = ByteBuffer.allocate(24);
        byteBuffer1.put(arr_b1, 8, 8);
        byteBuffer1.put(arr_b1, 8, 8);
        byteBuffer1.put(arr_b1, 8, 8);
        byte[] arr_b2 = byteBuffer0.array();
        byte[] arr_b3 = byteBuffer1.array();
        byte[] arr_b4 = Arrays.copyOf(arr_b, ((arr_b.length & 7) == 0 ? arr_b.length : gluj.a(arr_b.length + 1, 8, RoundingMode.CEILING) * 8));
        int v = arr_b4.length >> 3;
        SecretKeySpec secretKeySpec0 = new SecretKeySpec(arr_b2, "DESede");
        SecretKeySpec secretKeySpec1 = new SecretKeySpec(arr_b3, "DESede");
        Cipher cipher0 = Cipher.getInstance("DESede/CBC/NoPadding");
        byte[] arr_b5 = esux.a;
        cipher0.init(1, secretKeySpec0, new IvParameterSpec(arr_b5));
        byte[] arr_b6 = null;
        int v1 = 0;
        while(v1 < v) {
            if(arr_b6 == null) {
                arr_b6 = Arrays.copyOf(arr_b4, 8);
            }
            arr_b6 = cipher0.doFinal(arr_b6);
            ++v1;
            if(v1 < v) {
                byte[] arr_b7 = Arrays.copyOfRange(arr_b4, v1 * 8, v1 * 8 + 8);
                for(int v2 = 0; v2 < arr_b6.length; ++v2) {
                    arr_b6[v2] = (byte)(arr_b6[v2] ^ arr_b7[v2]);
                }
            }
        }
        cipher0.init(2, secretKeySpec1, new IvParameterSpec(arr_b5));
        batl.s(arr_b6);
        byte[] arr_b8 = cipher0.doFinal(arr_b6);
        cipher0.init(1, secretKeySpec0, new IvParameterSpec(arr_b5));
        return cipher0.doFinal(arr_b8);
    }

    public static byte[] c(byte[] arr_b, hgea hgea0) {
        try {
            KeyFactory keyFactory0 = KeyFactory.getInstance("RSA");
            BigInteger bigInteger0 = new BigInteger(1, (hgea0.l == null ? hgdz.a : hgea0.l).c.toByteArray());
            gfng gfng0 = hgea0.c == null ? gfng.a : hgea0.c;
            gfmy gfmy0 = gfng0.d == null ? gfmy.a : gfng0.d;
            RSAPrivateCrtKey rSAPrivateCrtKey0 = (RSAPrivateCrtKey)keyFactory0.generatePrivate(new RSAPrivateCrtKeySpec(bigInteger0, new BigInteger(1, esxg.c((gfmy0.f == null ? gfmz.a : gfmy0.f).d)), new BigInteger(1, (hgea0.l == null ? hgdz.a : hgea0.l).d.toByteArray()), new BigInteger(1, (hgea0.l == null ? hgdz.a : hgea0.l).e.toByteArray()), new BigInteger(1, (hgea0.l == null ? hgdz.a : hgea0.l).f.toByteArray()), new BigInteger(1, (hgea0.l == null ? hgdz.a : hgea0.l).g.toByteArray()), new BigInteger(1, (hgea0.l == null ? hgdz.a : hgea0.l).h.toByteArray()), new BigInteger(1, (hgea0.l == null ? hgdz.a : hgea0.l).i.toByteArray())));
            Cipher cipher0 = Cipher.getInstance("RSA/ECB/NOPADDING");
            cipher0.init(1, rSAPrivateCrtKey0);
            return cipher0.doFinal(arr_b);
        }
        catch(NoSuchAlgorithmException | InvalidKeyException | InvalidKeySpecException | IllegalBlockSizeException | BadPaddingException | NoSuchPaddingException exception0) {
            throw new RuntimeException(exception0);
        }
    }
}

