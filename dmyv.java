import androidx.compose.runtime.ParcelableSnapshotMutableState;

final class dmyv implements ibtw {
    final dmyx a;
    final gui b;

    public dmyv(dmyx dmyx0, gui gui0) {
        this.a = dmyx0;
        this.b = gui0;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        ((goz)object0).M(0x6E3C21FE);
        Object object2 = ((goz)object0).k();
        Object object3 = gop.a;
        if(object2 == object3) {
            ParcelableSnapshotMutableState parcelableSnapshotMutableState0 = new ParcelableSnapshotMutableState(Boolean.valueOf(false), gul.a);
            ((goz)object0).R(parcelableSnapshotMutableState0);
            object2 = parcelableSnapshotMutableState0;
        }
        ((goz)object0).A();
        ftwm ftwm0 = !((Boolean)((gra)object2).a()).booleanValue() || !dmyw.b(this.b) ? ftwm.a : ftwm.c;
        ftwm ftwm1 = ftwm.a;
        if(ftwm0 == ftwm1 && ((Boolean)((gra)object2).a()).booleanValue() && !dmyw.b(this.b)) {
            ((goz)object0).M(0xDD3995DC);
            dmyx dmyx0 = this.a;
            evql evql0 = dmyx0.B().f(dmyx0.av, hkid.k);
            ((goz)object0).M(5004770);
            Object object4 = ((goz)object0).k();
            if(object4 == object3) {
                object4 = new dmys(((gra)object2));
                ((goz)object0).R(object4);
            }
            ((goz)object0).A();
            evql0.z(((evpz)object4));
            ((goz)object0).M(5004770);
            boolean z = ((goz)object0).Z(dmyx0);
            Object object5 = ((goz)object0).k();
            if(z || object5 == object3) {
                object5 = new dmyq(dmyx0);
                ((goz)object0).R(object5);
            }
            ((goz)object0).A();
            dmyx0.V(ftwm1, ((ibth)object5), ((goz)object0), 6);
            ((goz)object0).A();
            return ibom.a;
        }
        ((goz)object0).M(0xDD411380);
        dmyx dmyx1 = this.a;
        ((goz)object0).M(0x97EA02AA);
        gui gui0 = this.b;
        int v = ((goz)object0).X(gui0) | ((goz)object0).Z(dmyx1);
        Object object6 = ((goz)object0).k();
        if(v != 0 || object6 == object3) {
            object6 = new dmyr(dmyx1, ((gra)object2), gui0);
            ((goz)object0).R(object6);
        }
        ((goz)object0).A();
        dmyx1.V(ftwm0, ((ibth)object6), ((goz)object0), 0);
        ((goz)object0).A();
        return ibom.a;
    }
}

