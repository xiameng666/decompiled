public final class gpke implements gpkv {
    private final gphn a;

    public gpke(gphn gphn0) {
        this.a = gphn0;
    }

    @Override  // gpkv
    public final gpmb a(gpkt gpkt0) {
        return gpmb.a;
    }

    @Override  // gpkv
    public final gpmb b(gpkt gpkt0) {
        iakq iakq0 = gpkt0.b;
        iakp iakp0 = gphl.a;
        gphl gphl0 = (gphl)iakq0.j(iakp0);
        if(gphl0 == null) {
            gphl0 = this.a.b(gpkt0.c.fullMethodName_);
            gftb.B(gphl0, "Could not find RpcId for method %s.Is portable_proto_filter set in your android_rpc_service?", gpkt0.c.fullMethodName_);
            iakq0 = iakq0.h(iakp0, gphl0);
        }
        fokg fokg0 = gphl0.a();
        iakq iakq1 = iakq0.h(fhrb.a, fokg0);
        return new gpmb(gpma.a, null, null, iakq1);
    }

    @Override  // gpkv
    public final gpmc c(gpks gpks0) {
        return gpmc.a;
    }

    @Override  // gpkv
    public final gpmb d() {
        return gpmb.a;
    }

    @Override  // gpkv
    public final gpmb e() {
        return gpmb.a;
    }

    @Override  // gpkv
    public final void f() {
    }

    @Override  // gpkv
    public final void g() {
    }
}

