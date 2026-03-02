import android.content.Context;
import android.provider.Settings.Secure;
import android.webkit.JavascriptInterface;
import com.google.android.gms.smartdevice.d2d.FallbackAccount;
import com.google.android.gms.smartdevice.setup.ui.views.MagicArchChallengeView;
import j..util.Objects;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public final class erog {
    final MagicArchChallengeView a;

    public erog(MagicArchChallengeView magicArchChallengeView0) {
        Objects.requireNonNull(magicArchChallengeView0);
        this.a = magicArchChallengeView0;
        super();
    }

    @JavascriptInterface
    public void finishChallenge() {
        if(!hyhp.i()) {
            FallbackAccount fallbackAccount0 = (FallbackAccount)this.a.i.get(this.a.k);
            this.a.m.add(fallbackAccount0);
            this.a.j.countDown();
            this.a.b();
        }
    }

    @JavascriptInterface
    public String getAndroidId() {
        if(hyhp.a.g().w()) {
            Context context0 = this.a.getContext();
            batl.s(context0);
            long v = bbmq.d(context0);
            return v == 0L ? null : Long.toHexString(v);
        }
        return null;
    }

    @JavascriptInterface
    public void setAuthenticatingParentId(String s) {
        if(hyhp.a.g().x()) {
            this.a.h.c(s);
        }
    }

    @JavascriptInterface
    public void setContentFilters(String s) {
        if(hyhp.a.g().p()) {
            try {
                JSONObject jSONObject0 = new JSONObject(s);
                Iterator iterator0 = jSONObject0.keys();
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    int v = jSONObject0.getInt(((String)object0));
                    Settings.Secure.putInt(this.a.getContext().getContentResolver(), ((String)object0), v);
                }
                return;
            }
            catch(JSONException jSONException0) {
                goto label_10;
            }
        }
        return;
    label_10:
        MagicArchChallengeView.a.n("Parse content filter values JSON failed", jSONException0, new Object[0]);
    }

    @JavascriptInterface
    public void skipAccount() {
        erof erof0 = new erof(this);
        this.a.post(erof0);
    }
}

