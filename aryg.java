import android.content.Context;

public final class aryg {
    private final aqqk a;

    public aryg(Context context0) {
        this.a = new aqqk(context0, null);
    }

    public final void a(ghys ghys0, ghyr ghyr0) {
        this.a.a(ghys0, ghyr0);
    }

    public final void b(int v, int v1) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gicw.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gicw)hftv0).c = v - 1;
        ((gicw)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gicw)hftp0.b_message).d = v1 - 1;
        ((gicw)hftp0.b_message).b |= 2;
        gicw gicw0 = (gicw)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ghys.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ghys ghys0 = (ghys)hftp1.b_message;
        gicw0.getClass();
        ghys0.S = gicw0;
        ghys0.c |= 0x400000;
        this.a(((ghys)hftp1.N_build()), ghyr.ab);
    }

    public final void c(int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gicw.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gicw)hftp0.b_message).c = v - 1;
        ((gicw)hftp0.b_message).b |= 1;
        gicw gicw0 = (gicw)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ghys.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ghys ghys0 = (ghys)hftp1.b_message;
        gicw0.getClass();
        ghys0.S = gicw0;
        ghys0.c |= 0x400000;
        this.a(((ghys)hftp1.N_build()), ghyr.ab);
    }

    public final void d(int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gicy.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gicy)hftv0).c = v - 1;
        ((gicy)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gicy gicy0 = (gicy)hftp0.b_message;
        gicy0.b |= 2;
        gicy0.d = false;
        gicy gicy1 = (gicy)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ghys.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ghys ghys0 = (ghys)hftp1.b_message;
        gicy1.getClass();
        ghys0.R = gicy1;
        ghys0.c |= 0x200000;
        this.a(((ghys)hftp1.N_build()), ghyr.aa);
    }

    public final void e(int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giei.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((giei)hftv0).b |= 1;
        ((giei)hftv0).c = false;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((giei)hftp0.b_message).e = v - 1;
        ((giei)hftp0.b_message).b |= 4;
        giei giei0 = (giei)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ghys.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ghys ghys0 = (ghys)hftp1.b_message;
        giei0.getClass();
        ghys0.W = giei0;
        ghys0.c |= 0x4000000;
        this.a(((ghys)hftp1.N_build()), ghyr.aq);
    }
}

