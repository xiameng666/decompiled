import j..util.concurrent.ConcurrentHashMap;

public final class iget extends igec {
    public static final iget I = null;
    private static final ConcurrentHashMap J = null;
    private static final long serialVersionUID = 0xF40BAA8C7E176BC6L;

    static {
        iget.J = new ConcurrentHashMap();
        iget.I = iget.as(igcw.b);
    }

    private iget(igcm igcm0, int v) {
        super(igcm0, v);
    }

    @Override  // igdz
    protected final void P(igdu igdu0) {
        if(this.a == null) {
            super.P(igdu0);
        }
    }

    @Override  // igdz
    public final int W() {
        return 0x116BD2D1;
    }

    @Override  // igdz
    public final int Y() {
        return -292275054;
    }

    @Override  // igdz
    public final long af(int v) {
        if(v < 0) {
            return (((long)v) * 365L + ((long)((v + 3 >> 2) - v / 100 + (v / 100 + 3 >> 2) - 0xAFAA8))) * 86400000L;
        }
        int v1 = (v / 100 >> 2) + ((v >> 2) - v / 100);
        return this.ar(v) ? (((long)v) * 365L + ((long)(v1 - 0xAFAA8))) * 86400000L : (((long)v) * 365L + ((long)(v1 - 0xAFAA7))) * 86400000L;
    }

    @Override  // igdz
    public final long ag() {
        return 31083597720000L;
    }

    @Override  // igdz
    public final long ah() {
        return 2629746000L;
    }

    @Override  // igdz
    public final long ai() {
        return 0x758F0DFC0L;
    }

    @Override  // igdz
    public final long aj() {
        return 15778476000L;
    }

    @Override  // igdz
    public final boolean ar(int v) {
        return (v & 3) == 0 ? v % 100 != 0 || v % 400 == 0 : false;
    }

    public static iget as(igcw igcw0) {
        return iget.at(igcw0, 4);
    }

    public static iget at(igcw igcw0, int v) {
        iget iget1;
        iget iget0;
        if(igcw0 == null) {
            igcw0 = igcw.o();
        }
        ConcurrentHashMap concurrentHashMap0 = iget.J;
        iget[] arr_iget = (iget[])concurrentHashMap0.get(igcw0);
        if(arr_iget == null) {
            arr_iget = new iget[7];
            iget[] arr_iget1 = (iget[])concurrentHashMap0.putIfAbsent(igcw0, arr_iget);
            if(arr_iget1 != null) {
                arr_iget = arr_iget1;
            }
        }
        try {
            iget0 = arr_iget[v - 1];
        }
        catch(ArrayIndexOutOfBoundsException unused_ex) {
            throw new IllegalArgumentException("Invalid min days in first week: " + v);
        }
        if(iget0 == null) {
            synchronized(arr_iget) {
                iget1 = arr_iget[v - 1];
                if(iget1 == null) {
                    iget1 = igcw0 == igcw.b ? new iget(null, v) : new iget(igfe.Q(iget.at(igcw.b, v), igcw0), v);
                    arr_iget[v - 1] = iget1;
                }
            }
            return iget1;
        }
        return iget0;
    }

    @Override  // igcm
    public final igcm c() {
        return iget.I;
    }

    @Override  // igcm
    public final igcm d(igcw igcw0) {
        if(igcw0 == null) {
            igcw0 = igcw.o();
        }
        return igcw0 == this.B() ? this : iget.as(igcw0);
    }

    private Object readResolve() {
        int v = this.H == 0 ? 4 : this.H;
        return this.a == null ? iget.at(igcw.b, v) : iget.at(this.a.B(), v);
    }
}

