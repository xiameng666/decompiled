import android.content.Context;

public final class atmb {
    public final aqqk a;
    private static final ggeo b;

    static {
        atmb.b = ggeo.r(gifh.h, ghyu.a, gifh.i, ghyu.b, gifh.j, ghyu.c, gifh.k, ghyu.d, gifh.l, ghyu.e, gifh.m, ghyu.f, gifh.n, ghyu.g);
    }

    public atmb(Context context0) {
        this.a = new aqqk(context0);
    }

    public final void a(gifh gifh0, String s) {
        this.d(null, gifh0, null, s);
    }

    public final void b(String s, gifh gifh0, String s1) {
        this.d(s, gifh0, null, s1);
    }

    public final void c(String s, gifh gifh0, boolean z) {
        this.d(s, gifh0, Boolean.valueOf(z), null);
    }

    public final void d(String s, gifh gifh0, Boolean boolean0, String s1) {
        if(hqlt.r()) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gifi.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((gifi)hftv0).d = gifh0.s;
            ((gifi)hftv0).b |= 2;
            if(s != null) {
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gifi gifi0 = (gifi)hftp0.b_message;
                gifi0.b |= 1;
                gifi0.c = s;
            }
            if(boolean0 != null) {
                boolean z = boolean0.booleanValue();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gifi gifi1 = (gifi)hftp0.b_message;
                gifi1.b |= 8;
                gifi1.f = z;
            }
            if(s1 != null) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gifi gifi2 = (gifi)hftp0.b_message;
                gifi2.b |= 4;
                gifi2.e = s1;
            }
            aqqk aqqk0 = this.a;
            ProtoLiteBuilder hftp1 = aqra.b();
            gifi gifi3 = (gifi)hftp0.N_build();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ghys ghys0 = (ghys)hftp1.b_message;
            gifi3.getClass();
            ghys0.ax = gifi3;
            ghys0.d |= 0x8000000;
            aqqk0.a(((ghys)hftp1.N_build()), ghyr.aM);
            return;
        }
        if(gifh0 != gifh.o) {
            ghyu ghyu0 = (ghyu)atmb.b.get(gifh0);
            gftb.check(ghyu0);
            if(hqlt.a.o().W()) {
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)ghyv.a).v_newBuilder();
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp2.b_message;
                ((ghyv)hftv1).d = ghyu0.h;
                ((ghyv)hftv1).b |= 2;
                if(s != null) {
                    if(!hftv1.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    ghyv ghyv0 = (ghyv)hftp2.b_message;
                    ghyv0.b |= 1;
                    ghyv0.c = s;
                }
                if(s1 != null) {
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    ghyv ghyv1 = (ghyv)hftp2.b_message;
                    ghyv1.b |= 4;
                    ghyv1.e = s1;
                }
                aqqk aqqk1 = this.a;
                ProtoLiteBuilder hftp3 = aqra.b();
                ghyv ghyv2 = (ghyv)hftp2.N_build();
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                ghys ghys1 = (ghys)hftp3.b_message;
                ghyv2.getClass();
                ghys1.ar = ghyv2;
                ghys1.d |= 0x100000;
                aqqk1.a(((ghys)hftp3.N_build()), ghyr.aF);
            }
        }
    }
}

