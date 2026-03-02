import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

public final class sjl {
    public static final dld a;
    public static final dld b;
    public static final dld c;
    public static final dld d;
    public static final float e;
    public static final float f;

    static {
        sjl.a = new dle(24.0f, 24.0f, 24.0f, 24.0f);
        sjl.b = dla.h(0.0f, 0.0f, 0.0f, 16.0f, 7);
        sjl.c = dla.h(0.0f, 0.0f, 0.0f, 16.0f, 7);
        sjl.d = dla.h(0.0f, 0.0f, 0.0f, 24.0f, 7);
        sjl.e = 8.0f;
        sjl.f = 12.0f;
    }

    public static final void a(float f, float f1, ibtw ibtw0, goz goz0, int v) {
        ibuq.f(ibtw0, "content");
        goz goz1 = goz0.ao(1043673763);
        int v1 = 1;
        int v2 = (v & 6) == 0 ? (goz1.U(f) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v2 |= (goz1.U(f1) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v2 |= (goz1.Z(ibtw0) ? 0x100 : 0x80);
        }
        if((v2 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
        }
        else {
            goz1.M(-1633490746);
            if((v2 & 0x70) != 0x20) {
                v1 = 0;
            }
            Object object0 = goz1.j();
            if((((v2 & 14) == 4 ? 1 : 0) | v1) != 0 || object0 == gop.a) {
                object0 = new six(f, f1);
                goz1.P(object0);
            }
            goz1.x();
            long v3 = gol.c(goz1);
            gzk gzk0 = goz1.ak();
            hfc hfc0 = hew.c(goz1, hfc.e);
            ibth ibth0 = iej.a;
            goz1.O();
            if(goz1.x) {
                goz1.t(ibth0);
            }
            else {
                goz1.T();
            }
            int v4 = (int)(v3 ^ v3 >>> 0x20);
            guo.b(goz1, ((iau)object0), iej.e);
            guo.b(goz1, gzk0, iej.d);
            ibtw ibtw1 = iej.f;
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v4))) {
                Integer integer0 = v4;
                goz1.P(integer0);
                goz1.p(integer0, ibtw1);
            }
            guo.a(goz1, iej.g);
            guo.b(goz1, hfc0, iej.c);
            ibtw0.a(goz1, Integer.valueOf(((v2 >> 6 & 14) << 6 & 0x380 | 6) >> 6 & 14));
            goz1.z();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new sis(f, f1, ibtw0, v);
        }
    }

    public static final void b(long v, jbn jbn0, ibtw ibtw0, goz goz0, int v1) {
        goz goz1 = goz0.ao(0xC39032E3);
        int v2 = (v1 & 6) == 0 ? (goz1.W(v) ? 4 : 2) | v1 : v1;
        if((v1 & 0x30) == 0) {
            v2 |= (goz1.X(jbn0) ? 0x20 : 16);
        }
        if((v1 & 0x180) == 0) {
            v2 |= (goz1.Z(ibtw0) ? 0x100 : 0x80);
        }
        if((v2 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
        }
        else {
            jbn jbn1 = ((jbn)goz1.h(gdh.a)).m(jbn0);
            gry[] arr_gry = new gry[2];
            hll hll0 = new hll(v);
            arr_gry[0] = fft.a.c(hll0);
            arr_gry[1] = gdh.a.c(jbn1);
            gpo.b(arr_gry, ibtw0, goz1, v2 >> 3 & 0x70 | 8);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new siu(v, jbn0, ibtw0, v1);
        }
    }

    public static final void c(sip sip0, sip sip1, String s, ibtw ibtw0, ibtw ibtw1, goz goz0, int v) {
        ibtw ibtw2;
        goz goz1 = goz0.ao(0x5231A1C7);
        int v1 = (v & 6) == 0 ? (goz1.X(sip0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.X(sip1) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.X(s) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (goz1.Z(ibtw0) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            v1 |= (goz1.Z(ibtw1) ? 0x4000 : 0x2000);
        }
        if((v1 & 9363) == 9362 && goz1.ac()) {
            goz1.G();
            ibtw2 = ibtw0;
        }
        else {
            goz1.M(0x81C6393B);
            Configuration configuration0 = (Configuration)goz1.h(AndroidCompositionLocals_androidKt.a);
            float f = (float)configuration0.screenWidthDp;
            int v2 = configuration0.orientation;
            goz1.x();
            hfc hfc0 = dls.o(hfc.e, f * (v2 == 2 ? 0.65f : 0.85f));
            goz1.M(0x8C50B4F9);
            gze gze0 = null;
            gze gze1 = s == null ? null : gzf.e(0xCBE5F341, new siy(s), goz1);
            goz1.x();
            goz1.M(-1940863074);
            if(ibtw1 != null) {
                gze0 = gzf.e(0x72EAE769, new sja(ibtw1), goz1);
            }
            goz1.x();
            ibtw2 = ibtw0;
            sjl.d(gzf.e(0x56B660EC, new sjf(sip1, sip0), goz1), hfc0, ibtw2, gze1, gze0, goz1, v1 >> 3 & 0x380 | 6);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new siv(sip0, sip1, s, ibtw2, ibtw1, v);
        }
    }

    public static final void d(ibtw ibtw0, hfc hfc0, ibtw ibtw1, ibtw ibtw2, ibtw ibtw3, goz goz0, int v) {
        goz goz2;
        ibuq.f(ibtw0, "buttons");
        goz goz1 = goz0.ao(0x413BD301);
        int v1 = (v & 6) == 0 ? (goz1.Z(ibtw0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.X(hfc0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.Z(ibtw1) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (goz1.Z(ibtw2) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            v1 |= (goz1.Z(ibtw3) ? 0x4000 : 0x2000);
        }
        if((v1 & 9363) == 9362 && goz1.ac()) {
            goz1.G();
            goz2 = goz1;
        }
        else {
            long v2 = fpu.a(goz1).G;
            gze gze0 = gzf.e(197622940, new sjk(ibtw1, ibtw2, ibtw3, ibtw0), goz1);
            goz2 = goz1;
            gaq.c(hfc0, sii.a, v2, 0L, 0.0f, 0.0f, null, gze0, goz2, 120);
        }
        gsb gsb0 = goz2.af();
        if(gsb0 != null) {
            gsb0.d = new sit(ibtw0, hfc0, ibtw1, ibtw2, ibtw3, v);
        }
    }
}

