import androidx.compose.runtime.snapshots.SnapshotStateList;

final class caq extends ibur implements ibtx {
    final SnapshotStateList a;
    final Object b;
    final cbm c;
    final ibty d;

    public caq(SnapshotStateList snapshotStateList0, Object object0, cbm cbm0, ibty ibty0) {
        this.a = snapshotStateList0;
        this.b = object0;
        this.c = cbm0;
        this.d = ibty0;
        super(3);
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        if((v & 6) == 0) {
            v |= (((v & 8) == 0 ? ((goz)object1).X(((ccg)object0)) : ((goz)object1).Z(((ccg)object0))) ? 4 : 2);
        }
        if(((goz)object1).ad((v & 19) != 18, v & 1)) {
            SnapshotStateList snapshotStateList0 = this.a;
            int v1 = ((goz)object1).X(snapshotStateList0);
            Object object3 = this.b;
            int v2 = v1 | ((goz)object1).Z(object3);
            cbm cbm0 = this.c;
            int v3 = v2 | ((goz)object1).Z(cbm0);
            Object object4 = ((goz)object1).k();
            if(v3 != 0 || object4 == gop.a) {
                object4 = new cap(snapshotStateList0, object3, cbm0);
                ((goz)object1).R(object4);
            }
            gqe.c(((ccg)object0), ((ibts)object4), ((goz)object1));
            ibuq.d(((ccg)object0), "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl");
            cbm0.f.k(object3, ((cch)(((ccg)object0))).a);
            Object object5 = ((goz)object1).k();
            if(object5 == gop.a) {
                object5 = new cax(((ccg)object0));
                ((goz)object1).R(object5);
            }
            this.d.a(((cax)object5), object3, ((goz)object1), Integer.valueOf(0));
            return ibom.a;
        }
        ((goz)object1).G();
        return ibom.a;
    }
}

