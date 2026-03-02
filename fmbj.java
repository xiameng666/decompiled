import j..time.Instant;
import j..util.Objects;
import java.security.KeyPair;

public final class fmbj {
    public fmbk a;
    private gged_interceptors b;
    private Instant c;
    private Instant d;

    public final fmbl a() {
        if(this.b != null && this.c != null && this.d != null && this.a != null) {
            return new fmbl(this.b, this.c, this.d, this.a);
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.b == null) {
            stringBuilder0.append(" tachyonToken");
        }
        if(this.c == null) {
            stringBuilder0.append(" expireAt");
        }
        if(this.d == null) {
            stringBuilder0.append(" refreshedAt");
        }
        if(this.a == null) {
            stringBuilder0.append(" oneOfId");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    public final void b(Instant instant0) {
        if(instant0 == null) {
            throw new NullPointerException("Null expireAt");
        }
        this.c = instant0;
    }

    public final void c(Instant instant0) {
        if(instant0 == null) {
            throw new NullPointerException("Null refreshedAt");
        }
        this.d = instant0;
    }

    public final void d(gged_interceptors gged0) {
        if(gged0 == null) {
            throw new NullPointerException("Null tachyonToken");
        }
        this.b = gged0;
    }

    public final void e(KeyPair keyPair0) {
        Objects.requireNonNull(keyPair0);
        this.a = new fmcd(keyPair0);
    }

    public final void f(long v) {
        this.b(glxs.b(v));
    }

    public final void g(long v) {
        this.c(Instant.ofEpochMilli(v));
    }
}

