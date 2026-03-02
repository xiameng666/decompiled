import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface;
import com.google.android.gms.auth.api.phone.ui.UserConsentPromptChimeraActivity;
import j..util.Objects;

public final class aicg implements DialogInterface.OnCancelListener {
    final String a;
    final String b;
    final UserConsentPromptChimeraActivity c;

    public aicg(UserConsentPromptChimeraActivity userConsentPromptChimeraActivity0, String s, String s1) {
        this.a = s;
        this.b = s1;
        Objects.requireNonNull(userConsentPromptChimeraActivity0);
        this.c = userConsentPromptChimeraActivity0;
        super();
    }

    @Override  // android.content.DialogInterface$OnCancelListener
    public final void onCancel(DialogInterface dialogInterface0) {
        this.c.m = 2;
        this.c.a(this.a, this.b);
    }
}

