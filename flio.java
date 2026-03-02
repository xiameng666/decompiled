import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.Arrays;
import java.util.List;

public final class flio implements Runnable {
    public final flit a;
    public final AccountContext b;
    public final ConversationId c;
    public final gged_interceptors d;

    public flio(flit flit0, AccountContext accountContext0, ConversationId conversationId0, gged_interceptors gged0) {
        this.a = flit0;
        this.b = accountContext0;
        this.c = conversationId0;
        this.d = gged0;
    }

    @Override
    public final void run() {
        fmou fmou0 = this.a.d(this.b);
        List list0 = Arrays.asList(new fmft[]{fmft.c});
        fmou0.ac(this.c, this.d, list0, fmft.d);
    }
}

