import android.content.Context;

public final class aruk {
    public static final aqql a;
    public final gful_cronetEngineProvider b;
    public final gmcg c;
    public final aruh d;
    private Boolean e;
    private arsy f;

    static {
        aruk.a = new aqql(new String[]{"PortalNotificationHelper"});
    }

    public aruk() {
        this.b = gfus.a(((gful_cronetEngineProvider)new arug()));
        this.c = new bblp(1, 9);
        this.d = new aruh();
    }

    public aruk(arsy arsy0) {
        this.b = gfus.a(((gful_cronetEngineProvider)new arug()));
        this.c = new bblp(1, 9);
        this.d = new aruh();
        this.f = arsy0;
    }

    public final boolean a(Context context0) {
        artu artu0 = arto.a(context0).b();
        return !artu0.f && !artu0.h;
    }

    public final boolean b(Context context0) {
        if(((Boolean)this.b.mr()).booleanValue() && this.a(context0)) {
            if(this.e == null) {
                this.e = Boolean.valueOf(arto.a(context0).b().g);
            }
            return this.e.booleanValue();
        }
        return false;
    }

    public final void c(int v) {
        arsy arsy0 = this.f;
        if(arsy0 != null) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gibq.a).v_newBuilder();
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gibn.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((gibn)hftp1.b_message).c = v - 1;
            ((gibn)hftp1.b_message).b |= 1;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gibq gibq0 = (gibq)hftp0.b_message;
            gibn gibn0 = (gibn)hftp1.N_build();
            gibn0.getClass();
            gibq0.c = gibn0;
            gibq0.b = 2;
            gibq gibq1 = (gibq)hftp0.N_build();
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)ghys.a).v_newBuilder();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ghys ghys0 = (ghys)hftp2.b_message;
            gibq1.getClass();
            ghys0.ai = gibq1;
            ghys0.d |= 0x400;
            arsy0.a(((ghys)hftp2.N_build()), ghyr.av);
        }
    }
}

