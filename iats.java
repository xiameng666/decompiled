import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public abstract class iats extends iatw implements iauy, ibbz {
    private iaof_metadata a;
    private volatile boolean b;
    private final ibca c;
    public static final Logger q;
    public final ibfu r;
    public final boolean s;

    static {
        iats.q = Logger.getLogger(iats.class.getName());
    }

    protected iats(ibfw ibfw0, ibfn ibfn0, ibfu ibfu0, iaof_metadata iaof0, iakq iakq0) {
        gftb.z(iaof0, "headers");
        gftb.z(ibfu0, "transportTracer");
        this.r = ibfu0;
        this.s = iayh.j(iakq0);
        this.c = new ibca(this, ibfw0, ibfn0);
        this.a = iaof0;
    }

    @Override  // iauy
    public final void b(iayp iayp0) {
        iayp0.b("remote_addr", this.a().a(iamb.a));
    }

    @Override  // iauy
    public final void c(iapk iapk0) {
        gftb.b(((boolean)(iapk0.h() ^ 1)), "Should not cancel with OK status");
        this.b = true;
        this.p().a(iapk0);
    }

    @Override  // iauy
    public final void e() {
        if(!this.t().s) {
            this.t().s = true;
            ibca ibca0 = this.v();
            if(!ibca0.i) {
                ibca0.i = true;
                if(ibca0.b != null && ibca0.b.a() == 0 && ibca0.b != null) {
                    ibca0.b = null;
                }
                ibca0.b(true, true);
            }
        }
    }

    @Override  // iauy
    public final void i(ials ials0) {
        this.a.g(iayh.a);
        iaof_metadata iaof0 = this.a;
        Long long0 = ials0.b(TimeUnit.NANOSECONDS);
        iaof0.i(iayh.a, long0);
    }

    @Override  // iauy
    public final void j(ialv ialv0) {
        iatv iatv0 = this.t();
        gftb.r(iatv0.q == null, "Already called start");
        gftb.z(ialv0, "decompressorRegistry");
        iatv0.r = ialv0;
    }

    @Override  // iauy
    public final void k(int v) {
        ((ibbw)this.t().j).b = v;
    }

    @Override  // iauy
    public final void l(int v) {
        gftb.r(this.c.a == -1, "max size already set");
        this.c.a = v;
    }

    @Override  // iauy
    public final void m(iava iava0) {
        iatv iatv0 = this.t();
        gftb.r(iatv0.q == null, "Already called setListener");
        iatv0.q = iava0;
        this.p().c(this.a);
        this.a = null;
    }

    @Override  // iatw, ibfo
    public final boolean o() {
        return this.q().i() && !this.b;
    }

    protected abstract iatq p();

    @Override  // iatw
    protected iatv q() {
        throw null;
    }

    protected abstract iatv t();

    @Override  // ibbz
    public final void u(ibfv ibfv0, boolean z, boolean z1, int v) {
        gftb.b(ibfv0 != null || z, "null frame before EOS");
        this.p().b(ibfv0, z, z1, v);
    }

    @Override  // iatw
    protected final ibca v() {
        return this.c;
    }
}

