import java.util.Arrays;

public final class bxws {
    public final byte[] a;
    public final byte[] b;
    public final String c;
    public final byte[] d;
    public final String e;
    public final String f;
    public final Long g;
    public final byte[] h;
    public final byte[] i;
    public final byte[] j;
    public final byte[] k;
    public final Long l;
    public final Boolean m;

    public bxws(byte[] arr_b, byte[] arr_b1, String s, byte[] arr_b2, String s1, String s2, Long long0, byte[] arr_b3, byte[] arr_b4, byte[] arr_b5, byte[] arr_b6, Long long1, Boolean boolean0) {
        ibuq.f(arr_b, "id");
        ibuq.f(arr_b1, "credentialId");
        ibuq.f(s, "rpId");
        ibuq.f(arr_b2, "userHandle");
        ibuq.f(s1, "userName");
        ibuq.f(s2, "userDisplayName");
        ibuq.f(arr_b3, "keyMaterial");
        super();
        this.a = arr_b;
        this.b = arr_b1;
        this.c = s;
        this.d = arr_b2;
        this.e = s1;
        this.f = s2;
        this.g = long0;
        this.h = arr_b3;
        this.i = arr_b4;
        this.j = arr_b5;
        this.k = arr_b6;
        this.l = long1;
        this.m = boolean0;
    }

    @Override
    public final boolean equals(Object object0) {
        return idoq.c(this, object0, new String[0]);
    }

    @Override
    public final int hashCode() {
        return idou.a(this, new String[0]);
    }

    @Override
    public final String toString() {
        String s = Arrays.toString(this.a);
        String s1 = Arrays.toString(this.b);
        String s2 = Arrays.toString(this.d);
        String s3 = Arrays.toString(this.h);
        String s4 = Arrays.toString(this.i);
        String s5 = Arrays.toString(this.j);
        String s6 = Arrays.toString(this.k);
        return "Passkey(id=" + s + ", credentialId=" + s1 + ", rpId=" + this.c + ", userHandle=" + s2 + ", userName=" + this.e + ", userDisplayName=" + this.f + ", creationTime=" + this.g + ", keyMaterial=" + s3 + ", hmacSecret=" + s4 + ", credBlob=" + s5 + ", largeBlob=" + s6 + ", largeBlobUncompressedSize=" + this.l + ", thirdPartyPaymentsSupport=" + this.m + ")";
    }
}

