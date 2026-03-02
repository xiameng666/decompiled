import java.io.Serializable;

public final class igcx extends igds implements igdj, Serializable {
    public static final igcx a = null;
    private static final long serialVersionUID = 0x23F7A51CED6L;

    static {
        igcx.a = new igcx(0L);
    }

    public igcx(long v) {
        super(v);
    }

    public final long a() {
        return this.b / 1000L;
    }

    public static igcx b(long v) {
        return v == 0L ? igcx.a : new igcx(v);
    }

    public final igcx c(igdj igdj0) {
        if(igdj0 != null) {
            long v = ((igds)igdj0).b;
            if(v != 0L) {
                long v1 = iggd.c(v, -1);
                return new igcx(iggd.b(this.b, v1));
            }
        }
        return this;
    }

    public static igcx d(long v) {
        return v == 0L ? igcx.a : new igcx(iggd.c(v, 86400000));
    }

    public static igcx e(long v) {
        return new igcx(iggd.c(v, 3600000));
    }

    public static igcx f(long v) {
        return new igcx(iggd.c(v, 60000));
    }

    public static igcx g(long v) {
        return v == 0L ? igcx.a : new igcx(iggd.c(v, 1000));
    }
}

