import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

final class fueu implements ibtw {
    final fufb a;
    final fufb b;

    public fueu(fufb fufb0, fufb fufb1) {
        this.a = fufb0;
        this.b = fufb1;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        hey hey2;
        jbn jbn1;
        hey hey1;
        Boolean boolean3;
        fufb fufb1;
        jbn jbn0;
        goz goz0 = (goz)object0;
        if((((Number)object1).intValue() & 3) == 2 && goz0.ac()) {
            goz0.G();
            return ibom.a;
        }
        hey hey0 = hfc.e;
        fuez.c(dls.w(hey0), this.a, goz0, 6);
        goz0.M(0x880BB911);
        fufb fufb0 = this.b;
        fryv fryv0 = fufb0.e;
        Boolean boolean0 = null;
        Boolean boolean1 = fryv0 == null ? null : Boolean.valueOf(fryw.b(fryv0, ((Context)goz0.h(AndroidCompositionLocals_androidKt.b))));
        goz0.A();
        Boolean boolean2 = Boolean.valueOf(true);
        if(ibuq.m(boolean1, boolean2)) {
            goz0.M(2037135457);
            hfc hfc0 = iqn.a(hey0, "TestTagSubtitle");
            if(hyxx.c()) {
                goz0.M(2037298796);
                jbn0 = fpu.d(goz0).i;
            }
            else {
                goz0.M(0x796FD92B);
                jbn0 = fpu.d(goz0).h;
            }
            goz0.A();
            fufb1 = fufb0;
            boolean3 = boolean2;
            ftzd.a(fryv0, hfc0, fpu.a(goz0).q, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jbn0, goz0, 0x30, 0, 0x1FFF8);
            goz0 = goz0;
            goz0.A();
            hey1 = hey0;
        }
        else {
            fufb1 = fufb0;
            boolean3 = boolean2;
            goz0.M(2037527669);
            hey1 = hey0;
            dlv.a(dls.k(hey1, 0.0f), goz0);
            goz0.A();
        }
        fufb fufb2 = fufb1;
        fryv fryv1 = fufb2.f;
        goz0.M(0x880BFC91);
        if(fryv1 != null) {
            boolean0 = Boolean.valueOf(fryw.b(fryv1, ((Context)goz0.h(AndroidCompositionLocals_androidKt.b))));
        }
        goz0.A();
        if(ibuq.m(boolean0, boolean3)) {
            goz0.M(0x7974670F);
            hfc hfc1 = iqn.a(hey1, "TestTagSecondarySubtitle");
            if(hyxx.c()) {
                goz0.M(2037853324);
                jbn1 = fpu.d(goz0).i;
            }
            else {
                goz0.M(0x79784F2C);
                jbn1 = fpu.d(goz0).k;
            }
            goz0.A();
            ftzd.a(fryv1, hfc1, fpu.a(goz0).q, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jbn1, goz0, 0x30, 0, 0x1FFF8);
            goz0 = goz0;
            goz0.A();
            hey2 = hey1;
            fufb2 = fufb2;
        }
        else {
            goz0.M(2038081205);
            hey2 = hey1;
            dlv.a(dls.k(hey2, 0.0f), goz0);
            goz0.A();
        }
        fucg fucg0 = fufb2.h;
        if(fucg0 != null) {
            goz0.M(2038244048);
            hfc hfc2 = dku.c(hey2, -12.0f, 0.0f, 2);
            fuhp fuhp0 = hyxx.c() ? fuhp.b : fuhp.a;
            jjy jjy0 = new jjy(5);
            fuhx.b(hfc2, new fuhy(fuhq.c, false, fucg0.a, jjy0, null, null, null, fuhp0, null, fucg0.d, 850), null, goz0, 70, 4);
            goz0.A();
            return ibom.a;
        }
        goz0.M(2038744853);
        dlv.a(dls.k(hey2, 0.0f), goz0);
        goz0.A();
        return ibom.a;
    }
}

