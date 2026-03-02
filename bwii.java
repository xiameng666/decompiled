import android.os.SystemClock;

public final class bwii {
    private final bwgr a;

    public bwii(bwgr bwgr0) {
        this.a = bwgr0;
    }

    public final void a(bbum bbum0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)bbum0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)bbum0));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((bbum)hftp0.b_message).e = 0L;
        bbum bbum1 = (bbum)hftp0.N_build();
        bwgr bwgr0 = this.a;
        if(htyb.a.d().f()) {
            bwgr0.b.j(((ProtoLiteMessage)bbum1));
            return;
        }
        bwgr0.d.cp().b(new bwgq(bwgr0, bbum1));
    }

    public final void b(String s, int v) {
        ibuq.f(s, "moduleName");
        bbup bbup0 = bbuo.a(((ProtoLiteMessage)bbum.a).v_newBuilder());
        bbup0.b(bbul.aJ);
        bbux bbux0 = bbuw.a(((ProtoLiteMessage)bbuv.a).v_newBuilder());
        bbux0.c(s);
        bbux0.e(bbuu.b);
        ProtoLiteBuilder hftp0 = bbux0.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((bbuv)hftp0.b_message).e = v;
        bbux0.b(SystemClock.elapsedRealtime());
        bbup0.c(bbux0.a());
        this.a(bbup0.a());
    }
}

