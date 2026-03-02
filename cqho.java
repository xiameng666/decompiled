import android.content.Context;

public final class cqho implements evqf {
    public final cqhp a;

    public cqho(cqhp cqhp0) {
        this.a = cqhp0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        if(((azui)object0).q()) {
            Context context0 = this.a.a;
            boolean z = cqix.h.a(context0).booleanValue();
            int v = bbmn.h(context0, "com.google.android.gms").isEmpty() ? 3 : 2;
            cexs cexs0 = cexs.v();
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hgzq.a).v_newBuilder();
            hgzp hgzp0 = hgzp.bb;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((hgzq)hftp0.b_message).c = hgzp0.fh;
            ((hgzq)hftp0.b_message).b |= 2;
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hgzn.a).v_newBuilder();
            hgzk hgzk0 = hgzk.e;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((hgzn)hftp1.b_message).c = hgzk0.i;
            ((hgzn)hftp1.b_message).b |= 1;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hgzq hgzq0 = (hgzq)hftp0.b_message;
            hgzn hgzn0 = (hgzn)hftp1.N_build();
            hgzn0.getClass();
            hgzq0.f = hgzn0;
            hgzq0.b |= 16;
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hgzs.a).v_newBuilder();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp2.b_message;
            ((hgzs)hftv0).b |= 2;
            ((hgzs)hftv0).f = z;
            if(!hftv0.isImmutable()) {
                hftp2.ensureMutable();
            }
            ((hgzs)hftp2.b_message).g = v - 1;
            ((hgzs)hftp2.b_message).b |= 4;
            String s = Long.toString(bbmq.d(context0));
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            hgzs hgzs0 = (hgzs)hftp2.b_message;
            s.getClass();
            hgzs0.c = 2;
            hgzs0.d = s;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hgzq hgzq1 = (hgzq)hftp0.b_message;
            hgzs hgzs1 = (hgzs)hftp2.N_build();
            hgzs1.getClass();
            hgzq1.g = hgzs1;
            hgzq1.b |= 0x20;
            cexs0.j(((ProtoLiteMessage)(((hgzq)hftp0.N_build()))));
        }
    }
}

