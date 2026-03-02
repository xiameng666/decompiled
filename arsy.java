import android.content.Context;

public final class arsy {
    private final aqql a;
    private final aqqk b;

    public arsy(Context context0) {
        this.a = new aqql(new String[]{"CustomDownloadLogger"});
        this.b = new aqqk(context0, null);
    }

    public final void a(ghys ghys0, ghyr ghyr0) {
        if(!hqii.a.e().p()) {
            this.a.j("Clearcut logging disabled", new Object[0]);
            return;
        }
        this.b.a(ghys0, ghyr0);
    }

    public final void b(gibu gibu0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ghys.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghys ghys0 = (ghys)hftp0.b_message;
        gibu0.getClass();
        ghys0.P = gibu0;
        ghys0.c |= 0x80000;
        this.a(((ghys)hftp0.N_build()), ghyr.W);
    }

    public final void c(int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gicg.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gicg)hftp0.b_message).c = v - 1;
        ((gicg)hftp0.b_message).b |= 1;
        gicg gicg0 = (gicg)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ghys.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ghys ghys0 = (ghys)hftp1.b_message;
        gicg0.getClass();
        ghys0.ak = gicg0;
        ghys0.d |= 0x1000;
        this.a(((ghys)hftp1.N_build()), ghyr.ax);
    }

    public final void d(String s, long v, int v1) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gibs.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        s.getClass();
        ((gibs)hftv0).b |= 1;
        ((gibs)hftv0).c = s;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((gibs)hftv1).b |= 4;
        ((gibs)hftv1).e = v;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gibs)hftp0.b_message).d = v1 - 1;
        ((gibs)hftp0.b_message).b |= 2;
        gibs gibs0 = (gibs)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ghys.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ghys ghys0 = (ghys)hftp1.b_message;
        gibs0.getClass();
        ghys0.Q = gibs0;
        ghys0.c |= 0x100000;
        this.a(((ghys)hftp1.N_build()), ghyr.Z);
    }

    public final void e(int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gibq.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gibp.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gibp)hftp1.b_message).c = v - 1;
        ((gibp)hftp1.b_message).b |= 1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gibq gibq0 = (gibq)hftp0.b_message;
        gibp gibp0 = (gibp)hftp1.N_build();
        gibp0.getClass();
        gibq0.c = gibp0;
        gibq0.b = 1;
        gibq gibq1 = (gibq)hftp0.N_build();
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)ghys.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ghys ghys0 = (ghys)hftp2.b_message;
        gibq1.getClass();
        ghys0.ai = gibq1;
        ghys0.d |= 0x400;
        this.a(((ghys)hftp2.N_build()), ghyr.av);
    }

    public final void f(int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gibu.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gibu)hftv0).b |= 1;
        ((gibu)hftv0).c = false;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gibu)hftp0.b_message).d = v - 1;
        ((gibu)hftp0.b_message).b |= 2;
        this.b(((gibu)hftp0.N_build()));
    }
}

