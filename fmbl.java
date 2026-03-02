import j..time.Instant;
import java.io.Serializable;
import java.security.KeyPair;

public final class fmbl implements Serializable {
    public static final String a = "fmbl";
    public final gged_interceptors b;
    public final Instant c;
    public final Instant d;
    private final fmbk e;

    static {
    }

    public fmbl() {
        throw null;
    }

    public fmbl(gged_interceptors gged0, Instant instant0, Instant instant1, fmbk fmbk0) {
        this.b = gged0;
        this.c = instant0;
        this.d = instant1;
        this.e = fmbk0;
    }

    public static fmbj a() {
        fmbj fmbj0 = new fmbj();
        fmbj0.a = fmce.a;
        return fmbj0;
    }

    public final KeyPair b() {
        return this.e.a();
    }

    public final int c() {
        return this.e.b();
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof fmbl) && ggia.i(this.b, ((fmbl)object0).b) && this.c.equals(((fmbl)object0).c) && this.d.equals(((fmbl)object0).d) && this.e.equals(((fmbl)object0).e);
    }

    @Override
    public final int hashCode() {
        return this.e.hashCode() ^ (((this.b.hashCode() ^ 1000003) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode()) * 1000003;
    }

    @Override
    public final String toString() {
        return "AuthToken{tachyonToken=" + this.b + ", expireAt=" + this.c + ", refreshedAt=" + this.d + ", oneOfId=" + this.e + "}";
    }
}

