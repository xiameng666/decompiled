import java.util.Iterator;

final class dcqz extends ibsl implements ibtx {
    int a;
    Object b;
    final ichm c;
    private Object d;

    public dcqz(ichm ichm0, ibrl ibrl0) {
        this.c = ichm0;
        super(3, ibrl0);
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        dcqz dcqz0 = new dcqz(this.c, ((ibrl)object2));
        dcqz0.d = (icih)object0;
        dcqz0.b = (dcrq)object1;
        return dcqz0.jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Iterator iterator0;
        Object object1 = ibrx.a;
        switch(this.a) {
            case 0: {
                ibnx.b(object0);
                icih icih0 = (icih)this.d;
                Object object2 = this.b;
                if(((dcrq)object2).c) {
                    this.d = null;
                    this.a = 1;
                    if(icih0.a(object2, this) != object1) {
                        return Boolean.valueOf(true);
                    }
                }
                else {
                    iterator0 = ((dcrq)object2).b.iterator();
                    while(true) {
                    label_14:
                        if(!iterator0.hasNext()) {
                            return Boolean.valueOf(false);
                        }
                        Object object3 = iterator0.next();
                        dcqs dcqs0 = new dcqs(((dcsl)object3));
                        this.d = iterator0;
                        this.a = 2;
                        if(this.c.a(dcqs0, this) == object1) {
                            break;
                        }
                    }
                }
                return object1;
            }
            case 1: {
                ibnx.b(object0);
                return Boolean.valueOf(true);
            }
            default: {
                iterator0 = (Iterator)this.d;
                ibnx.b(object0);
                goto label_14;
            }
        }
    }
}

