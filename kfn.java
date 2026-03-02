import android.view.View;
import android.view.ViewGroup;

public final class kfn extends ibsk implements ibtw {
    int a;
    final View b;
    private Object c;

    public kfn(View view0, ibrl ibrl0) {
        this.b = view0;
        super(ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((kfn)this.c(((ibxt)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new kfn(this.b, ibrl0);
        ibrl1.c = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibxt ibxt0;
        Object object1 = ibrx.a;
        switch(this.a) {
            case 0: {
                ibnx.b(object0);
                ibxt0 = (ibxt)this.c;
                this.c = ibxt0;
                this.a = 1;
                if(ibxt0.a(this.b, this) == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ibxt0 = (ibxt)this.c;
                ibnx.b(object0);
                break;
            }
            default: {
                ibnx.b(object0);
                return ibom.a;
            }
        }
        View view0 = this.b;
        if((view0 instanceof ViewGroup)) {
            kfm kfm0 = new kfm(((ViewGroup)view0));
            this.c = null;
            this.a = 2;
            if(ibxt0.c(kfm0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

