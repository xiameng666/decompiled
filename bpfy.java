import android.os.Build;

public final class bpfy implements glzn {
    public final bpik a;
    public final gtas b;
    public final ByteString c;
    public final fqwq d;
    public final boolean e;
    public final boov f;
    public final int g;

    public bpfy(bpik bpik0, gtas gtas0, int v, ByteString hfsf0, fqwq fqwq0, boolean z, boov boov0) {
        this.a = bpik0;
        this.b = gtas0;
        this.g = v;
        this.c = hfsf0;
        this.d = fqwq0;
        this.e = z;
        this.f = boov0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        gtas gtas0 = this.b;
        boolean z = bouv.b(gtas0);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gszf.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gszf.b(((gszf)hftp0.b_message));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        int v = this.g;
        gszf gszf0 = (gszf)hftp0.b_message;
        gszf0.g = gtac.a(v);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        bpik bpik0 = this.a;
        gszf gszf1 = (gszf)hftp0.b_message;
        ((gtap)object0).getClass();
        gszf1.d = (gtap)object0;
        gszf1.b |= 1;
        if(z) {
            gtbr gtbr0 = bpik0.G(this.c, v, 0L);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gszf gszf2 = (gszf)hftp0.b_message;
            gtbr0.getClass();
            gszf2.e = gtbr0;
            gszf2.b |= 2;
        }
        gfsx gfsx0 = gfsx.m(this.d.e());
        gszf gszf3 = (gszf)hftp0.N_build();
        boolean z1 = false;
        gftb.checkTrue(((ByteString)((gftm)gfsx0).a).size() == 16);
        gftb.checkTrue(gszf3.c > 0);
        gftb.checkTrue(gszf3.c <= 15);
        gtap gtap0 = gszf3.d == null ? gtap.a : gszf3.d;
        if(gtao.a(gtap0.c) == 4) {
            z1 = true;
        }
        gftb.checkTrue(z1);
        gftb.checkTrue(((boolean)(gtap0.e.isEmpty() ^ 1)));
        gfsx gfsx1 = gfsx.m(gszf3);
        fqsi fqsi0 = new fqsi(gfsx0, gfqx.a, gfqx.a, gfsx1);
        fqsj fqsj0 = fqsk.a();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gtaa.a).v_newBuilder();
        String s = bpxz.a(bpik0.c);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        s.getClass();
        ((gtaa)hftv0).d = s;
        gszv gszv0 = bpik.r(z);
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        gtaa gtaa0 = (gtaa)hftp1.b_message;
        gtaa0.g = gszv0.a();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gtaa gtaa1 = (gtaa)hftp1.b_message;
        gtaa1.h = gtas0.a();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gtaa gtaa2 = (gtaa)hftp1.b_message;
        gtaa2.e = gszy.a(22);
        fqsj0.d(((gtaa)hftp1.N_build()));
        fqsj0.b(bpik.b);
        fqsj0.f(Build.MANUFACTURER);
        fqsj0.h(Build.PRODUCT);
        fqsj0.j(Build.MODEL);
        fqsj0.k(this.e);
        fqsj0.m(v);
        fqsk fqsk0 = fqsj0.a();
        return this.f.a().i(fqsi0, fqsk0);
    }
}

