import java.util.Iterator;

final class dcra extends ibsl implements ibtx {
    Object a;
    int b;
    Object c;
    Object d;
    final icig e;
    final ichm f;

    public dcra(ichm ichm0, icig icig0, ibrl ibrl0) {
        this.f = ichm0;
        this.e = icig0;
        super(3, ibrl0);
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        dcra dcra0 = new dcra(this.f, this.e, ((ibrl)object2));
        dcra0.c = (dcrq)object0;
        dcra0.d = (dcrq)object1;
        return dcra0.jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        Iterator iterator0;
        Object object4;
        dcrq dcrq0;
        Object object3;
        Object object1 = ibrx.a;
        switch(this.b) {
            case 0: {
                ibnx.b(object0);
                object3 = this.c;
                dcrq0 = (dcrq)this.d;
                object4 = ibpo.ah(dcrq0.b, ((dcrq)object3).b).iterator();
                break;
            }
            case 1: {
                object4 = this.a;
                dcrq dcrq1 = (dcrq)this.d;
                object3 = this.c;
                ibnx.b(object0);
                dcrq0 = dcrq1;
                break;
            }
            default: {
                iterator0 = (Iterator)this.d;
                object2 = this.c;
                ibnx.b(object0);
                goto label_28;
            }
        }
        while(((Iterator)object4).hasNext()) {
            Object object5 = ((Iterator)object4).next();
            dcqr dcqr0 = new dcqr(((dcsl)object5), this.e);
            this.c = object3;
            this.d = dcrq0;
            this.a = object4;
            this.b = 1;
            if(this.f.a(dcqr0, this) == object1) {
                return object1;
            }
        }
        object2 = dcrq0;
        iterator0 = ibpo.ah(((dcrq)object3).b, dcrq0.b).iterator();
    label_28:
        while(iterator0.hasNext()) {
            Object object6 = iterator0.next();
            dcqs dcqs0 = new dcqs(((dcsl)object6));
            this.c = object2;
            this.d = iterator0;
            this.a = null;
            this.b = 2;
            if(this.f.a(dcqs0, this) == object1) {
                return object1;
            }
        }
        return object2;
    }
}

