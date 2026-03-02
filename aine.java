import android.os.SystemClock;

public final class aine implements gfsi {
    public final aink a;
    public final long b;

    public aine(aink aink0, long v) {
        this.a = aink0;
        this.b = v;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        int v1;
        boolean z;
        ByteString hfsf0;
        gfsx gfsx0 = ((aiod)object0).a;
        if(!gfsx0.i()) {
            return aink.b;
        }
        ajah ajah0 = (ajah)gfsx0.d();
        ggeo ggeo0 = ajah0.b;
        int v = 0;
        if(ggeo0.containsKey("com.google.android.gms.auth.blockstore.DEFAULT_BYTES_DATA_KEY")) {
            ajaf ajaf0 = (ajaf)ggeo0.get("com.google.android.gms.auth.blockstore.DEFAULT_BYTES_DATA_KEY");
            hfsf0 = ajaf0.a;
            z = ajaf0.b;
            v1 = ajaf0.c;
        }
        else {
            hfsf0 = ByteString.copyFrom(aink.b);
            v1 = 0;
            z = false;
        }
        aink aink0 = this.a;
        hfsf0.size();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)wvd.a).v_newBuilder();
        long v2 = SystemClock.elapsedRealtime() - this.b;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        wvd wvd0 = (wvd)hftp0.b_message;
        wvd0.b |= 1;
        wvd0.c = (int)v2;
        wvd wvd1 = (wvd)hftp0.N_build();
        int v3 = aink.g(z, v1);
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)wvp.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        wvp wvp0 = (wvp)hftp1.b_message;
        aink0.d.getClass();
        wvp0.b |= 1;
        wvp0.c = aink0.d;
        int v4 = hfsf0.size();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        wvp wvp1 = (wvp)hftp1.b_message;
        wvp1.b |= 2;
        wvp1.d = v4;
        int v5 = hfsf0.isEmpty() ^ 1;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((wvp)hftv0).b |= 4;
        ((wvp)hftv0).e = v5;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((wvp)hftv1).b |= 8;
        ((wvp)hftv1).f = false;
        boolean z1 = ajah0.a;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        wvp wvp2 = (wvp)hftp1.b_message;
        wvp2.b |= 16;
        wvp2.g = z1;
        int v6 = aizr.r(ajah0.c);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp1.b_message;
        ((wvp)hftv2).h = v6 - 1;
        ((wvp)hftv2).b |= 0x20;
        wvj wvj0 = ((aiod)object0).b;
        if(!hftv2.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp1.b_message;
        wvj0.getClass();
        ((wvp)hftv3).i = wvj0;
        ((wvp)hftv3).b |= 0x80;
        if(!hftv3.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv4 = hftp1.b_message;
        wvd1.getClass();
        ((wvp)hftv4).j = wvd1;
        ((wvp)hftv4).b |= 0x100;
        if(!hftv4.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((wvp)hftp1.b_message).k = v3 - 1;
        ((wvp)hftp1.b_message).b |= 0x200;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)wvm.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv5 = hftp2.b_message;
        ((wvm)hftv5).b |= 1;
        ((wvm)hftv5).c = v3 == 3 ? 1 : 0;
        if(!hftv5.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv6 = hftp2.b_message;
        ((wvm)hftv6).b |= 2;
        ((wvm)hftv6).d = v3 == 4 ? 1 : 0;
        if(v3 == 5) {
            v = 1;
        }
        if(!hftv6.isImmutable()) {
            hftp2.ensureMutable();
        }
        wvm wvm0 = (wvm)hftp2.b_message;
        wvm0.b |= 4;
        wvm0.e = v;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        wvp wvp3 = (wvp)hftp1.b_message;
        wvm wvm1 = (wvm)hftp2.N_build();
        wvm1.getClass();
        wvp3.l = wvm1;
        wvp3.b |= 0x400;
        wvp wvp4 = (wvp)hftp1.N_build();
        if(hpsg.e()) {
            aink0.f(wvp4);
            return hfsf0.toByteArray();
        }
        aink0.g.k(wvp4);
        return hfsf0.toByteArray();
    }
}

