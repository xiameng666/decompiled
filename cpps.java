import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.widget.TextView;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.GoogleMapOptions;

public final class cpps extends wby implements cppt {
    private Context a;

    public cpps() {
        super("com.google.android.gms.maps.internal.IMapFragmentDelegate");
    }

    public cpps(Context context0) {
        super("com.google.android.gms.maps.internal.IMapFragmentDelegate");
        this.a = context0;
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                cppn cppn0 = new cppn();
                parcel1.writeNoException();
                wbz.h(parcel1, cppn0);
                return true;
            }
            case 2: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if((iInterface0 instanceof bjgw)) {
                        bjgw bjgw0 = (bjgw)iInterface0;
                    }
                }
                GoogleMapOptions googleMapOptions0 = (GoogleMapOptions)wbz.a(parcel0, GoogleMapOptions.CREATOR);
                Bundle bundle0 = (Bundle)wbz.a(parcel0, Bundle.CREATOR);
                cpps.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 3: {
                Bundle bundle1 = (Bundle)wbz.a(parcel0, Bundle.CREATOR);
                cpps.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 4: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if((iInterface1 instanceof bjgw)) {
                        bjgw bjgw1 = (bjgw)iInterface1;
                    }
                }
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if((iInterface2 instanceof bjgw)) {
                        bjgw bjgw2 = (bjgw)iInterface2;
                    }
                }
                Bundle bundle2 = (Bundle)wbz.a(parcel0, Bundle.CREATOR);
                cpps.gr(parcel0);
                TextView textView0 = new TextView(this.a);
                textView0.setGravity(17);
                textView0.setText("Google Play services are updating");
                ObjectWrapper objectWrapper0 = new ObjectWrapper(textView0);
                parcel1.writeNoException();
                wbz.h(parcel1, objectWrapper0);
                return true;
            }
            case 5: {
                parcel1.writeNoException();
                return true;
            }
            case 6: {
                parcel1.writeNoException();
                return true;
            }
            case 7: {
                parcel1.writeNoException();
                return true;
            }
            case 8: {
                parcel1.writeNoException();
                return true;
            }
            case 9: {
                parcel1.writeNoException();
                return true;
            }
            case 10: {
                Bundle bundle3 = (Bundle)wbz.a(parcel0, Bundle.CREATOR);
                cpps.gr(parcel0);
                parcel1.writeNoException();
                wbz.g(parcel1, bundle3);
                return true;
            }
            case 11: {
                parcel1.writeNoException();
                parcel1.writeInt(0);
                return true;
            }
            case 12: {
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 != null) {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.maps.internal.IOnMapReadyCallback");
                    if((iInterface3 instanceof cpqm)) {
                        cpqm cpqm0 = (cpqm)iInterface3;
                    }
                }
                cpps.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 13: {
                Bundle bundle4 = (Bundle)wbz.a(parcel0, Bundle.CREATOR);
                cpps.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 14: {
                parcel1.writeNoException();
                return true;
            }
            case 15: {
                parcel1.writeNoException();
                return true;
            }
            case 16: {
                parcel1.writeNoException();
                return true;
            }
            case 17: {
                parcel0.readString();
                cpps.gr(parcel0);
                parcel1.writeNoException();
                parcel1.writeString("delegate is null");
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

