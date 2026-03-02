import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

public final class cpsz extends wby implements cpta {
    public cpsz() {
        super("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
    }

    @Override  // cpta
    public final int a() {
        return 0;
    }

    @Override  // cpta
    public final void b() {
    }

    @Override  // cpta
    public final boolean c(cpta cpta0) {
        return false;
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                parcel1.writeNoException();
                return true;
            }
            case 2: {
                parcel1.writeNoException();
                parcel1.writeString("");
                return true;
            }
            case 3: {
                LatLng latLng0 = (LatLng)wbz.a(parcel0, LatLng.CREATOR);
                cpsz.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 4: {
                LatLng latLng1 = new LatLng(0.0, 0.0);
                parcel1.writeNoException();
                wbz.g(parcel1, latLng1);
                return true;
            }
            case 5: {
                parcel0.readFloat();
                cpsz.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 6: {
                parcel0.readFloat();
                parcel0.readFloat();
                cpsz.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 7: {
                parcel1.writeNoException();
                parcel1.writeFloat(0.0f);
                return true;
            }
            case 8: {
                parcel1.writeNoException();
                parcel1.writeFloat(0.0f);
                return true;
            }
            case 9: {
                LatLngBounds latLngBounds0 = (LatLngBounds)wbz.a(parcel0, LatLngBounds.CREATOR);
                cpsz.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 10: {
                LatLngBounds latLngBounds1 = new LatLngBounds(new LatLng(0.0, 0.0), new LatLng(0.0, 0.0));
                parcel1.writeNoException();
                wbz.g(parcel1, latLngBounds1);
                return true;
            }
            case 11: {
                parcel0.readFloat();
                cpsz.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 12: {
                parcel1.writeNoException();
                parcel1.writeFloat(0.0f);
                return true;
            }
            case 13: {
                parcel0.readFloat();
                cpsz.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 14: {
                parcel1.writeNoException();
                parcel1.writeFloat(0.0f);
                return true;
            }
            case 15: {
                wbz.i(parcel0);
                cpsz.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 16: {
                parcel1.writeNoException();
                parcel1.writeInt(0);
                return true;
            }
            case 17: {
                parcel0.readFloat();
                cpsz.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 18: {
                parcel1.writeNoException();
                parcel1.writeFloat(0.0f);
                return true;
            }
            case 19: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                    if((iInterface0 instanceof cpta)) {
                        cpta cpta0 = (cpta)iInterface0;
                    }
                }
                cpsz.gr(parcel0);
                parcel1.writeNoException();
                parcel1.writeInt(0);
                return true;
            }
            case 20: {
                parcel1.writeNoException();
                parcel1.writeInt(0);
                return true;
            }
            case 21: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if((iInterface1 instanceof bjgw)) {
                        bjgw bjgw0 = (bjgw)iInterface1;
                    }
                }
                cpsz.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 22: {
                wbz.i(parcel0);
                cpsz.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 23: {
                parcel1.writeNoException();
                parcel1.writeInt(0);
                return true;
            }
            case 24: {
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if((iInterface2 instanceof bjgw)) {
                        bjgw bjgw1 = (bjgw)iInterface2;
                    }
                }
                cpsz.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 25: {
                parcel1.writeNoException();
                wbz.h(parcel1, null);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

