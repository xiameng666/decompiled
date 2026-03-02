import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

public final class arpn extends arlg implements arnv {
    public static final aqql d;
    public final arot e;
    public final gful_cronetEngineProvider f;
    public Future g;
    public final AtomicBoolean h;
    private final gmcg i;
    private final boolean j;
    private final gful_cronetEngineProvider k;
    private final gful_cronetEngineProvider l;
    private final gful_cronetEngineProvider m;
    private boolean n;

    static {
        arpn.d = new aqql(new String[]{"WifiTransport"});
    }

    public arpn(arlj arlj0, gmcg gmcg0, gmcg gmcg1, arem arem0, arpe arpe0, boolean z) {
        super(arlj0, gmcg0, arem0);
        this.f = gfus.a(((gful_cronetEngineProvider)new aroy()));
        this.k = gfus.a(((gful_cronetEngineProvider)new aroz()));
        this.l = gfus.a(((gful_cronetEngineProvider)new arpa()));
        this.m = gfus.a(((gful_cronetEngineProvider)new arpb()));
        this.n = false;
        this.h = new AtomicBoolean(false);
        cuvs cuvs0 = new cuvs();
        cuvs0.a = "backup.d2d";
        cuvt cuvt0 = new cuvt(cuvs0);
        cuvm cuvm0 = cumi.a(arpe0.a, cuvt0);
        azts azts0 = new azts(arpe0.a, null);
        this.e = new arot(this, arpe0.a, cuvm0, azts0, arpe0.b, arpe0.c, arpe0.d);
        this.i = gmcg1;
        this.j = z;
    }

    public final byte[] A() {
        return this.e.o;
    }

    private final void B() {
        synchronized(this) {
            if(this.h.get()) {
                arpn.d.d("WifiTransport is already shutting down. Abandoning this connect attempt.", new Object[0]);
                return;
            }
            if(this.g != null && !this.g.isDone()) {
                arpn.d.d("Already trying to connect.", new Object[0]);
                return;
            }
            arpk arpk0 = new arpk(this);
            this.g = this.i.d(arpk0);
        }
    }

    private static final InputStream C(boolean z, int v, InputStream inputStream0) {
        return z ? new SequenceInputStream(new ByteArrayInputStream(new byte[]{1, ((byte)v)}), inputStream0) : new SequenceInputStream(new ByteArrayInputStream(new byte[]{0}), inputStream0);
    }

    private static final InputStream D(int v, InputStream inputStream0) {
        return new SequenceInputStream(new ByteArrayInputStream(new byte[]{((byte)v)}), inputStream0);
    }

    @Override  // arlg
    protected final hkyj a() {
        return hkyj.c;
    }

    @Override  // arlg
    protected final void b() {
        synchronized(this) {
            arpn.d.h("doShutdown", new Object[0]);
            this.h.set(true);
            this.i.shutdownNow();
            this.e.k();
        }
    }

    @Override  // arlg
    protected final void c(byte[] arr_b) {
        arpn.d.h("doShutdownWithLastPacket", new Object[0]);
        arpj arpj0 = new arpj(this);
        this.e.h(arr_b, arpj0);
    }

    @Override  // arlg, arnv
    public final void e() {
        arpn.d.h("WifiTransport.onDisconnected", new Object[0]);
        super.e();
    }

    @Override  // arlk
    public final void j() {
        arpn.d.h("connect", new Object[0]);
        this.B();
    }

    @Override  // arlk
    public final void k(InputStream inputStream0, long v, arli arli0, hkyj hkyj0) {
        gftb.b(hkyj0.equals(hkyj.c), "Connection type must be WiFi.");
        arpn.d.h("sendBatchPayloadStream, payloadId=%d", new Object[]{v});
        arpm arpm0 = new arpm(this, inputStream0, v, arli0);
        this.b.execute(arpm0);
    }

    @Override  // arlk
    public final void l(File file0, arli arli0) {
        arpn.d.h("sendFile", new Object[0]);
        arph arph0 = new arph(this, file0, arli0);
        this.b.execute(arph0);
    }

    @Override  // arlk
    public final void m(File file0, long v, arli arli0) {
        arpn.d.h("sendFileWithPayloadId, payloadId=%d", new Object[]{v});
        arpl arpl0 = new arpl(this, file0, v, arli0);
        this.b.execute(arpl0);
    }

    @Override  // arlk
    public final void n(byte[] arr_b) {
        arpn.d.h("sendPacket", new Object[0]);
        arot.a.d("sendBytes", new Object[0]);
        cuwu cuwu0 = cuwu.b(arr_b);
        this.e.d(cuwu0);
    }

    @Override  // arlk
    public final void o(byte[] arr_b, long v) {
        throw new UnsupportedOperationException("Unexpected call to sendPacket(packet, timeout) in WiFi D2D.");
    }

    @Override  // arlk
    public final void p(InputStream inputStream0, arli arli0) {
        aqql aqql0 = arpn.d;
        aqql0.h("sendStream", new Object[0]);
        if(((Boolean)this.m.mr()).booleanValue()) {
            aqql0.d("sendStream running initial stream.read() in a dedicated thread.", new Object[0]);
            arow arow0 = new arow(this, inputStream0, arli0);
            this.i.execute(arow0);
            return;
        }
        aqql0.d("sendStream running initial stream.read() inline in the same thread.", new Object[0]);
        try {
            this.x(inputStream0.read(), inputStream0, arli0);
        }
        catch(IOException unused_ex) {
            arpn.d.f("IOException from sendStream. Sending stream error packet.", new Object[0]);
            this.n(arpn.u().toBytesArray());
        }
    }

    @Override  // arlk
    public final void q(InputStream inputStream0, arli arli0, hkyj hkyj0) {
        gftb.checkTrue(hkyj0.equals(hkyj.c));
        this.p(inputStream0, arli0);
    }

    @Override  // arlk
    public final void r(long v, arli arli0, hkyj hkyj0) {
        gftb.b(hkyj0.equals(hkyj.c), "Connection type must be WiFi.");
        arpn.d.h("sendStreamErrorPacket, itemPayloadId=%d", new Object[]{v});
        arpi arpi0 = new arpi(this, v, arli0);
        this.b.execute(arpi0);
    }

    @Override  // arlk
    public final void s(InputStream inputStream0, long v, arli arli0, hkyj hkyj0) {
        gftb.b(hkyj0.equals(hkyj.c), "Connection type must be WiFi.");
        aqql aqql0 = arpn.d;
        aqql0.h("sendStreamWithPayloadId, payloadId=%d", new Object[]{v});
        if(((Boolean)this.m.mr()).booleanValue()) {
            aqql0.d("sendStreamWithPayloadId running initial stream.read() in a dedicated thread.", new Object[0]);
            arox arox0 = new arox(this, inputStream0, v, arli0);
            this.i.execute(arox0);
            return;
        }
        aqql0.d("sendStream running initial stream.read() inline in the same thread.", new Object[0]);
        try {
            this.y(inputStream0.read(), v, inputStream0, arli0);
        }
        catch(IOException unused_ex) {
            arpn.d.f("IOException from sendStream. Sending stream error packet.", new Object[0]);
            byte[] arr_b = arpn.v(v).toBytesArray();
            this.e.h(arr_b, arli0);
        }
    }

    @Override  // arlk
    public final boolean t(hkyj hkyj0) {
        return hkyj0.equals(hkyj.c) && this.i();
    }

    public static asci u() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)asci.a).v_newBuilder();
        asch asch0 = asch.m;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((asci)hftp0.b_message).c = asch0.y;
        ((asci)hftp0.b_message).b |= 1;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ascj.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ascj ascj0 = (ascj)hftp1.b_message;
        ascj0.b |= 1;
        ascj0.c = 1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        asci asci0 = (asci)hftp0.b_message;
        ascj ascj1 = (ascj)hftp1.N_build();
        ascj1.getClass();
        asci0.f = ascj1;
        asci0.b |= 8;
        return (asci)hftp0.N_build();
    }

    public static asci v(long v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)asci.a).v_newBuilder();
        asch asch0 = asch.m;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((asci)hftp0.b_message).c = asch0.y;
        ((asci)hftp0.b_message).b |= 1;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ascj.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ascj ascj0 = (ascj)hftp1.b_message;
        ascj0.b |= 1;
        ascj0.c = 1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        asci asci0 = (asci)hftp0.b_message;
        ascj ascj1 = (ascj)hftp1.N_build();
        ascj1.getClass();
        asci0.f = ascj1;
        asci0.b |= 8;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        asci asci1 = (asci)hftp0.b_message;
        asci1.b |= 0x800;
        asci1.l = v;
        return (asci)hftp0.N_build();
    }

    public final Long w() {
        return this.j ? ((Long)this.l.mr()) : ((Long)this.k.mr());
    }

    public final void x(int v, InputStream inputStream0, arli arli0) {
        if(this.n) {
            InputStream inputStream1 = arpn.C(v != -1, v, inputStream0);
            this.e.i(inputStream1, arli0);
            return;
        }
        if(v == -1) {
            arpn.d.m("No data received from sendStream. Sending stream error packet.", new Object[0]);
            this.n(arpn.u().toBytesArray());
            return;
        }
        InputStream inputStream2 = arpn.D(v, inputStream0);
        this.e.i(inputStream2, arli0);
    }

    public final void y(int v, long v1, InputStream inputStream0, arli arli0) {
        if(this.n) {
            InputStream inputStream1 = arpn.C(v != -1, v, inputStream0);
            this.e.j(inputStream1, v1, arli0);
            return;
        }
        if(v == -1) {
            arpn.d.m("No data received from sendStream. Sending stream error packet.", new Object[0]);
            byte[] arr_b = arpn.v(v1).toBytesArray();
            this.e.h(arr_b, arli0);
            return;
        }
        InputStream inputStream2 = arpn.D(v, inputStream0);
        this.e.j(inputStream2, v1, arli0);
    }

    public final void z(boolean z) {
        arpn.d.h("shouldUseWifiD2dHeader: %b", new Object[]{Boolean.valueOf(z)});
        this.n = z;
    }
}

