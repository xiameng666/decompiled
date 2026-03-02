import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Base64;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.chimera.config.ModuleManager.ModuleInfo;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.backup.d2d.component.D2dEarlySourceChimeraService;
import com.google.android.gms.backup.d2d.component.posttransfertask.D2dPostTransferTask;
import com.google.android.gms.backup.d2d.migrate.service.protocol.p2p.PlayP2pRestoreServiceResultReceiver;
import com.google.android.gms.smartdevice.postsetup.HandshakeData;
import com.google.android.gms.smartdevice.postsetup.PostSetupAuthData;
import j..util.Optional;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import jeb.synthetic.FIN;

public final class arjh extends arin {
    public D2dEarlySourceChimeraService A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public volatile boolean F;
    public final gful_cronetEngineProvider G;
    public int H;
    private final arem I;
    private final arkn J;
    private final ScheduledExecutorService K;
    private final ScheduledExecutorService L;
    private arlf M;
    private arjs N;
    private long O;
    private byte[] P;
    private final arnb Q;
    private final arhy R;
    private boolean S;
    public static final aqql p;
    public final arjg q;
    public final CountDownLatch r;
    public final arqt s;
    public final aree t;
    public final ario u;
    public final aqee v;
    public final arkk w;
    public final gmcg x;
    public final boolean y;
    public final arhv z;

    static {
        arjh.p = new aqql(new String[]{"SourceProtocol"});
    }

    public arjh(Context context0, arlh arlh0, arfk arfk0, aqrx aqrx0, ario ario0, gmcg gmcg0, arem arem0, aqee aqee0, ScheduledExecutorService scheduledExecutorService0, ScheduledExecutorService scheduledExecutorService1, gmcg gmcg1, boolean z, WifiManager wifiManager0, arnb arnb0, arhy arhy0) {
        super(context0, gmcg0, wifiManager0);
        this.q = new arjg(this);
        this.r = new CountDownLatch(1);
        this.A = null;
        this.H = 1;
        this.B = false;
        this.C = false;
        this.D = false;
        this.O = 0L;
        this.P = null;
        this.S = false;
        this.G = gfus.a(((gful_cronetEngineProvider)new arip()));
        this.v = aqee0;
        this.u = ario0;
        this.I = arem0;
        this.e = arlh0.a(this);
        this.Q = arnb0;
        this.R = arhy0;
        arkn arkn0 = new arkn();
        this.J = arkn0;
        arjs arjs0 = new arjs(context0);
        this.N = arjs0;
        arqt arqt0 = arqt.b(context0, arfk0, arem0, aqrx0, arkn0, arjs0, gmcg1);
        this.s = arqt0;
        this.w = new arkk(context0, gmcg0, scheduledExecutorService0, scheduledExecutorService1);
        this.K = scheduledExecutorService0;
        this.L = scheduledExecutorService1;
        this.x = gmcg1;
        this.y = z;
        this.t = new aree(context0, arqt0);
        this.z = new arhv(this.e, arqt0, this);
    }

    public final void A() {
        this.w.a();
        this.x.shutdown();
        this.L.shutdown();
        if(hqhq.B()) {
            arjh.p.h("Shutdown called, shutting down appdata flavor handler", new Object[0]);
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)asbk.a).v_newBuilder();
            aqfx aqfx0 = aqfx.g;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((asbk)hftp0.b_message).d = aqfx0.q;
            ((asbk)hftp0.b_message).b |= 2;
            asbk asbk0 = (asbk)hftp0.N_build();
            arqb arqb0 = (arqb)this.s.a(asbk0);
            if(arqb0 != null) {
                arqb0.e.e.set(true);
            }
        }
        this.e.f();
    }

    public final boolean B() {
        if(!((Boolean)this.n.mr()).booleanValue()) {
            return this.e.i();
        }
        if(this.S) {
            return this.e.i();
        }
        arjh.p.h("Transfer has not started yet, checking if the primary transport is connected.", new Object[0]);
        arlk arlk0 = this.e;
        return (arlk0 instanceof arlm) ? ((arlm)arlk0).t(((arlm)arlk0).e) : arlk0.i();
    }

    final boolean C(asbi asbi0) {
        int v = 3;
        if(asbi0 != null && (asbi0.b & 1) != 0) {
            try {
                if(this.N == null) {
                    this.N = new arjs(this.b);
                }
                boolean z = aree.b(this.N, (asbi0.c == null ? arbk.a : asbi0.c));
                if(z) {
                    v = 2;
                }
                this.H = v;
                return z;
            }
            catch(ExecutionException | InterruptedException | TimeoutException unused_ex) {
                return false;
            }
        }
        arjh.p.j("Messages Custom D2D API is not supported in the target device.", new Object[0]);
        this.H = 3;
        return false;
    }

    private final arrd D() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)asbk.a).v_newBuilder();
        aqfx aqfx0 = aqfx.j;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((asbk)hftp0.b_message).d = aqfx0.q;
        ((asbk)hftp0.b_message).b |= 2;
        asbk asbk0 = (asbk)hftp0.N_build();
        arqo arqo0 = this.s.a(asbk0);
        return (arqo0 instanceof arrd) ? ((arrd)arqo0) : null;
    }

    private final void E(asch asch0, HandshakeData handshakeData0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)asci.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((asci)hftp0.b_message).c = asch0.y;
        ((asci)hftp0.b_message).b |= 1;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)asbt.a).v_newBuilder();
        ByteString hfsf0 = ByteString.copyFrom(handshakeData0.ax());
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        asbt asbt0 = (asbt)hftp1.b_message;
        asbt0.b |= 0x8000;
        asbt0.s = hfsf0;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        asci asci0 = (asci)hftp0.b_message;
        asbt asbt1 = (asbt)hftp1.N_build();
        asbt1.getClass();
        asci0.e = asbt1;
        asci0.b |= 4;
        this.f(((asci)hftp0.N_build()));
    }

    @Override  // arin
    public final void c(hkyj hkyj0) {
        synchronized(this) {
            if(((Boolean)this.n.mr()).booleanValue() && !this.S && hkyj0.equals(hkyj.b) && ((this.e instanceof arlm) && ((arlm)this.e).e.equals(hkyj.c))) {
                return;
            }
            if(!((Boolean)this.g.mr()).booleanValue() || !this.B()) {
                this.F = true;
                ario ario0 = this.u;
                argf.a.d("Device disconnected.", new Object[0]);
                if(((argf)ario0).l()) {
                    if(!((argf)ario0).o) {
                        argg argg0 = new argg(((argf)ario0).e);
                        ((argf)ario0).e.a.post(argg0);
                    }
                    ((argf)ario0).f(5);
                    ((argf)ario0).r.e();
                }
                ((argf)ario0).g.c();
                ((argf)ario0).d.i(12, null, 1, 1);
                ((argf)ario0).m = false;
                ((argf)ario0).i();
                if(((argf)ario0).o && ((argf)ario0).l()) {
                    ((argf)ario0).h();
                }
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)asbk.a).v_newBuilder();
                aqfx aqfx0 = aqfx.c;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((asbk)hftp0.b_message).d = aqfx0.q;
                ((asbk)hftp0.b_message).b |= 2;
                String s = aqfx0.name();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                asbk asbk0 = (asbk)hftp0.b_message;
                s.getClass();
                asbk0.b |= 1;
                asbk0.c = s;
                asbk asbk1 = (asbk)hftp0.N_build();
                arqo arqo0 = this.s.a(asbk1);
                if((arqo0 instanceof arqx)) {
                    arko arko0 = ((arqx)arqo0).b;
                    if(arko0 != null) {
                        arko0.d = true;
                    }
                }
                this.n();
            }
            super.c(hkyj0);
        }
    }

    @Override  // arin
    public final void h(ascm ascm0, ascj ascj0) {
        asci asci0 = arin.m(asch.c);
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)asci0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)asci0));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        asci asci1 = (asci)hftp0.b_message;
        ascm0.getClass();
        asci1.d = ascm0;
        asci1.b |= 2;
        if(ascj0 == null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((asci)hftp0.b_message).f = null;
            ((asci)hftp0.b_message).b &= -9;
        }
        else {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((asci)hftp0.b_message).f = ascj0;
            ((asci)hftp0.b_message).b |= 8;
        }
        asci asci2 = (asci)hftp0.N_build();
        long v = hqhq.a.j().u();
        asch asch0 = asch.b(asci2.c) == null ? asch.a : asch.b(asci2.c);
        arin.a.d("Sending packet of type: %s, timeout: %d", new Object[]{asch0, v});
        this.e.o(asci2.toBytesArray(), v);
        if(ascj0 != null) {
            arjh.p.f("SmartDevice error encountered: code %d and category %d", new Object[]{((int)ascj0.c), ((int)ascj0.e)});
            int v1 = ascj0.e;
            int v2 = ascj0.c;
            ProtoLiteBuilder hftp1 = this.I.l;
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hkza.a).v_newBuilder();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp2.b_message;
            ((hkza)hftv0).b |= 1;
            ((hkza)hftv0).c = v1;
            if(!hftv0.isImmutable()) {
                hftp2.ensureMutable();
            }
            hkza hkza0 = (hkza)hftp2.b_message;
            hkza0.b |= 2;
            hkza0.d = v2;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            hkyg hkyg0 = (hkyg)hftp1.b_message;
            hkza hkza1 = (hkza)hftp2.N_build();
            hkza1.getClass();
            hkyg0.m = hkza1;
            hkyg0.b |= 0x20;
        }
    }

    @Override  // arin
    public final void l(int v, String s, boolean z) {
        arjh.p.d("Fatal protocol error. Shutting transport down.", new Object[0]);
        if(z) {
            this.e.h(this.b(v - 1, s).toBytesArray());
        }
        else {
            this.e.f();
        }
        this.I.c(aqze.a(v - 1, true));
        this.u.m();
    }

    public final void n() {
        arlf arlf0 = this.M;
        if(arlf0 != null) {
            arlf0.a();
            this.M = null;
        }
    }

    public final void o(boolean z, Runnable runnable0) {
        if(this.P != null && hqhq.x()) {
            String s = "Device Token: " + Arrays.toString(this.P);
            arjh.p.d(s, new Object[0]);
            this.p(new arjx(this.K), z, runnable0);
            return;
        }
        if(this.P == null) {
            arjh.p.d("Got a null token from source", new Object[0]);
        }
        else {
            arjh.p.d("Experiment flag for apk transfer disabled", new Object[0]);
        }
        runnable0.run();
    }

    // Detected as a lambda impl.
    public final void p(arjx arjx0, boolean z, Runnable runnable0) {
        if(this.F) {
            arjh.p.d("The devices are disconnected..not proceeding.", new Object[0]);
            return;
        }
        arkk arkk0 = this.w;
        if(!arkk0.e()) {
            if(arjx0.b()) {
                arjx0.a(new arit(this, arjx0, z, runnable0));
                return;
            }
            runnable0.run();
            return;
        }
        ariy ariy0 = new ariy(this, z, runnable0, arjx0);
        arkk0.b(this.P, new PlayP2pRestoreServiceResultReceiver(this.J, ariy0, this.c), ariy0);
    }

    @Override  // arlj
    public final void q(int v, hkyj hkyj0) {
        if(v == 0) {
            argf.a.j("Device connected.", new Object[0]);
            arey arey0 = new arey();
            ((argf)this.u).r.a(arey0);
            ((argf)this.u).e.a();
            ((argf)this.u).g.d();
            return;
        }
        argf.a.j("Connection failed.", new Object[0]);
        arez arez0 = new arez();
        ((argf)this.u).r.a(arez0);
        ((argf)this.u).j();
    }

    @Override  // arlj
    public final void r(asci asci0, hkyj hkyj0) {
        byte[] arr_b3;
        int v9;
        ascj ascj0;
        Optional optional1;
        Optional optional0;
        boolean z;
        int v6;
        aqql aqql0 = arjh.p;
        aqql0.d("Received packet of type: %s", new Object[]{(asch.b(asci0.c) == null ? asch.a : asch.b(asci0.c))});
        int v = (asch.b(asci0.c) == null ? asch.a : asch.b(asci0.c)).ordinal();
        if(v != 1 && v != 2 && v != 3 && v != 12 && (v != 14 && v != 15 && v != 16) && (!((argf)this.u).m || !this.E)) {
            this.f(this.b(10, String.format("Require authorization for request of type: %s", (asch.b(asci0.c) == null ? asch.a : asch.b(asci0.c)).name())));
            aqql0.m("Cannot process packet. " + (((argf)this.u).m ? "Channel is not secure" : "Authorization required"), new Object[0]);
            return;
        }
        byte[] arr_b = null;
        switch((asch.b(asci0.c) == null ? asch.a : asch.b(asci0.c)).ordinal()) {
            case 1: {
                asbt asbt0 = asci0.e == null ? asbt.a : asci0.e;
                int v1 = asbt0.d;
                if(v1 == 0xD2DB00DA) {
                    int v2 = asbt0.e;
                    if(v2 != 1) {
                        aqql0.f("Handshake major version did not match. Got: %d", new Object[]{v2});
                        this.l(6, String.format("Handshake did not match, Required: %d", ((int)1)), true);
                        return;
                    }
                    aqql0.h("Protocol versions: local=%d.%d remote=%d.%d", new Object[]{((int)1), ((int)5), ((int)asbt0.e), ((int)asbt0.f)});
                    int v3 = (int)hqnd.b();
                    if(v3 <= 5) {
                        int v4 = Math.min(5, asbt0.f);
                        Integer integer0 = v4;
                        aqql0.h("Minimum common minor protocol version: %d", new Object[]{integer0});
                        if((asbt0.b & 0x10000) == 0) {
                            aqql0.h("Wifi header versions: local: %d, remote: unspecified", new Object[]{v3});
                            v6 = 0x7FFFFFFF;
                        }
                        else {
                            int v5 = asbt0.t;
                            aqql0.h("Wifi header versions: local: %d, remote: %d", new Object[]{v3, v5});
                            v6 = Math.max(v3, v5);
                        }
                        if(v4 >= v6) {
                            aqql0.h("shouldUseWifiD2dHeader: true, minMinorProtocolVersion: %d >= maxWifiHeaderMinorVersion: %d", new Object[]{integer0, v6});
                            z = true;
                        }
                        else {
                            z = false;
                        }
                    }
                    else {
                        z = false;
                    }
                    arlk arlk0 = this.e;
                    if((arlk0 instanceof arpn)) {
                        ((arpn)arlk0).z(z);
                    }
                    else if((arlk0 instanceof arlm) && ((arlm)arlk0).e.equals(hkyj.c)) {
                        arpn arpn0 = ((arlm)arlk0).f;
                        gftb.z(arpn0, "WifiTransport is null while calling setShouldUseWifiD2dHeader");
                        arpn0.z(z);
                    }
                    int v7 = asbt0.b;
                    if((v7 & 0x20) != 0) {
                        optional0 = Optional.of(asbt0.i);
                    }
                    else if((v7 & 8) == 0) {
                        optional0 = Optional.empty();
                    }
                    else {
                        aqql0.j("get device model from deprecated field: %s", new Object[]{asbt0.g});
                        optional0 = Optional.of(asbt0.g);
                    }
                    int v8 = asbt0.b;
                    if((v8 & 0x40) != 0) {
                        optional1 = Optional.of(asbt0.j);
                    }
                    else if((v8 & 8) == 0) {
                        optional1 = Optional.empty();
                    }
                    else {
                        aqql0.j("get device display name from deprecated field: %s", new Object[]{asbt0.g});
                        optional1 = Optional.of(asbt0.g);
                    }
                    if(optional0.isPresent() && optional1.isPresent()) {
                        aqql0.h("Target device model: %s, device display name: %s", new Object[]{optional0, optional1});
                        Object object0 = optional0.get();
                        Object object1 = optional1.get();
                        ((argf)this.u).k = (String)object0;
                        ((argf)this.u).l = (String)object1;
                        ((argf)this.u).k();
                    }
                    else {
                        aqql0.m("Target has not sent the device model.", new Object[0]);
                    }
                    if(hqhq.r()) {
                        frce frce0 = new frce(this.b);
                        frce0.d("backup");
                        frce0.e("TargetProtoDataStore.pb");
                        Uri uri0 = frce0.a();
                        frie frie0 = frif.a();
                        frie0.f(uri0);
                        frie0.e(((MessageLite)aqhz.a));
                        frif frif0 = frie0.a();
                        frli frli0 = cjtb.a.a(frif0);
                        if((asbt0.b & 0x4000) == 0) {
                            aqql0.m("Target SDK was not set in proto data store because it wasn\'t set in handshake payload.", new Object[0]);
                        }
                        else {
                            try {
                                ((glyq)frli0.b(new aqjx(asbt0.r), gmap.a)).u();
                            }
                            catch(InterruptedException | ExecutionException exception0) {
                                arjh.p.n("Failed to set target device SDK version in target device proto data store.", exception0, new Object[0]);
                            }
                        }
                        if(optional0.isPresent()) {
                            try {
                                ((glyq)frli0.b(new aqjz(((String)optional0.get())), gmap.a)).u();
                            }
                            catch(InterruptedException | ExecutionException exception1) {
                                arjh.p.n("Failed to set target device model in target device proto data store.", exception1, new Object[0]);
                            }
                        }
                        else {
                            arjh.p.m("Target model was not set in proto data store because it wasn\'t set in handshake payload.", new Object[0]);
                        }
                    }
                    else {
                        aqql0.m("Target device proto data store wasn\'t populated because the flag is disabled.", new Object[0]);
                    }
                    if((asbt0.b & 0x2000000) != 0) {
                        arrd arrd0 = this.D();
                        if(arrd0 != null) {
                            arrd0.c = (long)asbt0.D;
                        }
                    }
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)asbk.a).v_newBuilder();
                    aqfx aqfx0 = aqfx.g;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((asbk)hftp0.b_message).d = aqfx0.q;
                    ((asbk)hftp0.b_message).b |= 2;
                    asbk asbk0 = (asbk)hftp0.N_build();
                    arqb arqb0 = (arqb)this.s.a(asbk0);
                    if(arqb0.j()) {
                        arqb0.g(((String)optional0.orElse("")));
                    }
                    String s = asbt0.k;
                    ((argf)this.u).n = true;
                    batl.s(s);
                    ProtoLiteBuilder hftp1 = ((argf)this.u).h.l;
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    hkyg hkyg0 = (hkyg)hftp1.b_message;
                    hkyg0.b |= 1;
                    hkyg0.c = s;
                    this.e(asbt0.k, ((hkyf)this.I.e.N_build()), this.y);
                    return;
                }
                aqql0.f("Handshake magic did not match. Got: %d", new Object[]{v1});
                this.l(5, null, true);
                return;
            }
            case 2: {
                ascm ascm0 = asci0.d == null ? ascm.a : asci0.d;
                if((asci0.b & 8) == 0) {
                    ascj0 = null;
                }
                else {
                    ascj0 = asci0.f;
                    if(ascj0 == null) {
                        ascj0 = ascj.a;
                    }
                }
                aqql0.d("Processing SmartDevice payload of type: %s", new Object[]{(ascl.b(ascm0.c) == null ? ascl.a : ascl.b(ascm0.c))});
                try {
                    for(Object object2: ModuleManager.get(this.b).getAllModules()) {
                        ModuleManager.ModuleInfo moduleManager$ModuleInfo0 = (ModuleManager.ModuleInfo)object2;
                        if(!"com.google.android.gms.smartdevice".equals(moduleManager$ModuleInfo0.moduleId)) {
                            continue;
                        }
                        v9 = moduleManager$ModuleInfo0.moduleVersion;
                        goto label_145;
                    }
                }
                catch(InvalidConfigException unused_ex) {
                    arjh.p.m("unable to enumerate modules to find smart setup", new Object[0]);
                }
                v9 = -1;
            label_145:
                if(v9 == -1) {
                    arjh.p.m("Unable to determine smart device version, assuming all is well", new Object[0]);
                    v9 = 4;
                }
                if(v9 < 4) {
                    ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)ascj.a).v_newBuilder();
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp2.b_message;
                    ((ascj)hftv0).b |= 1;
                    ((ascj)hftv0).c = v9;
                    if(!hftv0.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    ProtoLiteMessage hftv1 = hftp2.b_message;
                    ((ascj)hftv1).b |= 4;
                    ((ascj)hftv1).e = 5;
                    if(!hftv1.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    ascj ascj1 = (ascj)hftp2.b_message;
                    ascj1.b |= 2;
                    ascj1.d = "Source Disabled";
                    ascj ascj2 = (ascj)hftp2.N_build();
                    ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)ascm.a).v_newBuilder();
                    ascl ascl0 = ascl.d;
                    if(!hftp3.b_message.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    ((ascm)hftp3.b_message).c = ascl0.g;
                    ((ascm)hftp3.b_message).b |= 1;
                    this.h(((ascm)hftp3.N_build()), ascj2);
                    return;
                }
                switch((ascl.b(ascm0.c) == null ? ascl.a : ascl.b(ascm0.c)).ordinal()) {
                    case 1: {
                        ((argf)this.u).f(1);
                        if(this.M != null) {
                            arjh.p.f("Source controller already initialized, but got Initialized command", new Object[0]);
                            this.n();
                        }
                        Context context0 = this.b;
                        arla arla0 = new arla(context0, new arim(this), this.c, new epzz(context0));
                        this.M = arla0;
                        arla0.b();
                        return;
                    }
                    case 2: {
                        arlf arlf0 = this.M;
                        if(arlf0 != null) {
                            byte[] arr_b1 = ascm0.d.toByteArray();
                            int v10 = ascm0.d.size();
                            OutputStream outputStream0 = arlf0.f;
                            if(outputStream0 != null) {
                                try {
                                    outputStream0.write(arr_b1, 0, v10);
                                }
                                catch(IOException iOException0) {
                                    arlf.d.f("Could not deliver data to API", new Object[0]);
                                    arlf0.d(2, iOException0.getMessage());
                                }
                                return;
                            }
                            arlf0.i.write(arr_b1, 0, v10);
                            arlf.d.j("deliverData called before onInitialized() callback, queuing data to send after", new Object[0]);
                            return;
                        }
                        arjh.p.f("SmartDeviceSourceController null but payload received", new Object[0]);
                        return;
                    }
                    case 3: {
                        if(ascj0 == null) {
                            arjh.p.f("SmartDevice error received from other device: null error", new Object[0]);
                        }
                        else {
                            arjh.p.f("SmartDevice error received from other device: code %d and category %d", new Object[]{((int)ascj0.c), ((int)ascj0.e)});
                        }
                        this.n();
                        this.u.b(false);
                        return;
                    }
                    case 4: {
                        if(this.M == null) {
                            arjh.p.f("SmartDevice complete received but controller is null. Ignoring.", new Object[0]);
                        }
                        this.M = null;
                        return;
                    }
                    case 5: {
                        if(this.M == null) {
                            arjh.p.f("Received abort and restart, but controller is already null. Recreating.", new Object[0]);
                        }
                        else {
                            this.n();
                        }
                        Context context1 = this.b;
                        arla arla1 = new arla(context1, new arim(this), this.c, new epzz(context1));
                        this.M = arla1;
                        arla1.b();
                        return;
                    }
                    default: {
                        aqql aqql1 = arjh.p;
                        if((ascm0.b & 1) != 0) {
                            arr_b = ascl.b(ascm0.c);
                            if(arr_b == null) {
                                arr_b = ascl.a;
                            }
                        }
                        aqql1.m("Got an unknown smart device packet: %s", new Object[]{arr_b});
                        return;
                    }
                }
            }
            case 3: {
                aqql0.d("Authorization request.", new Object[0]);
                argf argf0 = (argf)this.u;
                if(argf0.m) {
                    argf0.d();
                    return;
                }
                argf0.f(3);
                if(hqnd.a.c().k() && argf0.o && argf0.i != null) {
                    argf0.d();
                    return;
                }
                argf0.r.c();
                return;
            }
            case 5: {
                ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)asbl.a).v_newBuilder();
                arqt arqt0 = this.s;
                arqt0.d(this.C((asci0.k == null ? asbi.a : asci0.k)));
                for(Object object3: arqt0.c()) {
                    hftp4.cU(aqhj.b(((aqfx)object3)));
                }
                if(hqhq.B()) {
                    arjh.p.h("Using HAT appdata transfer improvement", new Object[0]);
                    ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)asbk.a).v_newBuilder();
                    aqfx aqfx1 = aqfx.g;
                    if(!hftp5.b_message.isImmutable()) {
                        hftp5.ensureMutable();
                    }
                    ((asbk)hftp5.b_message).d = aqfx1.q;
                    ((asbk)hftp5.b_message).b |= 2;
                    arqb arqb1 = (arqb)arqt0.a(((asbk)hftp5.N_build()));
                    if(arqb1 != null) {
                        baun baun0 = arqd.a;
                        baun0.h("startKeyValueBackupsAsync", new Object[0]);
                        arqd arqd0 = arqb1.e;
                        AtomicBoolean atomicBoolean0 = arqd0.d;
                        __monitor_enter(atomicBoolean0);
                        int v11 = FIN.finallyOpen$NT();
                        if(atomicBoolean0.get()) {
                            baun0.m("Backup thread was already triggered. Ignoring.", new Object[0]);
                            FIN.finallyExec$NT(v11);
                        }
                        else {
                            atomicBoolean0.set(true);
                            FIN.finallyCodeBegin$NT(v11);
                            arqc arqc0 = new arqc(arqd0, arqb1.g);
                            arqd0.c.execute(arqc0);
                        }
                    }
                }
                asbl asbl0 = (asbl)hftp4.N_build();
                if((asci0.b & 0x80) != 0) {
                    arr_b = (asci0.i == null ? asbq.a : asci0.i).b.toByteArray();
                }
                this.P = arr_b;
                if(hqhq.y()) {
                    aqql aqql2 = arjh.p;
                    aqql2.h("Early indexing is enabled", new Object[0]);
                    long v12 = asci0.m;
                    this.O = v12;
                    if(v12 != 0L && v12 != -1L) {
                        Context context2 = this.b;
                        byte[] arr_b2 = this.P;
                        Intent intent0 = new Intent();
                        intent0.setClassName(context2, "com.google.android.gms.backup.component.D2dEarlySourceService");
                        intent0.putExtra("suw_session_id", String.valueOf(v12));
                        if(arr_b2 != null) {
                            intent0.putExtra("p2p_device_token", Base64.encodeToString(arr_b2, 2));
                        }
                        context2.startService(intent0);
                        boolean z1 = bbic.a().d(context2, intent0, this.q, 1);
                        this.D = z1;
                        if(z1) {
                            this.g(((MessageLite)asbl0));
                            return;
                        }
                        aqql2.h("Failed to bind to early service", new Object[0]);
                    }
                    else {
                        aqql2.h("Invalid SUW session ID received from target", new Object[0]);
                    }
                }
                else {
                    arjh.p.h("Early indexing is disabled", new Object[0]);
                }
                this.o(false, new ariq(this, asbl0));
                return;
            }
            case 6: {
                ((argf)this.u).f(6);
                ((argf)this.u).r.h();
                this.j(new arja(this, this, hkyj0));
                return;
            }
            case 8: {
                this.S = true;
                this.u.a();
                this.j(new arjd(this, this, hkyj0, hkyj0));
                return;
            }
            case 9: {
                arrd arrd1 = this.D();
                if(arrd1 != null) {
                    List list0 = arrd1.d;
                    if(list0.isEmpty()) {
                        arrd.a.d("No wallet items to restore", new Object[0]);
                    }
                    else {
                        Long long0 = arrd1.c;
                        if(long0 == null) {
                            arrd.a.m("Missing target device Android ID. Could not restore %s items", new Object[]{list0.size()});
                        }
                        else {
                            fsxb fsxb0 = arre.a(long0.longValue(), list0);
                            gftb.b(fsxb0.b == 2, "Scheduled task must have a valid Wallet D2D Restore Request");
                            Bundle bundle0 = new Bundle();
                            bundle0.putByteArray("wallet_restore_request", fsxb0.toBytesArray());
                            clkn clkn0 = new clkn();
                            clkn0.w(D2dPostTransferTask.class.getName());
                            clkn0.t("WalletRestore");
                            clkn0.v(1);
                            clkn0.g(0);
                            clkn0.u = bundle0;
                            clkn0.t = cllb.a(0, ((int)hqhq.a.j().J()), ((int)hqhq.a.j().K()));
                            clkn0.e(hqhq.a.j().L(), hqhq.a.j().I());
                            clko clko0 = clkn0.a();
                            cljp.a(arrd1.b).f(clko0);
                            list0.clear();
                        }
                    }
                }
                argf argf1 = (argf)this.u;
                argf1.f(8);
                arem arem0 = argf1.h;
                ProtoLiteBuilder hftp6 = arem0.e;
                long v13 = SystemClock.elapsedRealtime() - arem0.d;
                if(!hftp6.b_message.isImmutable()) {
                    hftp6.ensureMutable();
                }
                hkyf hkyf0 = (hkyf)hftp6.b_message;
                hkyf0.b |= 2;
                hkyf0.d = v13;
                ProtoLiteMessage hftv2 = hftp6.b_message;
                if(((hkyf)hftv2).c == -1) {
                    if(!hftv2.isImmutable()) {
                        hftp6.ensureMutable();
                    }
                    hkyf hkyf1 = (hkyf)hftp6.b_message;
                    hkyf1.b |= 1;
                    hkyf1.c = 0;
                }
                else {
                    aqqn.a.j("Migrate status code overwritten explicitly", new Object[0]);
                }
                arem0.f();
                argf1.r.i();
                if(argf1.o) {
                    argf.a.h("WiFi D2D transfer finished, stopping service", new Object[0]);
                    argf1.j();
                }
                if(hqhq.w()) {
                    areh areh0 = argf1.q;
                    String s1 = argf1.k;
                    hqhq hqhq0 = hqhq.a;
                    if(hqhq0.j().aJ()) {
                        baun baun1 = areh.a;
                        baun1.h("Filtering transfer finished broadcast by target device", new Object[0]);
                        hfuo hfuo0 = hqhq0.j().T().b;
                        if(!hfuo0.contains(s1)) {
                            baun1.h("Not sending transfer broadcast as targetModel %s is not included in devices to send broadcast for: %s", new Object[]{s1, hfuo0});
                            goto label_378;
                        }
                        goto label_371;
                    }
                    else {
                    label_371:
                        baun baun2 = areh.a;
                        baun2.h("Sending transfer finished broadcast", new Object[0]);
                        Intent intent1 = new Intent("com.google.android.gms.SOURCE_D2D_TRANSFER_FINISHED");
                        if(hqhq.D()) {
                            baun2.h("Making ACTION_D2D_TRANSFER_FINISHED broadcast explicit", new Object[0]);
                            intent1.setPackage("com.google.android.apps.wear.companion");
                        }
                        areh0.b.sendBroadcast(intent1);
                    }
                }
            label_378:
                this.A();
                return;
            }
            case 10: {
                arfp arfp0 = new arfp(((argf)this.u).b, ((argf)this.u).c, ((argf)this.u).i);
                new clht(((argf)this.u).b.getMainLooper()).post(arfp0);
                return;
            }
            case 12: {
                ascj ascj3 = asci0.f == null ? ascj.a : asci0.f;
                int v14 = ascj3.c;
                aqql aqql3 = argf.a;
                aqql3.f("Received error from other device.\nCode: %d. Message: %s", new Object[]{v14, ascj3.d});
                argf argf2 = (argf)this.u;
                argf2.h.c(aqze.a(v14, false));
                if(v14 != 9) {
                    argf2.m();
                    return;
                }
                aqql3.f("Cancel requested from the other device", new Object[0]);
                argf2.f(10);
                argf2.i.n();
                arfc arfc0 = new arfc();
                argf2.r.a(arfc0);
                argf2.d.i(14, null, 1, 1);
                argf2.j();
                return;
            }
            case 14: 
            case 15: {
                asch asch0 = asch.b(asci0.c) == null ? asch.a : asch.b(asci0.c);
                arnb arnb0 = this.Q;
                ByteString hfsf0 = (asci0.e == null ? asbt.a : asci0.e).s;
                gftb.z(arnb0, "postSmartSetupAuthenticator must not be null for WiFi D2D.");
                try {
                    HandshakeData handshakeData0 = new HandshakeData();
                    handshakeData0.aw(hfsf0.toByteArray());
                    asch asch1 = asch.o;
                    if(asch0 == asch1) {
                        arnb.a.j("handshakeInit", new Object[0]);
                        this.E(asch1, ((HandshakeData)arnb0.a(((gful_cronetEngineProvider)new armz(arnb0, handshakeData0)))));
                        return;
                    }
                    arnb.a.j("authenticate", new Object[0]);
                    PostSetupAuthData postSetupAuthData0 = (PostSetupAuthData)arnb0.a(((gful_cronetEngineProvider)new arms(arnb0, handshakeData0)));
                    this.E(asch.p, postSetupAuthData0.c);
                    this.R.b = postSetupAuthData0.b;
                }
                catch(erpd | arna exception2) {
                    arjh.p.f(exception2.toString(), new Object[0]);
                    this.l(13, "Post-SmartSetup authentication failed.", true);
                }
                return;
            }
            case 16: {
                try {
                    ascf ascf0 = asci0.h == null ? ascf.a : asci0.h;
                    arlk arlk1 = this.e;
                    if((arlk1 instanceof arpn)) {
                        arr_b3 = ((arpn)arlk1).A();
                    }
                    else {
                        if(!(arlk1 instanceof arlm)) {
                            throw new IllegalStateException("Unexpected transport type for Nearby authentication.");
                        }
                        arpn arpn1 = ((arlm)arlk1).f;
                        gftb.z(arpn1, "WifiTransport is null while calling getNearbyRawAuthenticationToken");
                        arr_b3 = arpn1.A();
                    }
                    arhy arhy0 = this.R;
                    if(arhy0.b == null) {
                        throw new arhx("Missing secret key (likely post-smartsetup auth was skipped).");
                    }
                    byte[] arr_b4 = ascf0.b.toByteArray();
                    try {
                        byte[] arr_b5 = arhj.a(arhy0.b, arr_b4);
                    }
                    catch(arhi arhi0) {
                        throw new arhx(arhi0);
                    }
                    if(Arrays.equals(arr_b5, arr_b3)) {
                        aqql0.h("Nearby authentication success.", new Object[0]);
                        this.E = true;
                        this.d(asch.r);
                        return;
                    }
                    throw new arhx("Nearby token mismatch.");
                }
                catch(arhx arhx0) {
                    arjh.p.f(arhx0.toString(), new Object[0]);
                    this.l(14, "Nearby authentication failed." + arhx0.getMessage(), true);
                    return;
                }
            }
            case 20: {
                aqql0.h("processThroughputTestRequest()", new Object[0]);
                if(!hqhq.v()) {
                    aqql0.m("Throughput test is disabled. Not doing anything.", new Object[0]);
                    return;
                }
                aqql0.h("Sending ThroughputMeasurementStream", new Object[0]);
                this.i(new arqz());
                return;
            }
            case 22: {
                this.S = true;
                if(hkyj0.equals(hkyj.a)) {
                    aqql0.f("Connection type for receiving multiple item request is unspecified. This should not happen. Ignoring request", new Object[0]);
                    return;
                }
                this.u.a();
                this.j(new arjf(this, this, hkyj0, hkyj0));
                return;
            }
            case 23: {
                this.S = true;
                if(hkyj0.equals(hkyj.c)) {
                    this.u.a();
                    this.j(new arje(this, this, hkyj0));
                    return;
                }
                throw new IllegalArgumentException("Continuous streaming is only supported for WIFI connection type.");
            }
            default: {
                aqql0.m("Unknown/unexpected packet type; ignoring: %s", new Object[]{(asch.b(asci0.c) == null ? asch.a : asch.b(asci0.c))});
            }
        }
    }

    final void s(asbl asbl0) {
        gmcd gmcd0;
        arjh.p.h("onSummaryRequestParametersArrived()", new Object[0]);
        if(!hqhq.y()) {
            this.w(asbl0);
            return;
        }
        if(this.D && this.A == null) {
            try {
                this.D = this.r.await(10000L, TimeUnit.MILLISECONDS);
            }
            catch(InterruptedException interruptedException0) {
                arjh.p.g("Interrupted while waiting for service to bind", interruptedException0, new Object[0]);
                Thread.currentThread().interrupt();
                this.D = false;
            }
        }
        D2dEarlySourceChimeraService d2dEarlySourceChimeraService0 = this.A;
        if(d2dEarlySourceChimeraService0 != null) {
            long v = this.O;
            d2dEarlySourceChimeraService0.b.a(hgvs.h);
            AtomicLong atomicLong0 = d2dEarlySourceChimeraService0.c;
            if(atomicLong0.get() == 0L) {
                gmcd0 = gmbx.a;
            }
            else {
                gmcd0 = v == atomicLong0.get() ? gmbu.n(new arbq(d2dEarlySourceChimeraService0), gmap.a) : gmbu.h(new IllegalArgumentException("Session ID in progress: " + atomicLong0.get() + " does not match the given session ID: " + v));
            }
            gmbu.t(glzd.g(glzd.g(gmbt.h(gmcd0), new arbl(d2dEarlySourceChimeraService0, v), gmap.a), new arbm(d2dEarlySourceChimeraService0, v), gmap.a), new arjc(this, asbl0), this.c);
            return;
        }
        arjh.p.f("No active bound service", new Object[0]);
        this.o(true, () -> {
            asbo asbo0 = this.t.c(asbl0, this.H);
            arjh.p.j("Sending flavor summary list", new Object[0]);
            this.g(((MessageLite)asbo0));
        });
    }

    @Override  // arlj
    public final void t() {
        this.l(4, null, true);
    }

    public final void u(ascb ascb0, hkyj hkyj0) {
        InputStream inputStream0;
        arqo arqo0 = this.s.a((ascb0.c == null ? asbk.a : ascb0.c));
        try {
            inputStream0 = hqlt.z() ? new BufferedInputStream(arqo0.b((ascb0.d == null ? asby.a : ascb0.d)), ((int)hqlt.g())) : arqo0.b((ascb0.d == null ? asby.a : ascb0.d));
        }
        catch(arra unused_ex) {
            inputStream0 = new arhw();
        }
        this.e.q(inputStream0, new aris(ascb0, arqo0, inputStream0), hkyj0);
    }

    public final void v() {
        arjh.p.d("Requesting restart of smart device", new Object[0]);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ascm.a).v_newBuilder();
        ascl ascl0 = ascl.f;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((ascm)hftp0.b_message).c = ascl0.g;
        ((ascm)hftp0.b_message).b |= 1;
        this.h(((ascm)hftp0.N_build()), null);
    }

    // Detected as a lambda impl.
    public final void w(asbl asbl0) {
        asbo asbo0 = this.t.c(asbl0, this.H);
        arjh.p.j("Sending flavor summary list", new Object[0]);
        this.g(((MessageLite)asbo0));
    }

    public final void x(asce asce0, Queue queue0) {
        if(this.F) {
            arjh.p.m("Protocol instance is disconnected and should not attempt to send items.", new Object[0]);
            return;
        }
        if(!queue0.isEmpty()) {
            hkyj hkyj0 = hkyj.b;
            if(this.e.t(hkyj0) && !this.C) {
                this.C = true;
                this.z(asce0, queue0, ((asby)queue0.poll()), hkyj0);
            }
        }
        if(!queue0.isEmpty()) {
            hkyj hkyj1 = hkyj.c;
            if(this.e.t(hkyj1) && !this.B) {
                this.B = true;
                asby asby0 = (asby)queue0.poll();
                if((asce0.b & 2) != 0 && asce0.e) {
                    this.y(asce0, queue0, asby0);
                    return;
                }
                this.z(asce0, queue0, asby0, hkyj1);
            }
        }
    }

    public final void y(asce asce0, Queue queue0, asby asby0) {
        arqo arqo0 = this.s.a((asce0.c == null ? asbk.a : asce0.c));
        try {
            File file0 = arqo0.a(asby0);
            if(file0.length() == 0L) {
                arjh.p.m("The length of the file is 0. Proceeding with stream payload for item: %s.", new Object[]{asby0.e});
                this.z(asce0, queue0, asby0, hkyj.c);
                return;
            }
            this.e.m(file0, arqo0.e(asby0), new arir(this, asce0, queue0));
        }
        catch(IOException unused_ex) {
            arjh.p.h("file request failed, processing with stream request for item: " + asby0.e, new Object[0]);
            this.z(asce0, queue0, asby0, hkyj.c);
        }
    }

    public final void z(asce asce0, Queue queue0, asby asby0, hkyj hkyj0) {
        InputStream inputStream0;
        arqo arqo0 = this.s.a((asce0.c == null ? asbk.a : asce0.c));
        try {
            inputStream0 = hqlt.z() ? new BufferedInputStream(arqo0.b(asby0), ((int)hqlt.g())) : arqo0.b(asby0);
        }
        catch(arra unused_ex) {
            inputStream0 = new arhw();
        }
        this.e.s(inputStream0, arqo0.e(asby0), new ariv(this, asce0, asby0, arqo0, inputStream0, hkyj0, queue0), hkyj0);
    }
}

