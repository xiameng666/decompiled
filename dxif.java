import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.pay.PassFilter;
import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

final class dxif implements AndroidInjector {
    private final domv A;
    private final dolg B;
    final Provider a;
    final Provider b;
    final Provider c;
    final Provider d;
    final Provider e;
    final Provider f;
    final Provider g;
    final Provider h;
    final Provider i;
    final Provider j;
    final Provider k;
    final Provider l;
    final Provider m;
    final Provider n;
    final Provider o;
    final Provider p;
    final Provider q;
    final Provider r;
    final Provider s;
    final Provider t;
    final Provider u;
    final Provider v;
    final Provider w;
    final Provider x;
    final Provider y;
    private final doma z;

    public dxif(doma doma0, dolg dolg0, edor edor0, edlf edlf0, domv domv0) {
        this.z = doma0;
        this.A = domv0;
        this.B = dolg0;
        dxic dxic0 = new dxic(domv0);
        this.a = dxic0;
        dmkm dmkm0 = new dmkm(dxic0);
        this.b = dmkm0;
        edrr edrr0 = new edrr(dmkm0);
        this.c = edrr0;
        this.d = DoubleCheck.b(new edrz(edrr0));
        edsk edsk0 = new edsk(dmkm0, dybw.a);
        this.e = edsk0;
        this.f = DoubleCheck.b(new edsc(edsk0));
        this.g = DoubleCheck.b(edwx.a);
        dxia dxia0 = new dxia(dolg0);
        this.h = dxia0;
        domd domd0 = new domd(doma0);
        this.i = domd0;
        dxig dxig0 = new dxig(domd0);
        this.j = dxig0;
        dxhz dxhz0 = new dxhz(dolg0);
        this.k = dxhz0;
        dmgj dmgj0 = new dmgj(dxic0, dxhz0);
        this.l = dmgj0;
        dxid dxid0 = new dxid(domv0);
        this.m = dxid0;
        dsod dsod0 = new dsod(dxic0);
        this.n = dsod0;
        dspi dspi0 = new dspi(dsod0);
        this.o = dspi0;
        Provider provider0 = DoubleCheck.b(new dsny(dxic0, dxig0, dxhz0, dmgj0, dxid0, dspi0));
        this.p = provider0;
        edoe edoe0 = new edoe(dxic0);
        this.q = edoe0;
        edoc edoc0 = new edoc(dxic0);
        this.r = edoc0;
        edod edod0 = new edod(dxic0);
        this.s = edod0;
        edny edny0 = new edny(edoe0, edoc0, edod0);
        this.t = edny0;
        dxib dxib0 = new dxib(edlf0);
        this.u = dxib0;
        dxie dxie0 = new dxie(edor0);
        this.v = dxie0;
        dxeg dxeg0 = new dxeg(domd0);
        this.w = dxeg0;
        edsf edsf0 = new edsf(dxic0);
        this.x = edsf0;
        this.y = DoubleCheck.b(new dspq(dxia0, dxic0, provider0, dmkm0, edny0, dxib0, dxie0, dxeg0, edsf0));
    }

    final dmgi a() {
        this.A.a();
        return new dmgi(this.B.d(), dmgy.a());
    }

    final azts b() {
        return new azts(domd.b(this.z));
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        dxjk dxjk0 = (dxjk)object0;
        dxjk0.aj = new dxkh(domf.a(this.z), new bhgn(this.A.a()));
        dxjk0.ak = this.B.a();
        dxjk0.al = this.a();
        dxjk0.at = this.b();
        dxjk0.am = new eeej(domf.a(this.z), new eeaw(new azts(domd.b(this.z), null), this.B.d(), this.B.c(), this.B.e(), new etgl(domd.b(this.z)), new edse(this.A.a())), domd.b(this.z), ((edrp)this.d.get()), ((edsh)this.f.get()), this.a());
        Context context0 = this.A.a();
        edxm edxm0 = new edxm(this.B.a(), this.b(), new dxjg(), new bblp(0x7FFFFFFF, 10), ((lqi)this.g.get()), ((edsh)this.f.get()));
        Account account0 = this.B.a();
        azts azts0 = this.b();
        PassFilter passFilter0 = new PassFilter();
        passFilter0.h = 1;
        dxjk0.an = new dxkp(context0, edxm0, new eefg(account0, azts0, passFilter0, new bblp(0x7FFFFFFF, 10), ((lqi)this.g.get()), new eefb(DoubleCheck.a(this.y)), ((edsh)this.f.get())), this.B.a(), this.b(), new bblp(0x7FFFFFFF, 9));
        dxjk0.ao = (edrp)this.d.get();
        dxjk0.ap = new fuok();
        fhwk fhwk0 = this.A.i();
        Preconditions.e(fhwk0);
        dxjk0.aq = fhwk0;
    }
}

