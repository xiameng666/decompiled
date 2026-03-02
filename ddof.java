import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.sharing.DeviceVisibility;
import j..util.Objects;

public final class ddof extends wby implements ddog {
    final evqp a;

    public ddof() {
        super("com.google.android.gms.nearby.sharing.internal.IDeviceVisibilityResultListener");
    }

    public ddof(ddsc ddsc0, evqp evqp0) {
        this.a = evqp0;
        Objects.requireNonNull(ddsc0);
        super("com.google.android.gms.nearby.sharing.internal.IDeviceVisibilityResultListener");
    }

    @Override  // ddog
    public final void a(DeviceVisibility deviceVisibility0) {
        this.a.b(deviceVisibility0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                DeviceVisibility deviceVisibility0 = (DeviceVisibility)wbz.a(parcel0, DeviceVisibility.CREATOR);
                ddof.gr(parcel0);
                this.a(deviceVisibility0);
                return true;
            }
            case 2: {
                int v1 = parcel0.readInt();
                ddof.gr(parcel0);
                aztb aztb0 = new aztb(new Status(v1));
                this.a.a(aztb0);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

