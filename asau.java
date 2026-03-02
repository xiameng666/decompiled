import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;

public abstract class asau extends wby implements asav {
    public asau() {
        super("com.google.android.gms.backup.internal.IGmsRestoreService");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        asas asas0 = null;
        switch(v) {
            case 1: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.backup.internal.IGmsRestoreCallback");
                    asas0 = (iInterface0 instanceof asas) ? ((asas)iInterface0) : new asaq(iBinder0);
                }
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                asau.gr(parcel0);
                this.a(asas0, apiMetadata0);
                break;
            }
            case 2: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    asas0 = (iInterface1 instanceof azxs) ? ((azxs)iInterface1) : new azxq(iBinder1);
                }
                long v1 = parcel0.readLong();
                String s = parcel0.readString();
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                asau.gr(parcel0);
                this.e(asas0, v1, s, apiMetadata1);
                break;
            }
            case 3: {
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.backup.internal.IGmsRestoreCallback");
                    asas0 = (iInterface2 instanceof asas) ? ((asas)iInterface2) : new asaq(iBinder2);
                }
                Account account0 = (Account)wbz.a(parcel0, Account.CREATOR);
                ApiMetadata apiMetadata2 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                asau.gr(parcel0);
                this.c(asas0, account0, apiMetadata2);
                break;
            }
            case 4: {
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 != null) {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.backup.internal.IRestoreTimespanCallback");
                    asas0 = (iInterface3 instanceof asba) ? ((asba)iInterface3) : new asay(iBinder3);
                }
                String s1 = parcel0.readString();
                ApiMetadata apiMetadata3 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                asau.gr(parcel0);
                this.d(((asba)asas0), s1, apiMetadata3);
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

