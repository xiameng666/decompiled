import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class czti extends czth {
    public byte[] h;
    public final String i;
    public String j;
    public final cztl k;
    public final czjy l;
    public czuo m;
    private final int n;

    private czti(byte[] arr_b, String s, czjy czjy0, cztl cztl0, czuo czuo0, int v, boolean z, int v1) {
        super(bbqr.c(czmk.g(arr_b)), z, v1);
        this.h = arr_b;
        this.i = s;
        this.l = czjy0;
        this.k = cztl0;
        this.m = czuo0;
        this.n = v;
    }

    @Override  // czlg
    public final InputStream e() {
        return this.l;
    }

    @Override  // czlg
    public final OutputStream f() {
        return this.k;
    }

    @Override  // czlg
    public final void h() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gytk.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gytk)hftp0.b_message).c = 2;
        ((gytk)hftp0.b_message).b |= 1;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gytf.a).v_newBuilder();
        ByteString hfsf0 = ByteString.copyFrom(this.h);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gytf gytf0 = (gytf)hftp1.b_message;
        gytf0.b |= 1;
        gytf0.c = hfsf0;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gytk gytk0 = (gytk)hftp0.b_message;
        gytf gytf1 = (gytf)hftp1.N_build();
        gytf1.getClass();
        gytk0.e = gytf1;
        gytk0.b |= 4;
        byte[] arr_b = ((gytk)hftp0.N_build()).toBytesArray();
        try {
            gelf gelf0 = this.k.b(arr_b);
            if(gelf0 != null) {
                gelf0.b(new cztk(arr_b));
            }
        }
        catch(IOException iOException0) {
            czkq.a.c().f(iOException0).h("BleSocketImpl failed to send a disconnection packet to disconnect for service ID hash %s.", czmk.g(this.h));
        }
        this.m.a();
    }

    @Override  // czth
    public final String k() {
        return this.j;
    }

    @Override  // czth
    public final String l() {
        return this.i;
    }

    @Override  // czth
    public final void m(String s) {
        this.j = s;
    }

    @Override  // czth
    public final void n(byte[] arr_b) {
        this.h = arr_b;
        this.k.b = arr_b;
    }

    @Override  // czth
    public final byte[] o() {
        return this.h;
    }

    @Override  // czth
    public final int p() {
        return this.n;
    }

    final void r() {
        bbpb.b(this.k);
        bbpb.b(this.l);
    }

    final void s(byte[] arr_b) {
        this.k.a(arr_b);
    }

    public static czti t(byte[] arr_b, String s, czuo czuo0, cztl cztl0, int v, boolean z, int v1) {
        return new czti(arr_b, s, new czjy(), cztl0, czuo0, v, z, v1);
    }
}

