import android.os.Parcel;
import com.google.android.gms.actionlearner.internal.LiaSettingsResult;
import com.google.android.gms.actionlearner.internal.ParcelableAction;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;

public abstract class aaxn extends wby implements aaxo {
    public aaxn() {
        super("com.google.android.gms.actionlearner.internal.ILearnedActionProviderCallbacks");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
                ArrayList arrayList0 = parcel0.createTypedArrayList(ParcelableAction.CREATOR);
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                aaxn.gr(parcel0);
                this.a(status0, arrayList0);
                return true;
            }
            case 2: {
                Status status1 = (Status)wbz.a(parcel0, Status.CREATOR);
                LiaSettingsResult liaSettingsResult0 = (LiaSettingsResult)wbz.a(parcel0, LiaSettingsResult.CREATOR);
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                aaxn.gr(parcel0);
                this.c(status1, liaSettingsResult0);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

