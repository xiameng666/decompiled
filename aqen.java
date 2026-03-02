import java.util.List;

public final class aqen {
    public final String a;
    public final int b;
    public final List c;

    public aqen() {
        throw null;
    }

    public aqen(String s, int v, List list0) {
        if(s == null) {
            throw new NullPointerException("Null key");
        }
        this.a = s;
        this.b = v;
        if(list0 == null) {
            throw new NullPointerException("Null value");
        }
        this.c = list0;
    }

    public static aqen a(String s, int v, byte[] arr_b) {
        return new aqen(s, v, gged_interceptors.i(glwl.c(arr_b)));
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof aqen) && this.a.equals(((aqen)object0).a) && this.b == ((aqen)object0).b && this.c.equals(((aqen)object0).c);
    }

    @Override
    public final int hashCode() {
        return (this.b ^ (this.a.hashCode() ^ 1000003) * 1000003) * 1000003 ^ this.c.hashCode();
    }

    @Override
    public final String toString() {
        return "BackupKeyValueEntry{key=" + this.a + ", valueLength=" + this.b + ", value=" + this.c.toString() + "}";
    }
}

