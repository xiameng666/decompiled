public final class ight extends igcw {
    private static final int a = 0;
    private final igcw f;
    private final transient ighs[] g;
    private static final long serialVersionUID = 0x4BF18272D9B4CCBDL;

    static {
        int v;
        Integer integer0 = Integer.getInteger("org.joda.time.tz.CachedDateTimeZone.size");
        if(integer0 == null) {
            v = 0x200;
        }
        else {
            int v1 = ((int)integer0) - 1;
            int v2;
            for(v2 = 0; v1 > 0; ++v2) {
                v1 >>= 1;
            }
            v = 1 << v2;
        }
        ight.a = v - 1;
    }

    public ight(igcw igcw0) {
        super(igcw0.d);
        this.g = new ighs[ight.a + 1];
        this.f = igcw0;
    }

    @Override  // igcw
    public final int a(long v) {
        return this.c(v).a(v);
    }

    @Override  // igcw
    public final int b(long v) {
        return this.c(v).b(v);
    }

    private final ighs c(long v) {
        int v1 = ight.a & ((int)(v >> 0x20));
        ighs[] arr_ighs = this.g;
        ighs ighs0 = arr_ighs[v1];
        if(ighs0 != null && ((int)(ighs0.a >> 0x20)) == ((int)(v >> 0x20))) {
            return ighs0;
        }
        igcw igcw0 = this.f;
        ighs ighs1 = new ighs(igcw0, v & 0xFFFFFFFF00000000L);
        long v2 = v & 0xFFFFFFFF00000000L;
        ighs ighs2 = ighs1;
        while(true) {
            long v3 = igcw0.d(v2);
            if(v3 == v2 || v3 > (0xFFFFFFFFL | v & 0xFFFFFFFF00000000L)) {
                break;
            }
            ighs ighs3 = new ighs(igcw0, v3);
            ighs2.c = ighs3;
            ighs2 = ighs3;
            v2 = v3;
        }
        arr_ighs[v1] = ighs1;
        return ighs1;
    }

    @Override  // igcw
    public final long d(long v) {
        return this.f.d(v);
    }

    @Override  // igcw
    public final long e(long v) {
        return this.f.e(v);
    }

    @Override  // igcw
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof ight) ? this.f.equals(((ight)object0).f) : false;
    }

    @Override  // igcw
    public final String g(long v) {
        return this.c(v).c(v);
    }

    @Override  // igcw
    public final boolean h() {
        return false;
    }

    @Override  // igcw
    public final int hashCode() {
        return this.f.hashCode();
    }
}

