public class beqv extends lsb {
    public final lqd a;
    public final lqi b;
    public final lqh c;
    private final beih d;
    private final begp e;

    public beqv(beih beih0, begp begp0, beev beev0, beli beli0) {
        lqi lqi0 = new lqi();
        this.b = lqi0;
        lqh lqh0 = new lqh();
        this.c = lqh0;
        this.d = beih0;
        this.e = begp0;
        lqd lqd0 = lsa.b(beli0.a(), new beqs(beev0));
        this.a = lqd0;
        lqh0.o(lqd0, new beqt(this));
        lqh0.o(lqi0, new bequ(this));
    }

    public static bedv a(bedv bedv0, String s) {
        Object object0 = null;
        if(bedv0 == null) {
            return null;
        }
        if(gfta.c(s)) {
            return bedv0;
        }
        String s1 = s.toLowerCase(bgmp.b());
        Object object1 = bedv0.b;
        if(object1 != null) {
            ggdy ggdy0 = new ggdy();
            int v = ((gged_interceptors)object1).size();
            int v1 = 0;
            while(v1 < v) {
                gqlt gqlt0 = (gqlt)((gged_interceptors)object1).get(v1);
                if(gqlt0.b.c.toLowerCase(bgmp.b()).contains(s1)) {
                label_31:
                    ggdy0.i(gqlt0);
                }
                else {
                    gged_interceptors gged0 = gqlt0.c;
                    int v2 = ((ggna)gged0).c;
                    int v3 = 0;
                    while(v3 < v2) {
                        gqmd gqmd0 = (gqmd)gged0.get(v3);
                        if(gqmd0.k().toLowerCase(bgmp.b()).contains(s1)) {
                            goto label_31;
                        }
                        boolean z = false;
                        ggqj ggqj0 = gqmd0.d().om();
                        while(ggqj0.hasNext()) {
                            Object object2 = ggqj0.next();
                            String s2 = ((hhyf)object2).c.toLowerCase(bgmp.b());
                            if(!s2.startsWith("android://") && s2.contains(s1)) {
                                z = true;
                                break;
                            }
                        }
                        if(!z) {
                            ++v3;
                            continue;
                        }
                        goto label_31;
                    }
                }
                ++v1;
            }
            object0 = ggdy0.h();
        }
        return new bedv(bedv0.a, object0, bedv0.c);
    }

    public final void b(bedv bedv0) {
        lqh lqh0 = this.c;
        if(lqh0.ij() != bedv0) {
            lqh0.l(bedv0);
        }
    }

    public final void c() {
        bedv bedv0 = new bedv(bedu.b, null, null);
        this.d.e.l(bedv0);
        bedv bedv1 = new bedv(bedu.b, null, null);
        this.d.p.f(bedv1);
        bedv bedv2 = new bedv(bedu.b, null, null);
        this.d.g.l(bedv2);
        bedv bedv3 = new bedv(bedu.b, null, null);
        this.d.k.l(bedv3);
        bedv bedv4 = new bedv(bedu.b, null, null);
        this.d.r.f(bedv4);
        evql evql0 = this.d.b.d();
        this.d.e(evql0).A(new behe(this.d));
        this.e.b();
    }

    public final void e() {
        this.f(null);
    }

    public final void f(String s) {
        this.b.l(s);
    }
}

