import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.StreetViewPanoramaOptions;

public abstract class cppk extends wby implements cppl {
    public cppk() {
        super("com.google.android.gms.maps.internal.ICreator");
    }

    public static cppl asInterface(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
        return (iInterface0 instanceof cppl) ? ((cppl)iInterface0) : new cppj(iBinder0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        bjgw bjgw0 = null;
        switch(v) {
            case 1: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    bjgw0 = (iInterface0 instanceof bjgw) ? ((bjgw)iInterface0) : new bjgu(iBinder0);
                }
                cppk.gr(parcel0);
                this.init(bjgw0);
                parcel1.writeNoException();
                return true;
            }
            case 2: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    bjgw0 = (iInterface1 instanceof bjgw) ? ((bjgw)iInterface1) : new bjgu(iBinder1);
                }
                cppk.gr(parcel0);
                cppt cppt0 = this.newMapFragmentDelegate(bjgw0);
                parcel1.writeNoException();
                wbz.h(parcel1, cppt0);
                return true;
            }
            case 3: {
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    bjgw0 = (iInterface2 instanceof bjgw) ? ((bjgw)iInterface2) : new bjgu(iBinder2);
                }
                GoogleMapOptions googleMapOptions0 = (GoogleMapOptions)wbz.a(parcel0, GoogleMapOptions.CREATOR);
                cppk.gr(parcel0);
                cppw cppw0 = this.newMapViewDelegate(bjgw0, googleMapOptions0);
                parcel1.writeNoException();
                wbz.h(parcel1, cppw0);
                return true;
            }
            case 4: {
                cpph cpph0 = this.newCameraUpdateFactoryDelegate();
                parcel1.writeNoException();
                wbz.h(parcel1, cpph0);
                return true;
            }
            case 5: {
                cpst cpst0 = this.newBitmapDescriptorFactoryDelegate();
                parcel1.writeNoException();
                wbz.h(parcel1, cpst0);
                return true;
            }
            case 6: {
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 != null) {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    bjgw0 = (iInterface3 instanceof bjgw) ? ((bjgw)iInterface3) : new bjgu(iBinder3);
                }
                int v1 = parcel0.readInt();
                cppk.gr(parcel0);
                this.initV2(bjgw0, v1);
                parcel1.writeNoException();
                return true;
            }
            case 7: {
                IBinder iBinder4 = parcel0.readStrongBinder();
                if(iBinder4 != null) {
                    IInterface iInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    bjgw0 = (iInterface4 instanceof bjgw) ? ((bjgw)iInterface4) : new bjgu(iBinder4);
                }
                StreetViewPanoramaOptions streetViewPanoramaOptions0 = (StreetViewPanoramaOptions)wbz.a(parcel0, StreetViewPanoramaOptions.CREATOR);
                cppk.gr(parcel0);
                cprf cprf0 = this.newStreetViewPanoramaViewDelegate(bjgw0, streetViewPanoramaOptions0);
                parcel1.writeNoException();
                wbz.h(parcel1, cprf0);
                return true;
            }
            case 8: {
                IBinder iBinder5 = parcel0.readStrongBinder();
                if(iBinder5 != null) {
                    IInterface iInterface5 = iBinder5.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    bjgw0 = (iInterface5 instanceof bjgw) ? ((bjgw)iInterface5) : new bjgu(iBinder5);
                }
                cppk.gr(parcel0);
                cprc cprc0 = this.newStreetViewPanoramaFragmentDelegate(bjgw0);
                parcel1.writeNoException();
                wbz.h(parcel1, cprc0);
                return true;
            }
            case 9: {
                int v2 = this.getRendererType();
                parcel1.writeNoException();
                parcel1.writeInt(v2);
                return true;
            }
            case 10: {
                IBinder iBinder6 = parcel0.readStrongBinder();
                if(iBinder6 != null) {
                    IInterface iInterface6 = iBinder6.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    bjgw0 = (iInterface6 instanceof bjgw) ? ((bjgw)iInterface6) : new bjgu(iBinder6);
                }
                int v3 = parcel0.readInt();
                cppk.gr(parcel0);
                this.logInitialization(bjgw0, v3);
                parcel1.writeNoException();
                return true;
            }
            case 11: {
                IBinder iBinder7 = parcel0.readStrongBinder();
                if(iBinder7 != null) {
                    IInterface iInterface7 = iBinder7.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    bjgw0 = (iInterface7 instanceof bjgw) ? ((bjgw)iInterface7) : new bjgu(iBinder7);
                }
                cppk.gr(parcel0);
                this.preInit(bjgw0);
                parcel1.writeNoException();
                return true;
            }
            case 12: {
                IBinder iBinder8 = parcel0.readStrongBinder();
                if(iBinder8 != null) {
                    IInterface iInterface8 = iBinder8.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    bjgw0 = (iInterface8 instanceof bjgw) ? ((bjgw)iInterface8) : new bjgu(iBinder8);
                }
                String s = parcel0.readString();
                cppk.gr(parcel0);
                this.addInternalUsageAttributionId(bjgw0, s);
                parcel1.writeNoException();
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

