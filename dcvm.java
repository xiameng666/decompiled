public final class dcvm extends ibsl implements ibtx {
    int a;
    Object b;
    final ibub c;
    private Object d;

    public dcvm(ibrl ibrl0, ibub ibub0) {
        this.c = ibub0;
        super(3, ibrl0);
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        dcvm dcvm0 = new dcvm(((ibrl)object2), this.c);
        dcvm0.d = (icih)object0;
        dcvm0.b = (Object[])object1;
        return dcvm0.jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        Object object1 = ibrx.a;
        switch(this.a) {
            case 0: {
                ibnx.b(object0);
                object2 = this.d;
                Object[] arr_object = (Object[])this.b;
                Object object3 = arr_object[0];
                Object object4 = arr_object[1];
                Object object5 = arr_object[2];
                Object object6 = arr_object[3];
                Object object7 = arr_object[4];
                Object object8 = arr_object[5];
                this.a = 1;
                dieg dieg0 = new dieg(this);
                dieg0.a = ((Boolean)object3).booleanValue();
                dieg0.b = ((Boolean)object4).booleanValue();
                dieg0.c = ((Boolean)object5).booleanValue();
                dieg0.d = ((Boolean)object6).booleanValue();
                dieg0.e = ((Boolean)object7).booleanValue();
                dieg0.f = ((Boolean)object8).booleanValue();
                object0 = dieg0.jI(ibom.a);
                if(object0 != object1) {
                    goto label_26;
                }
                break;
            }
            case 1: {
                object2 = this.d;
                ibnx.b(object0);
            label_26:
                this.d = null;
                this.a = 2;
                if(((icih)object2).a(object0, this) != object1) {
                    return ibom.a;
                }
                break;
            }
            default: {
                ibnx.b(object0);
                return ibom.a;
            }
        }
        return object1;
    }
}

