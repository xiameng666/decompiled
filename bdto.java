import androidx.compose.runtime.ParcelableSnapshotMutableState;

final class bdto implements ibtx {
    final ibth a;
    final bdtt b;

    public bdto(ibth ibth0, bdtt bdtt0) {
        this.a = ibth0;
        this.b = bdtt0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dld)object0), "innerPadding");
        if((v & 6) == 0) {
            v |= (((goz)object1).X(((dld)object0)) ? 4 : 2);
        }
        if((v & 19) == 18 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        long v1 = fpu.a(((goz)object1)).F;
        ((goz)object1).M(0x6E3C21FE);
        Object object3 = ((goz)object1).k();
        Object object4 = gop.a;
        if(object3 == object4) {
            ParcelableSnapshotMutableState parcelableSnapshotMutableState0 = new ParcelableSnapshotMutableState(bdqn.a, gul.a);
            ((goz)object1).R(parcelableSnapshotMutableState0);
            object3 = parcelableSnapshotMutableState0;
        }
        ((goz)object1).A();
        hfc hfc0 = dla.d(dla.c(dls.u(hfc.e), ((dld)object0)), 16.0f);
        hej hej0 = hei.n;
        ((goz)object1).M(-1224400529);
        ibth ibth0 = this.a;
        int v2 = ((goz)object1).X(ibth0);
        bdtt bdtt0 = this.b;
        int v3 = v2 | ((goz)object1).Z(bdtt0) | ((goz)object1).W(v1);
        Object object5 = ((goz)object1).k();
        if(v3 != 0 || object5 == object4) {
            bdta bdta0 = new bdta(bdtt0, ibth0, ((gra)object3), v1);
            ((goz)object1).R(bdta0);
            object5 = bdta0;
        }
        ((goz)object1).A();
        dnh.a(hfc0, null, null, false, null, hej0, null, false, null, ((ibts)object5), ((goz)object1), 0x30000, 478);
        return ibom.a;
    }

    public static final bdqn b(gra gra0) {
        return (bdqn)gra0.a();
    }

    public static final void c(gra gra0, bdqn bdqn0) {
        gra0.b(bdqn0);
    }
}

