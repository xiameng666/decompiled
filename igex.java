import j..util.concurrent.ConcurrentHashMap;

public final class igex extends igec {
    private static final igex I = null;
    private static final ConcurrentHashMap J = null;
    private static final long serialVersionUID = 0x86D51DD032A2EC61L;

    static {
        igex.J = new ConcurrentHashMap();
        igex.I = igex.as(igcw.b);
    }

    public igex(igcm igcm0, int v) {
        super(igcm0, v);
    }

    @Override  // igdz
    protected final void P(igdu igdu0) {
        if(this.a == null) {
            super.P(igdu0);
            igdu0.E = new iggn(this, igdu0.E);
            igdu0.B = new iggn(this, igdu0.B);
        }
    }

    @Override  // igdz
    public final int W() {
        return 0x116BBB60;
    }

    @Override  // igdz
    public final int Y() {
        return 0xEE945402;
    }

    @Override  // igdz
    public final long af(int v) {
        if(v - 0x7B0 <= 0) {
            return (((long)(v - 0x7B0)) * 365L + ((long)(v - 0x7AD >> 2))) * 86400000L - 62035200000L;
        }
        int v1 = v - 0x7B0 >> 2;
        return this.ar(v) ? (((long)(v - 0x7B0)) * 365L + ((long)v1)) * 86400000L - 62035200000L : (((long)(v - 0x7B0)) * 365L + ((long)(v1 + 1))) * 86400000L - 62035200000L;
    }

    @Override  // igdz
    public final long ag() {
        return 31083663600000L;
    }

    @Override  // igdz
    public final long ah() {
        return 2629800000L;
    }

    @Override  // igdz
    public final long ai() {
        return 31557600000L;
    }

    @Override  // igdz
    public final long aj() {
        return 15778800000L;
    }

    @Override  // igdz
    public final long ak(int v, int v1, int v2) {
        if(v <= 0) {
            if(v != 0) {
                return super.ak(v + 1, v1, v2);
            }
            throw new igdb(igcr.f, ((int)0), null, null);
        }
        return super.ak(v, v1, v2);
    }

    @Override  // igdz
    public final boolean ar(int v) {
        return (v & 3) == 0;
    }

    public static igex as(igcw igcw0) {
        return igex.at(igcw0, 4);
    }

    public static igex at(igcw igcw0, int v) {
        igex igex1;
        igex igex0;
        if(igcw0 == null) {
            igcw0 = igcw.o();
        }
        ConcurrentHashMap concurrentHashMap0 = igex.J;
        igex[] arr_igex = (igex[])concurrentHashMap0.get(igcw0);
        if(arr_igex == null) {
            arr_igex = new igex[7];
            igex[] arr_igex1 = (igex[])concurrentHashMap0.putIfAbsent(igcw0, arr_igex);
            if(arr_igex1 != null) {
                arr_igex = arr_igex1;
            }
        }
        try {
            igex0 = arr_igex[v - 1];
        }
        catch(ArrayIndexOutOfBoundsException unused_ex) {
            throw new IllegalArgumentException("Invalid min days in first week: " + v);
        }
        if(igex0 == null) {
            synchronized(arr_igex) {
                igex1 = arr_igex[v - 1];
                if(igex1 == null) {
                    igex1 = igcw0 == igcw.b ? new igex(null, v) : new igex(igfe.Q(igex.at(igcw.b, v), igcw0), v);
                    arr_igex[v - 1] = igex1;
                }
            }
            return igex1;
        }
        return igex0;
    }

    @Override  // igcm
    public final igcm c() {
        return igex.I;
    }

    @Override  // igcm
    public final igcm d(igcw igcw0) {
        if(igcw0 == null) {
            igcw0 = igcw.o();
        }
        return igcw0 == this.B() ? this : igex.as(igcw0);
    }

    private Object readResolve() {
        int v = this.H == 0 ? 4 : this.H;
        return this.a == null ? igex.at(igcw.b, v) : igex.at(this.a.B(), v);
    }
}

