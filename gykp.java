import android.util.Base64;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.util.Arrays;

public final class gykp implements gyjp {
    private static final gykd a;
    private static final byte[] b;
    private static final byte[] c;
    private final String d;
    private final gyjp e;
    private hhsq f;
    private int g;
    private int h;

    static {
        gykp.a = gykd.b();
        gykp.b = "ChangeCipherSpec".getBytes(Charset.forName("UTF-8"));
        gykp.c = "CONFIRM".getBytes(Charset.forName("UTF-8"));
    }

    public gykp(gyjp gyjp0) {
        this.e = gyjp0;
        this.d = ((gyka)gykp.a).a();
        this.f = null;
        this.g = 1;
        this.h = 1;
    }

    @Override  // gyjp
    public final gyhi a() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gyhi.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gyhi gyhi0 = (gyhi)hftp0.b_message;
        this.d.getClass();
        gyhi0.b |= 1;
        gyhi0.c = this.d;
        hftr hftr0 = (hftr)((ProtoLiteMessage)gyhj.a).v_newBuilder();
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        ((gyhj)hftr0.b_message).c = 2;
        ((gyhj)hftr0.b_message).b |= 1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gyhi gyhi1 = (gyhi)hftp0.b_message;
        gyhj gyhj0 = (gyhj)((ProtoLiteBuilder)hftr0).N_build();
        gyhj0.getClass();
        gyhi1.d = gyhj0;
        gyhi1.b |= 2;
        return (gyhi)hftp0.N_build();
    }

    public final String b() {
        hhsq hhsq0 = this.f;
        if(hhsq0 == null) {
            throw new IllegalStateException("Cannot get verification code; no connection");
        }
        int v = this.h;
        if(v == 2) {
            try {
                return Base64.encodeToString(hhsq0.l(), 3);
            }
            catch(NoSuchAlgorithmException noSuchAlgorithmException0) {
                throw new IOException(noSuchAlgorithmException0);
            }
        }
        throw new IllegalStateException("Cannot get verification code; wrong state: " + gyko.a(v));
    }

    @Override  // gyjp
    public final String c() {
        return this.d;
    }

    @Override  // gykn
    public final void close() {
        this.g = 1;
        this.m();
        this.e.close();
    }

    @Override  // gykn
    public final void d() {
        byte[] arr_b;
        if(this.f()) {
            return;
        }
        gyjp gyjp0 = this.e;
        if(!gyjp0.f()) {
            gyjp0.d();
        }
        if(gyjp0.g()) {
            this.g = 2;
            this.m();
            this.g = 2;
            try {
                hhsv hhsv0 = new hhsv(1);
                int v = hhsv0.c;
                if(v == 0) {
                    throw null;
                }
                switch(v - 1) {
                    case 0: {
                        hhsv0.c = 2;
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hhtc.a).v_newBuilder();
                        hhuz hhuz0 = hhus.c(hhsv0.a.getPublic());
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ProtoLiteMessage hftv0 = hftp0.b_message;
                        hhuz0.getClass();
                        ((hhtc)hftv0).c = hhuz0;
                        ((hhtc)hftv0).b |= 1;
                        int v1 = hhsv0.b;
                        if(!hftv0.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        hhtc hhtc0 = (hhtc)hftp0.b_message;
                        hhtc0.b |= 2;
                        hhtc0.d = v1;
                        arr_b = ((hhtc)hftp0.N_build()).toBytesArray();
                        break;
                    }
                    case 3: {
                        arr_b = hhsv0.d(new byte[0]);
                        hhsv0.c = 5;
                        break;
                    }
                    default: {
                        throw new hhti("Cannot get next message in state: " + hhsu.a(v));
                    }
                }
                gyjp0.e(arr_b);
                byte[] arr_b1 = gyjp0.h();
                gykp.s(arr_b1);
                byte[] arr_b2 = hhsv0.e(arr_b1);
                if(!Arrays.equals(gykp.b, arr_b2)) {
                    throw new IOException("Could not get connection confirmation from responder");
                }
                this.h = 2;
                this.o(hhsv0);
            }
            catch(IllegalStateException illegalStateException0) {
                this.n(illegalStateException0);
            }
            catch(hhti hhti0) {
                this.n(hhti0);
            }
            return;
        }
        this.g = 3;
        this.m();
        this.g = 3;
        try {
            hhsv hhsv1 = new hhsv(3);
            byte[] arr_b3 = this.e.h();
            gykp.s(arr_b3);
            hhsv1.e(arr_b3);
            byte[] arr_b4 = hhsv1.c(gykp.b);
            this.e.e(arr_b4);
            this.h = 2;
            this.o(hhsv1);
        }
        catch(IllegalStateException illegalStateException1) {
            this.n(illegalStateException1);
        }
        catch(hhti hhti1) {
            this.n(hhti1);
        }
    }

    @Override  // gykn
    public final void e(byte[] arr_b) {
        if(!this.p()) {
            throw new IOException("Connection is not authenticated");
        }
        byte[] arr_b1 = this.r(arr_b);
        this.e.e(arr_b1);
    }

    @Override  // gykn
    public final boolean f() {
        return this.e.f() && this.p();
    }

    @Override  // gykn
    public final boolean g() {
        return this.e.g();
    }

    @Override  // gykn
    public final byte[] h() {
        if(this.p()) {
            return this.q(this.e.h());
        }
        throw new IOException("Connection is not authenticated");
    }

    public final void i() {
        if(this.f == null) {
            throw new IllegalStateException("Cannot set connection as verified; null connection");
        }
        int v = this.h;
        if(v != 2) {
            throw new IllegalStateException("Cannot verify connection code; wrong state: " + gyko.a(v));
        }
        this.h = 3;
    }

    public final void j() {
        byte[] arr_b = this.r(gykp.c);
        this.e.e(arr_b);
    }

    public final boolean k() {
        return this.e.f() && this.h == 2;
    }

    public final boolean l() {
        byte[] arr_b = this.q(this.e.h());
        return Arrays.equals(gykp.c, arr_b);
    }

    private final void m() {
        this.f = null;
        this.h = 1;
    }

    private final void n(Exception exception0) {
        this.m();
        ((ggtj)((ggtj)gyke.a.j()).ar(0x4F5D)).B("SecureConnectionEcdh: Fail to authenticate as %s", (this.g == 2 ? "initiator" : "responder"));
        this.e.e(new byte[0]);
        throw new IOException(exception0);
    }

    private final void o(hhsv hhsv0) {
        if(!hhsv0.b()) {
            throw new IOException("Expected handshake to be complete, but it\'s not");
        }
        int v = this.h;
        if(v != 2) {
            throw new IOException("Cannot upgrade connection; wrong state: " + gyko.a(v));
        }
        this.f = hhsv0.a();
    }

    private final boolean p() {
        return this.h == 3;
    }

    private final byte[] q(byte[] arr_b) {
        hhsq hhsq0 = this.f;
        if(hhsq0 != null) {
            try {
                return hhsq0.j(arr_b);
            }
            catch(SignatureException signatureException0) {
                throw new IOException(signatureException0);
            }
        }
        throw new IOException("Not connected");
    }

    private final byte[] r(byte[] arr_b) {
        hhsq hhsq0 = this.f;
        if(hhsq0 != null) {
            return hhsq0.k(arr_b);
        }
        throw new IOException("Not connected");
    }

    private static final void s(byte[] arr_b) {
        if(arr_b != null && arr_b.length != 0) {
            return;
        }
        throw new IOException("Connection torn down");
    }
}

