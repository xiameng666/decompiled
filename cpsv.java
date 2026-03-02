import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PatternItem;

public final class cpsv extends wby implements cpsw {
    public cpsv() {
        super("com.google.android.gms.maps.model.internal.ICircleDelegate");
    }

    @Override  // cpsw
    public final int a() {
        return 0;
    }

    @Override  // cpsw
    public final void b() {
    }

    @Override  // cpsw
    public final void c(LatLng latLng0) {
    }

    @Override  // cpsw
    public final void d(boolean z) {
    }

    @Override  // cpsw
    public final boolean e(cpsw cpsw0) {
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
                cpsv.gr(parcel0);
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
                parcel0.readDouble();
                cpsv.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 6: {
                parcel1.writeNoException();
                parcel1.writeDouble(0.0);
                return true;
            }
            case 7: {
                parcel0.readFloat();
                cpsv.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 8: {
                parcel1.writeNoException();
                parcel1.writeFloat(0.0f);
                return true;
            }
            case 9: {
                parcel0.readInt();
                cpsv.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 10: {
                parcel1.writeNoException();
                parcel1.writeInt(0);
                return true;
            }
            case 11: {
                parcel0.readInt();
                cpsv.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 12: {
                parcel1.writeNoException();
                parcel1.writeInt(0);
                return true;
            }
            case 13: {
                parcel0.readFloat();
                cpsv.gr(parcel0);
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
                cpsv.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 16: {
                parcel1.writeNoException();
                parcel1.writeInt(0);
                return true;
            }
            case 17: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                    if((iInterface0 instanceof cpsw)) {
                        cpsw cpsw0 = (cpsw)iInterface0;
                    }
                }
                cpsv.gr(parcel0);
                parcel1.writeNoException();
                parcel1.writeInt(0);
                return true;
            }
            case 18: {
                parcel1.writeNoException();
                parcel1.writeInt(0);
                return true;
            }
            case 19: {
                wbz.i(parcel0);
                cpsv.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 20: {
                parcel1.writeNoException();
                parcel1.writeInt(0);
                return true;
            }
            case 21: {
                parcel0.createTypedArrayList(PatternItem.CREATOR);
                cpsv.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 22: {
                parcel1.writeNoException();
                parcel1.writeTypedList(null);
                return true;
            }
            case 23: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if((iInterface1 instanceof bjgw)) {
                        bjgw bjgw0 = (bjgw)iInterface1;
                    }
                }
                cpsv.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 24: {
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

