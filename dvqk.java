import android.accounts.Account;
import android.content.Context;
import dagger.android.AndroidInjector;
import dagger.internal.Preconditions;

final class dvqk implements AndroidInjector {
    private final dolg a;
    private final doly b;
    private final domv c;
    private final edor d;
    private final dxed e;

    public dvqk(dolg dolg0, dxed dxed0, doly doly0, edor edor0, domv domv0) {
        this.a = dolg0;
        this.b = doly0;
        this.c = domv0;
        this.d = edor0;
        this.e = dxed0;
    }

    final dvfu a() {
        this.c.a();
        return new dvfu(new dmgi(this.a.d(), dmgy.a()), new dmgm(dmgy.a()));
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        dvuz dvuz0 = (dvuz)object0;
        dvuz0.y = this.a.a();
        dvuz0.z = dmgy.a();
        dvuz0.A = this.b.c();
        dvuz0.B = this.a();
        dvuz0.C = this.d.a();
        dvuz0.D = new dvfy();
        dvuz0.E = new dvhg(this.a.a(), this.a(), this.e.a(), new bblp(0x7FFFFFFF, 9));
        dvuz0.F = new fshk();
        dvuz0.U = this.e.a();
        dvuz0.G = new edon(this.c.a());
        dvuz0.H = new efma(this.c.a());
        dvuz0.I = new dvpq(this.b.c());
        dvuz0.J = bbnk.a;
        Context context0 = this.c.a();
        Account account0 = this.a.a();
        String s = dmgy.a();
        frii frii0 = this.c.n();
        Preconditions.e(frii0);
        dvuz0.K = new dsio(dsiq.b(context0, account0, s, frii0));
        dvuz0.L = efmh.b(this.b.c());
        dvuz0.M = new bblp(0x7FFFFFFF, 9);
        dvuz0.N = new dvju(this.c.a(), new edln(this.e.a()), new bblp(0x7FFFFFFF, 9), new dyda(this.a.a()));
        fhwk fhwk0 = this.c.i();
        Preconditions.e(fhwk0);
        dvuz0.O = fhwk0;
        dvuz0.P = new dvlr(this.c.h(), this.a.d());
        dvuz0.Q = this.c.h();
        fuot fuot0 = this.c.o();
        Preconditions.e(fuot0);
        dvuz0.R = fuot0;
    }
}

