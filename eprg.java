import android.text.TextUtils;
import com.google.android.gms.auth.firstparty.dataservice.ConsentResult;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;
import com.google.android.gms.auth.firstparty.shared.FACLConfig;
import com.google.android.gms.auth.firstparty.shared.PACLConfig;
import com.google.android.gms.signin.activity.ConsentChimeraActivity;
import java.util.concurrent.Callable;

public final class eprg implements Callable {
    public final ConsentChimeraActivity a;

    public eprg(ConsentChimeraActivity consentChimeraActivity0) {
        this.a = consentChimeraActivity0;
    }

    @Override
    public final Object call() {
        ConsentChimeraActivity consentChimeraActivity0 = this.a;
        TokenRequest tokenRequest0 = new TokenRequest(consentChimeraActivity0.q.a(), consentChimeraActivity0.q.a);
        tokenRequest0.f(consentChimeraActivity0.q.b());
        tokenRequest0.d(ajol.b);
        tokenRequest0.i = consentChimeraActivity0.q.i;
        ConsentResult consentResult0 = consentChimeraActivity0.t;
        if(consentResult0 != null) {
            FACLConfig fACLConfig0 = consentResult0.e;
            if(fACLConfig0 != null) {
                tokenRequest0.d = fACLConfig0;
            }
            PACLConfig pACLConfig0 = tokenRequest0.e;
            String s = consentResult0.d;
            if(s != null) {
                tokenRequest0.e = new PACLConfig((pACLConfig0 == null ? null : pACLConfig0.b), s);
            }
            ajol ajol0 = consentResult0.a();
            if(ajol0 != null) {
                tokenRequest0.d(ajol0);
            }
            String s1 = consentResult0.g;
            if(!TextUtils.isEmpty(s1)) {
                tokenRequest0.p = s1;
            }
            String s2 = consentResult0.h;
            if(!TextUtils.isEmpty(s2)) {
                tokenRequest0.q = s2;
            }
        }
        return consentChimeraActivity0.p.c(tokenRequest0);
    }
}

