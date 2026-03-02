import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.Callable;

public final class flfi implements Callable {
    public final flfv a;
    public final Map b;
    public final ConversationId c;

    public flfi(flfv flfv0, Map map0, ConversationId conversationId0) {
        this.a = flfv0;
        this.b = map0;
        this.c = conversationId0;
    }

    @Override
    public final Object call() {
        gged_interceptors gged0 = gged_interceptors.i(((Collection)this.b.get(this.c)));
        this.a.d.I(gged0);
        return null;
    }
}

