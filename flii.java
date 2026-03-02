import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ConversationId;

public final class flii implements gfsi {
    public final flit a;
    public final AccountContext b;

    public flii(flit flit0, AccountContext accountContext0) {
        this.a = flit0;
        this.b = accountContext0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        int v = ((gged_interceptors)object0).size();
        for(int v1 = 0; v1 < v; ++v1) {
            ConversationId conversationId0 = ((fmev)((gged_interceptors)object0).get(v1)).a;
            flhd flhd0 = new flhd();
            flhe flhe0 = new flhe();
            this.a.g(this.b, conversationId0, flhd0, flhe0).g();
        }
        return (gged_interceptors)object0;
    }
}

