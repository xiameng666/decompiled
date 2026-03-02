import android.os.Parcel;
import com.google.android.gms.appsearch.aidl.AppSearchBatchResultParcel;
import com.google.android.gms.appsearch.aidl.AppSearchResultParcel;
import com.google.android.gms.common.api.ApiMetadata;

public abstract class acji extends wby implements acjj {
    public acji() {
        super("com.google.android.gms.appsearch.aidl.IAppSearchBatchResultCallback");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                AppSearchBatchResultParcel appSearchBatchResultParcel0 = (AppSearchBatchResultParcel)wbz.a(parcel0, AppSearchBatchResultParcel.CREATOR);
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                acji.gr(parcel0);
                this.a(appSearchBatchResultParcel0);
                return true;
            }
            case 2: {
                AppSearchResultParcel appSearchResultParcel0 = (AppSearchResultParcel)wbz.a(parcel0, AppSearchResultParcel.CREATOR);
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                acji.gr(parcel0);
                this.c(appSearchResultParcel0);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

