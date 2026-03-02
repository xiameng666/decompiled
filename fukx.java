import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

final class fukx implements ibtx {
    final ibtw a;
    final boolean b;
    final int c;
    final long d;
    final fryv e;
    final fryv f;
    final fryv g;
    final ibth h;

    public fukx(ibtw ibtw0, boolean z, int v, long v1, fryv fryv0, fryv fryv1, fryv fryv2, ibth ibth0) {
        this.a = ibtw0;
        this.b = z;
        this.c = v;
        this.d = v1;
        this.e = fryv0;
        this.f = fryv1;
        this.g = fryv2;
        this.h = ibth0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v4;
        boolean z1;
        int v = ((Number)object2).intValue();
        ibuq.f(((dim)object0), "$this$Card");
        if((v & 17) == 16 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        hey hey0 = hfc.e;
        hfc hfc0 = dko.a(dla.j(hey0, 0.0f, 0.0f, 20.0f, 0.0f, 11));
        ibtw ibtw0 = this.a;
        boolean z = this.b;
        int v1 = this.c;
        long v2 = this.d;
        fryv fryv0 = this.e;
        fryv fryv1 = this.f;
        ibth ibth0 = this.h;
        hek hek0 = hei.j;
        iau iau0 = dll.b(dho.a, hek0, ((goz)object1), 0);
        int v3 = fuks.a(gol.c(((goz)object1)));
        gzk gzk0 = ((goz)object1).ap();
        hfc hfc1 = hew.c(((goz)object1), hfc0);
        fryv fryv2 = this.g;
        ibth ibth1 = iej.a;
        ((goz)object1).O();
        if(((goz)object1).ab()) {
            ((goz)object1).t(ibth1);
        }
        else {
            ((goz)object1).T();
        }
        ibtw ibtw1 = iej.e;
        guo.b(((goz)object1), iau0, ibtw1);
        ibtw ibtw2 = iej.d;
        guo.b(((goz)object1), gzk0, ibtw2);
        ibtw ibtw3 = iej.f;
        if(((goz)object1).ab()) {
            z1 = z;
            v4 = v1;
        label_38:
            Integer integer0 = v3;
            ((goz)object1).R(integer0);
            ((goz)object1).p(integer0, ibtw3);
        }
        else {
            z1 = z;
            v4 = v1;
            if(!ibuq.m(((goz)object1).k(), Integer.valueOf(v3))) {
                goto label_38;
            }
        }
        ibts ibts0 = iej.g;
        guo.a(((goz)object1), ibts0);
        ibtw ibtw4 = iej.c;
        guo.b(((goz)object1), hfc1, ibtw4);
        ibtw0.a(((goz)object1), Integer.valueOf(0));
        iau iau1 = dll.b(dho.g(8.0f), hek0, ((goz)object1), 6);
        int v5 = fuks.a(gol.c(((goz)object1)));
        gzk gzk1 = ((goz)object1).ap();
        hfc hfc2 = hew.c(((goz)object1), hey0);
        ((goz)object1).O();
        if(((goz)object1).ab()) {
            ((goz)object1).t(ibth1);
        }
        else {
            ((goz)object1).T();
        }
        guo.b(((goz)object1), iau1, ibtw1);
        guo.b(((goz)object1), gzk1, ibtw2);
        if(((goz)object1).ab() || !ibuq.m(((goz)object1).k(), Integer.valueOf(v5))) {
            Integer integer1 = v5;
            ((goz)object1).R(integer1);
            ((goz)object1).p(integer1, ibtw3);
        }
        guo.a(((goz)object1), ibts0);
        guo.b(((goz)object1), hfc2, ibtw4);
        hfc hfc3 = dla.j(hey0, 16.0f, 20.0f, 0.0f, 20.0f, 4);
        hfc hfc4 = dlo.a(dlq.a, hfc3, 1.0f);
        iau iau2 = dii.a(dho.g(4.0f), hei.m, ((goz)object1), 6);
        int v6 = fuks.a(gol.c(((goz)object1)));
        gzk gzk2 = ((goz)object1).ap();
        hfc hfc5 = hew.c(((goz)object1), hfc4);
        ((goz)object1).O();
        if(((goz)object1).ab()) {
            ((goz)object1).t(ibth1);
        }
        else {
            ((goz)object1).T();
        }
        guo.b(((goz)object1), iau2, ibtw1);
        guo.b(((goz)object1), gzk2, ibtw2);
        if(((goz)object1).ab() || !ibuq.m(((goz)object1).k(), Integer.valueOf(v6))) {
            Integer integer2 = v6;
            ((goz)object1).R(integer2);
            ((goz)object1).p(integer2, ibtw3);
        }
        guo.a(((goz)object1), ibts0);
        guo.b(((goz)object1), hfc5, ibtw4);
        grx grx0 = AndroidCompositionLocals_androidKt.b;
        String s = fryv0.a(((Context)((goz)object1).h(grx0))).toString();
        jbn jbn0 = fpu.d(((goz)object1)).h;
        gdh.b(s, null, fpu.a(((goz)object1)).q, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, jbn0, ((goz)object1), 0, 0, 0x1FFFA);
        goz goz0 = (goz)object1;
        goz0.M(0xFE60D78E);
        goz0.M(-27207900);
        boolean z2 = fryv1 != null && fryv1.a(((Context)goz0.h(grx0))).length() > 0;
        goz0.A();
        if(z2) {
            String s1 = fryv1.a(((Context)goz0.h(grx0))).toString();
            jbn jbn1 = fpu.d(goz0).k;
            gdh.b(s1, null, fpu.a(goz0).q, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, jbn1, goz0, 0, 0, 0x1FFFA);
            goz0 = goz0;
        }
        goz0.A();
        goz0.M(0xFE60FF31);
        goz0.M(0xFE60FD50);
        boolean z3 = fryv2 != null && fryv2.a(((Context)goz0.h(grx0))).length() > 0;
        goz0.A();
        if(z3) {
            hfc hfc6 = iqn.a(hey0, "WalletTipActionText");
            goz0.M(0xCDC41203);
            goz0.M(0x6E3C21FE);
            Object object3 = goz0.k();
            if(object3 == gop.a) {
                object3 = new fukt();
                goz0.R(object3);
            }
            goz0.A();
            hfc hfc7 = iuc.d(hey0, ((ibts)object3));
            goz0.A();
            hfc hfc8 = hfc6.a(hfc7);
            String s2 = fryv2.a(((Context)goz0.h(grx0))).toString();
            jbn jbn2 = fpu.d(goz0).m;
            gdh.b(s2, hfc8, fpu.a(goz0).a, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, jbn2, goz0, 0, 0, 0x1FFF8);
            goz0 = goz0;
        }
        goz0.A();
        goz0.M(0xFE61565F);
        goz0.A();
        goz0.z();
        goz0.M(0x2050DEC5);
        if(z1) {
            fugo.c(v4, 0x39B09, v2, gzf.e(927501521, new fukw(ibth0), goz0), goz0, 0xC30);
        }
        goz0.A();
        goz0.z();
        goz0.z();
        return ibom.a;
    }
}

