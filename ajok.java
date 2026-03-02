import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.firstparty.dataservice.PasswordSettings;
import com.google.android.gms.auth.firstparty.dataservice.PinSettings;
import com.google.android.gms.auth.firstparty.dataservice.ReauthSettingsResponse;

public final class ajok implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        PasswordSettings passwordSettings0 = null;
        int v1 = 0;
        int v2 = 0;
        PinSettings pinSettings0 = null;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 1: {
                    v1 = baua.f(parcel0, v3);
                    break;
                }
                case 2: {
                    v2 = baua.f(parcel0, v3);
                    break;
                }
                case 3: {
                    passwordSettings0 = (PasswordSettings)baua.m(parcel0, v3, PasswordSettings.CREATOR);
                    break;
                }
                case 4: {
                    pinSettings0 = (PinSettings)baua.m(parcel0, v3, PinSettings.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        return new ReauthSettingsResponse(v1, v2, passwordSettings0, pinSettings0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ReauthSettingsResponse[v];
    }
}

