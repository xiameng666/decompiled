import com.google.android.gms.findmydevice.spot.ChangeFindMyDeviceSettingsRequest;
import com.google.android.gms.findmydevice.spot.FindMyDeviceNetworkSettings;
import com.google.android.gms.findmydevice.spot.GetFindMyDeviceSettingsResponse;
import com.google.android.gms.findmydevice.spot.GetKeychainLockScreenKnowledgeFactorSupportResponse;

public final class cqmx implements Runnable {
    public final cqne a;
    public final GetKeychainLockScreenKnowledgeFactorSupportResponse b;
    public final GetFindMyDeviceSettingsResponse c;

    public cqmx(cqne cqne0, GetKeychainLockScreenKnowledgeFactorSupportResponse getKeychainLockScreenKnowledgeFactorSupportResponse0, GetFindMyDeviceSettingsResponse getFindMyDeviceSettingsResponse0) {
        this.a = cqne0;
        this.b = getKeychainLockScreenKnowledgeFactorSupportResponse0;
        this.c = getFindMyDeviceSettingsResponse0;
    }

    @Override
    public final void run() {
        cqne cqne0 = this.a;
        if(this.b.b) {
            cqne0.P();
            return;
        }
        int v = cqpy.a(this.c);
        ChangeFindMyDeviceSettingsRequest changeFindMyDeviceSettingsRequest0 = new ChangeFindMyDeviceSettingsRequest();
        FindMyDeviceNetworkSettings findMyDeviceNetworkSettings0 = new FindMyDeviceNetworkSettings();
        findMyDeviceNetworkSettings0.a = v;
        changeFindMyDeviceSettingsRequest0.c = findMyDeviceNetworkSettings0;
        changeFindMyDeviceSettingsRequest0.d = true;
        cqne0.aa(changeFindMyDeviceSettingsRequest0);
    }
}

