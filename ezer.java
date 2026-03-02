import android.content.Intent;
import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.trustagent.common.ui.ConfirmUserCredentialAndStartChimeraActivity;
import com.google.android.gms.trustagent.onboarding.TrustAgentOnboardingChimeraActivity;
import j..util.Objects;

public final class ezer implements View.OnClickListener {
    final TrustAgentOnboardingChimeraActivity a;

    public ezer(TrustAgentOnboardingChimeraActivity trustAgentOnboardingChimeraActivity0) {
        Objects.requireNonNull(trustAgentOnboardingChimeraActivity0);
        this.a = trustAgentOnboardingChimeraActivity0;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        TrustAgentOnboardingChimeraActivity trustAgentOnboardingChimeraActivity0 = this.a;
        if(trustAgentOnboardingChimeraActivity0.q) {
            trustAgentOnboardingChimeraActivity0.startActivity(ConfirmUserCredentialAndStartChimeraActivity.b(trustAgentOnboardingChimeraActivity0.o, trustAgentOnboardingChimeraActivity0.p, null));
            trustAgentOnboardingChimeraActivity0.finish();
            return;
        }
        Intent intent0 = ezcj.a(trustAgentOnboardingChimeraActivity0.o);
        trustAgentOnboardingChimeraActivity0.r = 1;
        trustAgentOnboardingChimeraActivity0.g().b(intent0);
    }
}

