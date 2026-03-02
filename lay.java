import java.util.Iterator;
import java.util.List;

final class lay extends ibsl implements ibts {
    Object a;
    Object b;
    Object c;
    Object d;
    Object e;
    int f;
    int g;
    final lcc h;
    final ldq i;

    public lay(lcc lcc0, ldq ldq0, ibrl ibrl0) {
        this.h = lcc0;
        this.i = ldq0;
        super(1, ibrl0);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        return new lay(this.h, this.i, ((ibrl)object0)).jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibvd ibvd4;
        icta icta3;
        ibuz ibuz3;
        Object object4;
        lax lax0;
        ibvd ibvd2;
        ibvd ibvd1;
        ibuz ibuz1;
        icta icta1;
        Object object1 = ibrx.a;
        switch(this.g) {
            case 0: {
                ibnx.b(object0);
                icta icta0 = new icta();
                ibuz ibuz0 = new ibuz();
                ibvd ibvd0 = new ibvd();
                this.a = icta0;
                this.b = ibuz0;
                this.c = ibvd0;
                this.d = ibvd0;
                this.g = 1;
                Object object3 = this.h.i(true, this);
                if(object3 != object1) {
                    icta1 = icta0;
                    ibuz1 = ibuz0;
                    ibvd1 = ibvd0;
                    object0 = object3;
                    ibvd2 = ibvd1;
                    goto label_31;
                }
                break;
            }
            case 1: {
                ibvd1 = (ibvd)this.d;
                ibvd ibvd3 = (ibvd)this.c;
                ibuz ibuz2 = (ibuz)this.b;
                icta icta2 = (icta)this.a;
                ibnx.b(object0);
                icta1 = icta2;
                ibuz1 = ibuz2;
                ibvd2 = ibvd3;
            label_31:
                ibvd1.a = ((lah)object0).a;
                lax0 = new lax(icta1, ibuz1, ibvd2, this.h);
                List list0 = this.i.b;
                if(list0 != null) {
                    object4 = list0.iterator();
                    goto label_43;
                }
                goto label_54;
            }
            case 2: {
                object4 = this.e;
                lax0 = (lax)this.d;
                ibvd2 = (ibvd)this.c;
                ibuz1 = (ibuz)this.b;
                icta1 = (icta)this.a;
                ibnx.b(object0);
            label_43:
                while(((Iterator)object4).hasNext()) {
                    Object object5 = ((Iterator)object4).next();
                    this.a = icta1;
                    this.b = ibuz1;
                    this.c = ibvd2;
                    this.d = lax0;
                    this.e = object4;
                    this.g = 2;
                    if(((ibtw)object5).a(lax0, this) == object1) {
                        return object1;
                    }
                }
            label_54:
                ibuz3 = ibuz1;
                icta3 = icta1;
                this.i.b = null;
                this.a = ibuz3;
                this.b = ibvd2;
                this.c = icta3;
                this.d = null;
                this.e = null;
                this.g = 3;
                if(icta3.b(this) != object1) {
                    ibvd4 = ibvd2;
                    goto label_70;
                }
                break;
            }
            case 3: {
                icta3 = (icta)this.c;
                ibvd4 = (ibvd)this.b;
                ibuz3 = (ibuz)this.a;
                ibnx.b(object0);
            label_70:
                ibuz3.a = true;
                icta3.d();
                Object object6 = ibvd4.a;
                int v1 = object6 == null ? 0 : object6.hashCode();
                lct lct0 = this.h.c();
                this.a = object6;
                this.b = null;
                this.c = null;
                this.f = v1;
                this.g = 4;
                Object object7 = lct0.a(this);
                if(object7 != object1) {
                    return new lah(object6, v1, ((Number)object7).intValue());
                }
                break;
            }
            default: {
                int v = this.f;
                Object object2 = this.a;
                ibnx.b(object0);
                return new lah(object2, v, ((Number)object0).intValue());
            }
        }
        return object1;
    }
}

