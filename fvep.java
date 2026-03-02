import android.os.SystemClock;
import java.util.Iterator;

public final class fvep implements gfsi {
    public final fvfn a;
    public final ggzv b;

    public fvep(fvfn fvfn0, ggzv ggzv0) {
        this.a = fvfn0;
        this.b = ggzv0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ggeo ggeo0;
        gxsa gxsa2;
        gxsa gxsa1;
        gxpu gxpu0 = (gxpu)object0;
        int v = !this.a.a || this.b == null ? 0 : 1;
        long v1 = SystemClock.elapsedRealtime();
        if(gxpu0 == null) {
            return null;
        }
        if((gxpu0.b & 1) != 0) {
            fvfp fvfp0 = new fvfp();
            ggdy ggdy0 = new ggdy();
            ggdy0.k(fvhq.e((gxpu0.c == null ? gxrf.a : gxpu0.c)));
            ggdy0.k(fvhq.c((gxpu0.d == null ? gxqm.a : gxpu0.d)));
            ggdy0.k(fvhq.d((gxpu0.e == null ? gxqu.a : gxpu0.e)));
            ggdy0.k(fvhq.b((gxpu0.f == null ? gxqa.a : gxpu0.f)));
            gxrr gxrr0 = gxpu0.g == null ? gxrr.a : gxpu0.g;
            ggdy ggdy1 = gged_interceptors.e(gxrr0.e.size());
            Iterator iterator0 = gxrr0.e.iterator();
            while(iterator0.hasNext()) {
                Object object1 = iterator0.next();
                gxrh gxrh0 = ((gxru)object1).d;
                if(gxrh0 == null) {
                    gxrh0 = gxrh.a;
                }
                gxrl gxrl0 = ((gxru)object1).e;
                if(gxrl0 == null) {
                    gxrl0 = gxrl.a;
                }
                gxrv gxrv0 = ((gxru)object1).f;
                if(gxrv0 == null) {
                    gxrv0 = gxrv.a;
                }
                gxrz gxrz0 = ((gxru)object1).g;
                if(gxrz0 == null) {
                    gxrz0 = gxrz.a;
                }
                gxre gxre0 = ((gxru)object1).c;
                if(gxre0 == null) {
                    gxre0 = gxre.a;
                }
                fvhk fvhk0 = new fvhk();
                fvhk0.a = (double)gxrz0.d;
                fvhk0.k = (gxrl0.k == null ? gxsa.a : gxrl0.k).b;
                gxsa gxsa0 = gxrl0.k;
                if(gxsa0 == null) {
                    gxsa1 = gxsa.a;
                    gxsa2 = null;
                }
                else {
                    gxsa1 = gxsa0;
                    gxsa2 = gxsa1;
                }
                fvhk0.l = gxsa1.c;
                fvhk0.o = (gxsa2 == null ? gxsa.a : gxsa2).f;
                fvhk0.p = (gxsa2 == null ? gxsa.a : gxsa2).g;
                fvhk0.m = (gxsa2 == null ? gxsa.a : gxsa2).d;
                fvhk0.n = (gxsa2 == null ? gxsa.a : gxsa2).e;
                fvhk0.b = gxrl0.j;
                fvhk0.c = gxrl0.i;
                fvhk0.d = gxrl0.c;
                fvhk0.e = gxrl0.b;
                fvhk0.f = gxrl0.h;
                fvhk0.g = gxrl0.f;
                fvhk0.j = gxrl0.g;
                fvhk0.i = gxrl0.d;
                fvhk0.h = gxrl0.e;
                fvhl fvhl0 = new fvhl(fvhk0);
                fvhw fvhw0 = fvhw.k(fvhq.a((gxrh0.b == null ? gxsc.a : gxrh0.b)));
                fvhg fvhg0 = new fvhg();
                fvhg0.b = gxrh0.c;
                fvhg0.c = gxrh0.d;
                fvhg0.d = gxrh0.e;
                fvhg0.a = ((double)fvhw0.b) * 1.000000E-12;
                fvhg0.e = gxrh0.f;
                fvhh fvhh0 = new fvhh(fvhg0);
                fvhn fvhn0 = new fvhn();
                fvhn0.q = fvii.b(4, ((gxru)object1).b, fvhw0.c());
                fvhn0.g = gxrz0.c;
                fvhn0.i = gxrz0.e;
                fvhn0.b = gxrv0.d > 2.0;
                fvhn0.a = gxrv0.c;
                fvhn0.h = gxrv0.b;
                fvhn0.d = gxre0.b;
                fvhn0.c = gxre0.c != 0;
                fvhn0.e = gxrh0.g;
                fvhn0.j = gxrz0.b;
                fvhn0.k = fvhl0;
                fvhn0.f = fvhh0;
                ggdy1.i(new fvho(fvhn0));
                iterator0 = iterator0;
                v = v;
                v1 = v1;
                ggdy0 = ggdy0;
                gxpu0 = gxpu0;
            }
            ggdy0.k(ggdy1.h());
            gged_interceptors gged0 = ggdy0.h();
            int v2 = ((ggna)gged0).c;
            ggek ggek0 = ggeo.i(v2);
            for(int v3 = 0; v3 < v2; ++v3) {
                fvhd fvhd0 = (fvhd)gged0.get(v3);
                if((fvhd0 instanceof fvhf)) {
                    ggek0.i(new fvek(1, fvhd0.r), fvhd0);
                }
                else if((fvhd0 instanceof fvhb)) {
                    ggek0.i(new fvek(3, fvhd0.r), fvhd0);
                }
                else if((fvhd0 instanceof fvgz)) {
                    ggek0.i(new fvek(6, fvhd0.r), fvhd0);
                }
                else if((fvhd0 instanceof fvho)) {
                    ggek0.i(new fvek(4, fvhd0.r), fvhd0);
                }
                else if((fvhd0 instanceof fvgw)) {
                    ggek0.i(new fvek(5, fvhd0.r), fvhd0);
                }
            }
            fvfp0.a = ggek0.b();
            ggek ggek1 = new ggek();
            for(Object object2: (gxpu0.c == null ? gxrf.a : gxpu0.c).g) {
                ggek1.i(new fvek(1, ((gxrw)object2).b), fvfo.c(((gxrw)object2)));
            }
            for(Object object3: (gxpu0.e == null ? gxqu.a : gxpu0.e).e) {
                ggek1.i(new fvek(3, ((gxrw)object3).b), fvfo.c(((gxrw)object3)));
            }
            for(Object object4: (gxpu0.d == null ? gxqm.a : gxpu0.d).f) {
                ggek1.i(new fvek(6, ((gxrw)object4).b), fvfo.c(((gxrw)object4)));
            }
            for(Object object5: (gxpu0.f == null ? gxqa.a : gxpu0.f).e) {
                ggek1.i(new fvek(5, ((gxrw)object5).b), fvfo.c(((gxrw)object5)));
            }
            for(Object object6: (gxpu0.g == null ? gxrr.a : gxpu0.g).f) {
                ggek1.i(new fvek(4, ((gxrw)object6).b), fvfo.c(((gxrw)object6)));
            }
            fvfp0.c = ggek1.b();
            gxrf gxrf0 = gxpu0.c == null ? gxrf.a : gxpu0.c;
            fvfp0.f = gxrf0.b == null ? gxrd.a : gxrf0.b;
            gxqm gxqm0 = gxpu0.d == null ? gxqm.a : gxpu0.d;
            fvfp0.g = gxqm0.b == null ? gxqk.a : gxqm0.b;
            gxqu gxqu0 = gxpu0.e == null ? gxqu.a : gxpu0.e;
            fvfp0.h = gxqu0.b == null ? gxqt.a : gxqu0.b;
            gxqa gxqa0 = gxpu0.f == null ? gxqa.a : gxpu0.f;
            fvfp0.i = gxqa0.b == null ? gxpz.a : gxqa0.b;
            gxrr gxrr1 = gxpu0.g == null ? gxrr.a : gxpu0.g;
            fvfp0.j = gxrr1.b == null ? gxrq.a : gxrr1.b;
            ggek ggek2 = new ggek();
            Integer integer0 = (int)1;
            gxrf gxrf1 = gxpu0.c == null ? gxrf.a : gxpu0.c;
            ggek2.i(integer0, fvfo.d((gxrf1.d == null ? gxsd.a : gxrf1.d)));
            gxqu gxqu1 = gxpu0.e == null ? gxqu.a : gxpu0.e;
            ggek2.i(Integer.valueOf(3), fvfo.d((gxqu1.c == null ? gxsd.a : gxqu1.c)));
            Integer integer1 = (int)6;
            gxqm gxqm1 = gxpu0.d == null ? gxqm.a : gxpu0.d;
            ggek2.i(integer1, fvfo.d((gxqm1.c == null ? gxsd.a : gxqm1.c)));
            Integer integer2 = (int)5;
            gxqa gxqa1 = gxpu0.f == null ? gxqa.a : gxpu0.f;
            ggek2.i(integer2, fvfo.d((gxqa1.c == null ? gxsd.a : gxqa1.c)));
            Integer integer3 = (int)4;
            gxrr gxrr2 = gxpu0.g == null ? gxrr.a : gxpu0.g;
            ggek2.i(integer3, fvfo.d((gxrr2.c == null ? gxsd.a : gxrr2.c)));
            fvfp0.d = ggek2.b();
            ggek ggek3 = new ggek();
            gxrf gxrf2 = gxpu0.c == null ? gxrf.a : gxpu0.c;
            ggek3.i(integer0, fvfo.b((gxrf2.e == null ? gxro.a : gxrf2.e)));
            gxqm gxqm2 = gxpu0.d == null ? gxqm.a : gxpu0.d;
            ggek3.i(integer1, fvfo.b((gxqm2.d == null ? gxro.a : gxqm2.d)));
            gxqa gxqa2 = gxpu0.f == null ? gxqa.a : gxpu0.f;
            ggek3.i(integer2, fvfo.b((gxqa2.f == null ? gxro.a : gxqa2.f)));
            gxrr gxrr3 = gxpu0.g == null ? gxrr.a : gxpu0.g;
            ggek3.i(integer3, fvfo.b((gxrr3.d == null ? gxro.a : gxrr3.d)));
            fvfp0.e = ggek3.b();
            if(v == 0) {
                ggeo0 = ggnf.a;
            }
            else {
                ggek ggek4 = new ggek();
                for(Object object7: (gxpu0.c == null ? gxrf.a : gxpu0.c).h) {
                    gxri gxri0 = (gxri)object7;
                    for(Object object8: gxri0.c) {
                        gxqj gxqj0 = (gxqj)object8;
                        fvfs fvfs0 = fvfs.a(gxqj0);
                        if(fvfs0 != null) {
                            ggek4.i(fvfo.a(1, gxri0.b, gxqj0), fvfs0);
                        }
                    }
                }
                for(Object object9: (gxpu0.d == null ? gxqm.a : gxpu0.d).g) {
                    gxqp gxqp0 = (gxqp)object9;
                    for(Object object10: gxqp0.c) {
                        gxqj gxqj1 = (gxqj)object10;
                        fvfs fvfs1 = fvfs.a(gxqj1);
                        if(fvfs1 != null) {
                            ggek4.i(fvfo.a(6, gxqp0.b, gxqj1), fvfs1);
                        }
                    }
                }
                for(Object object11: (gxpu0.f == null ? gxqa.a : gxpu0.f).g) {
                    gxqd gxqd0 = (gxqd)object11;
                    for(Object object12: gxqd0.c) {
                        gxqj gxqj2 = (gxqj)object12;
                        fvfs fvfs2 = fvfs.a(gxqj2);
                        if(fvfs2 != null) {
                            ggek4.i(fvfo.a(5, gxqd0.b, gxqj2), fvfs2);
                        }
                    }
                }
                for(Object object13: (gxpu0.e == null ? gxqu.a : gxpu0.e).f) {
                    gxqx gxqx0 = (gxqx)object13;
                    for(Object object14: gxqx0.c) {
                        gxqj gxqj3 = (gxqj)object14;
                        fvfs fvfs3 = fvfs.a(gxqj3);
                        if(fvfs3 != null) {
                            ggek4.i(fvfo.a(3, gxqx0.b, gxqj3), fvfs3);
                        }
                    }
                }
                for(Object object15: (gxpu0.g == null ? gxrr.a : gxpu0.g).g) {
                    gxrt gxrt0 = (gxrt)object15;
                    for(Object object16: gxrt0.c) {
                        gxqj gxqj4 = (gxqj)object16;
                        fvfs fvfs4 = fvfs.a(gxqj4);
                        if(fvfs4 != null) {
                            ggek4.i(fvfo.a(4, gxrt0.b, gxqj4), fvfs4);
                        }
                    }
                }
                ggeo0 = ggek4.b();
            }
            fvfp0.b = ggeo0;
            gxrf gxrf3 = gxpu0.c == null ? gxrf.a : gxpu0.c;
            fvfp0.k = fvhq.f((gxrf3.c == null ? gxrn.a : gxrf3.c));
            fvfp0.l = v1;
            return new fvfq(fvfp0);
        }
        return null;
    }
}

