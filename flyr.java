import android.content.Context;
import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public final class flyr implements flzo {
    public final String a;
    private final Context b;
    private final AccountContext c;
    private final ConversationId d;
    private final ByteString e;
    private final List f;
    private final boolean g;
    private final hnry h;

    public flyr(Context context0, AccountContext accountContext0, ConversationId conversationId0, ByteString hfsf0, List list0, hnry hnry0, boolean z) {
        this.b = context0;
        this.c = accountContext0;
        this.d = conversationId0;
        this.e = hfsf0;
        this.f = list0;
        this.h = hnry0;
        this.g = z;
        this.a = UUID.randomUUID().toString();
    }

    @Override  // flzo
    public final gmcd a(hnxl hnxl0) {
        int v;
        fltv fltv0 = new fltv();
        fltv0.c(this.f);
        fltv0.b(this.d);
        fltv0.d(this.a);
        fltv0.e(((int)this.g));
        fltv0.a = this.c.c().f();
        fltw fltw0 = fltv0.a();
        hnry hnry0 = flxa.b(this.c.c().f());
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: fltw0.c) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hnuf.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hnuf hnuf0 = (hnuf)hftp0.b_message;
            ((String)object0).getClass();
            hnuf0.b = (String)object0;
            arrayList0.add(((hnuf)hftp0.N_build()));
        }
        switch(fltw0.a) {
            case 0: {
                v = 3;
                break;
            }
            case 1: {
                v = 5;
                break;
            }
            default: {
                v = 4;
            }
        }
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hfrn.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((hfrn)hftp1.b_message).b = "type.googleapis.com/google.internal.communications.instantmessaging.v1.ReceiptEvent";
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hnug.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        hnug hnug0 = (hnug)hftp2.b_message;
        hfuo hfuo0 = hnug0.b;
        if(!hfuo0.c()) {
            hnug0.b = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(arrayList0, hnug0.b);
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((hnug)hftp2.b_message).c = v - 2;
        ByteString hfsf0 = ((hnug)hftp2.N_build()).getDefaultInstanceForType();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((hfrn)hftp1.b_message).c = hfsf0;
        hfrn hfrn0 = (hfrn)hftp1.N_build();
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)hnub.a).v_newBuilder();
        String s = fltw0.b;
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp3.b_message;
        s.getClass();
        ((hnub)hftv0).i = s;
        if(!hftv0.isImmutable()) {
            hftp3.ensureMutable();
        }
        hnub hnub0 = (hnub)hftp3.b_message;
        hnry0.getClass();
        hnub0.k = hnry0;
        hnub0.b |= 1;
        hnrr hnrr0 = flwy.b(fltw0.e);
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp3.b_message;
        hnrr0.getClass();
        ((hnub)hftv1).l = hnrr0;
        ((hnub)hftv1).b |= 2;
        hnsv hnsv0 = hnsv.g;
        if(!hftv1.isImmutable()) {
            hftp3.ensureMutable();
        }
        hnub hnub1 = (hnub)hftp3.b_message;
        hnub1.n = hnsv0.a();
        ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)hntz.a).v_newBuilder();
        if(!hftp4.b_message.isImmutable()) {
            hftp4.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp4.b_message;
        ((hntz)hftv2).c = 4;
        if(!hftv2.isImmutable()) {
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
        ProtoLiteBuilder hftp6 = ((ProtoLiteMessage)hgjg.a).v_newBuilder();
        hnry hnry1 = this.h;
        if(!hftp6.b_message.isImmutable()) {
            hftp6.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp6.b_message;
        hnry1.getClass();
        ((hgjg)hftv3).d = hnry1;
        ((hgjg)hftv3).b |= 2;
        if(!hftv3.isImmutable()) {
            hftp6.ensureMutable();
        }
        ProtoLiteMessage hftv4 = hftp6.b_message;
        hnxl0.getClass();
        ((hgjg)hftv4).c = hnxl0;
        ((hgjg)hftv4).b |= 1;
        if(!hftv4.isImmutable()) {
            hftp6.ensureMutable();
        }
        hgjg hgjg0 = (hgjg)hftp6.b_message;
        hnub5.getClass();
        hgjg0.e = hnub5;
        hgjg0.b |= 4;
        ProtoLiteBuilder hftp7 = ((ProtoLiteMessage)hnsn.a).v_newBuilder();
        String s1 = flbi.a(this.b);
        if(!hftp7.b_message.isImmutable()) {
            hftp7.ensureMutable();
        }
        hnsn hnsn0 = (hnsn)hftp7.b_message;
        s1.getClass();
        hnsn0.b = s1;
        hnsn hnsn1 = (hnsn)hftp7.N_build();
        if(!hftp6.b_message.isImmutable()) {
            hftp6.ensureMutable();
        }
        hgjg hgjg1 = (hgjg)hftp6.b_message;
        hnsn1.getClass();
        hgjg1.f = hnsn1;
        hgjg1.b |= 8;
        return gmbu.i(((hgjg)hftp6.N_build()));
    }

    @Override  // flzo
    public final gmcd b(gmcd gmcd0, Object object0) {
        return glzd.g(gmcd0, new flyq(((hgjg)object0)), gmap.a);
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
        fmai0.j(15);
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
        fmai0.j(15);
        fmai0.f(1);
        fmai0.e(v);
        flsl0.b(fmai0.a());
    }
}

