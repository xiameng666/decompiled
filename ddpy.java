import com.google.android.gms.nearby.sharing.DeviceVisibility;
import com.google.android.gms.nearby.sharing.internal.SetDeviceVisibilityParams;

public final class ddpy implements azys {
    public final DeviceVisibility a;

    public ddpy(DeviceVisibility deviceVisibility0) {
        this.a = deviceVisibility0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        ddot ddot0 = (ddot)((ddub)object0).H();
        SetDeviceVisibilityParams setDeviceVisibilityParams0 = new SetDeviceVisibilityParams();
        setDeviceVisibilityParams0.b = this.a.f;
        setDeviceVisibilityParams0.c = this.a.i;
        setDeviceVisibilityParams0.d = this.a.k;
        setDeviceVisibilityParams0.a = new ddrt(((evqp)object1));
        ddot0.V(setDeviceVisibilityParams0);
    }
}

