import com.google.android.gms.nearby.internal.connection.UnregisterDeviceProviderParams;

public final class czcn implements azys {
    public final czfc a;

    public czcn(czfc czfc0) {
        this.a = czfc0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        czft czft0 = (czft)((czbf)object0).H();
        UnregisterDeviceProviderParams unregisterDeviceProviderParams0 = new UnregisterDeviceProviderParams();
        unregisterDeviceProviderParams0.a = this.a;
        czft0.H(unregisterDeviceProviderParams0);
        ((evqp)object1).b(Boolean.valueOf(true));
    }
}

