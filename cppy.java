import android.os.IInterface;
import android.os.Parcel;
import j..util.Objects;

public final class cppy extends wby implements IInterface {
    final cpnl a;

    public cppy() {
        super("com.google.android.gms.maps.internal.IOnCameraIdleListener");
    }

    public cppy(cpnp cpnp0, cpnl cpnl0) {
        this.a = cpnl0;
        Objects.requireNonNull(cpnp0);
        super("com.google.android.gms.maps.internal.IOnCameraIdleListener");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            this.a.a();
            parcel1.writeNoException();
            return true;
        }
        return false;
    }
}

