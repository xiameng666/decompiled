import j..util.Objects;

public final class bvuz implements ibjx {
    final bvvb a;

    public bvuz(bvvb bvvb0) {
        Objects.requireNonNull(bvvb0);
        this.a = bvvb0;
        super();
    }

    @Override  // ibkd
    public final void a() {
    }

    @Override  // ibkd
    public final void b(Throwable throwable0) {
        if((throwable0.getCause() instanceof bvva)) {
            return;
        }
        RuntimeException runtimeException0 = new RuntimeException(throwable0);
        this.a.d.a(runtimeException0);
        this.a.b();
    }

    @Override  // ibkd
    public final void c(Object object0) {
        boolean z1;
        fpuf fpuf0 = ((fpug)object0).d;
        if(fpuf0 == null) {
            fpuf0 = fpuf.a;
        }
        boolean z = true;
        if((fpue.b(fpuf0.c) == null ? fpue.a : fpue.b(fpuf0.c)) == fpue.b) {
            this.a.c = true;
        }
        bvvb bvvb0 = this.a;
        if(bvvb0.c) {
            ggfp ggfp0 = bvvb.a;
            fpuf fpuf1 = ((fpug)object0).d;
            if(fpuf1 == null) {
                fpuf1 = fpuf.a;
            }
            z1 = ggfp0.contains((fpue.b(fpuf1.c) == null ? fpue.a : fpue.b(fpuf1.c)));
        }
        else {
            z1 = false;
        }
        fpuf fpuf2 = ((fpug)object0).d;
        if(fpuf2 == null) {
            fpuf2 = fpuf.a;
        }
        if(fpuf2.b) {
            fpub fpub0 = ((fpug)object0).c;
            if(fpub0 == null) {
                fpub0 = fpub.a;
            }
            if(!fpub0.c) {
                z = false;
            }
        }
        else {
            z = false;
        }
        if(!z1 && !z) {
            return;
        }
        gqqk gqqk0 = bvvh.a(((fpug)object0));
        bvvb0.d.b(gqqk0);
        bvvb0.c = false;
        bvvb0.b();
    }

    @Override  // ibjx
    public final void d(ibjp ibjp0) {
        this.a.e = ibjp0;
    }
}

