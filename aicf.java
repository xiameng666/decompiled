import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.auth.api.phone.ui.UserConsentPromptChimeraActivity;

public final class aicf implements View.OnClickListener {
    public final UserConsentPromptChimeraActivity a;

    public aicf(UserConsentPromptChimeraActivity userConsentPromptChimeraActivity0) {
        this.a = userConsentPromptChimeraActivity0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        fyfv fyfv0 = this.a.n;
        if(fyfv0 != null) {
            fyfv0.cancel();
        }
    }
}

