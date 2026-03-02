import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface;
import com.google.android.gms.auth.api.phone.ui.PhoneNumberVerificationUserConsentPromptChimeraActivity;

public final class aibx implements DialogInterface.OnCancelListener {
    public final PhoneNumberVerificationUserConsentPromptChimeraActivity a;
    public final String b;

    public aibx(PhoneNumberVerificationUserConsentPromptChimeraActivity phoneNumberVerificationUserConsentPromptChimeraActivity0, String s) {
        this.a = phoneNumberVerificationUserConsentPromptChimeraActivity0;
        this.b = s;
    }

    @Override  // android.content.DialogInterface$OnCancelListener
    public final void onCancel(DialogInterface dialogInterface0) {
        ((ggtj)PhoneNumberVerificationUserConsentPromptChimeraActivity.j.h()).x("User dismissed the dialog.");
        ghwp ghwp0 = aicv.c(this.b, ghwo.f);
        this.a.l.a(ghwp0);
        this.a.a(false, 0xCF0F, "User dismissed the dialog.");
    }
}

