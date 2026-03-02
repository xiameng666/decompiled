import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Provider;

final class ebgf implements AndroidInjector {
    final Provider A;
    final Provider B;
    final Provider C;
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
    final Provider z;

    public ebgf(dola dola0, dpss dpss0, domw domw0) {
        dolc dolc0 = new dolc(dola0);
        this.a = dolc0;
        ebgd ebgd0 = new ebgd();
        this.b = ebgd0;
        ebge ebge0 = new ebge(dpss0);
        this.c = ebge0;
        dolf dolf0 = new dolf(dola0);
        this.d = dolf0;
        dole dole0 = new dole(dola0);
        this.e = dole0;
        this.f = ebgg.a;
        dmhh dmhh0 = new dmhh(dlni.a, dolf0, dole0, dmgt.a, ebgg.a);
        this.g = dmhh0;
        dxei dxei0 = new dxei(dlni.a);
        this.h = dxei0;
        dmkm dmkm0 = new dmkm(dlni.a);
        this.i = dmkm0;
        dtpr dtpr0 = new dtpr(dolc0, dmhh0, dxei0, dmkm0);
        this.j = dtpr0;
        dmgj dmgj0 = new dmgj(dlni.a, dolf0);
        this.k = dmgj0;
        duam duam0 = new duam(ebge0, dmgj0, ebgd0);
        this.l = duam0;
        ebic ebic0 = new ebic(dxei0, ebge0);
        this.m = ebic0;
        dtzf dtzf0 = new dtzf(dlni.a, dxei0);
        this.n = dtzf0;
        dtrx dtrx0 = new dtrx(dlni.a, dole0);
        this.o = dtrx0;
        dtrg dtrg0 = new dtrg(ebge0, ebgd0, dtzf0, dolf0, dtrx0, dtpr0);
        this.p = dtrg0;
        dtxn dtxn0 = new dtxn(ebgd0, ebge0, dtpr0, duam0, ebic0, dolf0, dtrg0);
        this.q = dtxn0;
        dtqn dtqn0 = new dtqn(ebge0);
        this.r = dtqn0;
        dtvw dtvw0 = new dtvw(ebge0, dtzf0);
        this.s = dtvw0;
        dttj dttj0 = new dttj(dtxn0, ebge0, dtpr0, dtxn0, duam0, ebic0, dtvw0);
        this.t = dttj0;
        dtyd dtyd0 = new dtyd(dtpr0, ebge0, duam0, ebic0, dtrg0, dtvw0, dtxn0);
        this.u = dtyd0;
        dttq dttq0 = new dttq(dttj0, dtyd0);
        this.v = dttq0;
        dtym dtym0 = new dtym(dolc0, ebge0);
        this.w = dtym0;
        duaz duaz0 = new duaz(dxei0);
        this.x = duaz0;
        dttt dttt0 = new dttt(dtxn0, dtpr0, ebge0, dttq0, duam0, dtym0, dtzf0, dtvw0, duaz0);
        this.y = dttt0;
        dtwq dtwq0 = new dtwq(dolc0, dtxn0, dtqn0, dttt0, dtzf0, dxei0, ebgd0);
        this.z = dtwq0;
        dtuq dtuq0 = new dtuq(ebge0);
        this.A = dtuq0;
        dtwr dtwr0 = new dtwr(dtuq0);
        this.B = dtwr0;
        this.C = new dtxh(dolc0, dtxn0, dtqn0, dttt0, dtzf0, dxei0, dtwr0, dole0, ebgd0, dtwq0);
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        ((ebij)object0).a = dtws.a(DoubleCheck.a(this.z), DoubleCheck.a(this.C));
    }
}

