import android.os.Parcel;
import com.google.android.gms.appsearch.aidl.AppSearchResultParcel;
import com.google.android.gms.common.api.ApiMetadata;

public abstract class acjl extends wby implements acjm {
    public acjl() {
        super("com.google.android.gms.appsearch.aidl.IAppSearchResultCallback");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            AppSearchResultParcel appSearchResultParcel0 = (AppSearchResultParcel)wbz.a(parcel0, AppSearchResultParcel.CREATOR);
            ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
            acjl.gr(parcel0);
            this.a(appSearchResultParcel0);
            return true;
        }
        return false;
    }
}

