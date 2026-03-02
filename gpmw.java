import j..util.Objects;

final class gpmw extends iaky {
    final gRPCMethodDescriptor a;
    final iakq b;
    final gpmx c;

    public gpmw(gpmx gpmx0, iakv iakv0, gRPCMethodDescriptor iaoj0, iakq iakq0) {
        this.a = iaoj0;
        this.b = iakq0;
        Objects.requireNonNull(gpmx0);
        this.c = gpmx0;
        super(iakv0);
    }

    @Override  // iaky
    protected final void f(iaku iaku0, iaof_metadata iaof0) {
        MessageLite hfvm0 = this.c.a.b(this.a, this.b);
        iaoa iaoa0 = this.c.b;
        if(iaof0.j(iaoa0)) {
            throw new iapl(iapk.h.f("Metadata already contains a header with key " + iaoa0.toString()));
        }
        if(hfvm0 != null) {
            iaof0.i(iaoa0, hfvm0.toBytesArray());
        }
        this.d.e(new gpmv(this, iaku0), iaof0);
    }
}

