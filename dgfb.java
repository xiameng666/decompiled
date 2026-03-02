import java.util.Iterator;

final class dgfb extends ibsk implements ibtw {
    Object a;
    Object b;
    Object c;
    int d;
    final dgfc e;
    private Object f;

    public dgfb(dgfc dgfc0, ibrl ibrl0) {
        this.e = dgfc0;
        super(ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dgfb)this.c(((ibxt)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new dgfb(this.e, ibrl0);
        ibrl1.f = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibxt ibxt0;
        Object object4;
        Object object3;
        Object object2;
        ibxt ibxt3;
        Object object9;
        ibxt ibxt2;
        Object object7;
        Object object5;
        ibxt ibxt1;
        Object object1 = ibrx.a;
        switch(this.d) {
            case 0: {
                ibnx.b(object0);
                ibxt1 = (ibxt)this.f;
                object5 = this.e.c.iterator();
                goto label_15;
            }
            case 1: {
                object5 = this.a;
                ibxt1 = (ibxt)this.f;
                ibnx.b(object0);
            label_15:
                while(((Iterator)object5).hasNext()) {
                    Object object6 = ((Iterator)object5).next();
                    dgey dgey0 = new dgey(((dgfl)object6), ((dgfl)object6).b, null, ((dgfl)object6).j);
                    this.f = ibxt1;
                    this.a = object5;
                    this.d = 1;
                    if(ibxt1.a(dgey0, this) == object1) {
                        return object1;
                    }
                }
                object7 = this.e.d.iterator();
                ibxt2 = ibxt1;
                goto label_30;
            }
            case 2: {
                object7 = this.a;
                ibxt2 = (ibxt)this.f;
                ibnx.b(object0);
            label_30:
                while(((Iterator)object7).hasNext()) {
                    Object object8 = ((Iterator)object7).next();
                    dgey dgey1 = new dgey(((dggj)object8), ((dggj)object8).b, null, ((dggj)object8).g);
                    this.f = ibxt2;
                    this.a = object7;
                    this.d = 2;
                    if(ibxt2.a(dgey1, this) == object1) {
                        return object1;
                    }
                }
                object9 = this.e.e.iterator();
                ibxt3 = ibxt2;
                break;
            }
            case 3: {
                object9 = this.a;
                ibxt3 = (ibxt)this.f;
                ibnx.b(object0);
                break;
            }
            default: {
                object2 = this.c;
                object3 = this.b;
                object4 = this.a;
                ibxt0 = (ibxt)this.f;
                ibnx.b(object0);
                goto label_61;
            }
        }
        while(((Iterator)object9).hasNext()) {
            Object object10 = ((Iterator)object9).next();
            dgey dgey2 = new dgey(((dggo)object10), ((dggo)object10).b, null, ((dggo)object10).e);
            this.f = ibxt3;
            this.a = object9;
            this.d = 3;
            if(ibxt3.a(dgey2, this) == object1) {
                return object1;
            }
        }
        Object object11 = this.e.f.iterator();
        for(ibxt0 = ibxt3; true; ibxt0 = ibxt0) {
            object4 = object11;
            if(!((Iterator)object4).hasNext()) {
                break;
            }
            Object object12 = ((Iterator)object4).next();
            object3 = (dgen)object12;
            object2 = object3.e.iterator();
        label_61:
            object11 = object4;
            while(((Iterator)object2).hasNext()) {
                Object object13 = ((Iterator)object2).next();
                dgey dgey3 = new dgey(((dgeo)object3), ((dgem)object13).b, ((dgem)object13), ((dgem)object13).e);
                this.f = ibxt0;
                this.a = object11;
                this.b = object3;
                this.c = object2;
                this.d = 4;
                if(ibxt0.a(dgey3, this) == object1) {
                    return object1;
                }
            }
        }
        return ibom.a;
    }
}

