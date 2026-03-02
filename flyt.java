import android.content.Context;
import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public final class flyt implements flzo {
    private final Context a;
    private final AccountContext b;
    private final ConversationId c;
    private final ByteString d;
    private final Map e;
    private final boolean f;
    private final hnry g;
    private final String h;
    private final Map i;
    private final flce j;
    private final int k;

    public flyt(Context context0, AccountContext accountContext0, ConversationId conversationId0, ByteString hfsf0, Map map0, boolean z, hnry hnry0, flce flce0, int v, String s, Map map1) {
        this.a = context0;
        this.b = accountContext0;
        this.c = conversationId0;
        this.d = hfsf0;
        this.e = map0;
        this.f = z;
        this.g = hnry0;
        this.h = s;
        this.j = flce0;
        this.k = v;
        this.i = map1;
    }

    @Override  // flzo
    public final gmcd a(hnxl hnxl0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hgje.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hgje hgje0 = (hgje)hftp0.b_message;
        hnxl0.getClass();
        hgje0.c = hnxl0;
        hgje0.b |= 1;
        hnrr hnrr0 = flwy.b(this.c);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        hnrr0.getClass();
        ((hgje)hftv0).d = hnrr0;
        ((hgje)hftv0).b |= 2;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((hgje)hftv1).g = false;
        ByteString hfsf0 = this.d;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        hfsf0.getClass();
        ((hgje)hftv2).h = hfsf0;
        Map map0 = this.e;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        hgje hgje1 = (hgje)hftp0.b_message;
        hfvh hfvh0 = hgje1.i;
        if(!hfvh0.b) {
            hgje1.i = hfvh0.a();
        }
        hgje1.i.putAll(map0);
        int v = this.k;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp0.b_message;
        if(v == 1) {
            throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
        }
        ((hgje)hftv3).m = v - 2;
        String s = this.h;
        if(!hftv3.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv4 = hftp0.b_message;
        s.getClass();
        ((hgje)hftv4).j = s;
        hnry hnry0 = this.g;
        if(!hftv4.isImmutable()) {
            hftp0.ensureMutable();
        }
        hgje hgje2 = (hgje)hftp0.b_message;
        hnry0.getClass();
        hgje2.e = hnry0;
        hgje2.b |= 4;
        hnry hnry1 = flxa.b(this.b.c().f());
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv5 = hftp0.b_message;
        hnry1.getClass();
        ((hgje)hftv5).f = hnry1;
        ((hgje)hftv5).b |= 8;
        boolean z = this.f;
        if(!hftv5.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hgje)hftp0.b_message).k = z;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hnsn.a).v_newBuilder();
        String s1 = flbi.a(this.a);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        hnsn hnsn0 = (hnsn)hftp1.b_message;
        s1.getClass();
        hnsn0.b = s1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hgje hgje3 = (hgje)hftp0.b_message;
        hnsn hnsn1 = (hnsn)hftp1.N_build();
        hnsn1.getClass();
        hgje3.l = hnsn1;
        hgje3.b |= 16;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hgje)hftp0.b_message).n = false;
        List list0 = this.j.a();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hgje hgje4 = (hgje)hftp0.b_message;
        hfuf hfuf0 = hgje4.o;
        if(!hfuf0.c()) {
            hgje4.o = ProtoLiteMessage.C(hfuf0);
        }
        ggqk ggqk0 = ((gged_interceptors)list0).E();
        while(ggqk0.hasNext()) {
            Object object0 = ggqk0.next();
            hgje4.o.i(((Integer)object0).intValue());
        }
        return gmbu.i(((hgje)hftp0.N_build()));
    }

    @Override  // flzo
    public final gmcd b(gmcd gmcd0, Object object0) {
        return glzd.g(gmcd0, new flys(((hgje)object0)), gmap.a);
    }

    @Override  // flzo
    public final Object c(Object object0) {
        hfuo hfuo0 = ((hgjf)object0).b;
        Context context0 = this.a;
        flsl flsl0 = flsl.a(context0);
        ArrayList arrayList0 = new ArrayList();
        for(Object object1: hfuo0) {
            gfsx gfsx0 = flxc.c(gfsx.m(((hnub)object1)), this.b, context0, this.i, flsl0);
            if(gfsx0.i()) {
                arrayList0.add(gfsx0.d());
            }
            else {
                flbj.a("MsgProtoConverter", "TachyonMessage does not exist in its optional.");
            }
        }
        gged_interceptors gged0 = gged_interceptors.i(arrayList0);
        if(gged0 != null) {
            return new flkn(gged0);
        }
        throw new NullPointerException("Null tachyonMessages");
    }

    @Override  // flzo
    public final void d(UUID uUID0, int v, iapk iapk0, flsl flsl0, long v1) {
        fmai fmai0 = fmaj.a();
        fmai0.g(10003);
        fmai0.n(this.b.c().f());
        fmai0.o(this.b.d().toStringUtf8());
        fmai0.p(uUID0.toString());
        fmai0.d(this.c);
        fmai0.m(Integer.valueOf(iapk0.t.r));
        fmai0.f(v);
        fmai0.j(90);
        fmai0.e(v1);
        flsl0.b(fmai0.a());
    }

    @Override  // flzo
    public final void e(UUID uUID0, Object object0, flsl flsl0, long v) {
        flkn flkn0 = (flkn)object0;
        fmai fmai0 = fmaj.a();
        fmai0.g(10003);
        fmai0.n(this.b.c().f());
        fmai0.o(this.b.d().toStringUtf8());
        fmai0.p(uUID0.toString());
        fmai0.j(90);
        fmai0.f(1);
        fmai0.e(v);
        flsl0.b(fmai0.a());
    }
}

