import android.view.View;
import android.view.ViewParent;

final class bwdy extends ibsk implements ibtw {
    Object a;
    int b;
    final View c;
    private Object d;

    public bwdy(View view0, ibrl ibrl0) {
        this.c = view0;
        super(ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((bwdy)this.c(((ibxt)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new bwdy(this.c, ibrl0);
        ibrl1.d = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibxt ibxt0;
        Object object2;
        Object object1 = ibrx.a;
        if(this.b == 0) {
            ibnx.b(object0);
            ibxt ibxt1 = (ibxt)this.d;
            ViewParent viewParent0 = this.c.getParent();
            if((viewParent0 instanceof View)) {
                object2 = (View)viewParent0;
                ibxt0 = ibxt1;
                goto label_15;
            }
            else {
                ibxt0 = ibxt1;
            }
        }
        else {
            object2 = this.a;
            ibxt0 = (ibxt)this.d;
            ibnx.b(object0);
            goto label_21;
        }
        while(true) {
            object2 = null;
        label_15:
            if(object2 == null) {
                break;
            }
            this.d = ibxt0;
            this.a = object2;
            this.b = 1;
            if(ibxt0.a(object2, this) == object1) {
                return object1;
            }
        label_21:
            ViewParent viewParent1 = ((View)object2).getParent();
            if(!(viewParent1 instanceof View)) {
                continue;
            }
            object2 = (View)viewParent1;
            goto label_15;
        }
        return ibom.a;
    }
}

