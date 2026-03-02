import androidx.compose.runtime.snapshots.SnapshotStateList;

final class car extends ibur implements ibtw {
    final clj a;
    final Object b;
    final ibts c;
    final cbm d;
    final SnapshotStateList e;
    final ibty f;

    public car(clj clj0, Object object0, ibts ibts0, cbm cbm0, SnapshotStateList snapshotStateList0, ibty ibty0) {
        this.a = clj0;
        this.b = object0;
        this.c = ibts0;
        this.d = cbm0;
        this.e = snapshotStateList0;
        this.f = ibty0;
        super(2);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        if(((goz)object0).ad((v & 3) != 2, v & 1)) {
            ibts ibts0 = this.c;
            cbm cbm0 = this.d;
            Object object2 = ((goz)object0).k();
            Object object3 = gop.a;
            if(object2 == object3) {
                object2 = (cct)ibts0.a(cbm0);
                ((goz)object0).R(object2);
            }
            clj clj0 = this.a;
            Object object4 = clj0.e().f();
            Object object5 = this.b;
            boolean z = ((goz)object0).Y(ibuq.m(object4, object5));
            Object object6 = ((goz)object0).k();
            if(z || object6 == object3) {
                object6 = ibuq.m(clj0.e().f(), object5) ? cer.a : ((cct)ibts0.a(cbm0)).b;
                ((goz)object0).R(object6);
            }
            Object object7 = ((goz)object0).k();
            if(object7 == object3) {
                object7 = new caz(ibuq.m(object5, clj0.g()));
                ((goz)object0).R(object7);
            }
            ceq ceq0 = ((cct)object2).a;
            hey hey0 = hfc.e;
            boolean z1 = ((goz)object0).Z(((cct)object2));
            Object object8 = ((goz)object0).k();
            if(z1 || object8 == object3) {
                object8 = new cal(((cct)object2));
                ((goz)object0).R(object8);
            }
            hfc hfc0 = hzt.a(hey0, ((ibtx)object8));
            boolean z2 = ibuq.m(object5, clj0.g());
            ((caz)object7).a.b(Boolean.valueOf(z2));
            hfc hfc1 = hfc0.a(((caz)object7));
            boolean z3 = ((goz)object0).Z(object5);
            Object object9 = ((goz)object0).k();
            if(z3 || object9 == object3) {
                object9 = new cam(object5);
                ((goz)object0).R(object9);
            }
            boolean z4 = ((goz)object0).X(((cer)object6));
            Object object10 = ((goz)object0).k();
            if(z4 || object10 == object3) {
                object10 = new can(((cer)object6));
                ((goz)object0).R(object10);
            }
            ccf.f(clj0, ((ibts)object9), hfc1, ceq0, ((cer)object6), ((ibtw)object10), gzf.e(0xF774B549, new caq(this.e, object5, cbm0, this.f), ((goz)object0)), ((goz)object0), 0xC00000);
            return ibom.a;
        }
        ((goz)object0).G();
        return ibom.a;
    }
}

