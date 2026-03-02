import com.google.android.gms.nearby.sharing.DeviceVisibility;

final class dfnz extends ibsl implements ibtw {
    int a;
    final ddag b;
    private Object c;

    public dfnz(ddag ddag0, ibrl ibrl0) {
        this.b = ddag0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dfnz)this.c(((icih)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new dfnz(this.b, ibrl0);
        ibrl1.c = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        DeviceVisibility deviceVisibility0;
        Object object1 = ibrx.a;
        switch(this.a) {
            case 0: {
                ibnx.b(object0);
                icih icih0 = (icih)this.c;
                dbyl dbyl0 = DeviceVisibility.a.a();
                dbyl0.e = true;
                deviceVisibility0 = dbyl0.a();
                dfol dfol0 = new dfol(deviceVisibility0);
                this.c = deviceVisibility0;
                this.a = 1;
                if(icih0.a(dfol0, this) != object1) {
                    goto label_16;
                }
                break;
            }
            case 1: {
                deviceVisibility0 = (DeviceVisibility)this.c;
                ibnx.b(object0);
            label_16:
                this.c = deviceVisibility0;
                this.a = 2;
                if(this.b.c(this) != object1) {
                    goto label_22;
                }
                break;
            }
            case 2: {
                deviceVisibility0 = (DeviceVisibility)this.c;
                ibnx.b(object0);
            label_22:
                ibuq.c(deviceVisibility0);
                this.c = null;
                this.a = 3;
                if(this.b.f(deviceVisibility0, this) != object1) {
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

