import com.google.android.gms.nearby.sharing.DeviceVisibility;

final class dfnm extends ibsl implements ibtx {
    Object a;
    Object b;

    public dfnm(ibrl ibrl0) {
        super(3, ibrl0);
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        dfnm dfnm0 = new dfnm(((ibrl)object2));
        dfnm0.a = (Boolean)object0;
        dfnm0.b = (DeviceVisibility)object1;
        return dfnm0.jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        return new dfok(!((Boolean)this.a).booleanValue() && ((DeviceVisibility)this.b).f == 1);
    }
}

