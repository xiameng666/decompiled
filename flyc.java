import android.content.Context;
import android.util.Base64;
import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.List;
import java.util.UUID;

public final class flyc implements flzo {
    public final String a;
    private final Context b;
    private final AccountContext c;
    private final ConversationId d;
    private final ByteString e;
    private final boolean f;
    private final boolean g;
    private final hnry h;
    private final List i;
    private final String j;

    public flyc(Context context0, AccountContext accountContext0, ConversationId conversationId0, ByteString hfsf0, String s, boolean z, boolean z1, hnry hnry0, List list0) {
        this.b = context0;
        this.a = UUID.randomUUID().toString();
        this.c = accountContext0;
        this.d = conversationId0;
        this.e = hfsf0;
        this.j = s;
        this.f = z;
        this.g = z1;
        this.h = hnry0;
        this.i = list0;
    }

    @Override  // flzo
    public final gmcd a(hnxl hnxl0) {
        byte[] arr_b = Base64.decode(this.j, 8);
        boolean z = this.f;
        flbj.a("MsgProtoConverter", "isEmptyDeviceConversation: " + z);
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
        hnry0.getClass();
        ((hnub)hftv2).d = hnry0;
        ((hnub)hftv2).c = 5;
        hnsv hnsv0 = hnsv.g;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        hnub hnub1 = (hnub)hftp0.b_message;
        hnub1.n = hnsv0.a();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hntz.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((hntz)hftp1.b_message).c = 5;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hfrn.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((hfrn)hftp2.b_message).b = "type.googleapis.com/google.internal.communications.instantmessaging.v1.ConversationIntentOpenedEvent";
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)hntx.a).v_newBuilder();
        ByteString hfsf0 = ByteString.copyFrom(arr_b);
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp3.b_message;
        ((hntx)hftv3).b = hfsf0;
        if(!hftv3.isImmutable()) {
            hftp3.ensureMutable();
        }
        ProtoLiteMessage hftv4 = hftp3.b_message;
        ((hntx)hftv4).c = z;
        if(!hftv4.isImmutable()) {
            hftp3.ensureMutable();
        }
        ((hntx)hftp3.b_message).d = this.g;
        List list0 = flce.c().a();
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        hntx hntx0 = (hntx)hftp3.b_message;
        hfuf hfuf0 = hntx0.e;
        if(!hfuf0.c()) {
            hntx0.e = ProtoLiteMessage.C(hfuf0);
        }
        ggqk ggqk0 = ((gged_interceptors)list0).E();
        while(ggqk0.hasNext()) {
            Object object0 = ggqk0.next();
            hntx0.e.i(((Integer)object0).intValue());
        }
        ByteString hfsf1 = ((hntx)hftp3.N_build()).getDefaultInstanceForType();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((hfrn)hftp2.b_message).c = hfsf1;
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
        ProtoLiteBuilder hftp4 = (ProtoLiteBuilder)((ProtoLiteMessage)hnub3).jf(5, null);
        hftp4.X(((ProtoLiteMessage)hnub3));
        ByteString hfsf2 = this.e;
        if(!hftp4.b_message.isImmutable()) {
            hftp4.ensureMutable();
        }
        hnub hnub4 = (hnub)hftp4.b_message;
        hfsf2.getClass();
        hnub4.v = hfsf2;
        hnub hnub5 = (hnub)hftp4.N_build();
        ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)hgjg.a).v_newBuilder();
        hnry hnry1 = this.h;
        if(!hftp5.b_message.isImmutable()) {
            hftp5.ensureMutable();
        }
        ProtoLiteMessage hftv5 = hftp5.b_message;
        hnry1.getClass();
        ((hgjg)hftv5).d = hnry1;
        ((hgjg)hftv5).b |= 2;
        if(!hftv5.isImmutable()) {
            hftp5.ensureMutable();
        }
        ProtoLiteMessage hftv6 = hftp5.b_message;
        hnxl0.getClass();
        ((hgjg)hftv6).c = hnxl0;
        ((hgjg)hftv6).b |= 1;
        if(!hftv6.isImmutable()) {
            hftp5.ensureMutable();
        }
        hgjg hgjg0 = (hgjg)hftp5.b_message;
        hnub5.getClass();
        hgjg0.e = hnub5;
        hgjg0.b |= 4;
        ProtoLiteBuilder hftp6 = ((ProtoLiteMessage)hnsn.a).v_newBuilder();
        String s = flbi.a(this.b);
        if(!hftp6.b_message.isImmutable()) {
            hftp6.ensureMutable();
        }
        hnsn hnsn0 = (hnsn)hftp6.b_message;
        s.getClass();
        hnsn0.b = s;
        hnsn hnsn1 = (hnsn)hftp6.N_build();
        if(!hftp5.b_message.isImmutable()) {
            hftp5.ensureMutable();
        }
        hgjg hgjg1 = (hgjg)hftp5.b_message;
        hnsn1.getClass();
        hgjg1.f = hnsn1;
        hgjg1.b |= 8;
        return gmbu.i(((hgjg)hftp5.N_build()));
    }

    @Override  // flzo
    public final gmcd b(gmcd gmcd0, Object object0) {
        return glzd.g(gmcd0, new flyb(((hgjg)object0)), gmap.a);
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
        fmai0.j(16);
        fmai0.m(Integer.valueOf(iapk0.t.r));
        fmai0.f(v);
        fmai0.h(gged_interceptors.i(this.i));
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
        fmai0.j(16);
        fmai0.f(1);
        fmai0.h(gged_interceptors.i(this.i));
        fmai0.e(v);
        flsl0.b(fmai0.a());
    }
}

