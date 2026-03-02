import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wearable.AppTheme;
import com.google.android.gms.wearable.internal.GetAppThemeResponse;

public final class fdhs implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        AppTheme appTheme0 = null;
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 2: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 3: {
                    appTheme0 = (AppTheme)baua.m(parcel0, v2, AppTheme.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new GetAppThemeResponse(v1, appTheme0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GetAppThemeResponse[v];
    }
}

