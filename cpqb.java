import android.os.IInterface;
import android.os.Parcel;
import j..util.Objects;

public final class cpqb extends wby implements IInterface {
    final cpnm a;

    public cpqb() {
        super("com.google.android.gms.maps.internal.IOnCameraMoveStartedListener");
    }

    public cpqb(cpnp cpnp0, cpnm cpnm0) {
        this.a = cpnm0;
        Objects.requireNonNull(cpnp0);
        super("com.google.android.gms.maps.internal.IOnCameraMoveStartedListener");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            int v1 = parcel0.readInt();
            cpqb.gr(parcel0);
            this.a.a(v1);
            parcel1.writeNoException();
            return true;
        }
        return false;
    }
}

