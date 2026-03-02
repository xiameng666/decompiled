import android.content.Context;
import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId.IdType;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.UUID;

public final class flyk implements flzo {
    private final Context a;
    private final AccountContext b;
    private final hnry c;
    private final gfsx d;
    private final gfsx e;
    private final ByteString f;

    public flyk(Context context0, AccountContext accountContext0, ContactId contactId0) {
        this.a = context0;
        this.b = accountContext0;
        this.c = flxa.b(contactId0);
        this.d = gfsx.m(contactId0);
        this.e = gfqx.a;
        this.f = ByteString.b;
    }

    public flyk(Context context0, AccountContext accountContext0, ConversationId conversationId0, ByteString hfsf0) {
        hnry hnry0;
        this.a = context0;
        this.b = accountContext0;
        if(conversationId0.e() == ConversationId.IdType.b) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hnry.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((hnry)hftp0.b_message).b = 4;
            String s = conversationId0.d().a();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((hnry)hftp0.b_message).e = s;
            String s1 = conversationId0.d().b();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((hnry)hftp0.b_message).c = s1;
            hnry0 = (hnry)hftp0.N_build();
        }
        else {
            hnry0 = flxa.b(conversationId0.c());
        }
        this.c = hnry0;
        this.e = gfsx.m(conversationId0);
        this.d = gfqx.a;
        this.f = hfsf0;
    }

    @Override  // flzo
    public final gmcd a(hnxl hnxl0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hgjb.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        hnxl0.getClass();
        ((hgjb)hftv0).c = hnxl0;
        ((hgjb)hftv0).b |= 1;
        hnry hnry0 = this.c;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        hgjb hgjb0 = (hgjb)hftp0.b_message;
        hnry0.getClass();
        hgjb0.d = hnry0;
        hgjb0.b |= 2;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hnsn.a).v_newBuilder();
        String s = flbi.a(this.a);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        hnsn hnsn0 = (hnsn)hftp1.b_message;
        s.getClass();
        hnsn0.b = s;
        hnsn hnsn1 = (hnsn)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        hnsn1.getClass();
        ((hgjb)hftv1).e = hnsn1;
        ((hgjb)hftv1).b |= 4;
        ByteString hfsf0 = this.f;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        hgjb hgjb1 = (hgjb)hftp0.b_message;
        hfsf0.getClass();
        hgjb1.f = hfsf0;
        return gmbu.i(((hgjb)hftp0.N_build()));
    }

    @Override  // flzo
    public final gmcd b(gmcd gmcd0, Object object0) {
        return glzd.g(gmcd0, new flyj(((hgjb)object0)), gmap.a);
    }

    @Override  // flzo
    public final Object c(Object object0) {
        hnsd hnsd0 = ((hgjc)object0).c;
        if(hnsd0 == null) {
            hnsd0 = hnsd.a;
        }
        Context context0 = this.a;
        flsl flsl0 = flsl.a(context0);
        hnxm hnxm0 = ((hgjc)object0).b;
        if(hnxm0 == null) {
            hnxm0 = hnxm.a;
        }
        return new flkj(2, gfsx.m(flxd.a(this.b, context0, hnsd0, flsl0, hnxm0.b)));
    }

    @Override  // flzo
    public final void d(UUID uUID0, int v, iapk iapk0, flsl flsl0, long v1) {
        gfsx gfsx0 = this.d;
        if(gfsx0.i()) {
            fmai fmai0 = fmaj.a();
            fmai0.g(10003);
            fmai0.n(this.b.c().f());
            fmai0.o(this.b.d().toStringUtf8());
            fmai0.p(uUID0.toString());
            fmai0.c(((ContactId)gfsx0.d()));
            fmai0.j(9);
            fmai0.m(Integer.valueOf(iapk0.t.r));
            fmai0.f(v);
            fmai0.e(v1);
            flsl0.b(fmai0.a());
            return;
        }
        fmai fmai1 = fmaj.a();
        fmai1.g(10003);
        fmai1.n(this.b.c().f());
        fmai1.o(this.b.d().toStringUtf8());
        fmai1.p(uUID0.toString());
        fmai1.d(((ConversationId)this.e.d()));
        fmai1.m(Integer.valueOf(iapk0.t.r));
        fmai1.j(9);
        fmai1.f(v);
        fmai1.e(v1);
        flsl0.b(fmai1.a());
    }

    @Override  // flzo
    public final void e(UUID uUID0, Object object0, flsl flsl0, long v) {
        flkj flkj0 = (flkj)object0;
        if(this.d.i()) {
            fmai fmai0 = fmaj.a();
            fmai0.g(10003);
            fmai0.n(this.b.c().f());
            fmai0.o(this.b.d().toStringUtf8());
            fmai0.p(uUID0.toString());
            fmai0.j(9);
            fmai0.f(1);
            fmai0.e(v);
            flsl0.b(fmai0.a());
            return;
        }
        fmai fmai1 = fmaj.a();
        fmai1.g(10003);
        fmai1.n(this.b.c().f());
        fmai1.o(this.b.d().toStringUtf8());
        fmai1.p(uUID0.toString());
        fmai1.d(((ConversationId)this.e.d()));
        fmai1.j(9);
        fmai1.f(1);
        fmai1.e(v);
        flsl0.b(fmai1.a());
    }
}

