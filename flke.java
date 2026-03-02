import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.Map;

public final class flke implements Runnable {
    public final flkh a;
    public final AccountContext b;
    public final ConversationId c;
    public final int d;

    public flke(flkh flkh0, AccountContext accountContext0, ConversationId conversationId0, int v) {
        this.a = flkh0;
        this.b = accountContext0;
        this.c = conversationId0;
        this.d = v;
    }

    @Override
    public final void run() {
        int v;
        flkh flkh0 = this.a;
        AccountContext accountContext0 = this.b;
        ConversationId conversationId0 = this.c;
        boolean z = false;
        switch(this.d) {
            case 1: {
                long v1 = iadx.c();
                synchronized(flkh0) {
                    Map map0 = flkh0.c;
                    if(map0.containsKey(conversationId0)) {
                        Map map1 = flkh0.d;
                        if(map1.containsKey(conversationId0)) {
                            flba.a();
                            long v2 = iadx.b() - 2000L;
                            if(System.currentTimeMillis() - ((long)(((Long)map1.get(conversationId0)))) > v2) {
                            label_20:
                                z = true;
                            }
                        }
                    }
                    else {
                        flkc flkc0 = new flkc(flkh0, accountContext0, conversationId0);
                        flkh0.e.postDelayed(flkc0, v1);
                        goto label_20;
                    }
                    flba.a();
                    map0.put(conversationId0, Long.valueOf(System.currentTimeMillis()));
                }
                if(z) {
                    flkh0.c(accountContext0, conversationId0, true, 342);
                }
                return;
            }
            case 2: {
                v = 343;
                break;
            }
            case 3: {
                v = 344;
                break;
            }
            case 4: {
                v = 345;
                break;
            }
            default: {
                flbj.c("LitTypingIndicatorCntrl", "Unknown typing event");
                v = 341;
            }
        }
        flkh0.c(accountContext0, conversationId0, false, v);
        synchronized(flkh0) {
            flkh0.c.remove(conversationId0);
        }
    }
}

