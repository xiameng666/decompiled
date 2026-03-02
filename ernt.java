import android.content.Context;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import com.google.android.gms.smartdevice.setup.ui.views.AccountChallengeWebView;
import j..util.Objects;

final class ernt implements batm {
    final Context a;
    final String b;
    final String c;

    public ernt(AccountChallengeWebView accountChallengeWebView0, Context context0, String s, String s1) {
        this.a = context0;
        this.b = s;
        this.c = s1;
        Objects.requireNonNull(accountChallengeWebView0);
        super();
    }

    @Override  // batm
    public final boolean a(Object object0) {
        Integer integer0 = (Integer)object0;
        TokenResponse tokenResponse0 = eqqw.a(this.a, this.b, this.c);
        if(tokenResponse0 == null) {
            AccountChallengeWebView.a.f("TokenResponse was null", new Object[0]);
            return true;
        }
        ajpt ajpt0 = tokenResponse0.a();
        if(ajpt0 == ajpt.c) {
            AccountChallengeWebView.a.j("Successfully updated account", new Object[0]);
            return false;
        }
        baun baun0 = AccountChallengeWebView.a;
        baun0.f("Failed adding account %s", new Object[]{ajpt0.ak});
        if(ajpt.d(ajpt0)) {
            return true;
        }
        baun0.f("Unrecoverable error", new Object[0]);
        return false;
    }
}

