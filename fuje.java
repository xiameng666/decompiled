import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

final class fuje implements ibtw {
    final fuie a;
    final float b;
    final dih c;

    public fuje(dih dih0, fuie fuie0, float f) {
        this.c = dih0;
        this.a = fuie0;
        this.b = f;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        goz goz1;
        goz goz0;
        fuie fuie1;
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        float f = fujj.j(this.c, 12.0f, ((goz)object0));
        float f1 = fujj.j(this.c, 24.0f, ((goz)object0));
        hfc hfc0 = dla.e(hfc.e, f1, f);
        dhg dhg0 = dho.g(fujj.j(this.c, 4.0f, ((goz)object0)));
        fuie fuie0 = this.a;
        float f2 = this.b;
        iau iau0 = dii.a(dhg0, hei.m, ((goz)object0), 0);
        long v = gol.c(((goz)object0));
        gzk gzk0 = ((goz)object0).ap();
        hfc hfc1 = hew.c(((goz)object0), hfc0);
        ibth ibth0 = iej.a;
        ((goz)object0).O();
        if(((goz)object0).ab()) {
            ((goz)object0).t(ibth0);
        }
        else {
            ((goz)object0).T();
        }
        int v1 = (int)(v ^ v >>> 0x20);
        guo.b(((goz)object0), iau0, iej.e);
        guo.b(((goz)object0), gzk0, iej.d);
        ibtw ibtw0 = iej.f;
        if(((goz)object0).ab() || !ibuq.m(((goz)object0).k(), Integer.valueOf(v1))) {
            Integer integer0 = v1;
            ((goz)object0).R(integer0);
            ((goz)object0).p(integer0, ibtw0);
        }
        guo.a(((goz)object0), iej.g);
        guo.b(((goz)object0), hfc1, iej.c);
        fryv fryv0 = fuie0.c;
        ((goz)object0).M(0x30D5C54);
        if(fryv0 == null) {
            goz0 = (goz)object0;
            fuie1 = fuie0;
        }
        else {
            jbn jbn0 = fpu.d(((goz)object0)).n;
            Context context0 = (Context)((goz)object0).h(AndroidCompositionLocals_androidKt.b);
            fuie1 = fuie0;
            ftzd.b(fryv0, null, fuie0.d.a(context0), 0L, 0, false, 2, 0, null, null, jbn0, jlq.e(12), 61.830002f, f2, ((goz)object0), 0, 0xD80030, 0x77FA);
            goz0 = (goz)object0;
        }
        goz0.A();
        fryv fryv1 = fuie1.a;
        goz0.M(0x30D8F11);
        if(fryv1 == null) {
            goz1 = goz0;
        }
        else {
            jbn jbn1 = fpu.d(goz0).h;
            Context context1 = (Context)goz0.h(AndroidCompositionLocals_androidKt.b);
            goz1 = goz0;
            ftzd.b(fryv1, null, fuie1.b.a(context1), 0L, 0, false, 2, 0, null, null, jbn1, jlq.e(16), 61.830002f, f2, goz1, 0, 0xD80030, 0x77FA);
        }
        goz1.A();
        goz1.z();
        return ibom.a;
    }
}

