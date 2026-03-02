import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.aang.AppRestriction;
import com.google.android.gms.auth.aang.AppRestrictionInfo;
import com.google.android.gms.auth.aang.AppRestrictionState;

public final class actf implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        AppRestrictionState appRestrictionState0 = null;
        AppRestrictionInfo appRestrictionInfo0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    appRestrictionState0 = (AppRestrictionState)baua.m(parcel0, v1, AppRestrictionState.CREATOR);
                    break;
                }
                case 2: {
                    appRestrictionInfo0 = (AppRestrictionInfo)baua.m(parcel0, v1, AppRestrictionInfo.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new AppRestriction(appRestrictionState0, appRestrictionInfo0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new AppRestriction[v];
    }
}

