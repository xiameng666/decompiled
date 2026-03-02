import android.text.TextUtils;
import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ConversationId;

public final class fldu implements glzn {
    public final fleb a;
    public final AccountContext b;
    public final ConversationId c;

    public fldu(fleb fleb0, AccountContext accountContext0, ConversationId conversationId0) {
        this.a = fleb0;
        this.b = accountContext0;
        this.c = conversationId0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        gged_interceptors gged0 = ((flkm)object0).b;
        int v = ((ggna)gged0).c;
        fleb fleb0 = this.a;
        flky flky0 = fleb0.b;
        AccountContext accountContext0 = this.b;
        flla flla0 = flky0.d(accountContext0);
        fmel[] arr_fmel = new fmel[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_fmel[v1] = (fmel)gged0.get(v1);
        }
        flky0.b(accountContext0).U(this.c, arr_fmel);
        flbj.a("LitBstrpCntrl", "saved " + v + " messages to database");
        String s = ((flkm)object0).a;
        String s1 = TextUtils.isEmpty(s) ? "BOOTSTRAP_TOKEN_FINISH_VALUE" : s;
        flla0.c(fleb.d(this.c), s1.getBytes());
        return fleb0.c(accountContext0, this.c, s, false);
    }
}

