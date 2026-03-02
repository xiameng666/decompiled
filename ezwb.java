import java.util.ArrayList;
import java.util.Arrays;

public final class ezwb {
    public final int a;
    public final long b;
    public final boolean c;

    public ezwb(int v, long v1) {
        this(v, v1, false);
    }

    public ezwb(int v, long v1, boolean z) {
        this.a = v;
        this.b = v1;
        this.c = z;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof ezwb) ? this.a == ((ezwb)object0).a && this.b == ((ezwb)object0).b && this.c == ((ezwb)object0).c : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((int)this.a), ((long)this.b), Boolean.valueOf(this.c)});
    }

    @Override
    public final String toString() {
        ArrayList arrayList0 = new ArrayList();
        basz.b("status", Integer.valueOf(this.a), arrayList0);
        basz.b("delayMillis", Long.valueOf(this.b), arrayList0);
        basz.b("exact", Boolean.valueOf(this.c), arrayList0);
        return basz.a(arrayList0, this);
    }
}

