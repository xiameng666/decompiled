import android.content.Context;
import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.Map;
import java.util.UUID;

public final class flya implements flzo {
    public final String a;
    private final Context b;
    private final AccountContext c;
    private final ConversationId d;
    private final ByteString e;
    private final Map f;
    private final hnry g;
    private final String h;

    public flya(Context context0, AccountContext accountContext0, ConversationId conversationId0, ByteString hfsf0, Map map0, hnry hnry0, String s) {
        this.b = context0;
        this.c = accountContext0;
        this.d = conversationId0;
        this.e = hfsf0;
        this.f = map0;
        this.a = UUID.randomUUID().toString();
        this.g = hnry0;
        this.h = s;
    }

    @Override  // flzo
    public final gmcd a(hnxl hnxl0) {
        ConversationId conversationId0 = this.d;
        hnry hnry0 = flxa.b(conversationId0.a());
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hnub.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        this.a.getClass();
        ((hnub)hftv0).i = this.a;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        hnub hnub0 = (hnub)hftp0.b_message;
        hnry0.getClass();
        hnub0.k = hnry0;
        hnub0.b |= 1;
        hnrr hnrr0 = flwy.b(conversationId0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        hnrr0.getClass();
        ((hnub)hftv1).l = hnrr0;
        ((hnub)hftv1).b |= 2;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        this.e.getClass();
        ((hnub)hftv2).v = this.e;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp0.b_message;
        hnry0.getClass();
        ((hnub)hftv3).d = hnry0;
        ((hnub)hftv3).c = 5;
        hnsv hnsv0 = hnsv.g;
        if(!hftv3.isImmutable()) {
            hftp0.ensureMutable();
        }
        hnub hnub1 = (hnub)hftp0.b_message;
        hnub1.n = hnsv0.a();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hntz.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((hntz)hftp1.b_message).c = 12;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hfrn.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((hfrn)hftp2.b_message).b = "type.googleapis.com/google.internal.communications.instantmessaging.v1.ConversationCallbackIntent";
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)hntw.a).v_newBuilder();
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        hntw hntw0 = (hntw)hftp3.b_message;
        hfvh hfvh0 = hntw0.b;
        if(!hfvh0.b) {
            hntw0.b = hfvh0.a();
        }
        hntw0.b.putAll(this.f);
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        ProtoLiteMessage hftv4 = hftp3.b_message;
        ((hntw)hftv4).c = 1;
        if(!hftv4.isImmutable()) {
            hftp3.ensureMutable();
        }
        hntw hntw1 = (hntw)hftp3.b_message;
        this.h.getClass();
        hntw1.d = this.h;
        ByteString hfsf0 = ((hntw)hftp3.N_build()).getDefaultInstanceForType();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((hfrn)hftp2.b_message).c = hfsf0;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        hntz hntz0 = (hntz)hftp1.b_message;
        hfrn hfrn0 = (hfrn)hftp2.N_build();
        hfrn0.getClass();
        hntz0.d = hfrn0;
        hntz0.b |= 1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hnub hnub2 = (hnub)hftp0.b_message;
        hntz hntz1 = (hntz)hftp1.N_build();
        hntz1.getClass();
        hnub2.f = hntz1;
        hnub2.e = 105;
        hnub hnub3 = (hnub)hftp0.N_build();
        ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)hgjg.a).v_newBuilder();
        hnry hnry1 = this.g;
        if(!hftp4.b_message.isImmutable()) {
            hftp4.ensureMutable();
        }
        ProtoLiteMessage hftv5 = hftp4.b_message;
        hnry1.getClass();
        ((hgjg)hftv5).d = hnry1;
        ((hgjg)hftv5).b |= 2;
        if(!hftv5.isImmutable()) {
            hftp4.ensureMutable();
        }
        ProtoLiteMessage hftv6 = hftp4.b_message;
        hnxl0.getClass();
        ((hgjg)hftv6).c = hnxl0;
        ((hgjg)hftv6).b |= 1;
        if(!hftv6.isImmutable()) {
            hftp4.ensureMutable();
        }
        hgjg hgjg0 = (hgjg)hftp4.b_message;
        hnub3.getClass();
        hgjg0.e = hnub3;
        hgjg0.b |= 4;
        ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)hnsn.a).v_newBuilder();
        String s = flbi.a(this.b);
        if(!hftp5.b_message.isImmutable()) {
            hftp5.ensureMutable();
        }
        hnsn hnsn0 = (hnsn)hftp5.b_message;
        s.getClass();
        hnsn0.b = s;
        hnsn hnsn1 = (hnsn)hftp5.N_build();
        if(!hftp4.b_message.isImmutable()) {
            hftp4.ensureMutable();
        }
        hgjg hgjg1 = (hgjg)hftp4.b_message;
        hnsn1.getClass();
        hgjg1.f = hnsn1;
        hgjg1.b |= 8;
        return gmbu.i(((hgjg)hftp4.N_build()));
    }

    @Override  // flzo
    public final gmcd b(gmcd gmcd0, Object object0) {
        return glzd.g(gmcd0, new flxz(((hgjg)object0)), gmap.a);
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
        fmai0.j(87);
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
        fmai0.j(87);
        fmai0.f(1);
        fmai0.e(v);
        flsl0.b(fmai0.a());
    }
}

