public final class cns {
    public static final hpw a(cog cog0, boolean z, goz goz0) {
        float f = cog0.a.g;
        float f1 = cog0.a.h;
        String s = cog0.a.d;
        long v = cog0.a.j;
        int v1 = cog0.a.k;
        gze gze0 = gzf.e(0x8F0886E2, new cnr(z, cog0, cof.a), goz0);
        long v2 = htd.a(((jks)goz0.h(ipa.d)), cog0.a.e, cog0.a.f);
        long v3 = htd.b(v2, f, f1);
        int v4 = goz0.W(v) | goz0.V(v1);
        Object object0 = goz0.j();
        if(v4 != 0 || object0 == gop.a) {
            object0 = htd.c(v, v1);
            goz0.P(object0);
        }
        goz0.M(0x2F100BD7);
        Object object1 = goz0.j();
        Object object2 = gop.a;
        if(object1 == object2) {
            object1 = new hsv(null);
            goz0.P(object1);
        }
        htd.d(((hsv)object1), v2, v3, s, ((hlm)object0), true);
        gpg gpg0 = gol.e(goz0);
        int v5 = goz0.U(f) | goz0.U(f1);
        Object object3 = goz0.j();
        if(v5 != 0 || object3 == object2) {
            gpf gpf0 = ((hsv)object1).d;
            if(gpf0 == null || gpf0.f()) {
                gpf0 = new gpj(gpg0, new hri(((hsv)object1).c.a));
            }
            object3 = gpf0;
            ((gpf)object3).e(new gze(1749374910, true, new htc(gze0, v3)));
            goz0.P(object3);
        }
        ((hsv)object1).d = (gpf)object3;
        boolean z1 = goz0.Z(((gpf)object3));
        Object object4 = goz0.j();
        if(z1 || object4 == object2) {
            object4 = new htb(((gpf)object3));
            goz0.P(object4);
        }
        gqe.c(((hsv)object1), ((ibts)object4), goz0);
        goz0.x();
        return (hsv)object1;
    }
}

