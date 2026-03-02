import android.graphics.Point;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.VisibleRegion;

public final class cpqx extends wby implements cpqy {
    public cpqx() {
        super("com.google.android.gms.maps.internal.IProjectionDelegate");
    }

    @Override  // cpqy
    public final bjgw a(LatLng latLng0) {
        return new ObjectWrapper(new Point(0, 0));
    }

    @Override  // cpqy
    public final LatLng b(bjgw bjgw0) {
        return new LatLng(0.0, 0.0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if((iInterface0 instanceof bjgw)) {
                        bjgw bjgw0 = (bjgw)iInterface0;
                    }
                }
                cpqx.gr(parcel0);
                LatLng latLng0 = new LatLng(0.0, 0.0);
                parcel1.writeNoException();
                wbz.g(parcel1, latLng0);
                return true;
            }
            case 2: {
                LatLng latLng1 = (LatLng)wbz.a(parcel0, LatLng.CREATOR);
                cpqx.gr(parcel0);
                bjgw bjgw1 = this.a(latLng1);
                parcel1.writeNoException();
                wbz.h(parcel1, bjgw1);
                return true;
            }
            case 3: {
                VisibleRegion visibleRegion0 = new VisibleRegion(new LatLng(0.0, 0.0), new LatLng(0.0, 0.0), new LatLng(0.0, 0.0), new LatLng(0.0, 0.0), new LatLngBounds(new LatLng(0.0, 0.0), new LatLng(0.0, 0.0)));
                parcel1.writeNoException();
                wbz.g(parcel1, visibleRegion0);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

