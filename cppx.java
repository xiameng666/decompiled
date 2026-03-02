import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.CameraPosition;
import j..util.Objects;

public final class cppx extends wby implements IInterface {
    final fzug a;

    public cppx() {
        super("com.google.android.gms.maps.internal.IOnCameraChangeListener");
    }

    public cppx(cpnp cpnp0, fzug fzug0) {
        this.a = fzug0;
        Objects.requireNonNull(cpnp0);
        super("com.google.android.gms.maps.internal.IOnCameraChangeListener");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            CameraPosition cameraPosition0 = (CameraPosition)wbz.a(parcel0, CameraPosition.CREATOR);
            cppx.gr(parcel0);
            fzwk fzwk0 = this.a.ay;
            if(fzwk0 != null && !fzwk0.d && fzwk0.aj == null) {
                CameraPosition cameraPosition1 = fzwk0.b.y();
                if(!bata.b(fzwk0.ai, cameraPosition1)) {
                    fzwk0.ai = cameraPosition1;
                    fzwk0.z();
                }
            }
            parcel1.writeNoException();
            return true;
        }
        return false;
    }
}

