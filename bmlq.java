import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public final class bmlq {
    public final String a;
    public final byte[] b;
    public final byte[] c;
    public final ECPublicKey d;
    public final String e;
    public final gfsx f;
    public final gfsx g;
    private static final hhrn h;
    private static final hhrn i;
    private static final hhrn j;
    private static final hhrn k;
    private static final hhrn l;
    private static final hhrn m;
    private static final hhrn n;

    static {
        bmlq.h = new hhrn(1L);
        bmlq.i = new hhrn(2L);
        bmlq.j = new hhrn(3L);
        bmlq.k = new hhrn(4L);
        bmlq.l = new hhrn(5L);
        bmlq.m = new hhrn(6L);
        bmlq.n = new hhrn(999L);
    }

    public bmlq(String s, byte[] arr_b, byte[] arr_b1, ECPublicKey eCPublicKey0, String s1, gfsx gfsx0, gfsx gfsx1) {
        this.a = s;
        this.b = arr_b;
        this.c = arr_b1;
        this.d = eCPublicKey0;
        this.e = s1;
        this.f = gfsx0;
        this.g = gfsx1;
    }

    public static bmln a() {
        byte[] arr_b = new byte[0x20];
        new SecureRandom().nextBytes(arr_b);
        return new bmln(arr_b, bnar.a());
    }

    public static bmlq b(byte[] arr_b, String s, ECPrivateKey eCPrivateKey0, byte[] arr_b1) {
        String s2;
        ECPublicKey eCPublicKey0;
        ggfz ggfz0;
        try {
            ggfz0 = hhrs.q(arr_b).m().a;
        }
        catch(hhrr | hhrl exception0) {
            throw new bmlp("Link data is not a CBOR map", exception0);
        }
        String s1 = new String(bmlq.g(ggfz0, bmlq.h), StandardCharsets.UTF_8);
        byte[] arr_b2 = bmlq.g(ggfz0, bmlq.i);
        byte[] arr_b3 = bmlq.g(ggfz0, bmlq.j);
        try {
            eCPublicKey0 = bnar.b(bmlq.g(ggfz0, bmlq.k));
        }
        catch(InvalidAlgorithmParameterException invalidAlgorithmParameterException0) {
            throw new bmlp(invalidAlgorithmParameterException0);
        }
        hhrn hhrn0 = bmlq.l;
        if(!ggfz0.containsKey(hhrn0)) {
            throw new bmlp("Key does not exist in the link data: " + hhrn0.toString());
        }
        try {
            s2 = ((hhrs)ggfz0.get(hhrn0)).p().a;
        }
        catch(hhrr hhrr0) {
            throw new bmlp("Invalid data type from the link data", hhrr0);
        }
        byte[] arr_b4 = bmlq.g(ggfz0, bmlq.m);
        if(Arrays.equals(arr_b4, bmlq.d(eCPrivateKey0, eCPublicKey0, arr_b1))) {
            return new bmlq(s1, arr_b2, arr_b3, eCPublicKey0, s2, gfsx.m(arr_b4), gfsx.m(s));
        }
        throw new bmlp("Link signature verification failed");
    }

    public final hhrp c() {
        byte[] arr_b = bmlq.f(this.d);
        ggdy ggdy0 = new ggdy();
        hhrk hhrk0 = hhrs.k(this.a.getBytes(StandardCharsets.UTF_8));
        ggdy0.i(new hhro(bmlq.h, hhrk0));
        hhrk hhrk1 = hhrs.k(this.b);
        ggdy0.i(new hhro(bmlq.i, hhrk1));
        hhrk hhrk2 = hhrs.k(this.c);
        ggdy0.i(new hhro(bmlq.j, hhrk2));
        hhrk hhrk3 = hhrs.k(arr_b);
        ggdy0.i(new hhro(bmlq.k, hhrk3));
        hhrq hhrq0 = new hhrq(this.e);
        ggdy0.i(new hhro(bmlq.l, hhrq0));
        hhrj hhrj0 = new hhrj(true);
        ggdy0.i(new hhro(bmlq.n, hhrj0));
        gfsx gfsx0 = this.f;
        if(gfsx0.i()) {
            hhrk hhrk4 = hhrs.k(((byte[])gfsx0.d()));
            ggdy0.i(new hhro(bmlq.m, hhrk4));
        }
        gged_interceptors gged0 = ggdy0.h();
        try {
            return hhrs.n(gged0);
        }
        catch(hhrh hhrh0) {
            throw new bmlp("Building link data to CBOR map failed", hhrh0);
        }
    }

    public static byte[] d(ECPrivateKey eCPrivateKey0, ECPublicKey eCPublicKey0, byte[] arr_b) {
        byte[] arr_b1 = bnar.c(eCPrivateKey0, eCPublicKey0);
        if(arr_b1.length == 0x20) {
            try {
                Mac mac0 = Mac.getInstance("HmacSHA256");
                mac0.init(new SecretKeySpec(arr_b1, 0, 0x20, "HmacSHA256"));
                mac0.update(arr_b, 0, arr_b.length);
                return mac0.doFinal();
            }
            catch(NoSuchAlgorithmException | InvalidKeyException exception0) {
                throw new bmlp("Paring signature generated failed", exception0);
            }
        }
        throw new bmlp("Shared key generation failed");
    }

    public static byte[] e(byte[] arr_b, byte[] arr_b1, byte[] arr_b2) {
        return bmlg.h(bmlg.h(arr_b, arr_b1, bmlc.f, 0x20), arr_b2, bmlc.d, 0x20);
    }

    static byte[] f(ECPublicKey eCPublicKey0) {
        byte[] arr_b = eCPublicKey0.getEncoded();
        return Arrays.copyOfRange(arr_b, arr_b.length - 65, arr_b.length);
    }

    private static byte[] g(ggfz ggfz0, hhrn hhrn0) {
        if(ggfz0.containsKey(hhrn0)) {
            try {
                return ((hhrs)ggfz0.get(hhrn0)).j().d();
            }
            catch(hhrr hhrr0) {
                throw new bmlp("Invalid data type from the link data", hhrr0);
            }
        }
        throw new bmlp("Key does not exist in the link data: " + hhrn0.toString());
    }
}

