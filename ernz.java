import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import com.google.android.gms.smartdevice.d2d.FallbackAccount;
import com.google.android.gms.smartdevice.setup.ui.views.MagicArchChallengeView;

public final class ernz implements Runnable {
    public final MagicArchChallengeView a;
    public final FallbackAccount b;
    public final Context c;
    public final String d;

    public ernz(MagicArchChallengeView magicArchChallengeView0, FallbackAccount fallbackAccount0, Context context0, String s) {
        this.a = magicArchChallengeView0;
        this.b = fallbackAccount0;
        this.c = context0;
        this.d = s;
    }

    @Override
    public final void run() {
        int v = 0;
        while(v < ((int)hyhp.f())) {
            FallbackAccount fallbackAccount0 = this.b;
            String s = fallbackAccount0.b;
            if(TextUtils.isEmpty(s)) {
                ++v;
                continue;
            }
            else {
                TokenResponse tokenResponse0 = eqqw.a(this.c, s, this.d);
                if(tokenResponse0 == null) {
                    MagicArchChallengeView.a.f("upsert account failed, tokenResponse was null", new Object[0]);
                    ++v;
                    continue;
                }
                else {
                    ajpt ajpt0 = tokenResponse0.a();
                    if(ajpt0 == ajpt.c) {
                        MagicArchChallengeView.a.d("upsert account succeeded", new Object[0]);
                        this.a.m.add(fallbackAccount0);
                        return;
                    }
                    MagicArchChallengeView.a.f("upsert account failed, tokenResponse status: " + ajpt0, new Object[0]);
                    if(ajpt.d(ajpt0)) {
                        ++v;
                        continue;
                    }
                }
            }
            break;
        }
    }
}

