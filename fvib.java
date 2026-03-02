import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class fvib {
    private final fvgx a;
    private final fvia b;
    private final Map c;
    private final boolean d;
    private final fvfi e;

    public fvib(fvgx fvgx0, fvfi fvfi0, boolean z) {
        this.b = new fvia();
        this.c = new HashMap();
        this.a = fvgx0;
        this.e = fvfi0;
        this.d = z;
    }

    public final fvgk a(fvel fvel0, fvhw fvhw0) {
        fvhd fvhd0;
        fvfi fvfi0 = this.e;
        if(fvfi0 == null) {
            fvgx fvgx0 = this.a;
            gftb.check(fvgx0);
            if(fvgx0.a(fvhw0)) {
                fvhd0 = fvgx0.b(fvel0);
            label_8:
                if(fvhd0 != null && !fvhd0.h(fvhw0)) {
                    fveh fveh0 = fvel0.b.bQ;
                    if(!fvhd0.f(fveh0) || !fvhd0.g(fveh0)) {
                        fvhd0 = null;
                    }
                }
                else {
                    fvhd0 = null;
                }
            }
            else {
                fvhd0 = null;
            }
        }
        else {
            fvhd0 = fvfi0.D(fvel0);
            goto label_8;
        }
        if(fvhd0 == null) {
            return null;
        }
        if(this.d) {
            try {
                Map map0 = this.c;
                if(!map0.containsKey(fvel0)) {
                    map0.put(fvel0, new fvic(fvel0.a));
                }
                fvic fvic0 = (fvic)map0.get(fvel0);
                if(!fvic0.b(fvhw0)) {
                    double f = fvic0.a * 1000000000.0;
                    ArrayList arrayList0 = new ArrayList();
                    for(int v = 0; v <= 3; ++v) {
                        arrayList0.add(this.b(fvel0, fvhw0.s(((long)v) * ((long)f))));
                    }
                    fvhw fvhw1 = fvhw0.s(((long)f) * 3L);
                    gftb.d(arrayList0.size() == 4, "The input observation of satellite PVTs must be of length %s.", 4);
                    fvic0.c = fvhw0.c();
                    double f1 = fvic0.a(fvhw1);
                    double f2 = ((fvgk)arrayList0.get(0)).a.a;
                    double f3 = ((fvgk)arrayList0.get(1)).a.a;
                    fvgr fvgr0 = ((fvgk)arrayList0.get(2)).a;
                    double f4 = ((fvgk)arrayList0.get(3)).a.a;
                    fvic0.b[0] = fvhy.c(f1, f2, f3, fvgr0.a, f4);
                    fvic0.b[1] = fvhy.c(f1, ((fvgk)arrayList0.get(0)).a.b, ((fvgk)arrayList0.get(1)).a.b, ((fvgk)arrayList0.get(2)).a.b, ((fvgk)arrayList0.get(3)).a.b);
                    fvic0.b[2] = fvhy.c(f1, ((fvgk)arrayList0.get(0)).a.c, ((fvgk)arrayList0.get(1)).a.c, ((fvgk)arrayList0.get(2)).a.c, ((fvgk)arrayList0.get(3)).a.c);
                    fvic0.b[3] = fvhy.c(f1, ((fvgk)arrayList0.get(0)).c, ((fvgk)arrayList0.get(1)).c, ((fvgk)arrayList0.get(2)).c, ((fvgk)arrayList0.get(3)).c);
                }
                gftb.b(fvic0.b(fvhw0), "The satellite polyfitting computer is invalid for the input time.");
                int v1 = 0;
                while(v1 < 4) {
                    if(fvic0.b[v1] == null) {
                        throw new fvgi(null);
                    }
                    ++v1;
                    continue;
                }
                double f5 = fvic0.a(fvhw0);
                fvgj fvgj0 = new fvgj();
                fvgj0.a = new fvgr(fvic0.b[0].a(f5), fvic0.b[1].a(f5), fvic0.b[2].a(f5));
                fvgj0.c = fvic0.b[3].a(f5);
                fvgj0.b = new fvgr(fvic0.b[0].b(f5), fvic0.b[1].b(f5), fvic0.b[2].b(f5));
                fvgj0.d = fvic0.b[3].b(f5);
                return new fvgk(fvgj0);
            }
            catch(fvgi unused_ex) {
            }
        }
        return this.b(fvel0, fvhw0);
    }

    private final fvgk b(fvel fvel0, fvhw fvhw0) {
        fvuf fvuf1;
        double f15;
        fvhd fvhd0;
        fvfi fvfi0 = this.e;
        if(fvfi0 == null) {
            gftb.check(this.a);
            fvhd0 = this.a.b(fvel0);
        }
        else {
            fvhd0 = fvfi0.D(fvel0);
        }
        gftb.check(fvhd0);
        if(fvel0.a.a == 3) {
            fvia fvia0 = this.b;
            fvel0.a();
            gftb.b(fvhd0 instanceof fvhb, "Expecting a GLONASS ephemeris.");
            double f = fvia.b(((fvhb)fvhd0), fvhw0) / 0.0003;
            fvhw fvhw1 = new fvhw(fvhw0.a - ((int)(((long)f) / 604800000000000000L)), fvhw0.b - ((long)f) % 604800000000000000L);
            Long long0 = (Long)fvhw1.t().b;
            gftb.check(long0);
            double f1 = (double)(((long)long0));
            fvhs fvhs0 = new fvhs();
            fvhs0.a = ((fvhb)fvhd0).a.a;
            fvhs0.e(((fvhb)fvhd0).a.b);
            fvhs0.b(((fvhb)fvhd0).a.c);
            fvhs0.c(((fvhb)fvhd0).a.d);
            fvhs0.d(((fvhb)fvhd0).a.e);
            fvhs0.g(((fvhb)fvhd0).a.f);
            fvhs0.f(((fvhb)fvhd0).a.g);
            fvhs0.c(0);
            fvhs0.d(0);
            fvhs0.g(0);
            fvhs0.f(0L);
            fvht fvht0 = fvhs0.a();
            int v = fvht0.a;
            gftb.d(v >= 1901 && v <= 2099, "The UTC year %s is not in the valid range: 1900 < year < 2100. ", v);
            int v1 = fvht0.b;
            int v2 = fvht0.d;
            int v3 = fvht0.e;
            if(v1 <= 2) {
                v1 += 12;
                --v;
            }
            double f2 = (Math.floor(((double)v) * 365.25) + Math.floor(((double)(v1 + 1)) * 30.6001) - 15.0 + 1720996.5 + ((double)fvht0.c) + ((double)(v2 + v3 / 60 + v3 / 3600)) / 24.0 - 2451545.0) / 36525.0;
            double f3 = f2 * f2;
            double f4 = fvih.c((8640184.812866 * f2 + 24110.54841 + f3 * 0.093104 - f2 * f3 * 0.000006) / 3600.0, 24.0, 1) * 0.261799;
            double f5 = fvia.a(((fvhb)fvhd0));
            double f6 = fvih.c(f5 + 10800.0, 86400.0, 1);
            double f7 = f4 + f5 * 0.000073;
            double f8 = Math.cos(f7);
            fvhw fvhw2 = fvhw1;
            double f9 = Math.sin(f7);
            double f10 = ((fvhb)fvhd0).k;
            new double[]{((fvhb)fvhd0).i * f8 - ((fvhb)fvhd0).j * f9, f9 * ((fvhb)fvhd0).i + ((fvhb)fvhd0).j * f8, f10};
            double f11 = ((fvhb)fvhd0).c * f8 - ((fvhb)fvhd0).d * f9;
            double f12 = ((fvhb)fvhd0).c * f9 + ((fvhb)fvhd0).d * f8;
            double[] arr_f = {f11, f12, ((fvhb)fvhd0).e, ((fvhb)fvhd0).f * f8 - ((fvhb)fvhd0).g * f9 - f12 * 0.000073, ((fvhb)fvhd0).f * f9 + ((fvhb)fvhd0).g * f8 + f11 * 0.000073, ((fvhb)fvhd0).h, f5 * 0.000073};
            double f13 = ((fvhb)fvhd0).i * f8 - ((fvhb)fvhd0).j * f9;
            double f14 = f9 * ((fvhb)fvhd0).i + ((fvhb)fvhd0).j * f8;
            if(Double.compare(f1 * 1.000000E-12, 21600.0) < 0 && (f6 > 64800.0)) {
                f15 = f1 * 1.000000E-12 + 86400.0;
            }
            else {
                if((f1 * 1.000000E-12 > 64800.0) && (f6 < 21600.0)) {
                    f6 += 86400.0;
                }
                f15 = f1 * 1.000000E-12;
            }
            double[] arr_f1 = new double[7];
            fvif fvif0 = fvia0.a;
            double f16 = f15 - f6;
            int v4 = Math.max(((int)Math.ceil(Math.abs(f16) / fvif0.a)), 1);
            System.arraycopy(arr_f, 0, arr_f1, 0, 7);
            int v5 = 0;
            while(v5 < v4) {
                double f17 = f16 / ((double)v4);
                double[] arr_f2 = fvif0.b;
                fvhz.a(arr_f1, arr_f2, f13, f14, f10);
                fvif.a(arr_f1, arr_f2, f17 / 2.0, fvif0.f);
                fvhz.a(fvif0.f, fvif0.c, f13, f14, f10);
                double[] arr_f3 = fvif0.c;
                fvif.a(arr_f1, arr_f3, f17 / 2.0, fvif0.f);
                double[] arr_f4 = fvif0.d;
                fvhz.a(fvif0.f, arr_f4, f13, f14, f10);
                fvif.a(arr_f1, arr_f4, f17, fvif0.f);
                double[] arr_f5 = fvif0.e;
                fvhz.a(fvif0.f, arr_f5, f13, f14, f10);
                for(int v6 = 0; v6 < 7; ++v6) {
                    double f18 = arr_f1[v6];
                    double f19 = arr_f2[v6];
                    double f20 = arr_f3[v6];
                    double f21 = arr_f4[v6];
                    arr_f1[v6] = f18 + f17 / 6.0 * (f19 + (f20 + f20) + (f21 + f21) + arr_f5[v6]);
                }
                ++v5;
                fvhw2 = fvhw2;
            }
            double f22 = arr_f1[6] + f4;
            double f23 = Math.cos(f22);
            double f24 = Math.sin(f22);
            double f25 = arr_f1[3];
            double f26 = arr_f1[4];
            double f27 = -arr_f1[0] * f24 + arr_f1[1] * f23;
            double f28 = arr_f1[0] * f23 + arr_f1[1] * f24;
            double f29 = arr_f1[5];
            fvuf fvuf0 = new fvuf(new fvgr(f28 - 0.36, f27 + 0.08, arr_f1[2] + 0.18), new fvgr(f25 * f23 + f26 * f24 + f27 * 0.000073, -f25 * f24 + f26 * f23 - f28 * 0.000073, f29));
            double f30 = fvia.b(((fvhb)fvhd0), fvhw2);
            fvgj fvgj0 = new fvgj();
            fvgj0.a = (fvgr)fvuf0.a;
            gftb.check(((fvgr)fvuf0.b));
            fvgj0.b = (fvgr)fvuf0.b;
            fvgj0.c = f30;
            fvgj0.d = ((fvhb)fvhd0).m * 299792458.0;
            return new fvgk(fvgj0);
        }
        double f31 = fvel0.a();
        gftb.b(fvhd0 instanceof fvhj, "Expecting a Keplerian ephemeris.");
        fvid fvid0 = fvie.c(f31, ((fvhj)fvhd0), fvhw0);
        fvid fvid1 = fvie.c(f31, ((fvhj)fvhd0), fvhw0.s(500000000L));
        fvid fvid2 = fvie.c(f31, ((fvhj)fvhd0), fvhw0.r(500000000L));
        double f32 = fvid0.c;
        fvhl fvhl0 = ((fvhj)fvhd0).k;
        double f33 = Math.cos(fvid0.b);
        double f34 = Math.sin(fvid0.b);
        double f35 = 1.0 - fvhl0.d * fvhl0.d;
        double f36 = fvid1.a;
        double f37 = fvid2.a;
        double f38 = Math.atan2(Math.sqrt(f35) * f34, f33 - fvhl0.d) + fvhl0.g;
        double f39 = f38 + f38;
        double f40 = Math.cos(f39);
        double f41 = Math.sin(f39);
        double f42 = fvhl0.e * fvhl0.e;
        double f43 = f38 + (fvhl0.p * f41 + fvhl0.o * f40);
        double f44 = Math.cos(f43);
        double f45 = Math.sin(f43);
        double f46 = 1.0 - f33 * fvhl0.d;
        double f47 = f42 * f46 + (fvhl0.n * f41 + fvhl0.m * f40);
        double f48 = f47 * f44;
        double f49 = f47 * f45;
        double f50 = fvie.b(((fvhj)fvhd0));
        double f51 = fvhl0.j + (fvhl0.l * f41 + fvhl0.k * f40) + fvhl0.i * f32;
        double f52 = Math.cos(f51);
        double f53 = Math.sin(f51);
        double f54 = fvhl0.f;
        double f55 = fvie.d(((fvhj)fvhd0)) ? 0.0 : f50 * f32;
        double f56 = fvhl0.h + fvhl0.f * f32 - fvhl0.a * f50 - f55;
        double f57 = Math.cos(f56);
        double f58 = f49 * f52;
        double f59 = Math.sin(f56);
        double f60 = (Math.sqrt(fvie.a(((fvhj)fvhd0)) / (f42 * f42 * f42)) + fvhl0.b) / f46;
        double f61 = Math.sqrt(f35) * f60 / f46;
        double f62 = f61 + f61;
        double f63 = fvhl0.i + (fvhl0.l * f40 - fvhl0.k * f41) * f62;
        double f64 = fvhl0.d * f42 * f60 * f34 + (fvhl0.n * f40 - f41 * fvhl0.m) * f62;
        double f65 = f61 + f62 * (fvhl0.p * f40 - fvhl0.o * f41);
        if(fvie.d(((fvhj)fvhd0))) {
            f50 = 0.0;
        }
        double f66 = f54 - f50;
        double f67 = f44 * f64 - f49 * f65;
        double f68 = f48 * f66;
        double f69 = f64 * f45 + f65 * f48;
        fvgr fvgr0 = new fvgr(f48 * f57 - f58 * f59, f48 * f59 + f58 * f57, f49 * f53);
        fvgr fvgr1 = new fvgr(f67 * f57 - f68 * f59 - f69 * f59 * f52 - (f66 * f57 * f52 - f63 * f59 * f53) * f49, f67 * f59 + f68 * f57 + f69 * f57 * f52 - (f66 * f59 * f52 + f63 * f57 * f53) * f49, f69 * f53 + f49 * f63 * f52);
        if(fvie.d(((fvhj)fvhd0))) {
            double f70 = fvie.b(((fvhj)fvhd0));
            double f71 = f32 * f70;
            double f72 = Math.cos(f71);
            double f73 = Math.sin(f71);
            fvgr fvgr2 = new fvgr(f72, f73 * fvie.a, f73 * fvie.b);
            fvgr fvgr3 = new fvgr(-f73, f72 * fvie.a, f72 * fvie.b);
            fvgr fvgr4 = new fvgr(0.0, -fvie.b, fvie.a);
            fvgr fvgr5 = new fvgr(fvgr1.a(fvgr2), fvgr1.a(fvgr3), fvgr1.a(fvgr4));
            fvgr fvgr6 = new fvgr(fvgr0.a(new fvgr(-f73 * f70, f72 * fvie.a * f70, f72 * fvie.b * f70)), fvgr0.a(new fvgr(-f72 * f70, -f73 * fvie.a * f70, -f73 * fvie.b * f70)), fvgr0.a(new fvgr(0.0, 0.0, 0.0)));
            fvuf1 = new fvuf(new fvgr(fvgr0.a(fvgr2), fvgr0.a(fvgr3), fvgr0.a(fvgr4)), new fvgr(fvgr5.a + fvgr6.a, fvgr5.b + fvgr6.b, fvgr5.c + fvgr6.c));
        }
        else {
            fvuf1 = new fvuf(fvgr0, fvgr1);
        }
        fvgj fvgj1 = new fvgj();
        fvgj1.a = (fvgr)fvuf1.a;
        gftb.check(((fvgr)fvuf1.b));
        fvgj1.b = (fvgr)fvuf1.b;
        fvgj1.c = fvid0.a;
        fvgj1.d = f36 - f37;
        return new fvgk(fvgj1);
    }
}

