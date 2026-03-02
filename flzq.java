import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.UUID;

public final class flzq implements flzo {
    private final AccountContext a;
    private final ConversationId b;

    public flzq(AccountContext accountContext0, ConversationId conversationId0) {
        this.a = accountContext0;
        this.b = conversationId0;
    }

    @Override  // flzo
    public final gmcd a(hnxl hnxl0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hnqe.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hnqe hnqe0 = (hnqe)hftp0.b_message;
        hnxl0.getClass();
        hnqe0.c = hnxl0;
        hnqe0.b |= 1;
        hnrr hnrr0 = flwy.b(this.b);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hnqe hnqe1 = (hnqe)hftp0.b_message;
        hnrr0.getClass();
        hnqe1.d = hnrr0;
        hnqe1.b |= 2;
        return gmbu.i(((hnqe)hftp0.N_build()));
    }

    @Override  // flzo
    public final gmcd b(gmcd gmcd0, Object object0) {
        return glzd.g(gmcd0, new flzp(((hnqe)object0)), gmap.a);
    }

    @Override  // flzo
    public final Object c(Object object0) {
        hnqf hnqf0 = (hnqf)object0;
        return null;
    }

    @Override  // flzo
    public final void d(UUID uUID0, int v, iapk iapk0, flsl flsl0, long v1) {
        fmai fmai0 = fmaj.a();
        fmai0.g(10003);
        fmai0.n(this.a.c().f());
        fmai0.o(this.a.d().toStringUtf8());
        fmai0.p(uUID0.toString());
        fmai0.d(this.b);
        fmai0.j(7);
        fmai0.m(Integer.valueOf(iapk0.t.r));
        fmai0.f(v);
        fmai0.e(v1);
        flsl0.b(fmai0.a());
    }

    @Override  // flzo
    public final void e(UUID uUID0, Object object0, flsl flsl0, long v) {
        Void void0 = (Void)object0;
        fmai fmai0 = fmaj.a();
        fmai0.g(10003);
        fmai0.n(this.a.c().f());
        fmai0.o(this.a.d().toStringUtf8());
        fmai0.p(uUID0.toString());
        fmai0.d(this.b);
        fmai0.j(7);
        fmai0.f(1);
        fmai0.e(v);
        flsl0.b(fmai0.a());
    }
}

