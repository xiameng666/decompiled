import androidx.compose.runtime.ParcelableSnapshotMutableState;

final class bdrz implements ibtx {
    final bdsf a;

    public bdrz(bdsf bdsf0) {
        this.a = bdsf0;
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
        ((goz)object1).M(0x6E3C21FE);
        Object object3 = ((goz)object1).k();
        Object object4 = gop.a;
        if(object3 == object4) {
            ParcelableSnapshotMutableState parcelableSnapshotMutableState0 = new ParcelableSnapshotMutableState(bdqm.a, gul.a);
            ((goz)object1).R(parcelableSnapshotMutableState0);
            object3 = parcelableSnapshotMutableState0;
        }
        ((goz)object1).A();
        long v1 = fpu.a(((goz)object1)).G;
        hfc hfc0 = dla.d(dla.c(hfc.e, ((dld)object0)), 16.0f);
        hej hej0 = hei.n;
        ((goz)object1).M(0x97EA02AA);
        bdsf bdsf0 = this.a;
        int v2 = ((goz)object1).Z(bdsf0) | ((goz)object1).W(v1);
        Object object5 = ((goz)object1).k();
        if(v2 != 0 || object5 == object4) {
            object5 = new bdri(bdsf0, ((gra)object3), v1);
            ((goz)object1).R(object5);
        }
        ((goz)object1).A();
        dnh.a(hfc0, null, null, false, null, hej0, null, false, null, ((ibts)object5), ((goz)object1), 0x30000, 478);
        return ibom.a;
    }

    public static final bdqm b(gra gra0) {
        return (bdqm)gra0.a();
    }

    public static final void c(gra gra0, bdqm bdqm0) {
        gra0.b(bdqm0);
    }
}

