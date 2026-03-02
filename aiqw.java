import android.content.Context;
import java.util.concurrent.Executor;

@Deprecated
public final class aiqw implements aiqy {
    public static final String a;
    public final ayud b;
    public final ayvm c;
    private final Executor d;

    static {
        aiqw.a = hlrf.c.e;
    }

    public aiqw(Context context0, Executor executor0, ayud ayud0) {
        this.d = executor0;
        this.b = ayud0;
        this.c = fhbe.b(context0, new wtw());
    }

    @Override  // aiqy
    public final void a(wty wty0, int v) {
        aiqr aiqr0 = new aiqr(this, wty0, v);
        this.d.execute(aiqr0);
    }

    @Override  // aiqy
    public final void b(wub wub0) {
        aiqu aiqu0 = new aiqu(this, wub0);
        this.d.execute(aiqu0);
    }

    @Override  // aiqy
    public final void c(wue wue0) {
    }

    @Override  // aiqy
    public final void d(wuh wuh0) {
        aiqv aiqv0 = new aiqv(this, wuh0);
        this.d.execute(aiqv0);
    }

    @Override  // aiqy
    public final void e(wum wum0, int v) {
        aiqm aiqm0 = new aiqm(this, wum0, v);
        this.d.execute(aiqm0);
    }

    @Override  // aiqy
    public final void f(wup wup0) {
    }

    @Override  // aiqy
    public final void g(wus wus0) {
        aiql aiql0 = new aiql(this, wus0);
        this.d.execute(aiql0);
    }

    @Override  // aiqy
    public final void h(wuu wuu0) {
        aiqt aiqt0 = new aiqt(this, wuu0);
        this.d.execute(aiqt0);
    }

    @Override  // aiqy
    public final void i(wvc wvc0) {
    }

    @Override  // aiqy
    public final void j(wve wve0) {
        aiqn aiqn0 = new aiqn(this, wve0);
        this.d.execute(aiqn0);
    }

    @Override  // aiqy
    public final void k(wvp wvp0) {
        aiqq aiqq0 = new aiqq(this, wvp0);
        this.d.execute(aiqq0);
    }

    @Override  // aiqy
    public final void l(wvr wvr0, int v) {
        aiqs aiqs0 = new aiqs(this, wvr0, v);
        this.d.execute(aiqs0);
    }

    @Override  // aiqy
    public final void m(String s, int v, int v1, long v2, int v3) {
        aiqo aiqo0 = new aiqo(this, s, v1, v, v2, v3);
        this.d.execute(aiqo0);
    }

    @Override  // aiqy
    public final void n(String s, int v, int v1, boolean z, boolean z1, long v2) {
        aiqp aiqp0 = new aiqp(this, s, v, v1, v2, z, z1);
        this.d.execute(aiqp0);
    }
}

