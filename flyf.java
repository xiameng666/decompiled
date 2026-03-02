import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.UUID;

public final class flyf implements flzo {
    private final gged_interceptors a;
    private final AccountContext b;
    private final long c;

    public flyf(gged_interceptors gged0, long v, AccountContext accountContext0) {
        this.a = gged0;
        this.b = accountContext0;
        this.c = v;
    }

    @Override  // flzo
    public final gmcd a(hnxl hnxl0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hnrb.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hnrb hnrb0 = (hnrb)hftp0.b_message;
        hnxl0.getClass();
        hnrb0.c = hnxl0;
        hnrb0.b |= 1;
        flyd flyd0 = new flyd();
        gged_interceptors gged0 = flbp.c(this.a, flyd0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hnrb hnrb1 = (hnrb)hftp0.b_message;
        hfuo hfuo0 = hnrb1.d;
        if(!hfuo0.c()) {
            hnrb1.d = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(gged0, hnrb1.d);
        long v = this.c;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hnrb)hftp0.b_message).e = v;
        return gmbu.i(((hnrb)hftp0.N_build()));
    }

    @Override  // flzo
    public final gmcd b(gmcd gmcd0, Object object0) {
        return glzd.g(gmcd0, new flye(((hnrb)object0)), gmap.a);
    }

    @Override  // flzo
    public final Object c(Object object0) {
        return new flki(((hnrc)object0).b);
    }

    @Override  // flzo
    public final void d(UUID uUID0, int v, iapk iapk0, flsl flsl0, long v1) {
        for(int v2 = 0; true; ++v2) {
            gged_interceptors gged0 = this.a;
            if(v2 >= ((ggna)gged0).c) {
                break;
            }
            ConversationId conversationId0 = (ConversationId)gged0.get(v2);
            fmai fmai0 = fmaj.a();
            fmai0.g(10003);
            fmai0.n(this.b.c().f());
            fmai0.o(this.b.d().toStringUtf8());
            fmai0.p(uUID0.toString());
            fmai0.d(conversationId0);
            fmai0.m(Integer.valueOf(iapk0.t.r));
            fmai0.j(22);
            fmai0.f(v);
            fmai0.e(v1);
            flsl0.b(fmai0.a());
        }
    }

    @Override  // flzo
    public final void e(UUID uUID0, Object object0, flsl flsl0, long v) {
        flki flki0 = (flki)object0;
        for(int v1 = 0; true; ++v1) {
            gged_interceptors gged0 = this.a;
            if(v1 >= ((ggna)gged0).c) {
                break;
            }
            ConversationId conversationId0 = (ConversationId)gged0.get(v1);
            fmai fmai0 = fmaj.a();
            fmai0.g(10003);
            fmai0.n(this.b.c().f());
            fmai0.o(this.b.d().toStringUtf8());
            fmai0.p(uUID0.toString());
            fmai0.d(conversationId0);
            fmai0.j(22);
            fmai0.f(1);
            fmai0.e(v);
            flsl0.b(fmai0.a());
        }
    }
}

