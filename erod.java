import android.webkit.ValueCallback;
import com.google.android.gms.smartdevice.setup.ui.views.MagicArchChallengeView;
import j..util.Objects;

public final class erod implements ValueCallback {
    final String a;
    final MagicArchChallengeView b;

    public erod(MagicArchChallengeView magicArchChallengeView0, String s) {
        this.a = s;
        Objects.requireNonNull(magicArchChallengeView0);
        this.b = magicArchChallengeView0;
        super();
    }

    @Override  // android.webkit.ValueCallback
    public final void onReceiveValue(Object object0) {
        Boolean boolean0 = (Boolean)object0;
        this.b.c.loadUrl(this.a);
    }
}

