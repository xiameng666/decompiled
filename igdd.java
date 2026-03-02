import java.io.Serializable;

public final class igdd extends igdp implements igdk, Serializable {
    public static final igdd a = null;
    public final long b;
    private static final long serialVersionUID = 0x2DC8BED0C60E9CCDL;

    static {
        igdd.a = new igdd(0L);
    }

    public igdd() {
        this.b = igct.a();
    }

    public igdd(long v) {
        this.b = v;
    }

    public final igdd c(igdj igdj0) {
        return this.d(igdj0, -1);
    }

    public final igdd d(igdj igdj0, int v) {
        if(igdj0 != null && v != 0) {
            long v1 = ((igds)igdj0).b;
            int v2 = Long.compare(v1, 0L);
            if(v2 != 0 && v != 0) {
                long v3 = v2 == 0 || v == 0 ? this.b : iggd.b(this.b, iggd.c(v1, v));
                return v3 == this.b ? this : new igdd(v3);
            }
        }
        return this;
    }

    @Override  // igdk
    public final long oT() {
        return this.b;
    }

    @Override  // igdk
    public final igcm oU() {
        return igev.F;
    }
}

