import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.android.settingslib.bluetooth.devicesettings.DeviceSettingForgetDeviceDialogItem;
import com.android.settingslib.bluetooth.devicesettings.DeviceSettingGroup;
import com.android.settingslib.bluetooth.devicesettings.DeviceSettingItem;
import com.android.settingslib.bluetooth.devicesettings.DeviceSettingsConfig;
import java.util.ArrayList;

public final class shg implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        ibuq.f(parcel0, "parcel");
        ArrayList arrayList0 = new ArrayList();
        parcel0.readTypedList(arrayList0, DeviceSettingItem.CREATOR);
        ArrayList arrayList1 = new ArrayList();
        parcel0.readTypedList(arrayList1, DeviceSettingItem.CREATOR);
        DeviceSettingItem deviceSettingItem0 = (DeviceSettingItem)parcel0.readParcelable(DeviceSettingItem.class.getClassLoader());
        Bundle bundle0 = parcel0.readBundle(Bundle.class.getClassLoader());
        if(bundle0 == null) {
            bundle0 = Bundle.EMPTY;
        }
        DeviceSettingForgetDeviceDialogItem deviceSettingForgetDeviceDialogItem0 = (DeviceSettingForgetDeviceDialogItem)bundle0.getParcelable("forgetDialogItem");
        bundle0.setClassLoader(DeviceSettingGroup.class.getClassLoader());
        ArrayList arrayList2 = bundle0.getParcelableArrayList("settingGroups", DeviceSettingGroup.class);
        ibuq.c(bundle0);
        return new DeviceSettingsConfig(arrayList0, arrayList1, deviceSettingItem0, deviceSettingForgetDeviceDialogItem0, arrayList2, bundle0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new DeviceSettingsConfig[v];
    }
}

