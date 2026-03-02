import java.util.function.Consumer;

public final class dujy {
    public final boolean a;
    public final gtyc b;
    public final Consumer c;

    public dujy(boolean z, gtyc gtyc0, Consumer consumer0) {
        ibuq.f(gtyc0, "validityInfo");
        super();
        this.a = z;
        this.b = gtyc0;
        this.c = consumer0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof dujy)) {
            return false;
        }
        if(this.a != ((dujy)object0).a) {
            return false;
        }
        return ibuq.m(this.b, ((dujy)object0).b) ? ibuq.m(this.c, ((dujy)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        int v;
        gtyc gtyc0 = this.b;
        if(((ProtoLiteMessage)gtyc0).isImmutable()) {
            v = ((ProtoLiteMessage)gtyc0).s();
        }
        else {
            int v1 = gtyc0.memoizedHashCode;
            if(v1 == 0) {
                v1 = ((ProtoLiteMessage)gtyc0).s();
                gtyc0.memoizedHashCode = v1;
            }
            v = v1;
        }
        int v2 = this.a ? 0x4CF : 0x4D5;
        return this.c == null ? (v2 * 0x1F + v) * 0x1F : (v2 * 0x1F + v) * 0x1F + this.c.hashCode();
    }

    @Override
    public final String toString() {
        return "MsoDropDownState(expanded=" + this.a + ", validityInfo=" + this.b + ", onExpandedChange=" + this.c + ")";
    }
}

