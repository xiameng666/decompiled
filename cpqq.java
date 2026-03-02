import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.model.LatLng;
import j..util.Objects;

public final class cpqq extends wby implements IInterface {
    final fzts a;

    public cpqq() {
        super("com.google.android.gms.maps.internal.IOnMyLocationChangeListener");
    }

    public cpqq(cpnp cpnp0, fzts fzts0) {
        this.a = fzts0;
        Objects.requireNonNull(cpnp0);
        super("com.google.android.gms.maps.internal.IOnMyLocationChangeListener");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        bjgw bjgw0;
        if(v == 1) {
            IBinder iBinder0 = parcel0.readStrongBinder();
            if(iBinder0 == null) {
                bjgw0 = null;
            }
            else {
                IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                bjgw0 = (iInterface0 instanceof bjgw) ? ((bjgw)iInterface0) : new bjgu(iBinder0);
            }
            cpqq.gr(parcel0);
            Location location0 = (Location)ObjectWrapper.a(bjgw0);
            fzug fzug0 = this.a.a.b;
            if(fzug0.isAdded() && !fzug0.b) {
                fzug0.b = true;
                fzwk fzwk0 = fzug0.ay;
                if(fzwk0 != null) {
                    fzwk0.B(new LatLng(location0.getLatitude(), location0.getLongitude()));
                }
            }
            parcel1.writeNoException();
            return true;
        }
        return false;
    }
}

