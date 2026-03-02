import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class absu extends wby implements absv {
    public absu() {
        super("com.google.android.gms.api.compatibility.IDynamiteModuleLoad");
    }

    public static absv asInterface(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.api.compatibility.IDynamiteModuleLoad");
        return (iInterface0 instanceof absv) ? ((absv)iInterface0) : new abst(iBinder0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        bjgw bjgw0;
        if(v == 1) {
            IBinder iBinder0 = parcel0.readStrongBinder();
            if(iBinder0 == null) {
                bjgw0 = null;
            }
            else {
                IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                bjgw0 = (iInterface0 instanceof bjgw) ? ((bjgw)iInterface0) : new bjgu(iBinder0);
            }
            String s = parcel0.readString();
            absu.gr(parcel0);
            IBinder iBinder1 = this.load(bjgw0, s);
            parcel1.writeNoException();
            parcel1.writeStrongBinder(iBinder1);
            return true;
        }
        return false;
    }
}

