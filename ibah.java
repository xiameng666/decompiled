import java.util.concurrent.Executor;

final class ibah extends iama {
    public final ialq a;
    private final iami b;
    private final iakr c;
    private final Executor d;
    private final gRPCMethodDescriptor e;
    private iakq f;
    private iakv g;

    public ibah(iami iami0, iakr iakr0, Executor executor0, gRPCMethodDescriptor iaoj0, iakq iakq0) {
        this.b = iami0;
        this.c = iakr0;
        this.e = iaoj0;
        Executor executor1 = iakq0.c;
        if(executor1 != null) {
            executor0 = executor1;
        }
        this.d = executor0;
        this.f = iakq0.e(executor0);
        this.a = ialq.b();
    }

    @Override  // iaoz
    public final void a(String s, Throwable throwable0) {
        iakv iakv0 = this.g;
        if(iakv0 != null) {
            iakv0.a(s, throwable0);
        }
    }

    @Override  // iama
    public final void e(iaku iaku0, iaof_metadata iaof0) {
        gRPCMethodDescriptor iaoj0 = this.e;
        new iana(iaoj0, iaof0, this.f, ibbd.g);
        iamh iamh0 = this.b.a();
        iapk iapk0 = iamh0.a;
        if(iapk0.h()) {
            ibbo ibbo0 = ((ibbq)iamh0.b).b(iaoj0);
            if(ibbo0 != null) {
                this.f = this.f.h(ibbo.a, ibbo0);
            }
            iakv iakv0 = this.c.a(iaoj0, this.f);
            this.g = iakv0;
            iakv0.e(iaku0, iaof0);
            return;
        }
        ibag ibag0 = new ibag(this, iaku0, iayh.b(iapk0));
        this.d.execute(ibag0);
        this.g = ibbd.h;
    }

    @Override  // iama
    protected final iakv s() {
        return this.g;
    }
}

