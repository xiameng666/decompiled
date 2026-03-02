import com.google.android.gms.findmydevice.spot.GetFindMyDeviceSettingsResponse;
import com.google.android.gms.findmydevice.spot.GetKeychainLockScreenKnowledgeFactorSupportResponse;

public final class cqlm implements Runnable {
    public final cqlu a;
    public final GetFindMyDeviceSettingsResponse b;
    public final GetKeychainLockScreenKnowledgeFactorSupportResponse c;

    public cqlm(cqlu cqlu0, GetFindMyDeviceSettingsResponse getFindMyDeviceSettingsResponse0, GetKeychainLockScreenKnowledgeFactorSupportResponse getKeychainLockScreenKnowledgeFactorSupportResponse0) {
        this.a = cqlu0;
        this.b = getFindMyDeviceSettingsResponse0;
        this.c = getKeychainLockScreenKnowledgeFactorSupportResponse0;
    }

    @Override
    public final void run() {
        cqlu cqlu0 = this.a;
        if(cqlu0.d == null) {
            return;
        }
        if(cqpy.b(this.b)) {
            GetKeychainLockScreenKnowledgeFactorSupportResponse getKeychainLockScreenKnowledgeFactorSupportResponse0 = this.c;
            if(!getKeychainLockScreenKnowledgeFactorSupportResponse0.b) {
                if(!getKeychainLockScreenKnowledgeFactorSupportResponse0.a) {
                    cqlu0.d.h();
                    return;
                }
                cqlu0.d.d();
                return;
            }
            cqlu0.d.g();
            return;
        }
        cqlu0.d.d();
    }
}

