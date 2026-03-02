import com.google.android.gms.findmydevice.spot.GetFindMyDeviceSettingsResponse;
import com.google.android.gms.findmydevice.spot.GetKeychainLockScreenKnowledgeFactorSupportResponse;

public final class cqmb implements Runnable {
    public final cqne a;
    public final GetKeychainLockScreenKnowledgeFactorSupportResponse b;
    public final GetKeychainLockScreenKnowledgeFactorSupportResponse c;
    public final GetFindMyDeviceSettingsResponse d;

    public cqmb(cqne cqne0, GetKeychainLockScreenKnowledgeFactorSupportResponse getKeychainLockScreenKnowledgeFactorSupportResponse0, GetKeychainLockScreenKnowledgeFactorSupportResponse getKeychainLockScreenKnowledgeFactorSupportResponse1, GetFindMyDeviceSettingsResponse getFindMyDeviceSettingsResponse0) {
        this.a = cqne0;
        this.b = getKeychainLockScreenKnowledgeFactorSupportResponse0;
        this.c = getKeychainLockScreenKnowledgeFactorSupportResponse1;
        this.d = getFindMyDeviceSettingsResponse0;
    }

    @Override
    public final void run() {
        cqne cqne0 = this.a;
        GetFindMyDeviceSettingsResponse getFindMyDeviceSettingsResponse0 = this.d;
        GetKeychainLockScreenKnowledgeFactorSupportResponse getKeychainLockScreenKnowledgeFactorSupportResponse0 = this.b;
        if(getKeychainLockScreenKnowledgeFactorSupportResponse0.a && getKeychainLockScreenKnowledgeFactorSupportResponse0.c == null && this.c == null) {
            cqne0.S(getFindMyDeviceSettingsResponse0, getKeychainLockScreenKnowledgeFactorSupportResponse0);
            return;
        }
        cqne0.P();
        cqne0.X(getFindMyDeviceSettingsResponse0, getKeychainLockScreenKnowledgeFactorSupportResponse0);
    }
}

