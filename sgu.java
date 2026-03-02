import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.android.settingslib.bluetooth.devicesettings.ActionSwitchPreference;
import com.android.settingslib.bluetooth.devicesettings.DeviceSetting;
import com.android.settingslib.bluetooth.devicesettings.DeviceSettingFooterPreference;
import com.android.settingslib.bluetooth.devicesettings.DeviceSettingHelpPreference;
import com.android.settingslib.bluetooth.devicesettings.MultiTogglePreference;

public final class sgu implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = parcel0.readInt();
        Bundle bundle0 = parcel0.readBundle(Bundle.class.getClassLoader());
        switch(parcel0.readInt()) {
            case 1: {
                return new DeviceSetting(v, ActionSwitchPreference.a(parcel0), bundle0);
            }
            case 2: {
                return new DeviceSetting(v, MultiTogglePreference.a(parcel0), bundle0);
            }
            case 3: {
                return new DeviceSetting(v, DeviceSettingFooterPreference.a(parcel0), bundle0);
            }
            case 4: {
                return new DeviceSetting(v, DeviceSettingHelpPreference.a(parcel0), bundle0);
            }
            default: {
                return new DeviceSetting(v, shd.a, bundle0);
            }
        }
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new DeviceSetting[v];
    }
}

