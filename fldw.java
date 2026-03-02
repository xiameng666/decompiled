import android.text.TextUtils;
import com.google.android.libraries.messaging.lighter.model.AccountContext;
import java.nio.charset.StandardCharsets;

public final class fldw implements glzn {
    public final fleb a;
    public final int b;
    public final AccountContext c;

    public fldw(fleb fleb0, int v, AccountContext accountContext0) {
        this.a = fleb0;
        this.b = v;
        this.c = accountContext0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        gged_interceptors gged0 = ((flkl)object0).b;
        int v = gged0.size() + this.b;
        fleb fleb0 = this.a;
        AccountContext accountContext0 = this.c;
        fmou fmou0 = fleb0.b.b(accountContext0);
        flla flla0 = fleb0.b.d(accountContext0);
        int v1 = gged0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            fmej fmej0 = (fmej)gged0.get(v2);
            gged_interceptors gged1 = fmej0.b.a;
            int v3 = ((ggna)gged1).c;
            fmel[] arr_fmel = new fmel[v3];
            for(int v4 = 0; v4 < v3; ++v4) {
                arr_fmel[v4] = (fmel)gged1.get(v4);
            }
            fmou0.U(fmej0.a, arr_fmel);
            flla0.c(fleb.d(fmej0.a), "".getBytes(StandardCharsets.UTF_8));
            gmcu gmcu0 = new gmcu();
            gmbu.m(new flgw(fleb0.h, accountContext0, fmej0.a, gmcu0), gmap.a);
        }
        String s = ((flkl)object0).a;
        flla0.c("BOOTSTRAP_DOWNLOAD_CONVERSATION_TOKEN_KEY", (TextUtils.isEmpty(s) ? "BOOTSTRAP_TOKEN_FINISH_VALUE" : s).getBytes(StandardCharsets.UTF_8));
        flla0.c("BOOTSTRAP_CONVERSATIONS_DOWNLOADED_KEY", glxd.h(v));
        return fleb0.b(accountContext0, s, false, v);
    }
}

