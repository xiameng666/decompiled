import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Provider;
import j..util.Optional;

final class dvph implements AndroidInjector {
    final Provider a;
    final Provider b;
    final Provider c;
    final Provider d;
    final Provider e;
    final Provider f;
    final Provider g;
    final Provider h;
    private final dolg i;

    public dvph(dolg dolg0, edor edor0) {
        this.i = dolg0;
        dmkm dmkm0 = new dmkm(dlni.a);
        this.a = dmkm0;
        edrr edrr0 = new edrr(dmkm0);
        this.b = edrr0;
        this.c = DoubleCheck.b(new edrz(edrr0));
        edsf edsf0 = new edsf(dlni.a);
        this.d = edsf0;
        dvpg dvpg0 = new dvpg(edor0);
        this.e = dvpg0;
        edrn edrn0 = new edrn(edsf0, dmkm0, dvpg0);
        this.f = edrn0;
        this.g = DoubleCheck.b(new edrj(edrn0));
        this.h = DoubleCheck.b(edrh.a);
    }

    final dvfu a() {
        dlnj.a();
        return new dvfu(new dmgi(this.i.d(), dmgy.a()), new dmgm(dmgy.a()));
    }

    static final dmkl b() {
        return new dmkl(dlnj.a());
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        dvpp dvpp0 = (dvpp)object0;
        dvpp0.aj = this.i.a();
        dvpp0.ak = dlnj.a();
        dvpp0.al = this.a();
        dvpp0.am = new efma(dlnj.a());
        dvpp0.an = new dvgv(this.a(), dvph.b(), dmhh.b(dlnj.a(), this.i.d(), this.i.c(), dmgy.a(), null, Optional.empty()), dvga.b(((edrp)this.c.get())), new edmu(dvph.b(), ((edrk)this.g.get()), ((edrg)this.h.get())));
        dvpp0.aq = dxei.b(dlnj.a());
        dvpp0.ao = new edon(dlnj.a());
    }
}

