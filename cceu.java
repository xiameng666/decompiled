import android.content.Context;
import java.io.Closeable;
import java.util.HashSet;

public final class cceu implements cbzh, Closeable {
    final ayud a;
    private static final gkdp b;
    private final ayvm c;
    private final cbyw d;
    private final ayvf e;
    private final String f;

    static {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gkdp.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gkdp gkdp0 = (gkdp)hftp0.b_message;
        gkdp0.b |= 1;
        gkdp0.c = 199000;
        cceu.b = (gkdp)hftp0.N_build();
    }

    public cceu(Context context0, cbyw cbyw0) {
        this.d = cbyw0;
        this.f = "com.google.android.gms";
        if(cbyw0.Z()) {
            this.a = ayud.k(context0, "BRELLA");
        }
        else {
            aytt aytt0 = ayud.n(context0, "BRELLA");
            aytt0.g = new ccet(this);
            this.a = aytt0.a();
        }
        this.c = fhbe.b(avyr.a, new ccev());
        if(cbyw0.D()) {
            int v = cbyw0.c();
            ayvf ayvf0 = new ayvf(this.a, "BRELLA_COUNTERS", v);
            this.e = ayvf0;
            ayvf0.j();
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gkdc.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gkdc.b(((gkdc)hftp0.b_message));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gkdc gkdc0 = (gkdc)hftp0.b_message;
            gkdc0.b |= 1;
            gkdc0.c = "com.google.android.gms";
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gkdb.a).v_newBuilder();
            gkdp gkdp0 = cceu.b;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp1.b_message;
            gkdp0.getClass();
            ((gkdb)hftv0).e = gkdp0;
            ((gkdb)hftv0).b |= 0x400;
            if(!hftv0.isImmutable()) {
                hftp1.ensureMutable();
            }
            gkdb gkdb0 = (gkdb)hftp1.b_message;
            gkdc gkdc1 = (gkdc)hftp0.N_build();
            gkdc1.getClass();
            gkdb0.c = gkdc1;
            gkdb0.b |= 1;
            gkdb gkdb1 = (gkdb)hftp1.N_build();
            new ayuv(cbyw0.b());
            new HashSet(cbyw0.B());
            return;
        }
        this.e = null;
    }

    @Override  // cbzh
    public final void a(gkdb gkdb0) {
        if(gkdb0 == null) {
            return;
        }
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gkdb0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gkdb0));
        this.g(hftp0, this.f);
    }

    @Override  // cbzh
    public final void b(int v) {
        this.d(v, null);
    }

    @Override  // cbzh
    public final void c(int v) {
        this.e(v, null);
    }

    @Override
    public final void close() {
        ayvf ayvf0 = this.e;
        if(ayvf0 != null) {
            ayvf0.h();
        }
    }

    @Override  // cbzh
    public final void d(int v, String s) {
        if(this.d.L() && this.d.K()) {
            this.f(v - 2, s);
        }
    }

    @Override  // cbzh
    public final void e(int v, String s) {
        if(!this.d.L()) {
            return;
        }
        this.f(v - 2, s);
    }

    private final void f(int v, String s) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gkdd.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gkdd gkdd0 = (gkdd)hftp0.b_message;
        gkdd0.b |= 1;
        gkdd0.c = (long)v;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gkdb.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gkdb gkdb0 = (gkdb)hftp1.b_message;
        gkdd gkdd1 = (gkdd)hftp0.N_build();
        gkdd1.getClass();
        gkdb0.d = gkdd1;
        gkdb0.b |= 0x40;
        if(s == null) {
            s = this.f;
        }
        this.g(hftp1, s);
    }

    private final void g(ProtoLiteBuilder hftp0, String s) {
        gkdp gkdp0 = cceu.b;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gkdb gkdb0 = (gkdb)hftp0.b_message;
        gkdp0.getClass();
        gkdb0.e = gkdp0;
        gkdb0.b |= 0x400;
        gkdc gkdc0 = ((gkdb)hftp0.b_message).c;
        if(gkdc0 == null) {
            gkdc0 = gkdc.a;
        }
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)gkdc0).jf(5, null);
        hftp1.X(((ProtoLiteMessage)gkdc0));
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gkdc.b(((gkdc)hftp1.b_message));
        if(s != null) {
            gkdc gkdc1 = ((gkdb)hftp0.b_message).c;
            if(gkdc1 == null) {
                gkdc1 = gkdc.a;
            }
            if(gkdc1.c.isEmpty()) {
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gkdc gkdc2 = (gkdc)hftp1.b_message;
                gkdc2.b |= 1;
                gkdc2.c = s;
            }
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gkdb gkdb1 = (gkdb)hftp0.b_message;
        gkdc gkdc3 = (gkdc)hftp1.N_build();
        gkdc3.getClass();
        gkdb1.c = gkdc3;
        gkdb1.b |= 1;
        gkdb gkdb2 = (gkdb)hftp0.N_build();
        ayuc ayuc0 = this.a.i(((MessageLite)gkdb2));
        ayuc0.o = this.c;
        ayuc0.d();
    }
}

