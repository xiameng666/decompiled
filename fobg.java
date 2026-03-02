import android.content.Context;

public final class fobg extends fobh {
    public static final ayuj a;
    private final fnfm b;
    private final ayud c;
    private final ayud d;
    private final String e;

    static {
        fobg.a = ayuj.a(0x4AB0021, hlqj.d);
    }

    public fobg(fnfm fnfm0, Context context0) {
        aytt aytt0 = new aytt(context0, "ONEGOOGLE_MOBILE");
        aytt0.g = new fobf();
        ayud ayud0 = aytt0.a();
        ayud ayud1 = ayud.k(context0, "ONEGOOGLE_MOBILE");
        super();
        this.c = ayud0;
        this.d = ayud1;
        this.b = fnfm0;
        this.e = "com.google.android.gms";
    }

    @Override  // fobh
    public final void a(Object object0, hhce hhce0) {
        fnfm fnfm0 = this.b;
        int v = fnfm0.a(object0).b;
        if(v == 4) {
            return;
        }
        if(v == 1 && (object0 == null || !fnfm0.j(object0))) {
            v = 2;
        }
        this.b(v, object0, hhce0);
    }

    public final void b(int v, Object object0, hhce hhce0) {
        ayuc ayuc0;
        boolean z2;
        boolean z1;
        boolean z = false;
        int v1 = 1;
        switch(hhcm.a(hhce0.c)) {
            case 0: {
                z1 = false;
                break;
            }
            case 1: {
                z1 = false;
                break;
            }
            default: {
                z1 = true;
            }
        }
        gftb.checkTrue(z1);
        switch(hhcj.a(hhce0.d)) {
            case 0: {
                z2 = false;
                break;
            }
            case 1: {
                z2 = false;
                break;
            }
            default: {
                z2 = true;
            }
        }
        gftb.checkTrue(z2);
        if(hhch.a(hhce0.f) != 0 && hhch.a(hhce0.f) != 1) {
            z = true;
        }
        gftb.checkTrue(z);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hhcf.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)hhce0).jf(5, null);
        hftp1.X(((ProtoLiteMessage)hhce0));
        String s = this.e;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        hhce hhce1 = (hhce)hftp1.b_message;
        s.getClass();
        hhce1.b |= 0x40;
        hhce1.g = s;
        hhce hhce2 = (hhce)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hhcf hhcf0 = (hhcf)hftp0.b_message;
        hhce2.getClass();
        hhcf0.c = hhce2;
        hhcf0.b |= 1;
        hhcf hhcf1 = (hhcf)hftp0.N_build();
        switch(v - 1) {
            case 0: {
                ayuc ayuc1 = this.c.i(((MessageLite)hhcf1));
                ayuc1.o(this.b.d(object0));
                ayuc0 = ayuc1;
                break;
            }
            case 1: {
                ayuc0 = this.c.i(((MessageLite)hhcf1));
                break;
            }
            default: {
                ayuc0 = this.d.i(((MessageLite)hhcf1));
            }
        }
        int v2 = hhcm.a(hhce0.c);
        if(v2 != 0) {
            v1 = v2;
        }
        ayuc0.k(v1 - 1);
        ayuc0.d();
    }
}

