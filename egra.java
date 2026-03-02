import android.accounts.Account;
import java.util.concurrent.CancellationException;

public final class egra extends lqd implements gmbg {
    public final egvt a;
    public String h;
    public final egrb i;
    private static final bboh j;
    private final gmcg k;
    private gmcd l;

    static {
        egra.j = bboh.b("AccountLiveData", bbcu.f);
    }

    public egra(egvt egvt0, gmcg gmcg0, egrb egrb0) {
        this.a = egvt0;
        this.k = gmcg0;
        this.i = egrb0;
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        if((throwable0 instanceof CancellationException)) {
            return;
        }
        a.ae(egra.j.i(), "Error with account future. ", throwable0);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        this.ii(((Account)object0));
    }

    @Override  // lqd
    protected final void c() {
        this.o();
    }

    public final void o() {
        gmcd gmcd0 = this.l;
        if(gmcd0 != null) {
            gmcd0.cancel(true);
        }
        egqz egqz0 = new egqz(this);
        gmcd gmcd1 = this.k.e(egqz0);
        this.l = gmcd1;
        gmbu.t(gmcd1, this, gmap.a);
    }
}

