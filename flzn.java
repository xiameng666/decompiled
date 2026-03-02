import android.content.Context;
import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.UUID;

public final class flzn implements flzo {
    public final String a;
    private final Context b;
    private final AccountContext c;
    private final ConversationId d;
    private final ByteString e;
    private final boolean f;
    private final long g;
    private final hnry h;

    public flzn(Context context0, AccountContext accountContext0, ConversationId conversationId0, ByteString hfsf0, boolean z, long v, hnry hnry0) {
        this.b = context0;
        this.c = accountContext0;
        this.d = conversationId0;
        this.e = hfsf0;
        this.f = z;
        this.g = v;
        this.h = hnry0;
        this.a = UUID.randomUUID().toString();
    }

    @Override  // flzo
    public final gmcd a(hnxl hnxl0) {
        int v;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hgjg.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        this.h.getClass();
        ((hgjg)hftv0).d = this.h;
        ((hgjg)hftv0).b |= 2;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        hgjg hgjg0 = (hgjg)hftp0.b_message;
        hnxl0.getClass();
        hgjg0.c = hnxl0;
        hgjg0.b |= 1;
        fluc fluc0 = new fluc();
        fluc0.b(this.d);
        fluc0.e(this.a);
        fluc0.a = this.c.c().f();
        fluc0.f((this.f ? 1 : 2));
        fluc0.c(this.g);
        fluc0.d(0L);
        flud flud0 = fluc0.a();
        hnry hnry0 = flxa.b(this.c.c().f());
        switch(flud0.d) {
            case 1: {
                v = 3;
                break;
            }
            case 2: {
                v = 4;
                break;
            }
            default: {
                v = 2;
            }
        }
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hfrn.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((hfrn)hftp1.b_message).b = "type.googleapis.com/google.internal.communications.instantmessaging.v1.TypingIndicatorEvent";
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hnui.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp2.b_message;
        ((hnui)hftv1).b = v - 2;
        long v1 = flud0.e;
        if(!hftv1.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((hnui)hftp2.b_message).c = v1;
        ByteString hfsf0 = ((hnui)hftp2.N_build()).getDefaultInstanceForType();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((hfrn)hftp1.b_message).c = hfsf0;
        hfrn hfrn0 = (hfrn)hftp1.N_build();
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)hnub.a).v_newBuilder();
        String s = flud0.a;
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp3.b_message;
        s.getClass();
        ((hnub)hftv2).i = s;
        if(!hftv2.isImmutable()) {
            hftp3.ensureMutable();
        }
        hnub hnub0 = (hnub)hftp3.b_message;
        hnry0.getClass();
        hnub0.k = hnry0;
        hnub0.b |= 1;
        hnrr hnrr0 = flwy.b(flud0.b);
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp3.b_message;
        hnrr0.getClass();
        ((hnub)hftv3).l = hnrr0;
        ((hnub)hftv3).b |= 2;
        hnsv hnsv0 = hnsv.g;
        if(!hftv3.isImmutable()) {
            hftp3.ensureMutable();
        }
        hnub hnub1 = (hnub)hftp3.b_message;
        hnub1.n = hnsv0.a();
        ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)hntz.a).v_newBuilder();
        if(!hftp4.b_message.isImmutable()) {
            hftp4.ensureMutable();
        }
        ProtoLiteMessage hftv4 = hftp4.b_message;
        ((hntz)hftv4).c = 2;
        if(!hftv4.isImmutable()) {
            hftp4.ensureMutable();
        }
        hntz hntz0 = (hntz)hftp4.b_message;
        hfrn0.getClass();
        hntz0.d = hfrn0;
        hntz0.b |= 1;
        hntz hntz1 = (hntz)hftp4.N_build();
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        hnub hnub2 = (hnub)hftp3.b_message;
        hntz1.getClass();
        hnub2.f = hntz1;
        hnub2.e = 105;
        hnub hnub3 = (hnub)hftp3.N_build();
        ProtoLiteBuilder hftp5 = (ProtoLiteBuilder)((ProtoLiteMessage)hnub3).jf(5, null);
        hftp5.X(((ProtoLiteMessage)hnub3));
        ByteString hfsf1 = this.e;
        if(!hftp5.b_message.isImmutable()) {
            hftp5.ensureMutable();
        }
        hnub hnub4 = (hnub)hftp5.b_message;
        hfsf1.getClass();
        hnub4.v = hfsf1;
        hnub hnub5 = (hnub)hftp5.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hgjg hgjg1 = (hgjg)hftp0.b_message;
        hnub5.getClass();
        hgjg1.e = hnub5;
        hgjg1.b |= 4;
        ProtoLiteBuilder hftp6 = ((ProtoLiteMessage)hnsn.a).v_newBuilder();
        String s1 = flbi.a(this.b);
        if(!hftp6.b_message.isImmutable()) {
            hftp6.ensureMutable();
        }
        hnsn hnsn0 = (hnsn)hftp6.b_message;
        s1.getClass();
        hnsn0.b = s1;
        hnsn hnsn1 = (hnsn)hftp6.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hgjg hgjg2 = (hgjg)hftp0.b_message;
        hnsn1.getClass();
        hgjg2.f = hnsn1;
        hgjg2.b |= 8;
        return gmbu.i(((hgjg)hftp0.N_build()));
    }

    @Override  // flzo
    public final gmcd b(gmcd gmcd0, Object object0) {
        return glzd.g(gmcd0, new flzm(((hgjg)object0)), gmap.a);
    }

    @Override  // flzo
    public final Object c(Object object0) {
        hgjh hgjh0 = (hgjh)object0;
        return null;
    }

    @Override  // flzo
    public final void d(UUID uUID0, int v, iapk iapk0, flsl flsl0, long v1) {
        fmai fmai0 = fmaj.a();
        fmai0.g(10003);
        fmai0.n(this.c.c().f());
        fmai0.o(this.c.d().toStringUtf8());
        fmai0.p(this.a);
        fmai0.d(this.d);
        fmai0.j(23);
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
        fmai0.n(this.c.c().f());
        fmai0.o(this.c.d().toStringUtf8());
        fmai0.p(this.a);
        fmai0.d(this.d);
        fmai0.j(23);
        fmai0.f(1);
        fmai0.e(v);
        flsl0.b(fmai0.a());
    }
}

