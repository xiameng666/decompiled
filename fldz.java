import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.concurrent.Callable;

public final class fldz implements Callable {
    public final fleb a;
    public final AccountContext b;
    public final ConversationId c;

    public fldz(fleb fleb0, AccountContext accountContext0, ConversationId conversationId0) {
        this.a = fleb0;
        this.b = accountContext0;
        this.c = conversationId0;
    }

    @Override
    public final Object call() {
        AccountContext accountContext0 = this.b;
        Boolean boolean0 = Boolean.valueOf(true);
        if(!"GMM".equals(accountContext0.h()) && !"GMB".equals(accountContext0.h())) {
            flbj.a("LitBstrpCntrl", " Invalid app name.");
            gmbu.i(boolean0);
            return null;
        }
        ConversationId conversationId0 = this.c;
        fleb fleb0 = this.a;
        gfsx gfsx0 = fleb0.b.d(accountContext0).a(fleb.d(conversationId0));
        if(!gfsx0.i()) {
            flsm.a(accountContext0, fleb0.c, 10100, 407);
            gmbu.i(boolean0);
            return null;
        }
        String s = new String(((byte[])gfsx0.d()));
        if("BOOTSTRAP_TOKEN_FINISH_VALUE".equals(s)) {
            gmbu.i(boolean0);
            return null;
        }
        flsm.a(accountContext0, fleb0.c, 10100, (s.isEmpty() ? 405 : 406));
        fleb0.c(accountContext0, conversationId0, s, true);
        return null;
    }
}

