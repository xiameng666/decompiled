import java.util.List;

public final class blxs extends blxu {
    public final List a;
    public final List b;

    public blxs(Long long0, List list0, List list1) {
        super(1, long0);
        this.a = list0;
        gftb.checkTrue(((boolean)(list0.isEmpty() ^ 1)));
        gftb.check(list1);
        this.b = list1;
    }

    @Override  // blxu
    public final ByteString a() {
        return ((blxw)this.a.get(0)).b;
    }

    @Override  // blxu
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof blxs)) {
            return false;
        }
        return this.a.equals(((blxs)object0).a) ? this.b.equals(((blxs)object0).b) : false;
    }

    @Override  // blxu
    public final int hashCode() {
        return (this.a.hashCode() + 0x1F) * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return String.format("{requestType: %s, timeoutMillis: %s, challenges: %s, registeredKeys: %s}", blxt.a(this.d), String.valueOf(this.c), blxu.b(this.a), blxu.b(this.b));
    }
}

