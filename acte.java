import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.aang.AccountWithAppRestrictionState;
import com.google.android.gms.auth.aang.AppRestrictionState;
import com.google.android.gms.auth.aang.GoogleAccount;

public final class acte implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        GoogleAccount googleAccount0 = null;
        AppRestrictionState appRestrictionState0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    googleAccount0 = (GoogleAccount)baua.m(parcel0, v1, GoogleAccount.CREATOR);
                    break;
                }
                case 2: {
                    appRestrictionState0 = (AppRestrictionState)baua.m(parcel0, v1, AppRestrictionState.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new AccountWithAppRestrictionState(googleAccount0, appRestrictionState0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new AccountWithAppRestrictionState[v];
    }
}

