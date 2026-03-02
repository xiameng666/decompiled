import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ConversationId.IdType;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.UUID;

public final class fmjk implements flzo {
    public final byte[] a;
    private final gmcg b;
    private final ConversationId c;
    private final AccountContext d;

    public fmjk(AccountContext accountContext0, ConversationId conversationId0, byte[] arr_b) {
        this.b = flbs.b().a;
        this.a = arr_b;
        this.c = conversationId0;
        this.d = accountContext0;
    }

    @Override  // flzo
    public final gmcd a(hnxl hnxl0) {
        hnxb hnxb0;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hnxy.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        hnxl0.getClass();
        ((hnxy)hftv0).e = hnxl0;
        ((hnxy)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hnxy)hftp0.b_message).f = 10;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hnxc.a).v_newBuilder();
        ConversationId conversationId0 = this.c;
        if(conversationId0.e() == ConversationId.IdType.a) {
            hnxb0 = flwu.c(conversationId0.c());
        }
        else {
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hnxb.a).v_newBuilder();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ((hnxb)hftp2.b_message).c = 2;
            String s = conversationId0.d().b();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ((hnxb)hftp2.b_message).d = s;
            String s1 = conversationId0.d().a();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ((hnxb)hftp2.b_message).e = s1;
            hnxb0 = (hnxb)hftp2.N_build();
        }
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        hnxc hnxc0 = (hnxc)hftp1.b_message;
        hnxb0.getClass();
        hfuo hfuo0 = hnxc0.b;
        if(!hfuo0.c()) {
            hnxc0.b = ProtoLiteMessage.E(hfuo0);
        }
        hnxc0.b.add(hnxb0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hnxy hnxy0 = (hnxy)hftp0.b_message;
        hnxc hnxc1 = (hnxc)hftp1.N_build();
        hnxc1.getClass();
        hnxy0.d = hnxc1;
        hnxy0.c = 5;
        return gmbu.i(((hnxy)hftp0.N_build()));
    }

    @Override  // flzo
    public final gmcd b(gmcd gmcd0, Object object0) {
        return glzd.g(gmcd0, new fmjj(this, ((hnxy)object0)), this.b);
    }

    @Override  // flzo
    public final Object c(Object object0) {
        fmjl fmjl0 = new fmjl();
        hnxf hnxf0 = ((hnxz)object0).c;
        if(hnxf0 == null) {
            hnxf0 = hnxf.a;
        }
        fmjl0.b(hnxf0.c);
        hnxf hnxf1 = ((hnxz)object0).c;
        if(hnxf1 == null) {
            hnxf1 = hnxf.a;
        }
        fmjl0.c((hnxf1.e == null ? hftw.a : hnxf1.e).b);
        return new fmiy(fmjl0.a());
    }

    @Override  // flzo
    public final void d(UUID uUID0, int v, iapk iapk0, flsl flsl0, long v1) {
        int v2 = iapk0.t.r;
        Throwable throwable0 = iapk0.v;
        if((throwable0 instanceof fmja)) {
            fmja fmja0 = (fmja)throwable0;
        }
        fmai fmai0 = fmaj.a();
        fmai0.g(10003);
        fmai0.n(this.d.c().f());
        fmai0.o(this.d.d().toStringUtf8());
        fmai0.p(uUID0.toString());
        fmai0.j(17);
        fmai0.m(Integer.valueOf(v2));
        fmai0.f(v);
        fmai0.e(v1);
        flsl0.b(fmai0.a());
    }

    @Override  // flzo
    public final void e(UUID uUID0, Object object0, flsl flsl0, long v) {
        fmiy fmiy0 = (fmiy)object0;
        fmai fmai0 = fmaj.a();
        fmai0.g(10003);
        fmai0.n(this.d.c().f());
        fmai0.o(this.d.d().toStringUtf8());
        fmai0.p(uUID0.toString());
        fmai0.j(17);
        fmai0.f(1);
        fmai0.e(v);
        flsl0.b(fmai0.a());
    }
}

