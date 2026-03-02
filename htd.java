import java.util.List;
import java.util.Map;

public final class htd {
    public static final long a(jks jks0, float f, float f1) {
        return ((long)Float.floatToRawIntBits(jks0.eg(f))) << 0x20 | ((long)Float.floatToRawIntBits(jks0.eg(f1))) & 0xFFFFFFFFL;
    }

    public static final long b(long v, float f, float f1) {
        if(Float.isNaN(f)) {
            f = Float.intBitsToFloat(((int)(v >> 0x20)));
        }
        if(Float.isNaN(f1)) {
            f1 = Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL)));
        }
        return ((long)Float.floatToRawIntBits(f)) << 0x20 | ((long)Float.floatToRawIntBits(f1)) & 0xFFFFFFFFL;
    }

    public static final hlm c(long v, int v1) {
        return v != 16L ? new hlb(v, v1) : null;
    }

    public static final void d(hsv hsv0, long v, long v1, String s, hlm hlm0, boolean z) {
        hkf hkf0 = new hkf(v);
        hsv0.a.b(hkf0);
        hsv0.b.b(Boolean.valueOf(z));
        hsv0.c.e.b(hlm0);
        hkf hkf1 = new hkf(v1);
        hsv0.c.f.b(hkf1);
        hsv0.c.b = s;
    }

    public static final void e(hqb hqb0, hsr hsr0) {
        List list0 = hsr0.j;
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            hst hst0 = (hst)list0.get(v1);
            if((hst0 instanceof hte)) {
                hqi hqi0 = new hqi();
                hqi0.e(((hte)hst0).b);
                hqi0.f(((hte)hst0).c);
                hqi0.q();
                hqi0.a(((hte)hst0).d);
                hqi0.d(((hte)hst0).e);
                hqi0.g(((hte)hst0).f);
                hqi0.i(((hte)hst0).g);
                hqi0.m(((hte)hst0).h);
                hqi0.j(((hte)hst0).i);
                hqi0.k(((hte)hst0).j);
                hqi0.l(((hte)hst0).k);
                hqi0.p(((hte)hst0).l);
                hqi0.n(((hte)hst0).m);
                hqi0.o(((hte)hst0).n);
                hqb0.d(v1, hqi0);
            }
            else if((hst0 instanceof hsr)) {
                hqb hqb1 = new hqb();
                hqb1.i(((hsr)hst0).a);
                hqb1.l(((hsr)hst0).b);
                hqb1.m(((hsr)hst0).e);
                hqb1.n(((hsr)hst0).f);
                hqb1.o(((hsr)hst0).g);
                hqb1.p(((hsr)hst0).h);
                hqb1.j(((hsr)hst0).c);
                hqb1.k(((hsr)hst0).d);
                hqb1.g(((hsr)hst0).i);
                htd.e(hqb1, ((hsr)hst0));
                hqb0.d(v1, hqb1);
            }
        }
    }

    public static final void f(hsr hsr0, Map map0, goz goz0, int v) {
        hsq hsq1;
        goz goz1 = goz0.ao(0xE567D85F);
        int v1 = (v & 6) == 0 ? (goz1.X(hsr0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(map0) ? 0x20 : 16);
        }
        if(goz1.ad((v1 & 19) != 18, v1 & 1)) {
            for(hsq hsq0 = new hsq(hsr0); hsq0.hasNext(); hsq0 = hsq1) {
                hst hst0 = hsq0.a();
                if((hst0 instanceof hte)) {
                    goz1.M(0x2F97A6EB);
                    String s = ((hte)hst0).a;
                    hsp hsp0 = (hsp)map0.get(s);
                    if(hsp0 == null) {
                        hsp0 = new hsy();
                    }
                    List list0 = (List)hsp0.a(hth.a, ((hte)hst0).b);
                    hlf hlf0 = (hlf)hsp0.a(htf.a, ((hte)hst0).d);
                    hlf hlf1 = (hlf)hsp0.a(htn.a, ((hte)hst0).f);
                    hsq1 = hsq0;
                    hso.b(list0, ((hte)hst0).c, s, hlf0, ((Number)hsp0.a(htg.a, Float.valueOf(((hte)hst0).e))).floatValue(), hlf1, ((Number)hsp0.a(hto.a, Float.valueOf(((hte)hst0).g))).floatValue(), ((Number)hsp0.a(htp.a, Float.valueOf(((hte)hst0).h))).floatValue(), ((hte)hst0).i, ((hte)hst0).j, ((hte)hst0).k, ((Number)hsp0.a(htu.a, Float.valueOf(((hte)hst0).l))).floatValue(), ((Number)hsp0.a(hts.a, Float.valueOf(((hte)hst0).m))).floatValue(), ((Number)hsp0.a(htt.a, Float.valueOf(((hte)hst0).n))).floatValue(), goz1, 0, 0);
                    goz1 = goz1;
                }
                else {
                    hsq1 = hsq0;
                    if((hst0 instanceof hsr)) {
                        goz1.M(0x2FAD3C8C);
                        String s1 = ((hsr)hst0).a;
                        hsp hsp1 = (hsp)map0.get(s1);
                        if(hsp1 == null) {
                            hsp1 = new hsz();
                        }
                        List list1 = (List)hsp1.a(hth.a, ((hsr)hst0).i);
                        gze gze0 = gzf.e(1450046638, new hsw(hst0, map0), goz1);
                        hso.a(s1, ((Number)hsp1.a(htk.a, Float.valueOf(((hsr)hst0).b))).floatValue(), ((Number)hsp1.a(hti.a, Float.valueOf(((hsr)hst0).c))).floatValue(), ((Number)hsp1.a(htj.a, Float.valueOf(((hsr)hst0).d))).floatValue(), ((Number)hsp1.a(htl.a, Float.valueOf(((hsr)hst0).e))).floatValue(), ((Number)hsp1.a(htm.a, Float.valueOf(((hsr)hst0).f))).floatValue(), ((Number)hsp1.a(htq.a, Float.valueOf(((hsr)hst0).g))).floatValue(), ((Number)hsp1.a(htr.a, Float.valueOf(((hsr)hst0).h))).floatValue(), list1, gze0, goz1, 0x30000000);
                    }
                    else {
                        goz1.M(0x2E9F4323);
                    }
                }
                goz1.x();
            }
        }
        else {
            goz1.G();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new hsx(hsr0, map0, v);
        }
    }

    public static final hsv g(hqf hqf0, goz goz0) {
        jks jks0 = (jks)goz0.h(ipa.d);
        float f = jks0.dX();
        Object object0 = goz0.k();
        if(goz0.W(((long)Float.floatToRawIntBits(f)) & 0xFFFFFFFFL | ((long)Float.floatToRawIntBits(hqf0.m)) << 0x20) || object0 == gop.a) {
            hqb hqb0 = new hqb();
            htd.e(hqb0, hqf0.i);
            long v = htd.a(jks0, hqf0.e, hqf0.f);
            hsv hsv0 = new hsv(hqb0);
            hlm hlm0 = htd.c(hqf0.j, hqf0.k);
            htd.d(hsv0, v, htd.b(v, hqf0.g, hqf0.h), hqf0.d, hlm0, hqf0.l);
            goz0.R(hsv0);
            object0 = hsv0;
        }
        return (hsv)object0;
    }
}

