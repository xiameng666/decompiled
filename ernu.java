import android.content.Context;
import com.google.android.gms.smartdevice.setup.ui.views.AccountChallengeWebView;
import j..util.Objects;
import java.util.HashSet;

final class ernu implements batm {
    final Context a;
    final String b;
    final String c;
    final String d;
    final String e;

    public ernu(AccountChallengeWebView accountChallengeWebView0, Context context0, String s, String s1, String s2, String s3) {
        this.a = context0;
        this.b = s;
        this.c = s1;
        this.d = s2;
        this.e = s3;
        Objects.requireNonNull(accountChallengeWebView0);
        super();
    }

    @Override  // batm
    public final boolean a(Object object0) {
        Integer integer0 = (Integer)object0;
        HashSet hashSet0 = eqqw.g(this.a);
        if(eqqw.d(this.a, this.b, this.c, this.d, this.e, hashSet0)) {
            AccountChallengeWebView.a.j("Successfully updated account with credential", new Object[0]);
            return false;
        }
        AccountChallengeWebView.a.j("Upserting with credentials failed", new Object[0]);
        return true;
    }
}

