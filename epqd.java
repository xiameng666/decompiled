import android.text.TextUtils;
import com.google.android.gms.auth.BrowserResolutionCookie;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import com.google.android.gms.signin.activity.ConsentChimeraActivity;
import java.util.concurrent.Callable;

public final class epqd implements Callable {
    public final ConsentChimeraActivity a;

    public epqd(ConsentChimeraActivity consentChimeraActivity0) {
        this.a = consentChimeraActivity0;
    }

    @Override
    public final Object call() {
        ConsentChimeraActivity consentChimeraActivity0 = this.a;
        consentChimeraActivity0.n();
        TokenResponse tokenResponse0 = consentChimeraActivity0.s;
        gftb.check(tokenResponse0);
        ConsentChimeraActivity.p(new epqp(tokenResponse0));
        BrowserResolutionCookie[] arr_browserResolutionCookie = tokenResponse0.z.e;
        if(arr_browserResolutionCookie == null) {
            ConsentChimeraActivity.p(new epqq());
        }
        else {
            for(int v = 0; v < arr_browserResolutionCookie.length; ++v) {
                BrowserResolutionCookie browserResolutionCookie0 = arr_browserResolutionCookie[v];
                if(!TextUtils.isEmpty(browserResolutionCookie0.c) && !TextUtils.isEmpty(browserResolutionCookie0.a) && !TextUtils.isEmpty(browserResolutionCookie0.b)) {
                    String s = browserResolutionCookie0.c;
                    gftb.check(s);
                    String s1 = acru.a(s, Boolean.valueOf(browserResolutionCookie0.f));
                    String s2 = acru.b(browserResolutionCookie0.a, browserResolutionCookie0.b, browserResolutionCookie0.c, browserResolutionCookie0.d, Boolean.valueOf(browserResolutionCookie0.g), Boolean.valueOf(browserResolutionCookie0.f), Long.valueOf(browserResolutionCookie0.e));
                    ConsentChimeraActivity.p(new epqs(s));
                    consentChimeraActivity0.m.setCookie(s1, s2);
                }
                else {
                    ConsentChimeraActivity.p(new epqr());
                }
            }
        }
        if(hpaj.a.c().e() && tokenResponse0.z.f) {
            ConsentChimeraActivity.p(new epqt());
            return ggnj.a;
        }
        ConsentChimeraActivity.p(new epqu(tokenResponse0));
        return new actb(consentChimeraActivity0).b(consentChimeraActivity0.q.a(), new String[]{tokenResponse0.z.d});
    }
}

