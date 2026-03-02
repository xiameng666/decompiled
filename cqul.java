import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.mdns.MdnsSearchOptions;

public abstract class cqul extends wby implements cqum {
    public cqul() {
        super("com.google.android.gms.mdns.internal.IMdnsApiService");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        cqup cqup0 = null;
        switch(v) {
            case 1: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.mdns.internal.IMdnsServiceBrowserListener");
                    cqup0 = (iInterface0 instanceof cqup) ? ((cqup)iInterface0) : new cqun(iBinder0);
                }
                MdnsSearchOptions mdnsSearchOptions0 = (MdnsSearchOptions)wbz.a(parcel0, MdnsSearchOptions.CREATOR);
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                cqul.gr(parcel0);
                this.c(cqup0, mdnsSearchOptions0, apiMetadata0);
                break;
            }
            case 2: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.mdns.internal.IMdnsServiceBrowserListener");
                    cqup0 = (iInterface1 instanceof cqup) ? ((cqup)iInterface1) : new cqun(iBinder1);
                }
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                cqul.gr(parcel0);
                this.d(cqup0, apiMetadata1);
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

