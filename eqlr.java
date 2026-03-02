import android.content.Context;

public final class eqlr {
    public final eqmf a;
    private static final baun b;
    private final ayud c;
    private final Context d;
    private final gjna e;
    private eqtz f;
    private final ProtoLiteBuilder g;
    private final ProtoLiteBuilder h;
    private final ProtoLiteBuilder i;

    static {
        eqlr.b = new erqc(new String[]{"D2D", "Metrics", "PostSetupLogManager"});
    }

    public eqlr(Context context0) {
        ayud ayud0 = new aytt(context0, "SMART_SETUP").a();
        super();
        gjna gjna0 = (gjna)((ProtoLiteMessage)gjnb.a).v_newBuilder();
        this.e = gjna0;
        this.h = ((ProtoLiteMessage)gjns.a).v_newBuilder();
        this.i = ((ProtoLiteMessage)gjnu.a).v_newBuilder();
        this.d = context0;
        this.c = ayud0;
        this.g = ((ProtoLiteMessage)gjoc.a).v_newBuilder();
        this.a = new eqmf(gjna0);
        if(hygo.c()) {
            this.f = new eqtz(context0, ayud0);
        }
    }

    public final void a() {
        baun baun0 = eqlr.b;
        baun0.j("Sending logs with Clearcut.", new Object[0]);
        ProtoLiteBuilder hftp0 = this.i;
        gjnb gjnb0 = this.a.a();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjnu gjnu0 = (gjnu)hftp0.b_message;
        gjnb0.getClass();
        gjnu0.d = gjnb0;
        gjnu0.b |= 2;
        ProtoLiteBuilder hftp1 = this.h;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjnu gjnu1 = (gjnu)hftp0.b_message;
        gjns gjns0 = (gjns)hftp1.N_build();
        gjns0.getClass();
        gjnu1.e = gjns0;
        gjnu1.b |= 4;
        ProtoLiteBuilder hftp2 = this.g;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gjoc gjoc0 = (gjoc)hftp2.b_message;
        gjnu gjnu2 = (gjnu)hftp0.N_build();
        gjnu2.getClass();
        gjoc0.i = gjnu2;
        gjoc0.b |= 0x40;
        baun0.j(((ProtoLiteMessage)(((gjoc)hftp2.N_build()))).toString(), new Object[0]);
        if(hygo.d()) {
            new eqtx(this.d).a(((gjoc)hftp2.N_build()));
            return;
        }
        if(hygo.c()) {
            eqtz eqtz0 = this.f;
            if(eqtz0 != null) {
                eqtz0.c(((MessageLite)(((gjoc)hftp2.N_build()))));
                return;
            }
        }
        if(hygu.c()) {
            zdi zdi0 = new zdi();
            ayvm ayvm0 = fhbe.b(this.d, zdi0);
            ProtoLiteMessage hftv0 = hftp2.N_build();
            ayuc ayuc0 = this.c.i(((MessageLite)hftv0));
            ayuc0.o = ayvm0;
            ayuc0.d();
            return;
        }
        ProtoLiteMessage hftv1 = hftp2.N_build();
        this.c.i(((MessageLite)hftv1)).d();
    }

    public final void b(String s, boolean z) {
        ProtoLiteBuilder hftp0 = this.h;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjns gjns0 = (gjns)hftp0.b_message;
        s.getClass();
        gjns0.b |= 1;
        gjns0.c = s;
        if("com.google.android.gms".equals(s)) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gjns)hftp0.b_message).d = 1;
            ((gjns)hftp0.b_message).b |= 2;
            return;
        }
        if(z) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gjns)hftp0.b_message).d = 2;
            ((gjns)hftp0.b_message).b |= 2;
            return;
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gjns)hftp0.b_message).d = 4;
        ((gjns)hftp0.b_message).b |= 2;
    }

    public final void c(long v) {
        ProtoLiteBuilder hftp0 = this.g;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjoc gjoc0 = (gjoc)hftp0.b_message;
        gjoc0.b |= 1;
        gjoc0.c = v;
    }

    public final void d(int v) {
        ProtoLiteBuilder hftp0 = this.i;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gjnu)hftp0.b_message).c = v - 1;
        ((gjnu)hftp0.b_message).b |= 1;
    }
}

