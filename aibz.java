import android.app.Dialog;
import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.auth.api.phone.IncomingCallRetrieverRequest;
import com.google.android.gms.auth.api.phone.ui.PhoneNumberVerificationUserConsentPromptChimeraActivity;
import com.google.android.gms.common.api.Status;

public final class aibz implements View.OnClickListener {
    public final PhoneNumberVerificationUserConsentPromptChimeraActivity a;
    public final String b;
    public final IncomingCallRetrieverRequest c;
    public final Dialog d;

    public aibz(PhoneNumberVerificationUserConsentPromptChimeraActivity phoneNumberVerificationUserConsentPromptChimeraActivity0, String s, IncomingCallRetrieverRequest incomingCallRetrieverRequest0, Dialog dialog0) {
        this.a = phoneNumberVerificationUserConsentPromptChimeraActivity0;
        this.b = s;
        this.c = incomingCallRetrieverRequest0;
        this.d = dialog0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        ((ggtj)PhoneNumberVerificationUserConsentPromptChimeraActivity.j.h()).x("User consent Granted");
        ghwp ghwp0 = aicv.c(this.b, ghwo.e);
        this.a.l.a(ghwp0);
        icbb.b(lpt.a(this.a), null, null, new aica(this.a, this.b, null), 3);
        this.a.g(this.b, this.c);
        this.a.a(true, Status.b.i, "Verification started successfully.");
        this.d.dismiss();
    }
}

