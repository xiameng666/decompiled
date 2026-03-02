import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

final class fuey implements ibtw {
    final fufb a;
    final fryv b;
    final fryv c;
    final fufd d;

    public fuey(fufb fufb0, fryv fryv0, fryv fryv1, fufd fufd0) {
        this.a = fufb0;
        this.b = fryv0;
        this.c = fryv1;
        this.d = fufd0;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        long v;
        Boolean boolean7;
        Boolean boolean5;
        Boolean boolean3;
        fufb fufb1;
        goz goz0 = (goz)object0;
        if((((Number)object1).intValue() & 3) == 2 && goz0.ac()) {
            goz0.G();
            return ibom.a;
        }
        fufb fufb0 = this.a;
        goz0.M(0xD802B5FB);
        fryv fryv0 = fufb0.c;
        Boolean boolean0 = null;
        Boolean boolean1 = fryv0 == null ? null : Boolean.valueOf(fryw.b(fryv0, ((Context)goz0.h(AndroidCompositionLocals_androidKt.b))));
        goz0.A();
        Boolean boolean2 = Boolean.valueOf(true);
        if(ibuq.m(boolean1, boolean2)) {
            goz0.M(0x2854C785);
            hfc hfc0 = iqn.a(hfc.e, "TestTagSuperTitleStart");
            jbn jbn0 = fpu.d(goz0).n;
            fufb1 = fufb0;
            boolean3 = boolean2;
            ftzd.a(fryv0, hfc0, fpu.a(goz0).q, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jbn0, goz0, 0x30, 0, 0x1FFF8);
            goz0 = goz0;
        }
        else {
            fufb1 = fufb0;
            boolean3 = boolean2;
            goz0.M(0x2858AE0F);
            dlv.a(dls.k(hfc.e, 0.0f), goz0);
        }
        goz0.A();
        fryv fryv1 = fufb1.d;
        goz0.M(0xD802E61B);
        Boolean boolean4 = fryv1 == null ? null : Boolean.valueOf(fryw.b(fryv1, ((Context)goz0.h(AndroidCompositionLocals_androidKt.b))));
        goz0.A();
        if(ibuq.m(boolean4, boolean3)) {
            goz0.M(677026320);
            hfc hfc1 = iqn.a(hfc.e, "TestTagTitleStart");
            jbn jbn1 = fpu.d(goz0).g;
            boolean5 = boolean3;
            ftzd.a(fryv1, hfc1, fpu.a(goz0).q, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jbn1, goz0, 0x30, 0, 0x1FFF8);
            goz0 = goz0;
        }
        else {
            boolean5 = boolean3;
            goz0.M(0x285E574F);
            dlv.a(dls.k(hfc.e, 0.0f), goz0);
        }
        goz0.A();
        fryv fryv2 = this.b;
        goz0.M(0xD803153B);
        Boolean boolean6 = fryv2 == null ? null : Boolean.valueOf(fryw.b(fryv2, ((Context)goz0.h(AndroidCompositionLocals_androidKt.b))));
        goz0.A();
        if(ibuq.m(boolean6, boolean5)) {
            goz0.M(0x28604FC9);
            hfc hfc2 = iqn.a(hfc.e, "TestTagSuperTitleEnd");
            jbn jbn2 = fpu.d(goz0).n;
            boolean7 = boolean5;
            ftzd.a(fryv2, hfc2, fpu.a(goz0).q, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jbn2, goz0, 0x30, 0, 0x1FFF8);
            goz0 = goz0;
        }
        else {
            boolean7 = boolean5;
            goz0.M(0x2864274F);
            dlv.a(dls.k(hfc.e, 0.0f), goz0);
        }
        goz0.A();
        fryv fryv3 = this.c;
        goz0.M(0xD803459B);
        if(fryv3 != null) {
            boolean0 = Boolean.valueOf(fryw.b(fryv3, ((Context)goz0.h(AndroidCompositionLocals_androidKt.b))));
        }
        goz0.A();
        if(ibuq.m(boolean0, boolean7)) {
            goz0.M(0x2866401E);
            if((this.d instanceof fufc)) {
                goz0.M(0xD8035A0A);
                v = fsbs.e(fpu.a(goz0), goz0);
            }
            else {
                goz0.M(-670867004);
                v = fpu.a(goz0).q;
            }
            goz0.A();
            ftzd.a(fryv3, iqn.a(hfc.e, "TestTagTitleEnd"), v, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, fpu.d(goz0).g, goz0, 0x30, 0, 0x1FFF8);
            goz0.A();
            return ibom.a;
        }
        goz0.M(0x286C998F);
        dlv.a(dls.k(hfc.e, 0.0f), goz0);
        goz0.A();
        return ibom.a;
    }
}

