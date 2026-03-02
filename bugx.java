import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.googleone.StorageManagementIntentRequest;
import com.google.android.gms.googleone.StorageQuotaInfoRequest;

public final class bugx extends wby implements bugy, cjug {
    public final bubi a;
    private final icck b;

    public bugx() {
        super("com.google.android.gms.googleone.internal.IGoogleoneService");
    }

    public bugx(bubi bubi0, String s, icck icck0) {
        ibuq.f(s, "callingPackage");
        ibuq.f(icck0, "coroutineScope");
        super("com.google.android.gms.googleone.internal.IGoogleoneService");
        this.a = bubi0;
        this.b = icck0;
    }

    @Override  // bugy
    public final Intent a(StorageManagementIntentRequest storageManagementIntentRequest0, ApiMetadata apiMetadata0) {
        ibuq.f(storageManagementIntentRequest0, "storageManagementIntentRequest");
        ibuq.f(storageManagementIntentRequest0, "storageManagementIntentRequest");
        return this.a.a.a(storageManagementIntentRequest0.a, storageManagementIntentRequest0.b, storageManagementIntentRequest0.c, storageManagementIntentRequest0.d);
    }

    @Override  // bugy
    public final void b(buhb buhb0, StorageQuotaInfoRequest storageQuotaInfoRequest0, ApiMetadata apiMetadata0) {
        if(htup.c() && buhb0 != null && storageQuotaInfoRequest0 != null) {
            bubf bubf0 = new bubf(this, storageQuotaInfoRequest0, buhb0, null);
            icbb.b(this.b, null, null, bubf0, 3);
        }
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        buhb buhb0;
        switch(v) {
            case 3: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if((iInterface0 instanceof azxs)) {
                        azxs azxs0 = (azxs)iInterface0;
                    }
                }
                parcel0.createByteArray();
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bugx.gr(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 4: {
                StorageManagementIntentRequest storageManagementIntentRequest0 = (StorageManagementIntentRequest)wbz.a(parcel0, StorageManagementIntentRequest.CREATOR);
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bugx.gr(parcel0);
                Intent intent0 = this.a(storageManagementIntentRequest0, apiMetadata1);
                parcel1.writeNoException();
                wbz.g(parcel1, intent0);
                return true;
            }
            case 5: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 == null) {
                    buhb0 = null;
                }
                else {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.googleone.internal.IStorageQuotaInfoCallback");
                    buhb0 = (iInterface1 instanceof buhb) ? ((buhb)iInterface1) : new bugz(iBinder1);
                }
                StorageQuotaInfoRequest storageQuotaInfoRequest0 = (StorageQuotaInfoRequest)wbz.a(parcel0, StorageQuotaInfoRequest.CREATOR);
                ApiMetadata apiMetadata2 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bugx.gr(parcel0);
                this.b(buhb0, storageQuotaInfoRequest0, apiMetadata2);
                parcel1.writeNoException();
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

