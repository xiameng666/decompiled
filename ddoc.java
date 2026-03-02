import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.sharing.DeviceAccountId;
import j..util.Objects;

public final class ddoc extends wby implements ddod {
    final evqp a;

    public ddoc() {
        super("com.google.android.gms.nearby.sharing.internal.IDeviceAccountIdResultListener");
    }

    public ddoc(ddsc ddsc0, evqp evqp0) {
        this.a = evqp0;
        Objects.requireNonNull(ddsc0);
        super("com.google.android.gms.nearby.sharing.internal.IDeviceAccountIdResultListener");
    }

    @Override  // ddod
    public final void a(DeviceAccountId deviceAccountId0) {
        this.a.b(deviceAccountId0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                DeviceAccountId deviceAccountId0 = (DeviceAccountId)wbz.a(parcel0, DeviceAccountId.CREATOR);
                ddoc.gr(parcel0);
                this.a(deviceAccountId0);
                return true;
            }
            case 2: {
                int v1 = parcel0.readInt();
                ddoc.gr(parcel0);
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

