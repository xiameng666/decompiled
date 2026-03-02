import android.os.Bundle;
import com.google.android.gms.trustagent.onboarding.TrustAgentOnboardingChimeraActivity;
import j..util.Objects;

public final class ezet implements luo {
    final TrustAgentOnboardingChimeraActivity a;

    public ezet(TrustAgentOnboardingChimeraActivity trustAgentOnboardingChimeraActivity0) {
        Objects.requireNonNull(trustAgentOnboardingChimeraActivity0);
        this.a = trustAgentOnboardingChimeraActivity0;
        super();
    }

    @Override  // luo
    public final lvb a(int v, Bundle bundle0) {
        return new ezax(this.a, bundle0);
    }

    @Override  // luo
    public final void b(lvb lvb0, Object object0) {
        Bundle bundle0 = ((ezaw)object0).b;
        if(((ezaw)object0).a.i == 0) {
            this.a.l = bundle0.getBoolean("trustagent.api.bridge.be.GetIsTrustagentStartOperation.is_trustagent_start_key");
            this.a.n(false);
            this.a.m();
        }
    }

    @Override  // luo
    public final void c(lvb lvb0) {
    }
}

