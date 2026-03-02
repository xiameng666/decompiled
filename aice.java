import com.google.android.gms.auth.api.phone.ui.UserConsentPromptChimeraActivity;

public final class aice implements evqc {
    public final UserConsentPromptChimeraActivity a;

    public aice(UserConsentPromptChimeraActivity userConsentPromptChimeraActivity0) {
        this.a = userConsentPromptChimeraActivity0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        this.a.j.g("Internal service failed: %s", exception0, new Object[0]);
        this.a.finish();
    }
}

