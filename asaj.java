import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.backup.BackUpNowConfig;
import com.google.android.gms.common.api.ApiMetadata;

public abstract class asaj extends wby implements asak {
    public asaj() {
        super("com.google.android.gms.backup.internal.IBackUpNowService");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        aqgk aqgk0 = null;
        switch(v) {
            case 1: {
                String s = parcel0.readString();
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.backup.IBackUpNowClientCallbacks");
                    aqgk0 = (iInterface0 instanceof aqgk) ? ((aqgk)iInterface0) : new aqgi(iBinder0);
                }
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                asaj.gr(parcel0);
                this.b(s, aqgk0, apiMetadata0);
                parcel1.writeNoException();
                return true;
            }
            case 2: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.backup.internal.IBackUpNowCallbacks");
                    aqgk0 = (iInterface1 instanceof asah) ? ((asah)iInterface1) : new asaf(iBinder1);
                }
                BackUpNowConfig backUpNowConfig0 = (BackUpNowConfig)wbz.a(parcel0, BackUpNowConfig.CREATOR);
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                asaj.gr(parcel0);
                this.a(((asah)aqgk0), backUpNowConfig0, apiMetadata1);
                parcel1.writeNoException();
                return true;
            }
            case 3: {
                ApiMetadata apiMetadata2 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                asaj.gr(parcel0);
                boolean z = this.d(apiMetadata2);
                parcel1.writeNoException();
                parcel1.writeInt(((int)z));
                return true;
            }
            case 4: {
                String s1 = parcel0.readString();
                ApiMetadata apiMetadata3 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                asaj.gr(parcel0);
                this.c(s1, apiMetadata3);
                parcel1.writeNoException();
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

