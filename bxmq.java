import j..util.Objects;

final class bxmq implements gmbg {
    final bxmu a;

    public bxmq(bxmu bxmu0) {
        Objects.requireNonNull(bxmu0);
        this.a = bxmu0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        bxmu bxmu0 = this.a;
        synchronized(bxmu0.c) {
            if(bxmu0.e) {
                return;
            }
            bxmu0.e(throwable0);
        }
    }

    @Override  // gmbg
    public final void b(Object object0) {
        bxmu bxmu0 = this.a;
        synchronized(bxmu0.c) {
            if(bxmu0.e) {
                return;
            }
            bxmu0.h(new bxmo(this));
            if(((gfsx)object0).i()) {
                bxmu0.d = ((gfsx)object0).d();
                bxmu0.d();
            }
            else {
                bxmu0.e = true;
                bxmu0.h(new bxmp());
            }
        }
    }
}

