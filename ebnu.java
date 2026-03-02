import android.accounts.Account;
import android.content.Context;
import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import j..util.Optional;

final class ebnu implements AndroidInjector {
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
    private final domv r;
    private final domw s;
    private final dola t;
    private final dmgr u;

    public ebnu(dola dola0, dmgr dmgr0, domw domw0, domv domv0, edor edor0) {
        this.r = domv0;
        this.s = domw0;
        this.t = dola0;
        this.u = dmgr0;
        ebns ebns0 = new ebns(domv0);
        this.a = ebns0;
        ebnr ebnr0 = new ebnr(domv0);
        this.b = ebnr0;
        eczr eczr0 = new eczr(ebns0, ebnr0);
        this.c = eczr0;
        this.d = new ecwg();
        ecwf ecwf0 = new ecwf(ebns0);
        this.e = ecwf0;
        this.f = ebnv.a;
        ecwe ecwe0 = new ecwe(ebns0, ebnv.a);
        this.g = ecwe0;
        ecwr ecwr0 = new ecwr(ebns0, eczr0, ecwf0, ecwe0, ebnv.a);
        this.h = ecwr0;
        ecwd ecwd0 = new ecwd(ecwr0, ecwe0);
        this.i = ecwd0;
        dmgz dmgz0 = new dmgz();
        this.j = dmgz0;
        this.k = new ecvz(ecwd0, dmgz0, eczr0);
        edsf edsf0 = new edsf(ebns0);
        this.l = edsf0;
        dmkm dmkm0 = new dmkm(ebns0);
        this.m = dmkm0;
        ebnt ebnt0 = new ebnt(edor0);
        this.n = ebnt0;
        edrn edrn0 = new edrn(edsf0, dmkm0, ebnt0);
        this.o = edrn0;
        this.p = DoubleCheck.b(new edrj(edrn0));
        this.q = DoubleCheck.b(edrh.a);
    }

    final dmgi a() {
        this.r.a();
        return new dmgi(dolf.b(this.t), dmgy.a());
    }

    final dmhi b() {
        return dmhh.b(this.r.a(), dolf.b(this.t), dole.b(this.t), dmgy.a(), this.u.a, Optional.empty());
    }

    final dypo c() {
        return new dypo(this.r.a(), dole.b(this.t), dmgy.a());
    }

    final dypz d() {
        return new dypz(this.r.a(), dole.b(this.t), dmgy.a());
    }

    final dyxt e() {
        gmcg gmcg0 = this.r.p();
        Preconditions.e(gmcg0);
        bblp bblp0 = new bblp(0x7FFFFFFF, 9);
        dykl dykl0 = this.r.c();
        Preconditions.e(dykl0);
        dyks dyks0 = this.r.e();
        Preconditions.e(dyks0);
        dyky dyky0 = this.r.f();
        Preconditions.e(dyky0);
        dyko dyko0 = this.r.d();
        Preconditions.e(dyko0);
        return new dyxt(gmcg0, bblp0, dykl0, dyks0, dyky0, dyko0, this.f(), ((ecvz)this.k).a(), dolf.b(this.t), this.a());
    }

    final etgl f() {
        return new etgl(this.r.a());
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        ebvs ebvs0 = (ebvs)object0;
        dyxt dyxt0 = this.e();
        dyxt dyxt1 = this.e();
        Account account0 = dolc.b(this.t);
        dypo dypo0 = this.c();
        dypx dypx0 = new dypx(this.r.a(), dole.b(this.t), dmgy.a());
        dypz dypz0 = this.d();
        dypv dypv0 = new dypv(this.b(), new dlnm(new acqn(this.r.a()), dolf.b(this.t), dole.b(this.t)));
        dmgi dmgi0 = this.a();
        ebst ebst0 = new ebst(this.r.h());
        etgl etgl0 = this.f();
        dlmc dlmc0 = new dlmc(this.r.a(), dole.b(this.t), dmgy.a());
        Context context0 = this.r.a();
        String s = dole.b(this.t);
        String s1 = dmgy.a();
        Context context1 = this.r.a();
        String s2 = dole.b(this.t);
        String s3 = dmgy.a();
        Context context2 = this.r.a();
        Preconditions.e(context2);
        ebvs0.e = new dypj(dyxt0, new dypb(dyxt1, new dyre(account0, dypo0, dypx0, dypz0, dypv0, dmgi0, ebst0, new dmue(etgl0, dlmc0, new dmtn(context0, s, s1, new earj(new earo(context1, s2, s3, new earr(context2, dole.b(this.t), dmgy.a())))), new dmuj(this.b(), new fbio(this.r.a(), edtq.b(edtl.a(dmgv.e(dmgy.a())), dolc.b(this.t))), new edmu(new dmkl(this.r.a()), ((edrk)this.p.get()), ((edrg)this.q.get()))), new bblp(1, 10), easp.a(), this.c(), this.d(), new dypr(this.c()), new dmuh(dolc.b(this.t), this.f(), new eeeg(this.r.a(), dolf.b(this.t), dmgy.a())), new dxzo(dolc.b(this.t), dmgy.a(), new bblp(0x7FFFFFFF, 9))), easp.a())), new edmh(this.r.a(), dmgy.a(), easm.a()), new dybv(), new bblp(0x7FFFFFFF, 10));
        ebvs0.f = this.r.h();
        fich fich0 = this.r.k();
        Preconditions.e(fich0);
        ebvs0.g = fich0;
        ebvs0.h = new bblp(0x7FFFFFFF, 10);
    }
}

