import android.content.Context;
import j..util.Objects;

public final class atnx extends atnu {
    final atny b;
    private final long c;
    private final ProtoLiteBuilder d;

    public atnx(atny atny0, Context context0, String s, int v, boolean z) {
        Objects.requireNonNull(atny0);
        this.b = atny0;
        super(context0, v);
        ProtoLiteBuilder hftp0 = aqra.b();
        this.d = hftp0;
        String s1 = atny0.c;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghys ghys0 = (ghys)hftp0.b_message;
        s1.getClass();
        ghys0.b |= 1;
        ghys0.e = s1;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gict.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        s.getClass();
        ((gict)hftv0).b |= 1;
        ((gict)hftv0).c = s;
        long v1 = atny0.b;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((gict)hftv1).b |= 2;
        ((gict)hftv1).d = v1;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp1.b_message;
        ((gict)hftv2).j = 0;
        ((gict)hftv2).b |= 0x40;
        if(!hftv2.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp1.b_message;
        ((gict)hftv3).b |= 0x20;
        ((gict)hftv3).i = 0L;
        if(!hftv3.isImmutable()) {
            hftp1.ensureMutable();
        }
        gict gict0 = (gict)hftp1.b_message;
        gict0.b |= 0x80;
        gict0.k = z;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghys ghys1 = (ghys)hftp0.b_message;
        gict gict1 = (gict)hftp1.N_build();
        gict1.getClass();
        ghys1.j = gict1;
        ghys1.b |= 0x100;
        atny0.d.add(hftp0);
        this.c = System.currentTimeMillis();
    }

    public final void b(int v) {
        ProtoLiteBuilder hftp0 = this.d;
        gict gict0 = ((ghys)hftp0.b_message).j;
        if(gict0 == null) {
            gict0 = gict.a;
        }
        long v1 = (long)v;
        if((gict0.b & 0x20) != 0) {
            gict gict1 = ((ghys)hftp0.b_message).j;
            if(gict1 == null) {
                gict1 = gict.a;
            }
            v1 += gict1.i;
        }
        gict gict2 = ((ghys)hftp0.b_message).j;
        if(gict2 == null) {
            gict2 = gict.a;
        }
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)gict2).jf(5, null);
        hftp1.X(((ProtoLiteMessage)gict2));
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gict gict3 = (gict)hftp1.b_message;
        gict3.b |= 0x20;
        gict3.i = v1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghys ghys0 = (ghys)hftp0.b_message;
        gict gict4 = (gict)hftp1.N_build();
        gict4.getClass();
        ghys0.j = gict4;
        ghys0.b |= 0x100;
    }

    public final void c(long v) {
        ProtoLiteBuilder hftp0 = this.d;
        gict gict0 = ((ghys)hftp0.b_message).j;
        if(gict0 == null) {
            gict0 = gict.a;
        }
        if((gict0.b & 8) != 0) {
            gict gict1 = ((ghys)hftp0.b_message).j;
            if(gict1 == null) {
                gict1 = gict.a;
            }
            v += gict1.f;
        }
        gict gict2 = ((ghys)hftp0.b_message).j;
        if(gict2 == null) {
            gict2 = gict.a;
        }
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)gict2).jf(5, null);
        hftp1.X(((ProtoLiteMessage)gict2));
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gict gict3 = (gict)hftp1.b_message;
        gict3.b |= 8;
        gict3.f = v;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghys ghys0 = (ghys)hftp0.b_message;
        gict gict4 = (gict)hftp1.N_build();
        gict4.getClass();
        ghys0.j = gict4;
        ghys0.b |= 0x100;
    }

    public final void d(int v) {
        ProtoLiteBuilder hftp0 = this.d;
        gict gict0 = ((ghys)hftp0.b_message).j;
        if(gict0 == null) {
            gict0 = gict.a;
        }
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)gict0).jf(5, null);
        hftp1.X(((ProtoLiteMessage)gict0));
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gict gict1 = (gict)hftp1.b_message;
        gict1.b |= 16;
        gict1.h = v;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghys ghys0 = (ghys)hftp0.b_message;
        gict gict2 = (gict)hftp1.N_build();
        gict2.getClass();
        ghys0.j = gict2;
        ghys0.b |= 0x100;
    }

    public final void e(int v) {
        ProtoLiteBuilder hftp0 = this.d;
        gict gict0 = ((ghys)hftp0.b_message).j;
        if(gict0 == null) {
            gict0 = gict.a;
        }
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)gict0).jf(5, null);
        hftp1.X(((ProtoLiteMessage)gict0));
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gict gict1 = (gict)hftp1.b_message;
        hfuf hfuf0 = gict1.g;
        if(!hfuf0.c()) {
            gict1.g = ProtoLiteMessage.C(hfuf0);
        }
        gict1.g.i(v - 1);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghys ghys0 = (ghys)hftp0.b_message;
        gict gict2 = (gict)hftp1.N_build();
        gict2.getClass();
        ghys0.j = gict2;
        ghys0.b |= 0x100;
    }

    public final void f(int v) {
        ProtoLiteBuilder hftp0 = this.d;
        gict gict0 = ((ghys)hftp0.b_message).j;
        if(gict0 == null) {
            gict0 = gict.a;
        }
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)gict0).jf(5, null);
        hftp1.X(((ProtoLiteMessage)gict0));
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gict gict1 = (gict)hftp1.b_message;
        if(v == 0) {
            throw null;
        }
        gict1.j = v - 1;
        gict1.b |= 0x40;
        long v1 = System.currentTimeMillis() - this.c;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gict gict2 = (gict)hftp1.b_message;
        gict2.b |= 4;
        gict2.e = v1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghys ghys0 = (ghys)hftp0.b_message;
        gict gict3 = (gict)hftp1.N_build();
        gict3.getClass();
        ghys0.j = gict3;
        ghys0.b |= 0x100;
        this.a(hftp0, ghyr.e);
        this.b.d.remove(hftp0);
    }
}

