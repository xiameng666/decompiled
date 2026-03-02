import android.content.Intent;
import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.auth.api.phone.internal.RequestResult;
import com.google.android.gms.auth.api.phone.ui.UserConsentPromptChimeraActivity;
import j..util.Objects;

public final class aich implements View.OnClickListener {
    final RequestResult a;
    final String b;
    final String c;
    final UserConsentPromptChimeraActivity d;

    public aich(UserConsentPromptChimeraActivity userConsentPromptChimeraActivity0, RequestResult requestResult0, String s, String s1) {
        this.a = requestResult0;
        this.b = s;
        this.c = s1;
        Objects.requireNonNull(userConsentPromptChimeraActivity0);
        this.d = userConsentPromptChimeraActivity0;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        UserConsentPromptChimeraActivity userConsentPromptChimeraActivity0 = this.d;
        userConsentPromptChimeraActivity0.m = 1;
        Intent intent0 = new Intent();
        intent0.putExtra("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE", this.a.b);
        int v = this.a.c;
        if(v != -1) {
            intent0.putExtra("com.google.android.gms.auth.api.phone.EXTRA_SIM_SUBSCRIPTION_ID", v);
        }
        userConsentPromptChimeraActivity0.setResult(-1, intent0);
        if(userConsentPromptChimeraActivity0.n != null && userConsentPromptChimeraActivity0.n.isShowing()) {
            userConsentPromptChimeraActivity0.n.dismiss();
        }
        userConsentPromptChimeraActivity0.a(this.b, this.c);
    }
}

