import com.google.android.gms.pay.pass.idcard.view.components.PresentationBottomSheet;

public final class dukd extends ibsl implements ibtw {
    int a;
    final PresentationBottomSheet b;

    public dukd(PresentationBottomSheet presentationBottomSheet0, ibrl ibrl0) {
        this.b = presentationBottomSheet0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dukd)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dukd(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            fyx fyx0 = this.b.c;
            if(fyx0 == null) {
                ibuq.j("sheetState");
                fyx0 = null;
            }
            this.a = 1;
            if(fyx0.f(this) == object1) {
                return object1;
            }
        }
        dukt dukt0 = dukt.a(this.b.a(), 8);
        this.b.c(dukt0);
        return ibom.a;
    }
}

