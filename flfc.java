import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class flfc implements fmoz {
    public final flfv a;
    public final flud b;

    public flfc(flfv flfv0, flud flud0) {
        this.a = flfv0;
        this.b = flud0;
    }

    @Override  // fmoz
    public final void a(Object object0) {
        if(((Boolean)object0).booleanValue()) {
            return;
        }
        flud flud0 = this.b;
        flfv flfv0 = this.a;
        flba.a();
        long v = System.currentTimeMillis();
        synchronized(flfv0.q) {
            int v2 = flud0.d;
            ContactId contactId0 = flud0.c;
            ConversationId conversationId0 = flud0.b;
            if(v2 == 1) {
                long v3 = TimeUnit.MICROSECONDS.toMillis(flud0.e);
                flfv0.u.b(conversationId0, contactId0, flud0.f);
                Map map0 = flfv0.r;
                if(!map0.containsKey(conversationId0)) {
                    map0.put(conversationId0, new HashMap());
                }
                ((Map)map0.get(conversationId0)).put(contactId0, Long.valueOf(v + v3));
                if(v3 > 0L) {
                    flfs flfs0 = new flfs(flfv0, conversationId0, contactId0);
                    flfv0.s.schedule(flfs0, v3);
                }
                fmai fmai0 = fmaj.a();
                fmai0.g(0x2F);
                fmai0.f(347);
                fmai0.n(flfv0.b.c().f());
                fmai0.o(flfv0.b.d().toStringUtf8());
                fmai0.p(flud0.a);
                fmai0.d(conversationId0);
                fmaj fmaj0 = fmai0.a();
                flfv0.h.b(fmaj0);
            }
            else if(v2 == 2) {
                flfv0.u.f(conversationId0, contactId0, flud0.f);
                flfv0.j(conversationId0, contactId0);
                fmai fmai1 = fmaj.a();
                fmai1.g(0x2F);
                fmai1.f(348);
                fmai1.n(flfv0.b.c().f());
                fmai1.o(flfv0.b.d().toStringUtf8());
                fmai1.p(flud0.a);
                fmai1.d(conversationId0);
                fmaj fmaj1 = fmai1.a();
                flfv0.h.b(fmaj1);
            }
            else {
                fmai fmai2 = fmaj.a();
                fmai2.g(0x2F);
                fmai2.f(341);
                fmai2.n(flfv0.b.c().f());
                fmai2.o(flfv0.b.d().toStringUtf8());
                fmai2.p(flud0.a);
                fmai2.d(conversationId0);
                fmaj fmaj2 = fmai2.a();
                flfv0.h.b(fmaj2);
            }
            flfe flfe0 = new flfe(flfv0);
            flfv0.p.post(flfe0);
        }
    }
}

