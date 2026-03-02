import java.io.IOException;
import java.nio.charset.Charset;
import java.security.SignatureException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

public final class gykq implements gyjp {
    private static final gykd a;
    private static final byte[] b;
    private final String c;
    private final gyjp d;
    private final byte[] e;
    private hhsq f;
    private boolean g;
    private int h;

    static {
        gykq.a = gykd.b();
        gykq.b = "ChangeCipherSpec".getBytes(Charset.forName("UTF-8"));
    }

    public gykq(gyjp gyjp0, byte[] arr_b) {
        this.d = gyjp0;
        this.c = ((gyka)gykq.a).a();
        this.f = null;
        batl.s(arr_b);
        this.e = arr_b;
        this.h = 1;
        this.g = false;
    }

    @Override  // gyjp
    public final gyhi a() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gyhi.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gyhi gyhi0 = (gyhi)hftp0.b_message;
        this.c.getClass();
        gyhi0.b |= 1;
        gyhi0.c = this.c;
        hftr hftr0 = (hftr)((ProtoLiteMessage)gyhj.a).v_newBuilder();
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        ((gyhj)hftr0.b_message).c = 1;
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

    private final void b() {
        this.f = null;
        this.g = false;
    }

    @Override  // gyjp
    public final String c() {
        return this.c;
    }

    @Override  // gykn
    public final void close() {
        this.h = 1;
        this.b();
        this.d.close();
    }

    @Override  // gykn
    public final void d() {
        byte[] arr_b = this.e;
        if(this.f()) {
            return;
        }
        gyjp gyjp0 = this.d;
        if(!gyjp0.f()) {
            gyjp0.d();
        }
        if(gyjp0.g()) {
            this.h = 2;
            this.b();
            this.h = 2;
            try {
                hhsy hhsy0 = new hhsy(1, arr_b);
                gyjp0.e(hhsy0.d());
                byte[] arr_b1 = gyjp0.h();
                gykq.l(arr_b1);
                hhsy0.e(arr_b1);
                gyjp0.e(hhsy0.d());
                byte[] arr_b2 = gyjp0.h();
                gykq.l(arr_b2);
                byte[] arr_b3 = hhsy0.e(arr_b2);
                if(!Arrays.equals(gykq.b, arr_b3)) {
                    throw new IOException("Could not get connection confirmation from responder");
                }
                this.j(hhsy0);
                this.g = true;
            }
            catch(IllegalStateException illegalStateException0) {
                this.i(illegalStateException0);
            }
            catch(hhti hhti0) {
                this.i(hhti0);
            }
            return;
        }
        this.h = 3;
        this.b();
        this.h = 3;
        try {
            hhsy hhsy1 = new hhsy(5, this.e);
            gyjp gyjp1 = this.d;
            byte[] arr_b4 = gyjp1.h();
            gykq.l(arr_b4);
            hhsy1.e(arr_b4);
            gyjp1.e(hhsy1.d());
            byte[] arr_b5 = gyjp1.h();
            gykq.l(arr_b5);
            hhsy1.e(arr_b5);
            byte[] arr_b6 = gykq.b;
            int v = hhsy1.e;
            if(v == 0) {
                throw null;
            }
            if(v - 1 != 7) {
                throw new hhti("Cannot send handshake message with payload in state: " + hhsx.a(v));
            }
            byte[] arr_b7 = hhsy1.f(false, arr_b6);
            hhsy1.e = 9;
            gyjp1.e(arr_b7);
            this.j(hhsy1);
            this.g = true;
        }
        catch(IllegalStateException illegalStateException1) {
            this.i(illegalStateException1);
        }
        catch(hhti hhti1) {
            this.i(hhti1);
        }
    }

    @Override  // gykn
    public final void e(byte[] arr_b) {
        if(!this.g) {
            throw new IOException("Connection is not authenticated");
        }
        gyjp gyjp0 = this.d;
        hhsq hhsq0 = this.f;
        if(hhsq0 == null) {
            throw new IOException("Not connected");
        }
        gyjp0.e(hhsq0.k(arr_b));
    }

    @Override  // gykn
    public final boolean f() {
        return this.d.f() && this.g;
    }

    @Override  // gykn
    public final boolean g() {
        return this.d.g();
    }

    @Override  // gykn
    public final byte[] h() {
        if(this.g) {
            return this.k(this.d.h());
        }
        throw new IOException("Connection is not authenticated");
    }

    private final void i(Exception exception0) {
        this.b();
        ((ggtj)((ggtj)gyke.a.j()).ar(0x4F5E)).B("SecureConnectionSpake: Fail to authenticate as %s", (this.h == 2 ? "initiator" : "responder"));
        this.d.e(new byte[0]);
        throw new IOException(exception0);
    }

    private final void j(hhsy hhsy0) {
        if(!hhsy0.b()) {
            throw new IOException("Expected handshake to be complete, but it\'s not");
        }
        if(hhsy0.e == 10) {
            throw new hhti("Cannot reuse handshake context; is has already been used");
        }
        if(!hhsy0.b()) {
            throw new hhti("Handshake is not complete; cannot create connection context");
        }
        hhsy0.e = 10;
        this.f = new hhsr(new SecretKeySpec(hhsy0.d, "AES"), 1);
    }

    private final byte[] k(byte[] arr_b) {
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

    private static final void l(byte[] arr_b) {
        if(arr_b != null && arr_b.length != 0) {
            return;
        }
        throw new IOException("Connection torn down");
    }
}

