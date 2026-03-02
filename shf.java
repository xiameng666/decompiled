import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.android.settingslib.bluetooth.devicesettings.ActionSwitchPreferenceState;
import com.android.settingslib.bluetooth.devicesettings.DeviceSettingState;
import com.android.settingslib.bluetooth.devicesettings.MultiTogglePreferenceState;

public final class shf implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = parcel0.readInt();
        Bundle bundle0 = parcel0.readBundle(Bundle.class.getClassLoader());
        switch(parcel0.readInt()) {
            case 1: {
                return new DeviceSettingState(v, ActionSwitchPreferenceState.a(parcel0), bundle0);
            }
            case 2: {
                return new DeviceSettingState(v, MultiTogglePreferenceState.a(parcel0), bundle0);
            }
            default: {
                return new DeviceSettingState(v, she.b, bundle0);
            }
        }
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new DeviceSettingState[v];
    }
}

