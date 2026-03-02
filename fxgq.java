import android.content.Context;
import java.util.function.Supplier;

final class fxgq extends fxpd {
    public fxgt a;
    private final Context b;
    private final Supplier c;
    private fxpt d;

    public fxgq(Context context0, Supplier supplier0) {
        super("SessionMgr");
        this.b = context0;
        this.c = supplier0;
    }

    @Override  // fxpd
    public final void a() {
        if(this.d == null) {
            this.d = new fxps(huwd.f() - huwd.a.n().F());
        }
        fxgt fxgt0 = new fxgt(((fxob)this.c.get()).b.c, ((fxob)this.c.get()).b.b, fxen.a(this.b), System.currentTimeMillis());
        this.a = fxgt0;
        fxdo.b(this.b, "start", fxgt0);
        this.e(0L);
        this.h.i();
    }

    @Override  // fxpd
    public final void b(fxpi fxpi0) {
        fxdo.b(this.b, "finish", this.a);
    }

    @Override  // fxpd
    public final boolean c(fxpj fxpj0) {
        switch(fxpj0.a) {
            case 5: {
                this.d.b(new fxgp(this));
                this.e(huwd.f());
                return false;
            }
            case 6: {
                fxdo.b(this.b, "heartbeat", this.a);
                return false;
            }
            case 8: {
                ++this.a.g;
                fxdo.a(this.b, true);
                return false;
            }
            case 9: {
                ++this.a.f;
                fxdo.a(this.b, false);
                return false;
            }
            default: {
                return false;
            }
        }
    }

    private final void e(long v) {
        this.h.l(5, v);
    }
}

