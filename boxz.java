import android.accounts.Account;
import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

public final class boxz implements boxs {
    public static final bboh b;
    public final fgvt c;
    private final Context d;
    private final fqxe e;
    private final Executor f;

    static {
        boxz.b = bboh.b("KeychainMaintEventRepor", bbcu.eD);
    }

    public boxz(Context context0, fqxe fqxe0, fgvt fgvt0, Executor executor0) {
        this.d = context0;
        this.e = fqxe0;
        this.c = fgvt0;
        this.f = executor0;
    }

    @Override  // boxs
    public final gmcd a() {
        AtomicReference atomicReference0 = new AtomicReference();
        boxw boxw0 = new boxw(this, atomicReference0);
        return gdta.g(this.e.n(boxw0)).h(new boxx(atomicReference0), this.f);
    }

    @Override  // boxs
    public final gmcd b(Account account0, boolean z, int v, int v1, gfsx gfsx0) {
        gfsx gfsx1 = bpsq.f(this.d, account0);
        AtomicReference atomicReference0 = new AtomicReference();
        boxu boxu0 = new boxu(this, v, gfsx1, z, v1, gfsx0, atomicReference0);
        return gdta.g(this.e.n(boxu0)).h(new boxv(atomicReference0, v, z, v1), this.f);
    }

    public static final void c(boolean z, int v, int v1) {
        ciht ciht0 = ciht.v();
        boxt boxt0 = new boxt(z, v, v1);
        ciht0.j(((ProtoLiteMessage)bnns.a(hadq.f, boxt0)));
    }
}

