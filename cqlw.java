import com.google.android.gms.findmydevice.spot.GetFindMyDeviceSettingsResponse;
import com.google.android.gms.findmydevice.spot.GetKeychainLockScreenKnowledgeFactorSupportResponse;

public final class cqlw implements Runnable {
    public final cqne a;
    public final GetKeychainLockScreenKnowledgeFactorSupportResponse b;
    public final Exception c;
    public final GetFindMyDeviceSettingsResponse d;

    public cqlw(cqne cqne0, GetKeychainLockScreenKnowledgeFactorSupportResponse getKeychainLockScreenKnowledgeFactorSupportResponse0, Exception exception0, GetFindMyDeviceSettingsResponse getFindMyDeviceSettingsResponse0) {
        this.a = cqne0;
        this.b = getKeychainLockScreenKnowledgeFactorSupportResponse0;
        this.c = exception0;
        this.d = getFindMyDeviceSettingsResponse0;
    }

    @Override
    public final void run() {
        cqne cqne0 = this.a;
        cqne0.P();
        GetFindMyDeviceSettingsResponse getFindMyDeviceSettingsResponse0 = this.d;
        GetKeychainLockScreenKnowledgeFactorSupportResponse getKeychainLockScreenKnowledgeFactorSupportResponse0 = this.b;
        Exception exception0 = this.c;
        if(getKeychainLockScreenKnowledgeFactorSupportResponse0 == null) {
            cqqt.b(exception0, "Error checking LSKF availability", new Object[0]);
            GetKeychainLockScreenKnowledgeFactorSupportResponse getKeychainLockScreenKnowledgeFactorSupportResponse1 = new GetKeychainLockScreenKnowledgeFactorSupportResponse();
            getKeychainLockScreenKnowledgeFactorSupportResponse1.a = false;
            cqne0.X(getFindMyDeviceSettingsResponse0, getKeychainLockScreenKnowledgeFactorSupportResponse1);
            return;
        }
        cqqt.b(exception0, "Error checking for LSKF domain", new Object[0]);
        cqne0.X(getFindMyDeviceSettingsResponse0, getKeychainLockScreenKnowledgeFactorSupportResponse0);
    }
}

