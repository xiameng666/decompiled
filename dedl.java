import com.google.android.gms.nearby.sharing.DeviceVisibility;

final class dedl extends ibsl implements ibtx {
    Object a;
    Object b;

    public dedl(ibrl ibrl0) {
        super(3, ibrl0);
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        dedl dedl0 = new dedl(((ibrl)object2));
        dedl0.a = (Boolean)object0;
        dedl0.b = (DeviceVisibility)object1;
        return dedl0.jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        return new denc(!((Boolean)this.a).booleanValue() && ibuq.m(this.b, DeviceVisibility.b));
    }
}

