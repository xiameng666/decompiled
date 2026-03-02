import android.content.Context;
import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.UUID;

public final class flzh implements flzo {
    public final String a;
    private final Context b;
    private final AccountContext c;
    private final ConversationId d;
    private final ByteString e;
    private final hnry f;
    private final gfsx g;
    private final String h;

    public flzh(Context context0, AccountContext accountContext0, ConversationId conversationId0, ByteString hfsf0, hnry hnry0, gfsx gfsx0, gfsx gfsx1, String s) {
        this.b = context0;
        this.c = accountContext0;
        String s1 = UUID.randomUUID().toString();
        gfsx1.f(s1);
        this.a = s1;
        this.d = conversationId0;
        this.e = hfsf0;
        this.f = hnry0;
        this.g = gfsx0;
        this.h = s;
    }

    @Override  // flzo
    public final gmcd a(hnxl hnxl0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hgjg.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        this.f.getClass();
        ((hgjg)hftv0).d = this.f;
        ((hgjg)hftv0).b |= 2;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        hgjg hgjg0 = (hgjg)hftp0.b_message;
        hnxl0.getClass();
        hgjg0.c = hnxl0;
        hgjg0.b |= 1;
        String s = this.a;
        ConversationId conversationId0 = this.d;
        ByteString hfsf0 = this.e;
        gfsx gfsx0 = this.g;
        String s1 = this.h;
        hnry hnry0 = flxa.b(conversationId0.a());
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hnub.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((hnub)hftv1).i = s;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        hnub hnub0 = (hnub)hftp1.b_message;
        hnry0.getClass();
        hnub0.k = hnry0;
        hnub0.b |= 1;
        hnrr hnrr0 = flwy.b(conversationId0);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp1.b_message;
        hnrr0.getClass();
        ((hnub)hftv2).l = hnrr0;
        ((hnub)hftv2).b |= 2;
        if(!hftv2.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp1.b_message;
        hfsf0.getClass();
        ((hnub)hftv3).v = hfsf0;
        if(!hftv3.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv4 = hftp1.b_message;
        hnry0.getClass();
        ((hnub)hftv4).d = hnry0;
        ((hnub)hftv4).c = 5;
        hnsv hnsv0 = hnsv.g;
        if(!hftv4.isImmutable()) {
            hftp1.ensureMutable();
        }
        hnub hnub1 = (hnub)hftp1.b_message;
        hnub1.n = hnsv0.a();
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hntz.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((hntz)hftp2.b_message).c = 6;
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)hfrn.a).v_newBuilder();
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        ((hfrn)hftp3.b_message).b = "type.googleapis.com/google.internal.communications.instantmessaging.v1.ActionEvent";
        ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)hntt.a).v_newBuilder();
        String s2 = (String)gfsx0.f("");
        if(!hftp4.b_message.isImmutable()) {
            hftp4.ensureMutable();
        }
        ProtoLiteMessage hftv5 = hftp4.b_message;
        ((hntt)hftv5).b = s2;
        if(!hftv5.isImmutable()) {
            hftp4.ensureMutable();
        }
        hntt hntt0 = (hntt)hftp4.b_message;
        s1.getClass();
        hntt0.c = s1;
        ByteString hfsf1 = ((hntt)hftp4.N_build()).getDefaultInstanceForType();
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        ((hfrn)hftp3.b_message).c = hfsf1;
        hfrn hfrn0 = (hfrn)hftp3.N_build();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        hntz hntz0 = (hntz)hftp2.b_message;
        hfrn0.getClass();
        hntz0.d = hfrn0;
        hntz0.b |= 1;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        hnub hnub2 = (hnub)hftp1.b_message;
        hntz hntz1 = (hntz)hftp2.N_build();
        hntz1.getClass();
        hnub2.f = hntz1;
        hnub2.e = 105;
        hnub hnub3 = (hnub)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hgjg hgjg1 = (hgjg)hftp0.b_message;
        hnub3.getClass();
        hgjg1.e = hnub3;
        hgjg1.b |= 4;
        ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)hnsn.a).v_newBuilder();
        String s3 = flbi.a(this.b);
        if(!hftp5.b_message.isImmutable()) {
            hftp5.ensureMutable();
        }
        hnsn hnsn0 = (hnsn)hftp5.b_message;
        s3.getClass();
        hnsn0.b = s3;
        hnsn hnsn1 = (hnsn)hftp5.N_build();
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
        return glzd.g(gmcd0, new flzg(((hgjg)object0)), gmap.a);
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
        fmai0.j(19);
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
        fmai0.j(19);
        fmai0.f(1);
        fmai0.e(v);
        flsl0.b(fmai0.a());
    }
}

