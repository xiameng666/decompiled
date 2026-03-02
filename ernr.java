import android.webkit.ValueCallback;
import com.google.android.gms.smartdevice.setup.ui.views.AccountChallengeWebView;
import j..util.Objects;

public final class ernr implements ValueCallback {
    final String a;
    final AccountChallengeWebView b;

    public ernr(AccountChallengeWebView accountChallengeWebView0, String s) {
        this.a = s;
        Objects.requireNonNull(accountChallengeWebView0);
        this.b = accountChallengeWebView0;
        super();
    }

    @Override  // android.webkit.ValueCallback
    public final void onReceiveValue(Object object0) {
        Boolean boolean0 = (Boolean)object0;
        this.b.n.loadUrl(this.a);
    }
}

