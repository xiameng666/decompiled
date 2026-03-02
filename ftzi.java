import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Objects;

final class ftzi implements ibtw {
    final ftzf a;
    final boolean b;
    final gra c;

    public ftzi(ftzf ftzf0, boolean z, gra gra0) {
        this.a = ftzf0;
        this.b = z;
        this.c = gra0;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        hfc hfc0 = iqn.a(hfc.e, "Origin");
        jbn jbn0 = fpu.d(((goz)object0)).g;
        ((goz)object0).M(0x207A3D6);
        ((goz)object0).A();
        ((goz)object0).M(0x207A1EE);
        long v = fpu.a(((goz)object0)).q;
        ((goz)object0).A();
        hey hey0 = hfc.e;
        ftzf ftzf0 = this.a;
        ftzd.a(this.a.a, hfc0, v, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jbn0, ((goz)object0), 0x30, 0, 0x1FFF8);
        ((goz)object0).M(0x207AEC4);
        fryv fryv0 = ftzf0.b;
        boolean z = fryv0 != null && !fryw.a(fryv0, ((Context)((goz)object0).h(AndroidCompositionLocals_androidKt.b)));
        ((goz)object0).A();
        if(z) {
            hpw hpw0 = ism.a(ftzf0.c.c, ((goz)object0), 0);
            String s = isq.c(ftzf0.c.d, ((goz)object0));
            ((goz)object0).M(0x207D356);
            ((goz)object0).A();
            ((goz)object0).M(0x207D16E);
            long v1 = fpu.a(((goz)object0)).q;
            ((goz)object0).A();
            hfc hfc1 = hht.a(dls.k(hey0, 20.0f), (!this.b || ftzl.a(this.c) ? ftzf0.c.e : ftzf0.c.f));
            Objects.toString(ftzf0.c);
            fnq.a(hpw0, s, iqn.a(hfc1, "Icon - " + ftzf0.c), v1, ((goz)object0), 8, 0);
            hfc hfc2 = iqn.a(hey0, "Destination");
            jbn jbn1 = fpu.d(((goz)object0)).g;
            ((goz)object0).M(0x2081E56);
            ((goz)object0).A();
            ((goz)object0).M(0x2081C6E);
            long v2 = fpu.a(((goz)object0)).q;
            ((goz)object0).A();
            ftzd.a(fryv0, hfc2, v2, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jbn1, ((goz)object0), 0x30, 0, 0x1FFF8);
        }
        return ibom.a;
    }
}

