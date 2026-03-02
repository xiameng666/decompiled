import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;

public abstract class asao extends wby implements asap {
    public asao() {
        super("com.google.android.gms.backup.internal.IG1RestoreService");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        asaw asaw0 = null;
        switch(v) {
            case 1: {
                boolean z = wbz.i(parcel0);
                parcel0.readString();
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                asao.gr(parcel0);
                this.a(z);
                parcel1.writeNoException();
                return true;
            }
            case 2: {
                boolean z1 = wbz.i(parcel0);
                parcel0.readString();
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                asao.gr(parcel0);
                this.c(z1);
                parcel1.writeNoException();
                return true;
            }
            case 3: {
                ApiMetadata apiMetadata2 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                asao.gr(parcel0);
                parcel1.writeNoException();
                parcel1.writeInt(1);
                return true;
            }
            case 4: {
                ApiMetadata apiMetadata3 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                asao.gr(parcel0);
                boolean z2 = this.d();
                parcel1.writeNoException();
                parcel1.writeInt(((int)z2));
                return true;
            }
            case 5: {
                String s = parcel0.readString();
                ApiMetadata apiMetadata4 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                asao.gr(parcel0);
                this.g(s);
                parcel1.writeNoException();
                return true;
            }
            case 6: {
                boolean z3 = wbz.i(parcel0);
                boolean z4 = wbz.i(parcel0);
                ApiMetadata apiMetadata5 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                asao.gr(parcel0);
                this.e(z3, z4);
                parcel1.writeNoException();
                return true;
            }
            case 7: {
                boolean z5 = wbz.i(parcel0);
                boolean z6 = wbz.i(parcel0);
                ApiMetadata apiMetadata6 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                asao.gr(parcel0);
                this.f(z5, z6);
                parcel1.writeNoException();
                return true;
            }
            case 8: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.backup.internal.IRestoreDataCallback");
                    asaw0 = (iInterface0 instanceof asaw) ? ((asaw)iInterface0) : new asaw(iBinder0);
                }
                String s1 = parcel0.readString();
                ApiMetadata apiMetadata7 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                asao.gr(parcel0);
                this.h(asaw0, s1, apiMetadata7);
                parcel1.writeNoException();
                return true;
            }
            case 9: {
                boolean z7 = wbz.i(parcel0);
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.backup.internal.IRestoreNowCallbacks");
                    asaw0 = (iInterface1 instanceof asax) ? ((asax)iInterface1) : new asax(iBinder1);
                }
                ApiMetadata apiMetadata8 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                asao.gr(parcel0);
                this.i(z7, ((asax)asaw0));
                parcel1.writeNoException();
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

