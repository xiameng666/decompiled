import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.widget.TextView;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.StreetViewPanoramaOptions;

public final class cprb extends wby implements cprc {
    private Context a;

    public cprb() {
        super("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
    }

    public cprb(Context context0) {
        super("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
        this.a = context0;
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                parcel1.writeNoException();
                wbz.h(parcel1, null);
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
                StreetViewPanoramaOptions streetViewPanoramaOptions0 = (StreetViewPanoramaOptions)wbz.a(parcel0, StreetViewPanoramaOptions.CREATOR);
                Bundle bundle0 = (Bundle)wbz.a(parcel0, Bundle.CREATOR);
                cprb.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 3: {
                Bundle bundle1 = (Bundle)wbz.a(parcel0, Bundle.CREATOR);
                cprb.gr(parcel0);
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
                cprb.gr(parcel0);
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
                cprb.gr(parcel0);
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
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.maps.internal.IOnStreetViewPanoramaReadyCallback");
                    if((iInterface3 instanceof cpqv)) {
                        cpqv cpqv0 = (cpqv)iInterface3;
                    }
                }
                cprb.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 13: {
                parcel1.writeNoException();
                return true;
            }
            case 14: {
                parcel1.writeNoException();
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

