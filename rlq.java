import android.os.PersistableBundle;

public final class rlq implements rlr {
    private final roo b;
    private final String c;

    public rlq(roo roo0, String s) {
        this.b = roo0;
        this.c = s;
    }

    @Override  // scz
    public final PersistableBundle a() {
        return rln.a(this);
    }

    @Override  // rlr
    public final roo b() {
        return this.b;
    }

    @Override  // rlr
    public final String c() {
        return this.c;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof rlq)) {
            return false;
        }
        return ibuq.m(this.b, ((rlq)object0).b) ? ibuq.m(this.c, ((rlq)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() * 0x1F + this.c.hashCode();
    }

    @Override
    public final String toString() {
        return "Remote(node=" + this.b + ", qualifiedName=" + this.c + ")";
    }
}

