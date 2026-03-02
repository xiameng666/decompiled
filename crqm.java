import android.os.Bundle;
import android.text.TextUtils;
import j..util.Objects;

final class crqm implements crqw {
    final crqq a;

    public crqm(crqq crqq0) {
        Objects.requireNonNull(crqq0);
        this.a = crqq0;
        super();
    }

    @Override  // crqw
    public final void a(String s, String s1, Bundle bundle0) {
        if(TextUtils.isEmpty(s)) {
            crkt crkt0 = this.a.i;
            if(crkt0 != null) {
                crkt0.aJ().c.b("AppId not known when logging event", s1);
            }
            return;
        }
        this.a.aK().f(new crql(this, s, s1, bundle0));
    }
}

