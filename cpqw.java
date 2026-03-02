import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;

public final class cpqw extends wbx implements cpqy {
    public cpqw(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.maps.internal.IProjectionDelegate");
    }

    @Override  // cpqy
    public final bjgw a(LatLng latLng0) {
        bjgw bjgw0;
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, latLng0);
        Parcel parcel1 = this.hM(2, parcel0);
        IBinder iBinder0 = parcel1.readStrongBinder();
        if(iBinder0 == null) {
            bjgw0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            bjgw0 = (iInterface0 instanceof bjgw) ? ((bjgw)iInterface0) : new bjgu(iBinder0);
        }
        parcel1.recycle();
        return bjgw0;
    }

    @Override  // cpqy
    public final LatLng b(bjgw bjgw0) {
        Parcel parcel0 = this.jo();
        wbz.h(parcel0, bjgw0);
        Parcel parcel1 = this.hM(1, parcel0);
        LatLng latLng0 = (LatLng)wbz.a(parcel1, LatLng.CREATOR);
        parcel1.recycle();
        return latLng0;
    }
}

