import android.content.Context;
import java.util.concurrent.TimeUnit;

public final class iaqq extends ialy {
    private final ibbl a;
    private final iarb b;
    private boolean c;

    private iaqq(iaql iaql0, Context context0, iaks iaks0) {
        iarb iarb0 = new iarb();
        gftb.check(context0);
        iarb0.a = context0;
        iarb0.h = iaks0;
        this.b = iarb0;
        this.a = new ibbl(iaql0, (iaql0.a.getPackage() == null ? iaql0.a.getComponent().getPackageName() : iaql0.a.getPackage()), iarb0);
        this.n(60L, TimeUnit.SECONDS);
    }

    @Override  // ialx
    public final ianj_grpcChannel a() {
        gftb.z(this.a.e, "offloadExecutorPool");
        this.b.b = this.a.e;
        this.d(iaqm.a, this.b.a);
        return super.a();
    }

    @Override  // ialy
    protected final ianl b() {
        return this.a;
    }

    @Override  // ialy
    public final void i(long v, TimeUnit timeUnit0) {
        this.n(v, timeUnit0);
    }

    @Override  // ialy
    public final void k(long v, TimeUnit timeUnit0) {
        this.n(v, timeUnit0);
    }

    public static iaqq m(iaql iaql0, Context context0) {
        return new iaqq(iaql0, context0, new iaks());
    }

    public final void n(long v, TimeUnit timeUnit0) {
        gftb.r(((boolean)(this.c ^ 1)), "Idle timeouts are not supported when strict lifecycle management is enabled");
        super.k(v, timeUnit0);
    }

    public final void o(iaqs iaqs0) {
        this.b.f = iaqs0;
    }

    public final void p(iaqy iaqy0) {
        this.b.d = iaqy0;
    }

    public final void q(iaqp iaqp0) {
        this.b.e = iaqp0;
    }

    public final void r() {
        this.c = true;
        super.k(1000L, TimeUnit.DAYS);
    }
}

