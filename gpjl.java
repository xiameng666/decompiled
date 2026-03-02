public final class gpjl implements gpkv {
    private gphu a;

    @Override  // gpkv
    public final gpmb a(gpkt gpkt0) {
        return this.a.a(gpkt0);
    }

    @Override  // gpkv
    public final gpmb b(gpkt gpkt0) {
        iakq iakq0 = gpkt0.b;
        if(iakq0.j(gpji.g) != null) {
            return gpmb.a;
        }
        if(iakq0.j(gpib.a) != null) {
            return gpmb.a;
        }
        gphu gphu0 = new gphu(gfqx.a, ggnf.a);
        this.a = gphu0;
        return gphu0.b(gpkt0);
    }

    @Override  // gpkv
    public final gpmc c(gpks gpks0) {
        return this.a == null ? gpmc.a : this.a.c(gpks0);
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

