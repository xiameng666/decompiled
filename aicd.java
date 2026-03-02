import com.google.android.gms.auth.api.phone.internal.RequestResult;
import com.google.android.gms.auth.api.phone.internal.SmsRetrieverEvent;
import com.google.android.gms.auth.api.phone.internal.VerificationToken;
import com.google.android.gms.auth.api.phone.ui.UserConsentPromptChimeraActivity;
import java.util.concurrent.TimeUnit;

public final class aicd implements evqf {
    public final UserConsentPromptChimeraActivity a;
    public final String b;
    public final VerificationToken c;

    public aicd(UserConsentPromptChimeraActivity userConsentPromptChimeraActivity0, String s, VerificationToken verificationToken0) {
        this.a = userConsentPromptChimeraActivity0;
        this.b = s;
        this.c = verificationToken0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        UserConsentPromptChimeraActivity userConsentPromptChimeraActivity0 = this.a;
        String s = this.b;
        switch(((RequestResult)object0).a) {
            case 1: {
                VerificationToken verificationToken0 = this.c;
                userConsentPromptChimeraActivity0.l = (RequestResult)object0;
                aicr aicr0 = userConsentPromptChimeraActivity0.k;
                long v = System.currentTimeMillis() - verificationToken0.a;
                SmsRetrieverEvent smsRetrieverEvent0 = new SmsRetrieverEvent();
                aiao.d(9, smsRetrieverEvent0);
                int v1 = (int)TimeUnit.MILLISECONDS.toSeconds(v);
                smsRetrieverEvent0.n |= 0x80;
                smsRetrieverEvent0.h = v1;
                if(s != null) {
                    aiao.a(s, smsRetrieverEvent0);
                }
                aicr0.k(userConsentPromptChimeraActivity0, new aicq(smsRetrieverEvent0, true));
                userConsentPromptChimeraActivity0.g(s, ((RequestResult)object0), verificationToken0.b);
                return;
            }
            case 2: {
                userConsentPromptChimeraActivity0.k.k(userConsentPromptChimeraActivity0, aicr.u(s, 9));
                userConsentPromptChimeraActivity0.finish();
                return;
            }
            case 3: {
                userConsentPromptChimeraActivity0.k.k(userConsentPromptChimeraActivity0, aicr.u(s, 7));
                userConsentPromptChimeraActivity0.finish();
                return;
            }
            default: {
                userConsentPromptChimeraActivity0.j.f("Result canceled: %s", new Object[]{((RequestResult)object0)});
                userConsentPromptChimeraActivity0.finish();
            }
        }
    }
}

