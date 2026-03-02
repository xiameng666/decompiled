import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public final class fliu {
    private final Map a;
    private final Map b;

    public fliu() {
        ggib ggib0 = new ggib();
        ggib0.g(ggiq.b);
        this.a = ggib0.e();
        this.b = new HashMap();
    }

    public final fmpa a(ConversationId conversationId0) {
        fmpa fmpa1;
        synchronized(this) {
            Map map0 = this.a;
            if(!map0.containsKey(conversationId0)) {
                Map map1 = this.b;
                Collection collection0 = map1.containsKey(conversationId0) ? ((Map)map1.get(conversationId0)).values() : ggna.a;
                fmpa fmpa0 = new fmpf(gged_interceptors.i(collection0));
                map0.put(conversationId0, fmpa0);
                return fmpa0;
            }
            fmpa1 = (fmpa)map0.get(conversationId0);
        }
        return fmpa1;
    }

    public final void b(ConversationId conversationId0, String s) {
        synchronized(this) {
            Map map0 = this.b;
            if(map0.containsKey(conversationId0)) {
                ((Map)map0.get(conversationId0)).remove(s);
                Map map1 = this.a;
                if(map1.containsKey(conversationId0)) {
                    ((fmpf)map1.get(conversationId0)).c(gged_interceptors.i(((Map)map0.get(conversationId0)).values()));
                }
                if(((Map)map0.get(conversationId0)).isEmpty()) {
                    map0.remove(conversationId0);
                }
            }
        }
    }

    public final void c(ConversationId conversationId0) {
        synchronized(this) {
            Map map0 = this.b;
            if(map0.containsKey(conversationId0)) {
                map0.remove(conversationId0);
                Map map1 = this.a;
                if(map1.containsKey(conversationId0)) {
                    ((fmpf)map1.get(conversationId0)).c(ggna.a);
                }
            }
        }
    }
}

