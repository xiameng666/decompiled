import java.util.Arrays;
import java.util.List;

public final class bxwt {
    public final byte[] a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Long f;
    public final Long g;
    public final List h;

    public bxwt(byte[] arr_b, String s, String s1, String s2, String s3, Long long0, Long long1, List list0) {
        ibuq.f(arr_b, "id");
        ibuq.f(s, "signonRealm");
        ibuq.f(s1, "origin");
        ibuq.f(s3, "password");
        super();
        this.a = arr_b;
        this.b = s;
        this.c = s1;
        this.d = s2;
        this.e = s3;
        this.f = long0;
        this.g = long1;
        this.h = list0;
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
        return "Password(id=" + Arrays.toString(this.a) + ", signonRealm=" + this.b + ", origin=" + this.c + ", username=" + this.d + ", password=" + this.e + ", dateCreated=" + this.f + ", dateModified=" + this.g + ", notes=" + this.h + ")";
    }
}

