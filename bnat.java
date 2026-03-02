import android.util.Pair;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.spec.ECPoint;
import java.util.ArrayList;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class bnat {
    public byte[] a;
    private static final ByteString b;
    private static final ByteString c;
    private byte[] d;
    private byte[] e;

    static {
        ByteString.A("Noise_NK_P256_AESGCM_SHA256\u0000\u0000\u0000\u0000\u0000");
        bnat.b = ByteString.A("Noise_NKpsk0_P256_AESGCM_SHA256\u0000");
        bnat.c = ByteString.A("Noise_KNpsk0_P256_AESGCM_SHA256\u0000");
    }

    public bnat(int v) {
        byte[] arr_b = v - 1 == 1 ? bnat.b.toByteArray() : bnat.c.toByteArray();
        this.d = arr_b;
        this.a = arr_b;
    }

    public final Pair a() {
        ArrayList arrayList0 = bnat.k(this.d, new byte[0], 2);
        return Pair.create(((byte[])arrayList0.get(1)), ((byte[])arrayList0.get(0)));
    }

    public final gfsx b(byte[] arr_b) {
        try {
            Cipher cipher0 = Cipher.getInstance("AES/GCM/NoPadding");
            GCMParameterSpec gCMParameterSpec0 = new GCMParameterSpec(0x80, new byte[12]);
            cipher0.init(2, new SecretKeySpec(this.e, "AES"), gCMParameterSpec0);
            cipher0.updateAAD(this.a);
            byte[] arr_b1 = cipher0.doFinal(arr_b);
            this.c(arr_b);
            return gfsx.m(arr_b1);
        }
        catch(NoSuchAlgorithmException | InvalidAlgorithmParameterException | NoSuchPaddingException | IllegalBlockSizeException | InvalidKeyException exception0) {
            throw new AssertionError(exception0);
        }
        catch(BadPaddingException unused_ex) {
            return gfqx.a;
        }
    }

    public final void c(byte[] arr_b) {
        MessageDigest messageDigest0;
        try {
            messageDigest0 = MessageDigest.getInstance("SHA-256");
        }
        catch(NoSuchAlgorithmException noSuchAlgorithmException0) {
            throw new AssertionError(noSuchAlgorithmException0);
        }
        messageDigest0.update(this.a);
        this.a = messageDigest0.digest(arr_b);
    }

    public final void d(ECPoint eCPoint0) {
        this.c(bnat.g(eCPoint0));
    }

    public final void e(byte[] arr_b) {
        ArrayList arrayList0 = bnat.k(this.d, arr_b, 2);
        this.d = (byte[])arrayList0.get(0);
        this.e = (byte[])arrayList0.get(1);
    }

    public final void f(byte[] arr_b) {
        ArrayList arrayList0 = bnat.k(this.d, arr_b, 3);
        this.d = (byte[])arrayList0.get(0);
        this.c(((byte[])arrayList0.get(1)));
        this.e = (byte[])arrayList0.get(2);
    }

    public static byte[] g(ECPoint eCPoint0) {
        byte[] arr_b = new byte[65];
        arr_b[0] = 4;
        bnat.j(eCPoint0.getAffineX(), arr_b, 1);
        bnat.j(eCPoint0.getAffineY(), arr_b, 33);
        return arr_b;
    }

    public final byte[] h(byte[] arr_b) {
        try {
            Cipher cipher0 = Cipher.getInstance("AES/GCM/NoPadding");
            GCMParameterSpec gCMParameterSpec0 = new GCMParameterSpec(0x80, new byte[12]);
            cipher0.init(1, new SecretKeySpec(this.e, "AES"), gCMParameterSpec0);
            cipher0.updateAAD(this.a);
            byte[] arr_b1 = cipher0.doFinal(arr_b);
            this.c(arr_b1);
            return arr_b1;
        }
        catch(NoSuchAlgorithmException | NoSuchPaddingException | IllegalBlockSizeException | InvalidAlgorithmParameterException | BadPaddingException | InvalidKeyException exception0) {
            throw new AssertionError(exception0);
        }
    }

    private static final byte[] i(byte[] arr_b, byte[] arr_b1, int v) {
        try {
            gfuy.a(arr_b1.length > 0);
            Mac mac0 = Mac.getInstance("HmacSHA256");
            mac0.init(new SecretKeySpec(arr_b1, "HmacSHA256"));
            byte[] arr_b2 = mac0.doFinal(arr_b);
            byte[] arr_b3 = new byte[v];
            byte[] arr_b4 = new byte[0];
            int v2 = 0;
            for(int v1 = 1; v2 < v; v1 = (byte)(v1 + 1)) {
                mac0.init(new SecretKeySpec(arr_b2, "HmacSHA256"));
                mac0.update(arr_b4);
                mac0.update(((byte)v1));
                arr_b4 = mac0.doFinal();
                int v3 = v - v2;
                int v4 = arr_b4.length;
                if(v3 > v4) {
                    v3 = v4;
                }
                System.arraycopy(arr_b4, 0, arr_b3, v2, v3);
                v2 += v3;
            }
            return arr_b3;
        }
        catch(NoSuchAlgorithmException | InvalidKeyException exception0) {
            throw new AssertionError(exception0);
        }
    }

    private static void j(BigInteger bigInteger0, byte[] arr_b, int v) {
        boolean z = true;
        gfuy.a(bigInteger0.signum() >= 0);
        byte[] arr_b1 = bigInteger0.toByteArray();
        int v1 = arr_b1[0] == 0 ? 1 : 0;
        int v2 = arr_b1.length - v1;
        gfuy.a(v2 == 0 || arr_b1[v1] != 0);
        if(v2 > 0x20) {
            z = false;
        }
        gfuy.a(z);
        System.arraycopy(arr_b1, v1, arr_b, v + 0x20 - v2, v2);
    }

    private static final ArrayList k(byte[] arr_b, byte[] arr_b1, int v) {
        byte[] arr_b2 = bnat.i(arr_b1, arr_b, v * 0x20);
        ArrayList arrayList0 = new ArrayList();
        for(int v1 = 0; v1 < v; ++v1) {
            byte[] arr_b3 = new byte[0x20];
            System.arraycopy(arr_b2, v1 * 0x20, arr_b3, 0, 0x20);
            arrayList0.add(arr_b3);
        }
        return arrayList0;
    }
}

