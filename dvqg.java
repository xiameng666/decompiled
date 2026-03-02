import android.content.Context;
import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import j..util.Optional;

final class dvqg implements AndroidInjector {
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
    private final dxed p;
    private final domv q;
    private final dolg r;
    private final domw s;

    public dvqg(dolg dolg0, dxed dxed0, domw domw0, edor edor0, domv domv0) {
        this.p = dxed0;
        this.q = domv0;
        this.r = dolg0;
        this.s = domw0;
        dvqd dvqd0 = new dvqd(domv0);
        this.a = dvqd0;
        dvqc dvqc0 = new dvqc(dolg0);
        this.b = dvqc0;
        dvqf dvqf0 = new dvqf(domw0);
        this.c = dvqf0;
        dlny dlny0 = new dlny(dvqd0, dvqf0);
        this.d = dlny0;
        efmg efmg0 = new efmg(dvqd0);
        this.e = efmg0;
        this.f = DoubleCheck.b(new dsol(dvqd0, dvqc0, dlny0, efmg0));
        this.g = DoubleCheck.b(new dspa(dvqd0, dvqc0, dlny0, efmg0));
        dmkm dmkm0 = new dmkm(dvqd0);
        this.h = dmkm0;
        edrr edrr0 = new edrr(dmkm0);
        this.i = edrr0;
        this.j = DoubleCheck.b(new edrz(edrr0));
        edsf edsf0 = new edsf(dvqd0);
        this.k = edsf0;
        dvqe dvqe0 = new dvqe(edor0);
        this.l = dvqe0;
        edrn edrn0 = new edrn(edsf0, dmkm0, dvqe0);
        this.m = edrn0;
        this.n = DoubleCheck.b(new edrj(edrn0));
        this.o = DoubleCheck.b(edrh.a);
    }

    final dmkl a() {
        return new dmkl(this.q.a());
    }

    final dvfu b() {
        this.q.a();
        return new dvfu(new dmgi(this.r.d(), dmgy.a()), new dmgm(dmgy.a()));
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        dvsw dvsw0 = (dvsw)object0;
        dvsw0.al = this.p.a();
        Context context0 = this.q.a();
        dsok dsok0 = (dsok)this.f.get();
        dvsw0.b = new dspe(context0, ((dsoz)this.g.get()));
        dvsw0.c = new dsor(this.r.a(), new dlnx(this.q.a(), new bblp(1, 10)), new hfid(null));
        dvsw0.d = new dvgv(this.b(), this.a(), dmhh.b(this.q.a(), this.r.d(), this.r.c(), dmgy.a(), null, Optional.empty()), dvga.b(((edrp)this.j.get())), new edmu(this.a(), ((edrk)this.n.get()), ((edrg)this.o.get())));
        dvsw0.ag = this.b();
        fhwk fhwk0 = this.q.i();
        Preconditions.e(fhwk0);
        dvsw0.ah = fhwk0;
        dvsw0.ai = this.q.j();
        dvsw0.aj = this.q.g();
    }
}

