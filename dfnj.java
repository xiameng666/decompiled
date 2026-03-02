import com.google.android.gms.nearby.sharing.DeviceVisibility;

final class dfnj extends ibsl implements ibtx {
    Object a;
    Object b;

    public dfnj(ibrl ibrl0) {
        super(3, ibrl0);
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        dfnj dfnj0 = new dfnj(((ibrl)object2));
        dfnj0.a = (DeviceVisibility)object0;
        dfnj0.b = (Boolean)object1;
        return dfnj0.jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        Object object1 = this.a;
        if(((Boolean)this.b).booleanValue()) {
            ibuq.c(object1);
            return new dfol(((DeviceVisibility)object1));
        }
        ibuq.e(DeviceVisibility.e, "HIDDEN");
        return new dfol(DeviceVisibility.e);
    }
}

