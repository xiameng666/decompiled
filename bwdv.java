import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

final class bwdv extends ibsk implements ibtw {
    Object a;
    Object b;
    int c;
    final ViewGroup d;
    private Object e;

    public bwdv(ViewGroup viewGroup0, ibrl ibrl0) {
        this.d = viewGroup0;
        super(ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((bwdv)this.c(((ibxt)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new bwdv(this.d, ibrl0);
        ibrl1.e = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibxt ibxt0;
        Object object2;
        Object object1 = ibrx.a;
    alab1:
        switch(this.c) {
            case 0: {
                ibnx.b(object0);
                ibxt0 = (ibxt)this.e;
                ViewGroup viewGroup0 = this.d;
                if(viewGroup0.getTag(0x7F0B23D7) == null) {  // id:up_element_binder_tag
                    object2 = new ibyl(((ibym)bwdz.c(viewGroup0)));
                    goto label_28;
                }
                break;
            }
            case 1: {
                Object object3 = this.b;
                Object object4 = this.a;
                ibxt ibxt1 = (ibxt)this.e;
                ibnx.b(object0);
                while(true) {
                    if((object3 instanceof ViewGroup)) {
                        ibxr ibxr0 = bwdz.d(((ViewGroup)object3));
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
                    while(true) {
                    label_28:
                        if(!((Iterator)object2).hasNext()) {
                            break alab1;
                        }
                        Object object5 = ((Iterator)object2).next();
                        View view0 = (View)object5;
                        if(view0.getTag(0x7F0B23D7) != null) {  // id:up_element_binder_tag
                            continue;
                        }
                        this.e = ibxt0;
                        this.a = object2;
                        this.b = view0;
                        this.c = 1;
                        if(ibxt0.a(view0, this) != object1) {
                            ibxt1 = ibxt0;
                            object4 = object2;
                            object3 = view0;
                            break;
                        }
                        return object1;
                    }
                }
            }
            default: {
                object2 = this.a;
                ibxt0 = (ibxt)this.e;
                ibnx.b(object0);
                goto label_28;
            }
        }
        return ibom.a;
    }
}

