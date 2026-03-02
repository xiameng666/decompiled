import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

final class ftyc implements ibtw {
    final ftyi a;
    final hll b;
    final hfc c;
    final ftyi d;

    public ftyc(ftyi ftyi0, hll hll0, hfc hfc0, ftyi ftyi1) {
        this.a = ftyi0;
        this.b = hll0;
        this.c = hfc0;
        this.d = ftyi1;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        long v3;
        hfc hfc0;
        ftyi ftyi1;
        long v;
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        ibth ibth0 = ((fufv)((goz)object0).h(fugo.a)).a;
        ((goz)object0).M(0x6E3C21FE);
        Object object2 = ((goz)object0).k();
        Object object3 = gop.a;
        if(object2 == object3) {
            object2 = new dgh();
            ((goz)object0).R(object2);
        }
        ((goz)object0).A();
        ibvc ibvc0 = new ibvc();
        if(hyxx.c()) {
            ((goz)object0).M(370380235);
            v = fpu.a(((goz)object0)).F;
        }
        else {
            ((goz)object0).M(0x16160625);
            v = this.b == null ? fsbs.i(fpu.a(((goz)object0)), ((Context)((goz)object0).h(AndroidCompositionLocals_androidKt.b)), ((goz)object0)) : this.b.j;
        }
        ((goz)object0).A();
        ibvc0.a = v;
        boolean z = fsbn.a(((Context)((goz)object0).h(AndroidCompositionLocals_androidKt.b)), hln.b(ibvc0.a));
        ((goz)object0).M(0x161C0331);
        long v1 = fpu.a(((goz)object0)).q;
        ((goz)object0).A();
        ((goz)object0).M(0x63CF69AE);
        ftyi ftyi0 = this.a;
        if(ftyi0.j == null) {
            ftyi1 = ftyi0;
            hfc0 = hfc.e;
        }
        else {
            hey hey0 = hfc.e;
            ctp ctp0 = fxh.b(false, 0.0f, 0L, 7);
            ((goz)object0).M(-1633490746);
            int v2 = ((goz)object0).X(ibth0) | ((goz)object0).Z(ftyi0);
            Object object4 = ((goz)object0).k();
            if(v2 != 0 || object4 == object3) {
                object4 = new ftxz(ibth0, ftyi0);
                ((goz)object0).R(object4);
            }
            ((goz)object0).A();
            ftyi1 = ftyi0;
            hfc0 = cru.c(hey0, ((dgg)object2), ctp0, false, null, null, ((ibth)object4), 28);
        }
        ((goz)object0).A();
        hfc hfc1 = dls.w(this.c).a(hfc0);
        fcp fcp0 = fcq.h(ibvc0.a, 0L, 0L, 0L, ((goz)object0), 14);
        ((goz)object0).M(0x63CFDDF0);
        hyxx.c();
        crk crk0 = null;
        if(!hyxx.c() && z) {
            if(hyxx.c()) {
                ((goz)object0).M(0x162E23A0);
                v3 = fpu.a(((goz)object0)).B;
            }
            else {
                ((goz)object0).M(0x162F59A0);
                v3 = fpu.a(((goz)object0)).r;
            }
            ((goz)object0).A();
            crk0 = crl.a(1.0f, v3);
        }
        ((goz)object0).A();
        ftxu.a(hfc1, fcp0, crk0, gzf.e(500276938, new ftyb(ftyi1, this.d, v1), ((goz)object0)), ((goz)object0), 0xC00, 0);
        return ibom.a;
    }
}

