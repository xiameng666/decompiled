import java.util.Arrays;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public final class quk {
    public byte[] a;
    public final byte[] b;
    public final byte[] c;
    public final SecretKey d;
    public final SecretKey e;
    public final byte[] f;
    public final SecretKey g;
    public static final int h;
    private static final byte[] i;
    private static final SecretKeySpec j;
    private final String k;
    private final int l;
    private final Integer m;

    static {
        byte[] arr_b = "0000-0000-0000".getBytes(ibyo.a);
        ibuq.e(arr_b, "getBytes(...)");
        quk.i = arr_b;
        quk.j = new SecretKeySpec(arr_b, 0, arr_b.length, "AES");
    }

    public quk() {
        this(null);
    }

    public quk(String s, int v, byte[] arr_b, byte[] arr_b1, byte[] arr_b2, SecretKey secretKey0, SecretKey secretKey1, byte[] arr_b3, SecretKey secretKey2) {
        ibuq.f(arr_b1, "credentialData");
        ibuq.f(secretKey0, "credentialKey");
        super();
        this.k = s;
        this.l = v;
        this.m = null;
        this.a = arr_b;
        this.b = arr_b1;
        this.c = arr_b2;
        this.d = secretKey0;
        this.e = secretKey1;
        this.f = arr_b3;
        this.g = secretKey2;
    }

    public quk(byte[] arr_b) {
        this(null, 1, null, new byte[0], new byte[0], quk.j, null, null, null);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!ibuq.m(this.getClass(), (object0 == null ? null : object0.getClass()))) {
            return false;
        }
        ibuq.d(object0, "null cannot be cast to non-null type com.allegion.hceapplet.data.CredentialPayload");
        if(!ibuq.m(this.k, ((quk)object0).k)) {
            return false;
        }
        if(this.l != ((quk)object0).l) {
            return false;
        }
        if(!ibuq.m(null, null)) {
            return false;
        }
        byte[] arr_b = this.a;
        if(arr_b != null) {
            byte[] arr_b1 = ((quk)object0).a;
            if(arr_b1 == null) {
                return false;
            }
            if(!Arrays.equals(arr_b, arr_b1)) {
                return false;
            }
        }
        else if(((quk)object0).a != null) {
            return false;
        }
        if(!Arrays.equals(this.b, ((quk)object0).b)) {
            return false;
        }
        if(!Arrays.equals(this.c, ((quk)object0).c)) {
            return false;
        }
        if(!ibuq.m(this.d, ((quk)object0).d)) {
            return false;
        }
        if(!ibuq.m(this.e, ((quk)object0).e)) {
            return false;
        }
        return ibuq.m(this.g, ((quk)object0).g) ? Arrays.equals(this.f, ((quk)object0).f) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : Arrays.hashCode(this.a);
        int v2 = (this.k == null ? 0 : this.k.hashCode()) + this.l + v1 + Arrays.hashCode(this.b) + Arrays.hashCode(this.c) + this.d.hashCode();
        int v3 = this.e == null ? 0 : this.e.hashCode();
        SecretKey secretKey0 = this.g;
        if(secretKey0 != null) {
            v = secretKey0.hashCode();
        }
        return v2 + v3 + v + Arrays.hashCode(this.f);
    }

    @Override
    public final String toString() {
        String s = Arrays.toString(this.a);
        String s1 = Arrays.toString(this.b);
        String s2 = Arrays.toString(this.c);
        String s3 = Arrays.toString(this.f);
        return "CredentialPayload(versionValue=" + this.k + ", versionMajor=" + this.l + ", versionMinor=null, noTourData=" + s + ", credentialData=" + s1 + ", credentialKeyInput=" + s2 + ", credentialKey=" + this.d + ", privacyKey=" + this.e + ", noTourKeyInput=" + s3 + ", noTourKey=" + this.g + ")";
    }
}

