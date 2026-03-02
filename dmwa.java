import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.List;

public final class dmwa implements ibty {
    final List a;
    final SnapshotStateList b;

    public dmwa(List list0, SnapshotStateList snapshotStateList0) {
        this.a = list0;
        this.b = snapshotStateList0;
        super();
    }

    @Override  // ibty
    public final Object a(Object object0, Object object1, Object object2, Object object3) {
        fule fule0;
        fubd fubd1;
        float f;
        int v = ((Number)object1).intValue();
        int v1 = ((Number)object3).intValue();
        int v2 = (v1 & 6) == 0 ? (((goz)object2).X(((dnj)object0)) ? 4 : 2) | v1 : v1;
        if((v1 & 0x30) == 0) {
            v2 |= (((goz)object2).V(v) ? 0x20 : 16);
        }
        int v3 = 0;
        if(((goz)object2).ad((v2 & 0x93) != 0x92, v2 & 1)) {
            fuat fuat0 = (fuat)this.a.get(v);
            ((goz)object2).M(0xEDD3FAE);
            hey hey0 = hfc.e;
            if(v == 0) {
                f = 0.0f;
            }
            else {
                v3 = v;
                f = 2.0f;
            }
            dlv.a(dls.e(hey0, f), ((goz)object2));
            fubd fubd0 = fuat0.c;
            ((goz)object2).M(0xEFF6B589);
            if((fubd0 instanceof fuaz)) {
                frxq frxq0 = new frxq(fpu.a(((goz)object2)).q);
                ibuq.f(((fuaz)fubd0).a, "icon");
                ibuq.f(((fuaz)fubd0).d, "variant");
                fubd1 = new fuaz(((fuaz)fubd0).a, frxq0, ((fuaz)fubd0).c, ((fuaz)fubd0).d, ((fuaz)fubd0).e);
            }
            else {
                fubd1 = fubd0;
            }
            ((goz)object2).A();
            SnapshotStateList snapshotStateList0 = this.b;
            if(snapshotStateList0.a() == 1) {
                fule0 = fule.a;
            }
            else if(v3 == 0) {
                fule0 = fule.b;
            }
            else {
                fule0 = v3 == snapshotStateList0.a() - 1 ? fule.d : fule.c;
            }
            fuar.f(null, fuat.d(fuat0, null, fubd1, null, null, false, true, fule0, 0x27FB), ((goz)object2), 0x40, 1);
            ((goz)object2).A();
            return ibom.a;
        }
        ((goz)object2).G();
        return ibom.a;
    }
}

