import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.ObjectWrapper;
import j..util.Objects;

public final class ccdd extends wby implements IInterface {
    final cbza a;

    public ccdd() {
        super("com.google.android.gms.learning.internal.IExampleStoreV2");
    }

    public ccdd(cbza cbza0) {
        Objects.requireNonNull(cbza0);
        this.a = cbza0;
        super("com.google.android.gms.learning.internal.IExampleStoreV2");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        ccdc ccdc1;
        bjgw bjgw4;
        bjgw bjgw3;
        bjgw bjgw2;
        bjgw bjgw1;
        bjgw bjgw0 = null;
        switch(v) {
            case 2: {
                ccdc ccdc0 = null;
                String s = parcel0.readString();
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 == null) {
                    bjgw1 = null;
                }
                else {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    bjgw1 = (iInterface0 instanceof bjgw) ? ((bjgw)iInterface0) : new bjgu(iBinder0);
                }
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 == null) {
                    bjgw2 = null;
                }
                else {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    bjgw2 = (iInterface1 instanceof bjgw) ? ((bjgw)iInterface1) : new bjgu(iBinder1);
                }
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.learning.internal.IExampleStoreQueryCallbackV2");
                    ccdc0 = (iInterface2 instanceof ccdc) ? ((ccdc)iInterface2) : new ccdc(iBinder2);
                }
                ccdd.gr(parcel0);
                byte[] arr_b = (byte[])ObjectWrapper.a(bjgw1);
                byte[] arr_b1 = (byte[])ObjectWrapper.a(bjgw2);
                cccs cccs0 = new cccs(ccdc0);
                this.a.a(s, arr_b, arr_b1, cccs0, grhf.a);
                parcel1.writeNoException();
                return true;
            }
            case 3: {
                parcel1.writeNoException();
                parcel1.writeInt(1);
                return true;
            }
            case 4: {
                String s1 = parcel0.readString();
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 == null) {
                    bjgw3 = null;
                }
                else {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    bjgw3 = (iInterface3 instanceof bjgw) ? ((bjgw)iInterface3) : new bjgu(iBinder3);
                }
                IBinder iBinder4 = parcel0.readStrongBinder();
                if(iBinder4 == null) {
                    bjgw4 = null;
                }
                else {
                    IInterface iInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    bjgw4 = (iInterface4 instanceof bjgw) ? ((bjgw)iInterface4) : new bjgu(iBinder4);
                }
                IBinder iBinder5 = parcel0.readStrongBinder();
                if(iBinder5 == null) {
                    ccdc1 = null;
                }
                else {
                    IInterface iInterface5 = iBinder5.queryLocalInterface("com.google.android.gms.learning.internal.IExampleStoreQueryCallbackV2");
                    ccdc1 = (iInterface5 instanceof ccdc) ? ((ccdc)iInterface5) : new ccdc(iBinder5);
                }
                IBinder iBinder6 = parcel0.readStrongBinder();
                if(iBinder6 != null) {
                    IInterface iInterface6 = iBinder6.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    bjgw0 = (iInterface6 instanceof bjgw) ? ((bjgw)iInterface6) : new bjgu(iBinder6);
                }
                ccdd.gr(parcel0);
                grhf grhf0 = grhf.a;
                byte[] arr_b2 = (byte[])ObjectWrapper.a(bjgw0);
                if(arr_b2 != null) {
                    try {
                        hftc hftc0 = hftc.a();
                        ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)grhf0), arr_b2, 0, arr_b2.length, hftc0);
                        ProtoLiteMessage.P_makeImmutable(hftv0);
                        grhf0 = (grhf)hftv0;
                    }
                    catch(hfur hfur0) {
                        new cccs(ccdc1).a(8, hfur0.getMessage());
                        parcel1.writeNoException();
                        return true;
                    }
                }
                byte[] arr_b3 = (byte[])ObjectWrapper.a(bjgw3);
                byte[] arr_b4 = (byte[])ObjectWrapper.a(bjgw4);
                cccs cccs1 = new cccs(ccdc1);
                this.a.a(s1, arr_b3, arr_b4, cccs1, grhf0);
                parcel1.writeNoException();
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

