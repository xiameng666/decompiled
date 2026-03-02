import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class hmnp extends hmnl {
    protected final hmnn b;
    private static final String c = "hmnp";
    private final hmnf d;
    private Cipher e;
    private Cipher f;
    private Cipher g;

    static {
    }

    public hmnp(hmnn hmnn0, hmnf hmnf0) {
        this.b = hmnn0;
        this.d = hmnf0;
    }

    @Override  // hmno
    public final void f(hmnr hmnr0, byte[] arr_b, byte[] arr_b1, byte[] arr_b2, boolean z) {
        try {
            if(z) {
                Cipher cipher0 = this.p(hmnr0, 2);
                cipher0.init(1, this.o(hmnr0));
                byte[] arr_b3 = cipher0.doFinal(arr_b1);
                for(int v = 0; v < arr_b1.length - 8; ++v) {
                    arr_b3[v + 8] = (byte)(arr_b3[v + 8] ^ arr_b1[v]);
                }
                hmnp.r(hmnr0, arr_b1, arr_b);
                hmnp.q(arr_b3, arr_b2);
            }
            else {
                Cipher cipher1 = this.p(hmnr0, 1);
                cipher1.init(2, this.o(hmnr0), new IvParameterSpec(hmnp.s(hmnr0, arr_b)));
                byte[] arr_b4 = cipher1.doFinal(arr_b1);
                hmnp.r(hmnr0, arr_b1, arr_b);
                hmnp.q(arr_b4, arr_b2);
            }
            hmnp.l(hmnr0, arr_b, arr_b1, arr_b2);
        }
        catch(NoSuchAlgorithmException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchPaddingException | BadPaddingException | IllegalBlockSizeException | NoSuchProviderException exception0) {
            this.m(((GeneralSecurityException)exception0).getMessage(), exception0);
        }
    }

    @Override  // hmno
    public final void g(hmnr hmnr0, byte[] arr_b, byte[] arr_b1, byte[] arr_b2, boolean z) {
        try {
            int v = hmnr0.d == 1 ? 16 : 8;
            int v1 = arr_b1.length % v;
            if(v1 != 0) {
                v -= v1;
            }
            else if(!z) {
                v = 0;
            }
            byte[] arr_b3 = new byte[v + arr_b1.length];
            System.arraycopy(arr_b1, 0, arr_b3, 0, arr_b1.length);
            if(z) {
                arr_b3[arr_b1.length] = (byte)0x80;
            }
            Cipher cipher0 = this.p(hmnr0, 1);
            cipher0.init(1, this.o(hmnr0), new IvParameterSpec(hmnp.s(hmnr0, arr_b)));
            byte[] arr_b4 = cipher0.doFinal(arr_b3);
            hmnp.r(hmnr0, arr_b4, arr_b);
            hmnp.q(arr_b4, arr_b2);
            hmnp.l(hmnr0, arr_b, arr_b1, arr_b2);
        }
        catch(NoSuchAlgorithmException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchPaddingException | BadPaddingException | IllegalBlockSizeException exception0) {
            this.m(((GeneralSecurityException)exception0).getMessage(), exception0);
            throw new UnsupportedOperationException("Unexpected error");
        }
        catch(NoSuchProviderException noSuchProviderException0) {
            this.m(noSuchProviderException0.getMessage(), noSuchProviderException0);
        }
    }

    @Override  // hmno
    public final byte[] h(hmnr hmnr0, byte[] arr_b, byte[] arr_b1) {
        byte[] arr_b3;
        byte[] arr_b2;
        int v;
        Cipher cipher0;
        try {
            cipher0 = this.p(hmnr0, 1);
            Key key0 = this.o(hmnr0);
            if(arr_b1 == null) {
                cipher0.init(1, key0);
            }
            else {
                cipher0.init(1, key0, new IvParameterSpec(hmnp.s(hmnr0, arr_b1)));
            }
            v = cipher0.getBlockSize();
            arr_b2 = new byte[v];
            goto label_12;
        }
        catch(InvalidKeyException | InvalidAlgorithmParameterException exception0) {
            this.m(((GeneralSecurityException)exception0).getMessage(), exception0);
            throw new SecurityException(((GeneralSecurityException)exception0).getMessage());
        }
        catch(NoSuchAlgorithmException | NoSuchPaddingException | BadPaddingException | NoSuchProviderException | IllegalBlockSizeException exception1) {
        }
        arr_b2 = null;
        this.m(((GeneralSecurityException)exception1).getMessage(), exception1);
        hmnp.l(hmnr0, arr_b1, arr_b, arr_b2);
        return Arrays.copyOfRange(arr_b2, 0, 4);
        try {
        label_12:
            int v1 = (v - arr_b.length % v) % v;
            if(v1 > 0) {
                arr_b3 = new byte[v1 + arr_b.length];
                System.arraycopy(arr_b, 0, arr_b3, 0, arr_b.length);
            }
            else {
                arr_b3 = arr_b;
            }
            int v2 = 0;
            while(true) {
                if(v2 >= arr_b3.length) {
                    goto label_29;
                }
                int v3 = v2 + v;
                arr_b2 = cipher0.doFinal(hmpy.U(arr_b2, Arrays.copyOfRange(arr_b3, v2, v3)));
                v2 = v3;
            }
        }
        catch(InvalidKeyException | InvalidAlgorithmParameterException exception0) {
            this.m(((GeneralSecurityException)exception0).getMessage(), exception0);
            throw new SecurityException(((GeneralSecurityException)exception0).getMessage());
        }
        catch(NoSuchAlgorithmException | NoSuchPaddingException | BadPaddingException | NoSuchProviderException | IllegalBlockSizeException exception1) {
        }
        this.m(((GeneralSecurityException)exception1).getMessage(), exception1);
    label_29:
        hmnp.l(hmnr0, arr_b1, arr_b, arr_b2);
        return Arrays.copyOfRange(arr_b2, 0, 4);
    }

    @Override  // hmno
    public final byte[] i(hmnr hmnr0, byte[] arr_b, byte[] arr_b1, int v) {
        hmns hmns0;
        try {
            int v1 = hmnr0.d;
            if(v1 == 1) {
                hmns0 = new hmns("AES", 16);
            }
            else {
                switch(v1) {
                    case 2: {
                        hmns0 = new hmns("DESede", 8);
                        break;
                    }
                    case 3: {
                        hmns0 = new hmns("DESede", 8);
                        break;
                    }
                    default: {
                        throw new UnsupportedOperationException("Keytype not set");
                    }
                }
            }
            hmns0.a(this.o(hmnr0), new IvParameterSpec(hmnp.s(hmnr0, arr_b1)));
            hmns0.j.write(arr_b, 0, arr_b.length);
            Cipher cipher0 = hmns0.e;
            int v2 = cipher0.getBlockSize();
            int v3 = hmns0.j.size() % v2;
            boolean z = hmns0.j.size() == 0;
            if(!z && v3 == 0) {
                v3 = 0;
            }
            else {
                hmns0.j.write(hmns.d, 0, v2 - v3);
            }
            byte[] arr_b2 = new byte[v2];
            byte[] arr_b3 = hmns0.j.toByteArray();
            int v4 = arr_b3.length - v2;
            System.arraycopy(arr_b3, v4, arr_b2, 0, v2);
            System.arraycopy((z || v3 != 0 ? hmpy.U(arr_b2, hmns0.h) : hmpy.U(arr_b2, hmns0.g)), 0, arr_b3, v4, v2);
            byte[] arr_b4 = cipher0.doFinal(arr_b3, 0, arr_b3.length);
            byte[] arr_b5 = new byte[v2];
            System.arraycopy(arr_b4, arr_b4.length - v2, arr_b5, 0, v2);
            hmns0.a(hmns0.i, new IvParameterSpec(arr_b5));
            byte[] arr_b6 = new byte[hmns0.f];
            System.arraycopy(arr_b5, 0, arr_b6, 0, hmns0.f);
            hmnp.r(hmnr0, ((byte[])((IvParameterSpec)cipher0.getParameters().getParameterSpec(IvParameterSpec.class)).getIV().clone()), arr_b1);
            switch(v - 1) {
                case 1: {
                    byte[] arr_b7 = new byte[hmnr0.a() >> 1];
                    for(int v5 = 0; v5 < hmnr0.a() >> 1; ++v5) {
                        arr_b7[v5] = arr_b6[v5 + v5 + 1];
                    }
                    hmnp.l(hmnr0, arr_b1, arr_b, arr_b7);
                    return arr_b7;
                }
                case 2: {
                    byte[] arr_b8 = Arrays.copyOf(arr_b6, 8);
                    hmnp.l(hmnr0, arr_b1, arr_b, arr_b8);
                    return arr_b8;
                }
                default: {
                    hmnp.l(hmnr0, arr_b1, arr_b, arr_b6);
                    return arr_b6;
                }
            }
        }
        catch(GeneralSecurityException generalSecurityException0) {
            this.m(generalSecurityException0.getMessage(), generalSecurityException0);
            return new byte[0];
        }
    }

    @Override  // hmno
    public final boolean j(String s, String s1) {
        return s == null || s1 == null ? false : s.equals(s1);
    }

    protected static final SecretKeySpec k(hmnr hmnr0) {
        switch(hmnr0.d) {
            case 1: {
                return new SecretKeySpec(Arrays.copyOfRange(hmnr0.c(), 0, 16), "AES");
            }
            case 2: {
                byte[] arr_b = hmnr0.c();
                byte[] arr_b1 = new byte[24];
                if(arr_b.length < 24) {
                    if(arr_b.length == 8) {
                        System.arraycopy(arr_b, 0, arr_b1, 0, 8);
                        System.arraycopy(arr_b, 0, arr_b1, 8, 8);
                    }
                    else {
                        System.arraycopy(arr_b, 0, arr_b1, 0, 16);
                    }
                    System.arraycopy(arr_b, 0, arr_b1, 16, 8);
                    arr_b = arr_b1;
                }
                return new SecretKeySpec(arr_b, "DESede");
            }
            case 3: {
                return new SecretKeySpec(hmnr0.c(), "DESede");
            }
            default: {
                throw new InvalidAlgorithmParameterException();
            }
        }
    }

    protected static final void l(hmnr hmnr0, byte[] arr_b, byte[] arr_b1, byte[] arr_b2) {
        hmpy.C(arr_b);
        hmpy.C(arr_b1);
        hmpy.C(arr_b2);
    }

    protected final void m(String s, Exception exception0) {
        this.d.a(s, exception0);
    }

    private final Cipher n() {
        Cipher cipher0 = this.f;
        if(cipher0 != null) {
            return cipher0;
        }
        Cipher cipher1 = Cipher.getInstance("DESede/CBC/NoPadding");
        this.f = cipher1;
        return cipher1;
    }

    private final Key o(hmnr hmnr0) {
        boolean z;
        hmnm hmnm0 = this.b.a(hmnr0.c);
        if(hmnm0 == null) {
            return hmnr0.c() == null ? null : hmnp.k(hmnr0);
        }
        Key key0 = hmnm0.a();
        if(key0 != null) {
            int v = hmnr0.d;
            if(v == 1) {
                z = "AES".equalsIgnoreCase(key0.getAlgorithm());
                goto label_13;
            }
            else if(v == 2 || v == 3) {
                z = "DESede".equalsIgnoreCase(key0.getAlgorithm());
            label_13:
                if(!z) {
                    throw new InvalidAlgorithmParameterException("Invalid algorithm in MifareKey :" + hmnq.a(hmnr0.d));
                }
            }
            return key0;
        }
        return hmnr0.c() == null ? null : hmnp.k(hmnr0);
    }

    private final Cipher p(hmnr hmnr0, int v) {
        int v1 = hmnr0.d;
        if(v1 == 1) {
            Cipher cipher0 = this.e;
            if(cipher0 != null) {
                return cipher0;
            }
            Cipher cipher1 = Cipher.getInstance("AES/CBC/NoPadding");
            this.e = cipher1;
            return cipher1;
        }
        switch(v1) {
            case 2: {
                if(v != 1) {
                    Cipher cipher2 = this.g;
                    if(cipher2 != null) {
                        return cipher2;
                    }
                    Cipher cipher3 = Cipher.getInstance("DESede/ECB/NoPadding");
                    this.g = cipher3;
                    return cipher3;
                }
                return this.n();
            }
            case 3: {
                return this.n();
            }
            default: {
                throw new InvalidAlgorithmParameterException("MifareKey type not supported: " + hmnq.a(hmnr0.d));
            }
        }
    }

    private static final void q(byte[] arr_b, byte[] arr_b1) {
        if(arr_b == null) {
            throw new IllegalArgumentException("in or out byte[] is null");
        }
        if(arr_b.length != arr_b1.length) {
            throw new IllegalArgumentException(a.z(arr_b1.length, arr_b.length, "Length on in and out array are different. in.length: ", " out.length: "));
        }
        System.arraycopy(arr_b, 0, arr_b1, 0, arr_b.length);
    }

    private static final void r(hmnr hmnr0, byte[] arr_b, byte[] arr_b1) {
        if(arr_b == null || arr_b1 == null) {
            throw new IllegalArgumentException();
        }
        if(hmnr0.d != 2 && hmnr0.d != 3) {
            System.arraycopy(arr_b, arr_b.length - 16, arr_b1, 0, 16);
            return;
        }
        System.arraycopy(arr_b, arr_b.length - 8, arr_b1, 0, 8);
    }

    private static final byte[] s(hmnr hmnr0, byte[] arr_b) {
        return hmnr0.d == 2 || hmnr0.d == 3 ? Arrays.copyOfRange(arr_b, 0, 8) : arr_b;
    }
}

