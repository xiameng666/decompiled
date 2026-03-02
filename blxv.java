import j..util.Objects;
import java.util.List;

public final class blxv extends blxu {
    public final List a;

    public blxv(Long long0, List list0) {
        super(2, long0);
        this.a = list0;
    }

    @Override  // blxu
    public final ByteString a() {
        return this.a.isEmpty() ? null : ((blxx)this.a.get(0)).b;
    }

    @Override  // blxu
    public final boolean equals(Object object0) {
        return (object0 instanceof blxv) ? Objects.equals(this.a, ((blxv)object0).a) : false;
    }

    @Override  // blxu
    public final int hashCode() {
        return this.c == null ? (this.d + 0x1F) * 0x1F * 0x1F + this.a.hashCode() : ((this.d + 0x1F) * 0x1F + this.c.hashCode()) * 0x1F + this.a.hashCode();
    }

    @Override
    public final String toString() {
        return String.format("{requestType: %s, timeoutMillis: %s, challenges: %s}", blxt.a(this.d), String.valueOf(this.c), blxu.b(this.a));
    }
}

