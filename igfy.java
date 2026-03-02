import java.io.Serializable;

public abstract class igfy extends igcy implements Serializable {
    public final igda d;
    private static final long serialVersionUID = 0xDC8D7F9B8CDA387EL;

    protected igfy(igda igda0) {
        this.d = igda0;
    }

    @Override
    public final int compareTo(Object object0) {
        long v = ((igcy)object0).c();
        int v1 = Long.compare(this.c(), v);
        if(v1 == 0) {
            return 0;
        }
        return v1 >= 0 ? 1 : -1;
    }

    @Override  // igcy
    public final igda e() {
        return this.d;
    }

    @Override  // igcy
    public final boolean g() {
        return true;
    }

    @Override
    public final String toString() {
        return "DurationField[" + this.d.m + "]";
    }
}

