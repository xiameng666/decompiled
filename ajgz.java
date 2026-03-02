import android.os.Parcel;
import com.google.android.gms.auth.cryptauth.ExportedSymmetricKey;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;

public abstract class ajgz extends wby implements ajha {
    public ajgz() {
        super("com.google.android.gms.auth.cryptauth.internal.IExportedSymmetricKeyCallback");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                ExportedSymmetricKey exportedSymmetricKey0 = (ExportedSymmetricKey)wbz.a(parcel0, ExportedSymmetricKey.CREATOR);
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ajgz.gr(parcel0);
                this.c(exportedSymmetricKey0, apiMetadata0);
                return true;
            }
            case 2: {
                Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ajgz.gr(parcel0);
                this.a(status0, apiMetadata1);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

