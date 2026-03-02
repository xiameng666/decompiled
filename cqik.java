import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;

public final class cqik extends wby implements IInterface, cjug {
    private final int a;

    public cqik() {
        super("com.google.android.gms.mdm.internal.IDeviceManagerService");
    }

    public cqik(int v) {
        super("com.google.android.gms.mdm.internal.IDeviceManagerService");
        this.a = v;
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        Object object1;
        Object object0 = null;
        switch(v) {
            case 1: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 == null) {
                    object1 = null;
                }
                else {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.mdm.internal.IDeviceManagerCallbacks");
                    object1 = (iInterface0 instanceof cqij) ? ((cqij)iInterface0) : new cqij(iBinder0);
                }
                cqik.gr(parcel0);
                batl.s(object1);
                if(this.a >= 8000000) {
                    Parcel parcel2 = ((wbx)object1).jo();
                    parcel2.writeInt(13);
                    wbz.f(parcel2, null);
                    wbz.f(parcel2, ApiMetadata.b);
                    ((wbx)object1).jp(4, parcel2);
                }
                else {
                    Parcel parcel3 = ((wbx)object1).jo();
                    parcel3.writeInt(13);
                    parcel3.writeString(null);
                    wbz.f(parcel3, ApiMetadata.b);
                    ((wbx)object1).jp(1, parcel3);
                }
                break;
            }
            case 2: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.mdm.internal.IDeviceManagerCallbacks");
                    object0 = (iInterface1 instanceof cqij) ? ((cqij)iInterface1) : new cqij(iBinder1);
                }
                parcel0.readString();
                cqik.gr(parcel0);
                batl.s(object0);
                ((cqij)object0).a(ApiMetadata.b);
                break;
            }
            case 3: {
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.mdm.internal.IDeviceManagerCallbacks");
                    object0 = (iInterface2 instanceof cqij) ? ((cqij)iInterface2) : new cqij(iBinder2);
                }
                cqik.gr(parcel0);
                batl.s(object0);
                ((cqij)object0).a(ApiMetadata.b);
                break;
            }
            default: {
                return false;
            }
        }
        parcel1.writeNoException();
        return true;
    }
}

