import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

final class fuji implements ibtx {
    final fujl a;

    public fuji(fujl fujl0) {
        this.a = fujl0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        fcu fcu0;
        eaa eaa0;
        int v = ((Number)object2).intValue();
        ibuq.f(((dih)object0), "$this$BoxWithConstraints");
        if((v & 6) == 0) {
            v |= (((goz)object1).X(((dih)object0)) ? 4 : 2);
        }
        if((v & 19) == 18 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        hfc hfc0 = dls.v(hfc.e);
        fujl fujl0 = this.a;
        Context context0 = (Context)((goz)object1).h(AndroidCompositionLocals_androidKt.b);
        fcp fcp0 = fcq.h(fujl0.d.a(context0), 0L, 0L, 0L, ((goz)object1), 14);
        if(jkv.a(((dih)object0).d(), 320.0f) > 0) {
            ((goz)object1).M(0x69745AF6);
            eaa0 = fpu.c(((goz)object1)).d;
            ((goz)object1).A();
        }
        else if(jkv.a(((dih)object0).d(), 240.0f) > 0) {
            ((goz)object1).M(0x697594F5);
            eaa0 = fpu.c(((goz)object1)).c;
            ((goz)object1).A();
        }
        else if(jkv.a(((dih)object0).d(), 160.0f) > 0) {
            ((goz)object1).M(0x6976D296);
            eaa0 = fpu.c(((goz)object1)).b;
            ((goz)object1).A();
        }
        else if(jkv.a(((dih)object0).d(), 71.0f) > 0) {
            ((goz)object1).M(0x69780931);
            eaa0 = fpu.c(((goz)object1)).a;
            ((goz)object1).A();
        }
        else if(jkv.a(((dih)object0).d(), 30.0f) > 0) {
            ((goz)object1).M(0x697951F6);
            ((goz)object1).A();
            eaa0 = eah.b(2.5f);
        }
        else {
            ((goz)object1).M(1769616054);
            ((goz)object1).A();
            eaa0 = eah.b(1.5f);
        }
        if(fujl0.e) {
            ((goz)object1).M(0x697BBA35);
            fcu0 = fcq.a(5.0f, 62);
        }
        else {
            ((goz)object1).M(1769806301);
            fcu0 = fcq.e(0.0f, 0.0f, 0.0f, 62);
        }
        ((goz)object1).A();
        ((goz)object1).M(-774190014);
        crk crk0 = fujl0.h ? crl.a(1.0f, fpu.a(((goz)object1)).B) : null;
        ((goz)object1).A();
        fdb.a(hfc0, eaa0, fcp0, fcu0, crk0, gzf.e(-92048538, new fujh(fujl0), ((goz)object1)), ((goz)object1), 0x30006, 0);
        return ibom.a;
    }
}

