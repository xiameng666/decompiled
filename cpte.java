import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.model.LatLng;

public final class cpte extends wby implements cptf {
    public cpte() {
        super("com.google.android.gms.maps.model.internal.IMarkerDelegate");
    }

    @Override  // cptf
    public final int a() {
        return 0;
    }

    @Override  // cptf
    public final String b() {
        return "";
    }

    @Override  // cptf
    public final void c() {
    }

    @Override  // cptf
    public final void d(LatLng latLng0) {
    }

    @Override  // cptf
    public final void e(boolean z) {
    }

    @Override  // cptf
    public final void f() {
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
                cpte.gr(parcel0);
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
                parcel0.readString();
                cpte.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 6: {
                parcel1.writeNoException();
                parcel1.writeString("");
                return true;
            }
            case 7: {
                parcel0.readString();
                cpte.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 8: {
                parcel1.writeNoException();
                parcel1.writeString("");
                return true;
            }
            case 9: {
                wbz.i(parcel0);
                cpte.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 10: {
                parcel1.writeNoException();
                parcel1.writeInt(0);
                return true;
            }
            case 11: {
                parcel1.writeNoException();
                return true;
            }
            case 12: {
                parcel1.writeNoException();
                return true;
            }
            case 13: {
                parcel1.writeNoException();
                parcel1.writeInt(0);
                return true;
            }
            case 14: {
                wbz.i(parcel0);
                cpte.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 15: {
                parcel1.writeNoException();
                parcel1.writeInt(0);
                return true;
            }
            case 16: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    if((iInterface0 instanceof cptf)) {
                        cptf cptf0 = (cptf)iInterface0;
                    }
                }
                cpte.gr(parcel0);
                parcel1.writeNoException();
                parcel1.writeInt(0);
                return true;
            }
            case 17: {
                parcel1.writeNoException();
                parcel1.writeInt(0);
                return true;
            }
            case 18: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if((iInterface1 instanceof bjgw)) {
                        bjgw bjgw0 = (bjgw)iInterface1;
                    }
                }
                cpte.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 19: {
                parcel0.readFloat();
                parcel0.readFloat();
                cpte.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 20: {
                wbz.i(parcel0);
                cpte.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 21: {
                parcel1.writeNoException();
                parcel1.writeInt(0);
                return true;
            }
            case 22: {
                parcel0.readFloat();
                cpte.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 23: {
                parcel1.writeNoException();
                parcel1.writeFloat(0.0f);
                return true;
            }
            case 24: {
                parcel0.readFloat();
                parcel0.readFloat();
                cpte.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 25: {
                parcel0.readFloat();
                cpte.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 26: {
                parcel1.writeNoException();
                parcel1.writeFloat(0.0f);
                return true;
            }
            case 27: {
                parcel0.readFloat();
                cpte.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 28: {
                parcel1.writeNoException();
                parcel1.writeFloat(0.0f);
                return true;
            }
            case 29: {
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if((iInterface2 instanceof bjgw)) {
                        bjgw bjgw1 = (bjgw)iInterface2;
                    }
                }
                cpte.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 30: {
                parcel1.writeNoException();
                wbz.h(parcel1, null);
                return true;
            }
            case 0x1F: {
                parcel0.readInt();
                cpte.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 0x20: {
                parcel1.writeNoException();
                parcel1.writeInt(0);
                return true;
            }
            case 33: {
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 != null) {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if((iInterface3 instanceof bjgw)) {
                        bjgw bjgw2 = (bjgw)iInterface3;
                    }
                }
                cpte.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 34: {
                ObjectWrapper objectWrapper0 = new ObjectWrapper(null);
                parcel1.writeNoException();
                wbz.h(parcel1, objectWrapper0);
                return true;
            }
            case 35: {
                parcel1.writeNoException();
                parcel1.writeInt(0);
                return true;
            }
            case 36: {
                parcel1.writeNoException();
                parcel1.writeString(null);
                return true;
            }
            default: {
                return false;
            }
        }
    }

    @Override  // cptf
    public final boolean g(cptf cptf0) {
        return false;
    }
}

