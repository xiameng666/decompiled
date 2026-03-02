import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.udc.SettingDisplayInfo;
import com.google.android.gms.udc.SettingState;

public final class ezmh implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        SettingState settingState0 = null;
        String s = null;
        String s1 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 2: {
                    settingState0 = (SettingState)baua.m(parcel0, v1, SettingState.CREATOR);
                    break;
                }
                case 3: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 4: {
                    s1 = baua.s(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new SettingDisplayInfo(settingState0, s, s1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new SettingDisplayInfo[v];
    }
}

