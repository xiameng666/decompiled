import j..util.Objects;

final class aqtt implements ibjx {
    final Long[] a;
    final Boolean[] b;
    final aqvd c;
    final aqtu d;

    public aqtt(aqtu aqtu0, Long[] arr_long, Boolean[] arr_boolean, aqvd aqvd0) {
        this.a = arr_long;
        this.b = arr_boolean;
        this.c = aqvd0;
        Objects.requireNonNull(aqtu0);
        this.d = aqtu0;
        super();
    }

    @Override  // ibkd
    public final void a() {
    }

    @Override  // ibkd
    public final void b(Throwable throwable0) {
        aqtu aqtu0 = this.d;
        aqtv aqtv0 = aqtu0.c;
        if(aqtv0 != null) {
            aqtv0.a();
            String s = ((iapn)throwable0).a.u;
            if(!Objects.equals(s, "transport shutdown by peer") && !Objects.equals(s, "Canceling Photos status stream")) {
                aqtu0.a.f(8, this.c, 0, this.a[0]);
            }
        }
    }

    @Override  // ibkd
    public final void c(Object object0) {
        aqvk aqvk0;
        String s;
        int v1;
        long v;
        boolean z1;
        fpue fpue2;
        fpub fpub0;
        fpuc fpuc0;
        fpuf fpuf0;
        Boolean[] arr_boolean = this.b;
        boolean z = false;
        if(!arr_boolean[0].booleanValue()) {
            Boolean boolean0 = Boolean.valueOf(true);
            arr_boolean[0] = boolean0;
            this.d.a.g(8, this.c, boolean0, this.a[0]);
        }
        fpue fpue0 = fpue.a;
        aqtw aqtw0 = this.d.b;
        if(aqtw0 == null) {
            return;
        }
        if(((fpug)object0) == null) {
            fpub0 = null;
            fpuf0 = null;
            fpuc0 = null;
        }
        else {
            fpuf0 = ((fpug)object0).d;
            if(fpuf0 == null) {
                fpuf0 = fpuf.a;
            }
            fpuc0 = ((fpug)object0).e;
            if(fpuc0 == null) {
                fpuc0 = fpuc.a;
            }
            fpub0 = ((fpug)object0).c;
            if(fpub0 == null) {
                fpub0 = fpub.a;
            }
        }
        if(fpuf0 == null) {
            fpue2 = fpue0;
            z1 = false;
        }
        else {
            fpue fpue1 = fpue.b(fpuf0.c);
            fpue2 = fpue1 == null ? fpue0 : fpue1;
            z1 = fpuf0.b;
        }
        if(fpuc0 == null) {
            v = 0L;
            v1 = 0;
        }
        else {
            v = fpuc0.c;
            v1 = fpuc0.b;
        }
        if(fpub0 != null && (fpub0.b & 2) != 0) {
            s = (fpub0.d == null ? fptn.a : fpub0.d).b;
            z = fpub0.c;
        }
        else {
            s = null;
        }
        if(z) {
            gftb.check(s);
            aqvk0 = new aqvk(aqvj.a, s, null);
        }
        else {
            aqvk0 = new aqvk(aqvj.b, null, null);
        }
        aqtw0.a(new aqtx(z1, v1, v, fpue2, aqvk0));
    }

    @Override  // ibjx
    public final void d(ibjp ibjp0) {
        this.d.d = ibjp0;
        this.a[0] = this.d.a.a();
    }
}

