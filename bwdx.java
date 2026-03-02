import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

final class bwdx extends ibsk implements ibtw {
    Object a;
    Object b;
    int c;
    final ViewGroup d;
    private Object e;

    public bwdx(ViewGroup viewGroup0, ibrl ibrl0) {
        this.d = viewGroup0;
        super(ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((bwdx)this.c(((ibxt)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new bwdx(this.d, ibrl0);
        ibrl1.e = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibxt ibxt0;
        Object object2;
        ibxt ibxt1;
        Object object4;
        Object object3;
        Object object1 = ibrx.a;
        switch(this.c) {
            case 0: {
                ibnx.b(object0);
                ibxt0 = (ibxt)this.e;
                object2 = new ibyl(((ibym)bwdz.c(this.d)));
                goto label_26;
            }
            case 1: {
                object3 = this.b;
                object4 = this.a;
                ibxt1 = (ibxt)this.e;
                ibnx.b(object0);
                break;
            }
            default: {
                object2 = this.a;
                ibxt0 = (ibxt)this.e;
                ibnx.b(object0);
                goto label_26;
            }
        }
        while(true) {
            if((object3 instanceof ViewGroup)) {
                ibxr ibxr0 = bwdz.e(((ViewGroup)object3));
                this.e = ibxt1;
                this.a = object4;
                this.b = null;
                this.c = 2;
                if(ibxt1.c(ibxr0, this) == object1) {
                    return object1;
                }
            }
            object2 = object4;
            ibxt0 = ibxt1;
        label_26:
            if(!((Iterator)object2).hasNext()) {
                break;
            }
            Object object5 = ((Iterator)object2).next();
            this.e = ibxt0;
            this.a = object2;
            this.b = (View)object5;
            this.c = 1;
            if(ibxt0.a(((View)object5), this) != object1) {
                ibxt1 = ibxt0;
                object4 = object2;
                object3 = (View)object5;
                continue;
            }
            return object1;
        }
        return ibom.a;
    }
}

