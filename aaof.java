import java.util.ArrayList;

public final class aaof implements lqj {
    public final aaon a;

    public aaof(aaon aaon0) {
        this.a = aaon0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        if(((gfsx)object0).i()) {
            aaon aaon0 = this.a;
            aaol aaol0 = ((aaom)((gfsx)object0).d()).a;
            zho zho0 = ((aaom)((gfsx)object0).d()).b;
            grul grul0 = zho0.a();
            boolean z = !aaon0.l.a() && (grul0.b & 2) != 0;
            if(zho0.a.c != 1000 && (!aadw.b(grul0) || z || !zho0.c() || zho0.c)) {
                aaon0.c();
                grxw grxw0 = aaon0.b();
                grwp grwp0 = aaol0.b;
                grxw grxw1 = grwp0.c == null ? grxw.a : grwp0.c;
                if(aadw.b(grul0)) {
                    fhru fhru0 = new fhru(new aamp(grul0, aaon0.a.d(), aaon0.a.g, false, false, grxw0, grxw1));
                    aaon0.g.l(fhru0);
                    return;
                }
                aaon0.a.l.f(grxw0, grxw1);
                aany aany0 = aany.a((grwp0.d == null ? grum.a : grwp0.d).c);
                aanz aanz0 = aaon0.k(grxw0, aaol0.a);
                ArrayList arrayList0 = aaon0.b;
                arrayList0.add(aanz0);
                if(aaol0.c - 1 == 1 || aaol0.c - 1 == 4) {
                    aanz aanz1 = aaon0.k(grxw1, aape.a);
                    grxw grxw2 = aanz1.b;
                    if(grxw2 != null) {
                        int v = arrayList0.size() - 1;
                        int v1 = -1;
                        while(v >= 0 && bata.b(grxw2, ((aanz)arrayList0.get(v)).b)) {
                            v1 = v;
                            --v;
                        }
                        if(v1 != -1) {
                            if(bata.b(((aanz)arrayList0.get(v1)).a, aanz1.a)) {
                                aaop.a(arrayList0, v1);
                            }
                            else {
                                aaop.a(arrayList0, v1 + 1);
                            }
                        }
                    }
                }
                else if(arrayList0.size() >= 2 && bata.b(((aanz)gggq.p(arrayList0)).a, grxw1) && bata.b(((aanz)arrayList0.get(arrayList0.size() - 2)).a, grxw1)) {
                    arrayList0.remove(arrayList0.size() - 2);
                }
                aaon0.c.l(new aaok(grxw1, null, false, aany0, null, grxw1.c == grxw0.c));
                aaon0.g();
                aaon0.d();
            }
        }
    }
}

