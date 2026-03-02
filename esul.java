import java.math.BigInteger;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
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

public final class esul {
    public static final byte[] a;
    private static final byte[] b;

    static {
        esul.b = new byte[8];
        esul.a = new byte[16];
    }

    public static ByteBuffer a(ByteBuffer byteBuffer0, ByteBuffer byteBuffer1) {
        ByteBuffer byteBuffer2 = ByteBuffer.allocate(16);
        SecretKeySpec secretKeySpec0 = new SecretKeySpec(byteBuffer0.array(), "AES");
        Cipher cipher0 = Cipher.getInstance("AES/CBC/NoPadding");
        cipher0.init(1, secretKeySpec0, new IvParameterSpec(esul.a));
        byte[] arr_b = cipher0.doFinal(byteBuffer1.array());
        if(arr_b.length != 16) {
            throw new GeneralSecurityException();
        }
        byteBuffer2.put(arr_b);
        return byteBuffer2;
    }

    public static byte[] b(byte[] arr_b) {
        try {
            return MessageDigest.getInstance("SHA1").digest(arr_b);
        }
        catch(NoSuchAlgorithmException noSuchAlgorithmException0) {
            throw new RuntimeException("Missing SHA1 implementation.", noSuchAlgorithmException0);
        }
    }

    public static byte[] c() {
        byte[] arr_b = new byte[16];
        new SecureRandom().nextBytes(arr_b);
        return arr_b;
    }

    public static byte[] d(byte[] arr_b, byte[] arr_b1) {
        byte[] arr_b3;
        int v = ((arr_b.length & 7) == 0 ? 0 : gluj.a(arr_b.length + 1, 8, RoundingMode.CEILING) * 8) - arr_b.length;
        if(v > 0) {
            byte[] arr_b2 = new byte[v];
            arr_b2[0] = (byte)0x80;
            Arrays.fill(arr_b2, 1, v - 1, 0);
            arr_b3 = ByteBuffer.allocate(arr_b.length + v).put(arr_b).put(arr_b2).array();
        }
        else {
            arr_b3 = ByteBuffer.allocate(arr_b.length + v).put(arr_b).array();
        }
        byte[] arr_b4 = Arrays.copyOf(arr_b1, 8);
        byte[] arr_b5 = Arrays.copyOfRange(arr_b1, arr_b1.length - 8, arr_b1.length);
        byte[] arr_b6 = (byte[])arr_b3.clone();
        int v1 = arr_b6.length >> 3;
        SecretKeySpec secretKeySpec0 = new SecretKeySpec(arr_b4, "DES");
        SecretKeySpec secretKeySpec1 = new SecretKeySpec(arr_b5, "DES");
        Cipher cipher0 = Cipher.getInstance("DES/CBC/NoPadding");
        byte[] arr_b7 = esul.b;
        cipher0.init(1, secretKeySpec0, new IvParameterSpec(arr_b7));
        byte[] arr_b8 = null;
        int v2 = 0;
        while(v2 < v1) {
            if(arr_b8 == null) {
                arr_b8 = Arrays.copyOf(arr_b6, 8);
            }
            arr_b8 = cipher0.doFinal(arr_b8);
            ++v2;
            if(v2 < v1) {
                byte[] arr_b9 = Arrays.copyOfRange(arr_b6, v2 * 8, v2 * 8 + 8);
                for(int v3 = 0; v3 < arr_b8.length; ++v3) {
                    arr_b8[v3] = (byte)(arr_b8[v3] ^ arr_b9[v3]);
                }
            }
        }
        cipher0.init(2, secretKeySpec1, new IvParameterSpec(arr_b7));
        byte[] arr_b10 = cipher0.doFinal(arr_b8);
        cipher0.init(1, secretKeySpec0, new IvParameterSpec(arr_b7));
        byte[] arr_b11 = cipher0.doFinal(arr_b10);
        if(arr_b11.length == 8) {
            return arr_b11;
        }
        throw new GeneralSecurityException();
    }

    public static byte[] e(String s, essp essp0) {
        String s1 = essp0.w.get("lucKey").toString();
        Cipher cipher0 = Cipher.getInstance("DESede/ECB/Nopadding");
        cipher0.init(1, new SecretKeySpec(essz.b((s1 + s1.substring(0, 16))), "DESede"));
        return cipher0.doFinal(essz.b((s + "F00000000000" + s + "0F0000000000")));
    }

    public static byte[] f(byte[] arr_b, essp essp0) {
        try {
            RSAPrivateCrtKey rSAPrivateCrtKey0 = (RSAPrivateCrtKey)KeyFactory.getInstance("RSA").generatePrivate(new RSAPrivateCrtKeySpec(new BigInteger(1, essp0.U()), new BigInteger(1, ((byte[])essp0.C.clone())), new BigInteger(1, ((byte[])essp0.D.clone())), new BigInteger(1, ((byte[])essp0.A.clone())), new BigInteger(1, ((byte[])essp0.B.clone())), new BigInteger(1, ((byte[])essp0.E.clone())), new BigInteger(1, ((byte[])essp0.F.clone())), new BigInteger(1, ((byte[])essp0.G.clone()))));
            Cipher cipher0 = Cipher.getInstance("RSA/ECB/NOPADDING");
            cipher0.init(1, rSAPrivateCrtKey0);
            byte[] arr_b1 = cipher0.doFinal(arr_b);
            if(arr_b1.length == essp0.S) {
                return arr_b1;
            }
            throw new RuntimeException();
        }
        catch(NoSuchAlgorithmException | InvalidKeyException | InvalidKeySpecException | IllegalBlockSizeException | BadPaddingException | NoSuchPaddingException exception0) {
            throw new RuntimeException(exception0);
        }
    }
}

