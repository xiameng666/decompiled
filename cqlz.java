import android.accounts.Account;
import com.google.android.gms.findmydevice.spot.GetFindMyDeviceSettingsResponse;
import com.google.android.gms.findmydevice.spot.GetKeychainLockScreenKnowledgeFactorSupportRequest;

public final class cqlz implements evqf {
    public final cqne a;

    public cqlz(cqne cqne0) {
        this.a = cqne0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        if(cqpy.b(((GetFindMyDeviceSettingsResponse)object0))) {
            Account account0 = ((GetFindMyDeviceSettingsResponse)object0).h;
            if(account0 != null) {
                bosa bosa0 = this.a.ai;
                GetKeychainLockScreenKnowledgeFactorSupportRequest getKeychainLockScreenKnowledgeFactorSupportRequest0 = new GetKeychainLockScreenKnowledgeFactorSupportRequest();
                getKeychainLockScreenKnowledgeFactorSupportRequest0.a = account0;
                getKeychainLockScreenKnowledgeFactorSupportRequest0.b = false;
                evql evql0 = bosa0.g(getKeychainLockScreenKnowledgeFactorSupportRequest0);
                evql0.b(new cqml(this.a, ((GetFindMyDeviceSettingsResponse)object0)));
                evql0.A(new cqmm(this.a));
            }
        }
    }
}

