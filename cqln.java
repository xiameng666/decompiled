import com.google.android.gms.findmydevice.spot.ChangeFindMyDeviceSettingsRequest;
import com.google.android.gms.findmydevice.spot.FindMyDeviceNetworkSettings;
import com.google.android.gms.findmydevice.spot.GetFindMyDeviceSettingsResponse;
import com.google.android.gms.findmydevice.spot.GetKeychainLockScreenKnowledgeFactorSupportResponse;

public final class cqln implements Runnable {
    public final cqlu a;
    public final GetKeychainLockScreenKnowledgeFactorSupportResponse b;
    public final GetFindMyDeviceSettingsResponse c;

    public cqln(cqlu cqlu0, GetKeychainLockScreenKnowledgeFactorSupportResponse getKeychainLockScreenKnowledgeFactorSupportResponse0, GetFindMyDeviceSettingsResponse getFindMyDeviceSettingsResponse0) {
        this.a = cqlu0;
        this.b = getKeychainLockScreenKnowledgeFactorSupportResponse0;
        this.c = getFindMyDeviceSettingsResponse0;
    }

    @Override
    public final void run() {
        if(this.b.b) {
            return;
        }
        int v = cqpy.a(this.c);
        ChangeFindMyDeviceSettingsRequest changeFindMyDeviceSettingsRequest0 = new ChangeFindMyDeviceSettingsRequest();
        FindMyDeviceNetworkSettings findMyDeviceNetworkSettings0 = new FindMyDeviceNetworkSettings();
        findMyDeviceNetworkSettings0.a = v;
        changeFindMyDeviceSettingsRequest0.c = findMyDeviceNetworkSettings0;
        changeFindMyDeviceSettingsRequest0.d = true;
        this.a.M(changeFindMyDeviceSettingsRequest0).A(new cqlq());
    }
}

