import com.google.android.gms.findmydevice.spot.ChangeFindMyDeviceSettingsRequest;
import com.google.android.gms.findmydevice.spot.FindMyDeviceNetworkSettings;
import com.google.android.gms.mdm.settings.RadioButtonPreferenceWithDropdown;

public final class cqlf implements Runnable {
    public final cqlu a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final RadioButtonPreferenceWithDropdown e;

    public cqlf(cqlu cqlu0, boolean z, boolean z1, int v, RadioButtonPreferenceWithDropdown radioButtonPreferenceWithDropdown0) {
        this.a = cqlu0;
        this.b = z;
        this.c = z1;
        this.d = v;
        this.e = radioButtonPreferenceWithDropdown0;
    }

    @Override
    public final void run() {
        ChangeFindMyDeviceSettingsRequest changeFindMyDeviceSettingsRequest0 = new ChangeFindMyDeviceSettingsRequest();
        changeFindMyDeviceSettingsRequest0.a = Boolean.valueOf(this.b);
        changeFindMyDeviceSettingsRequest0.b = Boolean.valueOf(this.c);
        FindMyDeviceNetworkSettings findMyDeviceNetworkSettings0 = new FindMyDeviceNetworkSettings();
        findMyDeviceNetworkSettings0.a = this.d;
        changeFindMyDeviceSettingsRequest0.c = findMyDeviceNetworkSettings0;
        changeFindMyDeviceSettingsRequest0.d = true;
        evql evql0 = this.a.M(changeFindMyDeviceSettingsRequest0);
        evql0.b(new cqku(this.a, this.e));
        evql0.A(new cqkv(this.a));
    }
}

