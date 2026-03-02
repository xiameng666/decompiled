import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;
import j..util.Objects;

public final class cpqj extends wby implements IInterface {
    final cpnn a;

    public cpqj() {
        super("com.google.android.gms.maps.internal.IOnMapClickListener");
    }

    public cpqj(cpnp cpnp0, cpnn cpnn0) {
        this.a = cpnn0;
        Objects.requireNonNull(cpnp0);
        super("com.google.android.gms.maps.internal.IOnMapClickListener");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            LatLng latLng0 = (LatLng)wbz.a(parcel0, LatLng.CREATOR);
            cpqj.gr(parcel0);
            this.a.a();
            parcel1.writeNoException();
            return true;
        }
        return false;
    }
}

