import java.io.Serializable;

public final class iggg extends igcy implements Serializable {
    public static final igcy a = null;
    private static final long serialVersionUID = 0x24DE85B89B81F517L;

    static {
        iggg.a = new iggg();
    }

    @Override  // igcy
    public final long a(long v, int v1) {
        return iggd.b(v, v1);
    }

    @Override  // igcy
    public final long b(long v, long v1) {
        return iggd.b(v, v1);
    }

    @Override  // igcy
    public final long c() {
        return 1L;
    }

    @Override
    public final int compareTo(Object object0) {
        int v = Long.compare(((igcy)object0).c(), 1L);
        if(v == 0) {
            return 0;
        }
        return v <= 0 ? 1 : -1;
    }

    @Override  // igcy
    public final igda e() {
        return igda.l;
    }

    @Override
    public final boolean equals(Object object0) {
        if((object0 instanceof iggg)) {
            iggg iggg0 = (iggg)object0;
            return true;
        }
        return false;
    }

    @Override  // igcy
    public final boolean f() {
        return true;
    }

    @Override  // igcy
    public final boolean g() {
        return true;
    }

    @Override
    public final int hashCode() {
        return 1;
    }

    private Object readResolve() {
        return iggg.a;
    }

    @Override
    public final String toString() {
        return "DurationField[millis]";
    }
}

