import com.google.android.gms.findmydevice.spot.GetFindMyDeviceSettingsResponse;

public final class cqmt implements Runnable {
    public final cqne a;
    public final GetFindMyDeviceSettingsResponse b;

    public cqmt(cqne cqne0, GetFindMyDeviceSettingsResponse getFindMyDeviceSettingsResponse0) {
        this.a = cqne0;
        this.b = getFindMyDeviceSettingsResponse0;
    }

    @Override
    public final void run() {
        cqne cqne0 = this.a;
        GetFindMyDeviceSettingsResponse getFindMyDeviceSettingsResponse0 = this.b;
        if(getFindMyDeviceSettingsResponse0.g && getFindMyDeviceSettingsResponse0.h != null) {
            cqne0.S(getFindMyDeviceSettingsResponse0, null);
            return;
        }
        cqne0.P();
        cqne0.T();
    }
}

