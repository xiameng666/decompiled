import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PatternItem;
import java.util.ArrayList;

public final class cpti extends wby implements cptj {
    public cpti() {
        super("com.google.android.gms.maps.model.internal.IPolygonDelegate");
    }

    @Override  // cptj
    public final int a() {
        return 0;
    }

    @Override  // cptj
    public final boolean b(cptj cptj0) {
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
                parcel0.createTypedArrayList(LatLng.CREATOR);
                cpti.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 4: {
                ArrayList arrayList0 = new ArrayList();
                parcel1.writeNoException();
                parcel1.writeTypedList(arrayList0);
                return true;
            }
            case 5: {
                wbz.b(parcel0);
                cpti.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 6: {
                ArrayList arrayList1 = new ArrayList();
                parcel1.writeNoException();
                parcel1.writeList(arrayList1);
                return true;
            }
            case 7: {
                parcel0.readFloat();
                cpti.gr(parcel0);
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
                cpti.gr(parcel0);
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
                cpti.gr(parcel0);
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
                cpti.gr(parcel0);
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
                cpti.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 16: {
                parcel1.writeNoException();
                parcel1.writeInt(0);
                return true;
            }
            case 17: {
                wbz.i(parcel0);
                cpti.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 18: {
                parcel1.writeNoException();
                parcel1.writeInt(0);
                return true;
            }
            case 19: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                    if((iInterface0 instanceof cptj)) {
                        cptj cptj0 = (cptj)iInterface0;
                    }
                }
                cpti.gr(parcel0);
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
                wbz.i(parcel0);
                cpti.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 22: {
                parcel1.writeNoException();
                parcel1.writeInt(0);
                return true;
            }
            case 23: {
                parcel0.readInt();
                cpti.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 24: {
                parcel1.writeNoException();
                parcel1.writeInt(0);
                return true;
            }
            case 25: {
                parcel0.createTypedArrayList(PatternItem.CREATOR);
                cpti.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 26: {
                parcel1.writeNoException();
                parcel1.writeTypedList(null);
                return true;
            }
            case 27: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if((iInterface1 instanceof bjgw)) {
                        bjgw bjgw0 = (bjgw)iInterface1;
                    }
                }
                cpti.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 28: {
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

