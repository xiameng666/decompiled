import com.google.android.gms.pay.pass.idcard.view.components.PresentationBottomSheet;

final class duke extends ibsl implements ibtw {
    int a;
    final PresentationBottomSheet b;
    final int c;

    public duke(PresentationBottomSheet presentationBottomSheet0, int v, ibrl ibrl0) {
        this.b = presentationBottomSheet0;
        this.c = v;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((duke)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new duke(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            cvq cvq0 = this.b.b;
            if(cvq0 != null) {
                this.a = 1;
                ckh ckh0 = new ckh(null, 7);
                int v1 = cvq0.c();
                Object object2 = dce.a(cvq0, ((float)(this.c - v1)), ckh0, this);
                if(object2 != object1) {
                    object2 = ibom.a;
                }
                if(object2 == object1) {
                    return object1;
                }
            }
        }
        return ibom.a;
    }
}

