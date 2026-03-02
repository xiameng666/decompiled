import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class flkh {
    public final flky a;
    public final gmcg b;
    public final Map c;
    public final Map d;
    public final Handler e;
    public final flwi f;
    private final Map g;
    private final Map h;

    public flkh(flwi flwi0, flky flky0) {
        this.e = new Handler(Looper.getMainLooper());
        this.g = new HashMap();
        this.h = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.f = flwi0;
        this.a = flky0;
        this.b = flbs.b().a;
    }

    public final fmpa a(ConversationId conversationId0) {
        fmpa fmpa1;
        synchronized(this) {
            Map map0 = this.g;
            if(!map0.containsKey(conversationId0)) {
                fmpa fmpa0 = new fmpf(this.i(conversationId0));
                map0.put(conversationId0, fmpa0);
                return fmpa0;
            }
            fmpa1 = (fmpa)map0.get(conversationId0);
        }
        return fmpa1;
    }

    public final void b(ConversationId conversationId0, ContactId contactId0, long v) {
        synchronized(this) {
            Map map0 = this.h;
            if(!map0.containsKey(conversationId0)) {
                map0.put(conversationId0, new LinkedHashMap());
            }
            if(!((Map)map0.get(conversationId0)).containsKey(contactId0) || ((long)(((Long)((Pair)((Map)map0.get(conversationId0)).get(contactId0)).second))) <= v) {
                ((Map)map0.get(conversationId0)).put(contactId0, Pair.create(Boolean.valueOf(true), Long.valueOf(v)));
                Map map1 = this.g;
                if(map1.containsKey(conversationId0)) {
                    ((fmpf)map1.get(conversationId0)).c(this.i(conversationId0));
                }
            }
        }
    }

    public final void c(AccountContext accountContext0, ConversationId conversationId0, boolean z, int v) {
        long v1 = TimeUnit.MILLISECONDS.toMicros(iadx.b());
        this.a.b(accountContext0).p(conversationId0).k(new flkd(this, accountContext0, conversationId0, z, v1, v));
    }

    public final void d(ConversationId conversationId0) {
        synchronized(this) {
            LinkedHashMap linkedHashMap0 = new LinkedHashMap();
            this.h.put(conversationId0, linkedHashMap0);
            Map map0 = this.g;
            if(map0.containsKey(conversationId0)) {
                ((fmpf)map0.get(conversationId0)).c(this.i(conversationId0));
            }
        }
    }

    public final void e(ConversationId conversationId0) {
        synchronized(this) {
            this.c.remove(conversationId0);
        }
    }

    public final void f(ConversationId conversationId0, ContactId contactId0, long v) {
        synchronized(this) {
            Map map0 = this.h;
            if(!map0.containsKey(conversationId0)) {
                map0.put(conversationId0, new LinkedHashMap());
            }
            if(!((Map)map0.get(conversationId0)).containsKey(contactId0) || ((long)(((Long)((Pair)((Map)map0.get(conversationId0)).get(contactId0)).second))) <= v) {
                ((Map)map0.get(conversationId0)).put(contactId0, Pair.create(Boolean.valueOf(false), Long.valueOf(v)));
                Map map1 = this.g;
                if(map1.containsKey(conversationId0)) {
                    ((fmpf)map1.get(conversationId0)).c(this.i(conversationId0));
                }
            }
        }
    }

    public final void g(AccountContext accountContext0, ConversationId conversationId0, int v) {
        synchronized(this) {
            flke flke0 = new flke(this, accountContext0, conversationId0, v);
            this.b.d(flke0);
        }
    }

    // Detected as a lambda impl.
    public final void h(AccountContext accountContext0, ConversationId conversationId0) {
        long v3;
        boolean z;
        long v = iadx.c();
        synchronized(this) {
            Map map0 = this.c;
            if(map0.containsKey(conversationId0)) {
                long v2 = (long)(((Long)map0.get(conversationId0)));
                flba.a();
                if(v2 <= System.currentTimeMillis() - v) {
                    map0.remove(conversationId0);
                    z = true;
                }
                else {
                    z = false;
                }
                flba.a();
                v3 = v2 + v - System.currentTimeMillis();
            }
            else {
                v3 = -1L;
                z = false;
            }
        }
        if(z) {
            this.c(accountContext0, conversationId0, false, 344);
            return;
        }
        if(v3 > 0L) {
            flkg flkg0 = new flkg(this, accountContext0, conversationId0);
            this.e.postDelayed(flkg0, v3);
        }
    }

    private final gged_interceptors i(ConversationId conversationId0) {
        gged_interceptors gged0;
        synchronized(this) {
            Map map0 = this.h;
            if(!map0.containsKey(conversationId0)) {
                return ggna.a;
            }
            ggdy ggdy0 = new ggdy();
            for(Object object0: ((Map)map0.get(conversationId0)).entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                if(((Boolean)((Pair)map$Entry0.getValue()).first).booleanValue()) {
                    ggdy0.i(((ContactId)map$Entry0.getKey()));
                }
            }
            gged0 = ggdy0.h();
        }
        return gged0;
    }
}

