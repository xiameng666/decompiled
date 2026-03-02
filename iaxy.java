import java.util.concurrent.TimeUnit;

class iaxy extends ianj_grpcChannel {
    public final ianj_grpcChannel a;

    public iaxy(ianj_grpcChannel ianj0) {
        this.a = ianj0;
    }

    @Override  // iakr
    public final iakv a(gRPCMethodDescriptor iaoj0, iakq iakq0) {
        return this.a.a(iaoj0, iakq0);
    }

    @Override  // iakr
    public final String b() {
        return this.a.b();
    }

    @Override  // ianj_grpcChannel
    public ianj_grpcChannel d() {
        throw null;
    }

    @Override  // ianj_grpcChannel
    public ianj_grpcChannel e() {
        throw null;
    }

    @Override  // ianj_grpcChannel
    public final void f() {
        this.a.f();
    }

    @Override  // ianj_grpcChannel
    public final void g(iall iall0, Runnable runnable0) {
        this.a.g(iall0, runnable0);
    }

    @Override  // ianj_grpcChannel
    public final boolean h(long v, TimeUnit timeUnit0) {
        return this.a.h(v, timeUnit0);
    }

    @Override  // ianj_grpcChannel
    public final boolean i() {
        return this.a.i();
    }

    @Override  // ianj_grpcChannel
    public final boolean j() {
        return ((ibbd)this.a).F;
    }

    @Override  // ianj_grpcChannel
    public final iall k() {
        return this.a.k();
    }

    @Override
    public final String toString() {
        ToStringHelper gfsv0 = MoreObjects.toStringHelper(this);
        gfsv0.add("delegate", this.a);
        return gfsv0.toString();
    }
}

